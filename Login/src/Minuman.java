
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author acer
 */
public class Minuman extends javax.swing.JPanel {

    private void menu_1() {
        try {
            String query = "SELECT * FROM menu where nama_menu = 'Es Teh'";
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
                if (stok > 20) {
                    status = "Tersedia";
                } else if (stok <= 20) {
                    status = "Hampis Habis";
                } else if (stok == 0) {
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
            String query = "SELECT * FROM menu where nama_menu = 'Teh Panas'";
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
                if (stok > 20) {
                    status = "Tersedia";
                } else if (stok <= 20) {
                    status = "Hampis Habis";
                } else if (stok == 0) {
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
            String query = "SELECT * FROM menu where nama_menu = 'Es Jeruk'";
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
                if (stok > 20) {
                    status = "Tersedia";
                } else if (stok <= 20) {
                    status = "Hampis Habis";
                } else if (stok == 0) {
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
            String query = "SELECT * FROM menu where nama_menu = 'Jeruk Panas'";
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
                if (stok > 20) {
                    status = "Tersedia";
                } else if (stok <= 20) {
                    status = "Hampis Habis";
                } else if (stok == 0) {
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
            String query = "SELECT * FROM menu where nama_menu = 'Thai Tea'";
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
                if (stok > 20) {
                    status = "Tersedia";
                } else if (stok <= 20) {
                    status = "Hampis Habis";
                } else if (stok == 0) {
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
            String query = "SELECT * FROM menu where nama_menu = 'Susu'";
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
                if (stok > 20) {
                    status = "Tersedia";
                } else if (stok <= 20) {
                    status = "Hampis Habis";
                } else if (stok == 0) {
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
            String query = "SELECT * FROM menu where nama_menu = 'Kopi Hitam'";
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
                if (stok > 20) {
                    status = "Tersedia";
                } else if (stok <= 20) {
                    status = "Hampis Habis";
                } else if (stok == 0) {
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

    private void menu_8() {
        try {
            String query = "SELECT * FROM menu where nama_menu = 'Cappucino'";
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
                nama_8.setText("Nama: " + nama);
                kd_8.setText("Kode: " + kode);
                harga_8.setText("Harga: " + harga);
                stok_8.setText("Stok: " + stok);
                String status = "";
                if (stok > 20) {
                    status = "Tersedia";
                } else if (stok <= 20) {
                    status = "Hampis Habis";
                } else if (stok == 0) {
                    status = "Habis";
                }
                status_8.setText("Status: " + status);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error mengambil data: " + e.getMessage());
        }
    }

    private void menu_9() {
        try {
            String query = "SELECT * FROM menu where nama_menu = 'Kopi Susu'";
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
                nama_9.setText("Nama: " + nama);
                kd_9.setText("Kode: " + kode);
                harga_9.setText("Harga: " + harga);
                stok_9.setText("Stok: " + stok);
                String status = "";
                if (stok > 20) {
                    status = "Tersedia";
                } else if (stok <= 20) {
                    status = "Hampis Habis";
                } else if (stok == 0) {
                    status = "Habis";
                }
                status_9.setText("Status: " + status);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error mengambil data: " + e.getMessage());
        }
    }

    private void menu_10() {
        try {
            String query = "SELECT * FROM menu where nama_menu = 'Coklat'";
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
                nama_10.setText("Nama: " + nama);
                kd_10.setText("Kode: " + kode);
                harga_10.setText("Harga: " + harga);
                stok_10.setText("Stok: " + stok);
                String status = "";
                if (stok > 20) {
                    status = "Tersedia";
                } else if (stok <= 20) {
                    status = "Hampis Habis";
                } else if (stok == 0) {
                    status = "Habis";
                }
                status_10.setText("Status: " + status);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error mengambil data: " + e.getMessage());
        }
    }

    public Minuman() {
        initComponents();
        menu_1();
        menu_2();
        menu_3();
        menu_4();
        menu_5();
        menu_6();
        menu_7();
        menu_8();
        menu_9();
        menu_10();
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
        jLabel72 = new javax.swing.JLabel();
        nama_8 = new javax.swing.JLabel();
        kd_8 = new javax.swing.JLabel();
        harga_8 = new javax.swing.JLabel();
        stok_8 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        nama_9 = new javax.swing.JLabel();
        kd_9 = new javax.swing.JLabel();
        harga_9 = new javax.swing.JLabel();
        stok_9 = new javax.swing.JLabel();
        nama_10 = new javax.swing.JLabel();
        kd_10 = new javax.swing.JLabel();
        harga_10 = new javax.swing.JLabel();
        stok_10 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        status_2 = new javax.swing.JLabel();
        status_1 = new javax.swing.JLabel();
        status_3 = new javax.swing.JLabel();
        status_4 = new javax.swing.JLabel();
        status_5 = new javax.swing.JLabel();
        status_6 = new javax.swing.JLabel();
        status_7 = new javax.swing.JLabel();
        status_8 = new javax.swing.JLabel();
        status_9 = new javax.swing.JLabel();
        status_10 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        panel_utama.setPreferredSize(new java.awt.Dimension(1024, 753));
        panel_utama.setLayout(new java.awt.CardLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setPreferredSize(new java.awt.Dimension(1024, 753));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("MENU MINUMAN");

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
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 0));
        jButton3.setText("Minuman");
        jButton3.setEnabled(false);
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

        jPanel1.setPreferredSize(new java.awt.Dimension(919, 983));

        jLabel37.setBackground(new java.awt.Color(102, 0, 204));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mnm1.png"))); // NOI18N
        jLabel37.setText("jLabel2");

        nama_1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_1.setText("jLabel6");

        kd_1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_1.setText("jLabel6");

        harga_1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_1.setText("jLabel6");

        stok_1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_1.setText("jLabel6");

        nama_2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_2.setText("jLabel6");

        kd_2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_2.setText("jLabel6");

        harga_2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_2.setText("jLabel6");

        stok_2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_2.setText("jLabel6");

        jLabel46.setBackground(new java.awt.Color(102, 0, 204));
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mnm2.png"))); // NOI18N
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
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mnm4.png"))); // NOI18N
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
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mnm3.png"))); // NOI18N
        jLabel56.setText("jLabel2");

        nama_5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_5.setText("jLabel6");

        kd_5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_5.setText("jLabel6");

        harga_5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_5.setText("jLabel6");

        stok_5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_5.setText("jLabel6");

        jLabel61.setBackground(new java.awt.Color(102, 0, 204));
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mnm5.png"))); // NOI18N
        jLabel61.setText("jLabel2");

        nama_6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_6.setText("jLabel6");

        jLabel63.setBackground(new java.awt.Color(102, 0, 204));
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mnm6.png"))); // NOI18N
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
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mnm7.png"))); // NOI18N
        jLabel71.setText("jLabel2");

        jLabel72.setBackground(new java.awt.Color(102, 0, 204));
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mnm8.png"))); // NOI18N
        jLabel72.setText("jLabel2");

        nama_8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_8.setText("jLabel6");

        kd_8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_8.setText("jLabel6");

        harga_8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_8.setText("jLabel6");

        stok_8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_8.setText("jLabel6");

        jLabel77.setBackground(new java.awt.Color(102, 0, 204));
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mnm9.png"))); // NOI18N
        jLabel77.setText("jLabel2");

        nama_9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_9.setText("jLabel6");

        kd_9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_9.setText("jLabel6");

        harga_9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_9.setText("jLabel6");

        stok_9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_9.setText("jLabel6");

        nama_10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama_10.setText("jLabel6");

        kd_10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        kd_10.setText("jLabel6");

        harga_10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        harga_10.setText("jLabel6");

        stok_10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        stok_10.setText("jLabel6");

        jLabel86.setBackground(new java.awt.Color(102, 0, 204));
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mnm10.png"))); // NOI18N

        status_2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_2.setText("jLabel6");

        status_1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_1.setText("jLabel6");

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

        status_8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_8.setText("jLabel6");

        status_9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_9.setText("jLabel6");

        status_10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        status_10.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nama_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kd_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(harga_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stok_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nama_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kd_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(harga_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stok_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nama_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kd_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(harga_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stok_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nama_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kd_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(harga_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stok_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nama_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kd_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(harga_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stok_9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(status_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status_7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(status_9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kd_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(harga_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stok_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kd_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(harga_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stok_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nama_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kd_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(harga_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stok_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nama_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kd_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(harga_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stok_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nama_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kd_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(harga_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(status_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(status_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(status_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stok_10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status_10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(179, 179, 179))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46))
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(142, 142, 142)
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
                    .addComponent(jLabel61)
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
                    .addComponent(jLabel63))
                .addGap(143, 143, 143)
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
                    .addComponent(jLabel71)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nama_8)
                        .addGap(8, 8, 8)
                        .addComponent(kd_8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(harga_8)
                        .addGap(5, 5, 5)
                        .addComponent(stok_8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status_8))
                    .addComponent(jLabel72))
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nama_9)
                        .addGap(8, 8, 8)
                        .addComponent(kd_9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(harga_9)
                        .addGap(5, 5, 5)
                        .addComponent(stok_9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status_9))
                    .addComponent(jLabel77)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nama_10)
                        .addGap(8, 8, 8)
                        .addComponent(kd_10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(harga_10)
                        .addGap(5, 5, 5)
                        .addComponent(stok_10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status_10))
                    .addComponent(jLabel86))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        panel_utama.add(jPanel6, "card2");

        add(panel_utama, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        panel_utama.removeAll();
        panel_utama.add(new Makanan());
        panel_utama.repaint();
        panel_utama.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel harga_1;
    private javax.swing.JLabel harga_10;
    private javax.swing.JLabel harga_2;
    private javax.swing.JLabel harga_3;
    private javax.swing.JLabel harga_4;
    private javax.swing.JLabel harga_5;
    private javax.swing.JLabel harga_6;
    private javax.swing.JLabel harga_7;
    private javax.swing.JLabel harga_8;
    private javax.swing.JLabel harga_9;
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
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel kd_1;
    private javax.swing.JLabel kd_10;
    private javax.swing.JLabel kd_2;
    private javax.swing.JLabel kd_3;
    private javax.swing.JLabel kd_4;
    private javax.swing.JLabel kd_5;
    private javax.swing.JLabel kd_6;
    private javax.swing.JLabel kd_7;
    private javax.swing.JLabel kd_8;
    private javax.swing.JLabel kd_9;
    private javax.swing.JLabel nama_1;
    private javax.swing.JLabel nama_10;
    private javax.swing.JLabel nama_2;
    private javax.swing.JLabel nama_3;
    private javax.swing.JLabel nama_4;
    private javax.swing.JLabel nama_5;
    private javax.swing.JLabel nama_6;
    private javax.swing.JLabel nama_7;
    private javax.swing.JLabel nama_8;
    private javax.swing.JLabel nama_9;
    private javax.swing.JPanel panel_utama;
    private javax.swing.JLabel status_1;
    private javax.swing.JLabel status_10;
    private javax.swing.JLabel status_2;
    private javax.swing.JLabel status_3;
    private javax.swing.JLabel status_4;
    private javax.swing.JLabel status_5;
    private javax.swing.JLabel status_6;
    private javax.swing.JLabel status_7;
    private javax.swing.JLabel status_8;
    private javax.swing.JLabel status_9;
    private javax.swing.JLabel stok_1;
    private javax.swing.JLabel stok_10;
    private javax.swing.JLabel stok_2;
    private javax.swing.JLabel stok_3;
    private javax.swing.JLabel stok_4;
    private javax.swing.JLabel stok_5;
    private javax.swing.JLabel stok_6;
    private javax.swing.JLabel stok_7;
    private javax.swing.JLabel stok_8;
    private javax.swing.JLabel stok_9;
    // End of variables declaration//GEN-END:variables
}
