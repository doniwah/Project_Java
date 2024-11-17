package Assets;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class CTable extends JTable {
    
    private int selectedRow = -1;
    private final Color[] rowColors = {
        Color.WHITE,                 
        new Color(159, 88, 187, 100)  
    };
    
    public CTable() {
        setShowGrid(true);
        setGridColor(new Color(255, 255, 255));
        setRowHeight(40);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Mencegah edit mode
        setDefaultEditor(Object.class, null);
        
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TablezHeader header = new TablezHeader(value + "");
                header.setHorizontalAlignment(SwingConstants.CENTER);
                header.setBackground(Color.WHITE);
                return header;
            }
        });
        
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (!isSelected) {
                    com.setBackground(rowColors[row % 2]);
                } else {
                    com.setBackground(new Color(204, 204, 204));
                }
                setHorizontalAlignment(SwingConstants.CENTER);
                setBorder(noFocusBorder);
                if (isSelected) {
                    com.setForeground(new Color(15, 89, 140));
                } else {
                    com.setForeground(new Color(102, 102, 102));
                }
                return this;
            }
        });
        
        // Mengubah MouseListener untuk menangani klik ganda
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = getSelectedRow();
                if (row == selectedRow) {
                    clearSelection();
                    selectedRow = -1;
                } else {
                    selectedRow = row;
                }
                
                // Mencegah event default dari klik ganda
                if (e.getClickCount() == 2) {
                    e.consume();
                }
            }
        });
    }
    
    public void addRow(Object[] Row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(Row);
    }
    
    private class TablezHeader extends JLabel {
        public TablezHeader(String text) {
            super(text);
            setOpaque(true);
            setBackground(Color.WHITE);
            setFont(new Font("sansserif", 1, 12));
            setForeground(new Color(102, 102, 102));
            setBorder(new EmptyBorder(10, 5, 10, 5));
            setHorizontalAlignment(SwingConstants.CENTER);
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(new Color(255, 255, 255));
            g.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
        }
    }
}