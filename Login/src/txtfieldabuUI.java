package Assets;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.metal.MetalTextFieldUI;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class txtfieldabuUI extends MetalTextFieldUI {
    private JTextField textfield;
    private Border border;
    private int round = 15;
    private int borderThickness = 2; // Default border thickness
    private List<String> items = new ArrayList<>();
    private JPopupMenu popup;
    private JList<String> suggestionList;
    
    public txtfieldabuUI(JTextField textfield) {
        this.textfield = textfield;
        this.popup = new JPopupMenu();
        this.suggestionList = new JList<>();
        initializeComponent();
    }
    
    private void initializeComponent() {
        // Initialize border with padding to accommodate thicker border
        border = new Border(10);
        border.setRound(round);
        border.setBorderThickness(borderThickness);
        
        // Configure textfield
        textfield.setBorder(border);
        textfield.setOpaque(false);
        textfield.setSelectedTextColor(Color.WHITE);
        textfield.setSelectionColor(new Color(54, 189, 248));
        
        // Setup suggestion list
        suggestionList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        suggestionList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    selectSuggestion();
                }
            }
        });
        
        // Add suggestion list to popup
        JScrollPane scrollPane = new JScrollPane(suggestionList);
        scrollPane.setBorder(null);
        popup.add(scrollPane);
        
        // Add document listener for text changes
        textfield.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                showSuggestions();
            }
            
            @Override
            public void removeUpdate(DocumentEvent e) {
                showSuggestions();
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                showSuggestions();
            }
        });
        
        // Add key listeners for navigation
        textfield.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        navigateSuggestions(-1);
                        break;
                    case KeyEvent.VK_DOWN:
                        navigateSuggestions(1);
                        break;
                    case KeyEvent.VK_ENTER:
                        selectSuggestion();
                        break;
                    case KeyEvent.VK_ESCAPE:
                        popup.setVisible(false);
                        break;
                }
            }
        });
        
        // Add focus listeners
        textfield.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent fe) {
                border.setColor(new Color(204, 204, 204));
                textfield.repaint();
            }
            
            @Override
            public void focusLost(FocusEvent fe) {
                border.setColor(new Color(204, 204, 204));
                textfield.repaint();
                Timer timer = new Timer(200, (e) -> popup.setVisible(false));
                timer.setRepeats(false);
                timer.start();
            }
        });
    }
    
    // Method to set border thickness
    public void setBorderThickness(int thickness) {
        this.borderThickness = thickness;
        border.setBorderThickness(thickness);
        textfield.repaint();
    }
    
    // Method to get border thickness
    public int getBorderThickness() {
        return borderThickness;
    }
    
    private void showSuggestions() {
        String text = textfield.getText().toLowerCase();
        DefaultListModel<String> model = new DefaultListModel<>();
        
        for (String item : items) {
            if (item.toLowerCase().contains(text)) {
                model.addElement(item);
            }
        }
        
        suggestionList.setModel(model);
        
        if (model.getSize() > 0 && textfield.isFocusOwner()) {
            if (!popup.isVisible()) {
                popup.setPopupSize(textfield.getWidth(), Math.min(model.getSize() * 20 + 5, 200));
                popup.show(textfield, 0, textfield.getHeight());
            }
            suggestionList.setSelectedIndex(0);
        } else {
            popup.setVisible(false);
        }
    }
    
    private void navigateSuggestions(int direction) {
        if (!popup.isVisible()) {
            return;
        }
        
        int size = suggestionList.getModel().getSize();
        int currentIndex = suggestionList.getSelectedIndex();
        int newIndex = currentIndex + direction;
        
        if (newIndex >= 0 && newIndex < size) {
            suggestionList.setSelectedIndex(newIndex);
            suggestionList.ensureIndexIsVisible(newIndex);
        }
    }
    
    private void selectSuggestion() {
        if (popup.isVisible() && suggestionList.getSelectedValue() != null) {
            textfield.setText(suggestionList.getSelectedValue());
            popup.setVisible(false);
        }
    }
    
    public List<String> getItems() {
        return new ArrayList<>(items);
    }
    
    public void setItems(List<String> items) {
        this.items = new ArrayList<>(items);
    }
    
    public int getRound() {
        return round;
    }
    
    public void setRound(int round) {
        this.round = round;
        border.setRound(round);
        textfield.repaint();
    }
    
    @Override
    protected void paintBackground(Graphics grphcs) {
        if (textfield.isOpaque()) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(textfield.getBackground());
            g2.fillRoundRect(0, 0, textfield.getWidth(), textfield.getHeight(), round, round);
            g2.dispose();
        }
    }
    
    private class Border extends EmptyBorder {
        private Color focusColor = new Color(204, 204, 204);
        private Color color = new Color(204, 204, 204);
        private int round;
        private int borderThickness = 2; // Default thickness
        
        public Border(int border) {
            super(border, border, border, border);
        }
        
        public Border() {
            this(5);
        }
        
        public void setBorderThickness(int thickness) {
            this.borderThickness = thickness;
        }
        
        public int getBorderThickness() {
            return borderThickness;
        }
        
        public int getRound() {
            return round;
        }
        
        public void setRound(int round) {
            this.round = round;
        }
        
        public Color getFocusColor() {
            return focusColor;
        }
        
        public void setFocusColor(Color focusColor) {
            this.focusColor = focusColor;
        }
        
        public Color getColor() {
            return color;
        }
        
        public void setColor(Color color) {
            this.color = color;
        }
        
        @Override
        public void paintBorder(Component cmpnt, Graphics grphcs, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            // Set the stroke thickness
            g2.setStroke(new BasicStroke(borderThickness));
            
            g2.setColor(cmpnt.isFocusOwner() ? focusColor : color);
            g2.drawRoundRect(x + borderThickness/2, y + borderThickness/2, 
                           width - borderThickness, height - borderThickness, 
                           round, round);
            g2.dispose();
        }
    }
}