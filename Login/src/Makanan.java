
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author acer
 */
public class Makanan extends javax.swing.JPanel {

    /**
     * Creates new form SignUp
     */
    private void menu_1() {
        try {
            String query = "SELECT * FROM menu where nama_menu = 'Nasi Pecel'";
            // Ganti nama_tabel dan kolom_stok sesuai dengan struktur database Anda
            java.sql.Connection con = (Connection) Config.ConfigDB();
            //java.sql.ResultSet rs = pst.executeQuery(sql);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                String nama = rs.getString("nama_menu");
                String kode = rs.getString("kd_menu");
                int harga = rs.getInt("harga_menu");
                int stok = rs.getInt("stok_menu");
                
                nama_1.setText("Nama: " + nama);
                kd_1.setText("Kode: " + kode);
                harga_1.setText("Harga: " + harga);
                stok_1.setText("Stok: " + stok);
                String status = "";
                if(stok > 20){
                    status = "Tersedia";
                }
                else if(stok <= 20)
                {
                    status = "Hampis Habis";
                }
                else if(stok == 0)
                {
                    status = "Habis";
                }
                status_1.setText("Status: " + status);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error mengambil data: " + e.getMessage());
        }
    }
    private void menu_2() {
        try {
            String query = "SELECT * FROM menu where nama_menu = 'Nasi Campur'";
            // Ganti nama_tabel dan kolom_stok sesuai dengan struktur database Anda
            java.sql.Connection con = (Connection) Config.ConfigDB();
            //java.sql.ResultSet rs = pst.executeQuery(sql);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                String nama = rs.getString("nama_menu");
                String kode = rs.getString("kd_menu");
                int harga = rs.getInt("harga_menu");
                int stok = rs.getInt("stok_menu");
                nama_2.setText("Nama: " + nama);
                kd_2.setText("Kode: " + kode);
                harga_2.setText("Harga: " + harga);
                stok_2.setText("Stok: " + stok);
                String status = "";
                if(stok > 20){
                    status = "Tersedia";
                }
                else if(stok <= 20)
                {
                    status = "Hampis Habis";
                }
                else if(stok == 0)
                {
                    status = "Habis";
                }
                status_2.setText("Status: " + status);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error mengambil data: " + e.getMessage());
        }
    }
    private void menu_3() {
        try {
            String query = "SELECT * FROM menu where nama_menu = 'Nasi Soto'";
            // Ganti nama_tabel dan kolom_stok sesuai dengan struktur database Anda
            java.sql.Connection con = (Connection) Config.ConfigDB();
            //java.sql.ResultSet rs = pst.executeQuery(sql);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                String nama = rs.getString("nama_menu");
                String kode = rs.getString("kd_menu");
                int harga = rs.getInt("harga_menu");
                int stok = rs.getInt("stok_menu");
                nama_3.setText("Nama: " + nama);
                kd_3.setText("Kode: " + kode);
                harga_3.setText("Harga: " + harga);
                stok_3.setText("Stok: " + stok);
                String status = "";
                if(stok > 20){
                    status = "Tersedia";
                }
                else if(stok <= 20)
                {
                    status = "Hampis Habis";
                }
                else if(stok == 0)
                {
                    status = "Habis";
                }
                status_3.setText("Status: " + status);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error mengambil data: " + e.getMessage());
        }
    }
    private void menu_4() {
        try {
            String query = "SELECT * FROM menu where nama_menu = 'Nasi Goreng Jowo'";
            // Ganti nama_tabel dan kolom_stok sesuai dengan struktur database Anda
            java.sql.Connection con = (Connection) Config.ConfigDB();
            //java.sql.ResultSet rs = pst.executeQuery(sql);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                String nama = rs.getString("nama_menu");
                String kode = rs.getString("kd_menu");
                int harga = rs.getInt("harga_menu");
                int stok = rs.getInt("stok_menu");
                nama_4.setText("Nama: " + nama);
                kd_4.setText("Kode: " + kode);
                harga_4.setText("Harga: " + harga);
                stok_4.setText("Stok: " + stok);
                String status = "";
                if(stok > 20){
                    status = "Tersedia";
                }
                else if(stok <= 20)
                {
                    status = "Hampis Habis";
                }
                else if(stok == 0)
                {
                    status = "Habis";
                }
                status_4.setText("Status: " + status);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error mengambil data: " + e.getMessage());
        }
    }
    private void menu_5() {
        try {
            String query = "SELECT * FROM menu where nama_menu = 'Nasi Goreng Spesial + Telor'";
            // Ganti nama_tabel dan kolom_stok sesuai dengan struktur database Anda
            java.sql.Connection con = (Connection) Config.ConfigDB();
            //java.sql.ResultSet rs = pst.executeQuery(sql);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                String nama = rs.getString("nama_menu");
                String kode = rs.getString("kd_menu");
                int harga = rs.getInt("harga_menu");
                int stok = rs.getInt("stok_menu");
                nama_5.setText("Nama: " + nama);
                kd_5.setText("Kode: " + kode);
                harga_5.setText("Harga: " + harga);
                stok_5.setText("Stok: " + stok);
                String status = "";
                if(stok > 20){
                    status = "Tersedia";
                }
                else if(stok <= 20)
                {
                    status = "Hampis Habis";
                }
                else if(stok == 0)
                {
                    status = "Habis";
                }
                status_5.setText("Status: " + status);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error mengambil data: " + e.getMessage());
        }
    }
    private void menu_6() {
        try {
            String query = "SELECT * FROM menu where nama_menu = 'Nasi Goreng Spesial'";
            // Ganti nama_tabel dan kolom_stok sesuai dengan struktur database Anda
            java.sql.Connection con = (Connection) Config.ConfigDB();
            //java.sql.ResultSet rs = pst.executeQuery(sql);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                String nama = rs.getString("nama_menu");
                String kode = rs.getString("kd_menu");
                int harga = rs.getInt("harga_menu");
                int stok = rs.getInt("stok_menu");
                nama_6.setText("Nama: " + nama);
                kd_6.setText("Kode: " + kode);
                harga_6.setText("Harga: " + harga);
                stok_6.setText("Stok: " + stok);
                String status = "";
                if(stok > 20){
                    status = "Tersedia";
                }
                else if(stok <= 20)
                {
                    status = "Hampis Habis";
                }
                else if(stok == 0)
                {
                    status = "Habis";
                }
                status_6.setText("Status: " + status);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error mengambil data: " + e.getMessage());
        }
    }
        private void menu_7() {
        try {
            String query = "SELECT * FROM menu where nama_menu = 'Bakmi Jowo'";
            // Ganti nama_tabel dan kolom_stok sesuai dengan struktur database Anda
            java.sql.Connection con = (Connection) Config.ConfigDB();
            //java.sql.ResultSet rs = pst.executeQuery(sql);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                String nama = rs.getString("nama_menu");
                String kode = rs.getString("kd_menu");
                int harga = rs.getInt("harga_menu");
                int stok = rs.getInt("stok_menu");
                nama_7.setText("Nama: " + nama);
                kd_7.setText("Kode: " + kode);
                harga_7.setText("Harga: " + harga);
                stok_7.setText("Stok: " + stok);
                String status = "";
                if(stok > 20){
                    status = "Tersedia";
                }
                else if(stok <= 20)
                {
                    status = "Hampis Habis";
                }
                else if(stok == 0)
                {
                    status = "Habis";
                }
                status_7.setText("Status: " + status);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error mengambil data: " + e.getMessage());
        }
    }
    public Makanan() {
        initComponents();
        menu_1();
        menu_2();
        menu_3();
        menu_4();
        menu_5();
        menu_6();
        menu_7();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_utama = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        nama_1 = new javax.swing.JLabel();
        kd_1 = new javax.swing.JLabel();
        harga_1 = new javax.swing.JLabel();
        stok_1 = new javax.swing.JLabel();
        nama_2 = new javax.swing.JLabel();
        kd_2 = new javax.swing.JLabel();
        harga_2 = new javax.swing.JLabel();
        stok_2 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        nama_4 = new javax.swing.JLabel();
        kd_4 = new javax.swing.JLabel();
        harga_4 = new javax.swing.JLabel();
        stok_4 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        nama_3 = new javax.swing.JLabel();
        kd_3 = new javax.swing.JLabel();
        harga_3 = new javax.swing.JLabel();
        stok_3 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        nama_5 = new javax.swing.JLabel();
        kd_5 = new javax.swing.JLabel();
        harga_5 = new javax.swing.JLabel();
        stok_5 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        nama_6 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        kd_6 = new javax.swing.JLabel();
        harga_6 = new javax.swing.JLabel();
        stok_6 = new javax.swing.JLabel();
        nama_7 = new javax.swing.JLabel();
        kd_7 = new javax.swing.JLabel();
        harga_7 = new javax.swing.JLabel();
        stok_7 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        status_1 = new javax.swing.JLabel();
        status_2 = new javax.swing.JLabel();
        status_3 = new javax.swing.JLabel();
        status_4 = new javax.swing.JLabel();
        status_5 = new javax.swing.JLabel();
        status_6 = new javax.swing.JLabel();
        status_7 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        panel_utama.setLayout(new java.awt.CardLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setPreferredSize(new java.awt.Dimension(1024, 753));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("MENU MAKANAN");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("CARI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("Makanan");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 0));
        jButton3.setText("Minuman");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 0));
        jButton4.setText("Tambah");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(102, 0, 204));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mkn1.png"))); // NOI18N
        jLabel37.setText("jLabel2");

        nama_1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_1.setText("Label1");

        kd_1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_1.setText("label1");

        harga_1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_1.setText("label1");

        stok_1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_1.setText("label1");

        nama_2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_2.setText("jLabel6");

        kd_2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_2.setText("jLabel6");

        harga_2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_2.setText("jLabel6");

        stok_2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_2.setText("jLabel6");

        jLabel46.setBackground(new java.awt.Color(102, 0, 204));
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mkn2.png"))); // NOI18N
        jLabel46.setText("jLabel2");

        nama_4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_4.setText("jLabel6");

        kd_4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_4.setText("jLabel6");

        harga_4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_4.setText("jLabel6");

        stok_4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_4.setText("jLabel6");

        jLabel51.setBackground(new java.awt.Color(102, 0, 204));
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mkn4.png"))); // NOI18N
        jLabel51.setText("jLabel2");

        nama_3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_3.setText("jLabel6");

        kd_3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_3.setText("jLabel6");

        harga_3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_3.setText("jLabel6");

        stok_3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_3.setText("jLabel6");

        jLabel56.setBackground(new java.awt.Color(102, 0, 204));
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mkn3.png"))); // NOI18N
        jLabel56.setText("jLabel2");

        nama_5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nama_5.setText("jLabel6");

        kd_5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_5.setText("jLabel6");

        harga_5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_5.setText("jLabel6");

        stok_5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_5.setText("jLabel6");

        jLabel61.setBackground(new java.awt.Color(102, 0, 204));
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mkn5.png"))); // NOI18N
        jLabel61.setText("jLabel2");

        nama_6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_6.setText("jLabel6");

        jLabel63.setBackground(new java.awt.Color(102, 0, 204));
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mkn6.png"))); // NOI18N
        jLabel63.setText("jLabel2");

        kd_6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_6.setText("jLabel6");

        harga_6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_6.setText("jLabel6");

        stok_6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_6.setText("jLabel6");

        nama_7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_7.setText("jLabel6");

        kd_7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_7.setText("jLabel6");

        harga_7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_7.setText("jLabel6");

        stok_7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_7.setText("jLabel6");

        jLabel71.setBackground(new java.awt.Color(102, 0, 204));
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mkn7.png"))); // NOI18N
        jLabel71.setText("jLabel2");

        status_1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_1.setText("label1");

        status_2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_2.setText("jLabel6");

        status_3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_3.setText("jLabel6");

        status_4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_4.setText("jLabel6");

        status_5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_5.setText("jLabel6");

        status_6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_6.setText("jLabel6");

        status_7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_7.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nama_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kd_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(harga_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stok_7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(status_7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kd_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(harga_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stok_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nama_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nama_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kd_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(harga_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stok_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nama_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kd_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(harga_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stok_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(status_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(status_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(status_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nama_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kd_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(harga_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(stok_2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(status_2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nama_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(kd_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(harga_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(stok_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(status_6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nama_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(kd_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(harga_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(stok_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(status_4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nama_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kd_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(harga_1)
                                .addGap(8, 8, 8)
                                .addComponent(stok_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status_1))
                            .addComponent(jLabel37))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nama_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kd_3)
                                .addGap(12, 12, 12)
                                .addComponent(harga_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stok_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status_3))
                            .addComponent(jLabel56))
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nama_5)
                                .addGap(15, 15, 15)
                                .addComponent(kd_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(harga_5)
                                .addGap(5, 5, 5)
                                .addComponent(stok_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status_5))
                            .addComponent(jLabel61)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nama_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kd_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(harga_2)
                                .addGap(8, 8, 8)
                                .addComponent(stok_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status_2))
                            .addComponent(jLabel46))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nama_4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kd_4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(harga_4)
                                .addGap(8, 8, 8)
                                .addComponent(stok_4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status_4))
                            .addComponent(jLabel51))
                        .addGap(148, 148, 148)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nama_6)
                                .addGap(15, 15, 15)
                                .addComponent(kd_6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(harga_6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stok_6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status_6))
                            .addComponent(jLabel63))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nama_7)
                        .addGap(8, 8, 8)
                        .addComponent(kd_7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(harga_7)
                        .addGap(5, 5, 5)
                        .addComponent(stok_7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status_7))
                    .addComponent(jLabel71))
                .addGap(33, 33, 33))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(93, 93, 93)
                                .addComponent(jButton3)
                                .addGap(283, 283, 283)
                                .addComponent(jButton4))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        panel_utama.add(jPanel6, "card2");

        add(panel_utama, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        panel_utama.removeAll();
        panel_utama.add(new Minuman());
        panel_utama.repaint();
        panel_utama.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel harga_1;
    private javax.swing.JLabel harga_2;
    private javax.swing.JLabel harga_3;
    private javax.swing.JLabel harga_4;
    private javax.swing.JLabel harga_5;
    private javax.swing.JLabel harga_6;
    private javax.swing.JLabel harga_7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel kd_1;
    private javax.swing.JLabel kd_2;
    private javax.swing.JLabel kd_3;
    private javax.swing.JLabel kd_4;
    private javax.swing.JLabel kd_5;
    private javax.swing.JLabel kd_6;
    private javax.swing.JLabel kd_7;
    private javax.swing.JLabel nama_1;
    private javax.swing.JLabel nama_2;
    private javax.swing.JLabel nama_3;
    private javax.swing.JLabel nama_4;
    private javax.swing.JLabel nama_5;
    private javax.swing.JLabel nama_6;
    private javax.swing.JLabel nama_7;
    private javax.swing.JPanel panel_utama;
    private javax.swing.JLabel status_1;
    private javax.swing.JLabel status_2;
    private javax.swing.JLabel status_3;
    private javax.swing.JLabel status_4;
    private javax.swing.JLabel status_5;
    private javax.swing.JLabel status_6;
    private javax.swing.JLabel status_7;
    private javax.swing.JLabel stok_1;
    private javax.swing.JLabel stok_2;
    private javax.swing.JLabel stok_3;
    private javax.swing.JLabel stok_4;
    private javax.swing.JLabel stok_5;
    private javax.swing.JLabel stok_6;
    private javax.swing.JLabel stok_7;
    // End of variables declaration//GEN-END:variables

    void pack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
