/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poly.books.ui;


import javax.swing.JDialog;
import javax.swing.JFrame;
import poly.books.controller.PolybookController;
import poly.books.util.XIcon;

/**
 *
 * @author HuyNguyen
 */
public class PolybookJFrame extends javax.swing.JFrame implements poly.books.controller.PolybookController {

    /**
     * Creates new form PolybookJFrame 215 503
     */
    int x = 199;    //chieu rong
    int y = 660;    //chieu cao

    public PolybookJFrame() {
        initComponents();

        menu.setSize(199, 660);
    }

    public void openMenu() {
        menu.setSize(x, y);
        if (x == 0) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= 199; i++) {
                            menu.setSize(i, y);
                            Thread.sleep(1);
                        }
                    } catch (Exception e) {
                    }
                }
            }).start();
            x = 199;
        }
    }

    public void closeMenu() {
        menu.setSize(x, y);
        if (x == 199) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int i = 199; i >= 0; i--) {
                            menu.setSize(i, y);
                            Thread.sleep(2);
                        }
                    } catch (Exception e) {
                    }
                }
            }).start();
            x = 0;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        lbBanHang = new javax.swing.JLabel();
        lbQLSach = new javax.swing.JLabel();
        lbTaiKhoan = new javax.swing.JLabel();
        lbQuanLyKH = new javax.swing.JLabel();
        lbQuanLyHD = new javax.swing.JLabel();
        lbThongKe = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbgiamgia = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbDangXuat = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BanHang = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        TaiKhoan = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Quanlyhoadon = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        GiamGia = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        Thongke = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        KhachHang = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));

        main.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(0, 102, 102));
        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menu.setPreferredSize(new java.awt.Dimension(200, 577));

        lbBanHang.setBackground(new java.awt.Color(0, 102, 102));
        lbBanHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbBanHang.setForeground(new java.awt.Color(255, 255, 255));
        lbBanHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBanHang.setText("Bán Hàng");
        lbBanHang.setOpaque(true);
        lbBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBanHangMouseClicked(evt);
            }
        });

        lbQLSach.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbQLSach.setForeground(new java.awt.Color(255, 255, 255));
        lbQLSach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQLSach.setText("Quản lý sách");
        lbQLSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbQLSachMouseClicked(evt);
            }
        });

        lbTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lbTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTaiKhoan.setText("Tài khoản");
        lbTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTaiKhoanMouseClicked(evt);
            }
        });

        lbQuanLyKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbQuanLyKH.setForeground(new java.awt.Color(255, 255, 255));
        lbQuanLyKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLyKH.setText("Quản lý khách hàng");
        lbQuanLyKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbQuanLyKHMouseClicked(evt);
            }
        });

        lbQuanLyHD.setBackground(new java.awt.Color(0, 153, 153));
        lbQuanLyHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbQuanLyHD.setForeground(new java.awt.Color(255, 255, 255));
        lbQuanLyHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuanLyHD.setText("Quản lý hóa đơn");
        lbQuanLyHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbQuanLyHDMouseClicked(evt);
            }
        });

        lbThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lbThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThongKe.setText("Thống kê");
        lbThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThongKeMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(51, 51, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tên ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Chức vụ");

        lbgiamgia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbgiamgia.setForeground(new java.awt.Color(255, 255, 255));
        lbgiamgia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbgiamgia.setText("Giảm giá");
        lbgiamgia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbgiamgiaMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_import_25px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        lbDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lbDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDangXuat.setText("Đăng xuất");
        lbDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDangXuatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbBanHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbQLSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbQuanLyKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbQuanLyHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbgiamgia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel7))
            .addComponent(lbDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQLSach, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQuanLyKH, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQuanLyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbgiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel13.setBackground(new java.awt.Color(0, 204, 204));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Bán Hàng");
        jLabel13.setOpaque(true);

        javax.swing.GroupLayout BanHangLayout = new javax.swing.GroupLayout(BanHang);
        BanHang.setLayout(BanHangLayout);
        BanHangLayout.setHorizontalGroup(
            BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
        );
        BanHangLayout.setVerticalGroup(
            BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BanHangLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 559, Short.MAX_VALUE))
        );

        jPanel2.add(BanHang, "card2");

        jLabel19.setBackground(new java.awt.Color(0, 204, 204));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Quản Lý Tài khoản");
        jLabel19.setOpaque(true);

        javax.swing.GroupLayout TaiKhoanLayout = new javax.swing.GroupLayout(TaiKhoan);
        TaiKhoan.setLayout(TaiKhoanLayout);
        TaiKhoanLayout.setHorizontalGroup(
            TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
        );
        TaiKhoanLayout.setVerticalGroup(
            TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaiKhoanLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 559, Short.MAX_VALUE))
        );

        jPanel2.add(TaiKhoan, "card4");

        jLabel20.setBackground(new java.awt.Color(0, 204, 204));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Quản Lý Hóa Đơn");
        jLabel20.setOpaque(true);

        javax.swing.GroupLayout QuanlyhoadonLayout = new javax.swing.GroupLayout(Quanlyhoadon);
        Quanlyhoadon.setLayout(QuanlyhoadonLayout);
        QuanlyhoadonLayout.setHorizontalGroup(
            QuanlyhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
        );
        QuanlyhoadonLayout.setVerticalGroup(
            QuanlyhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanlyhoadonLayout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 559, Short.MAX_VALUE))
        );

        jPanel2.add(Quanlyhoadon, "card5");

        jLabel21.setBackground(new java.awt.Color(0, 204, 204));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Quản Lý giảm giá");
        jLabel21.setOpaque(true);

        javax.swing.GroupLayout GiamGiaLayout = new javax.swing.GroupLayout(GiamGia);
        GiamGia.setLayout(GiamGiaLayout);
        GiamGiaLayout.setHorizontalGroup(
            GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
        );
        GiamGiaLayout.setVerticalGroup(
            GiamGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GiamGiaLayout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 559, Short.MAX_VALUE))
        );

        jPanel2.add(GiamGia, "card6");

        jLabel22.setBackground(new java.awt.Color(0, 204, 204));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Thống kê");
        jLabel22.setOpaque(true);

        javax.swing.GroupLayout ThongkeLayout = new javax.swing.GroupLayout(Thongke);
        Thongke.setLayout(ThongkeLayout);
        ThongkeLayout.setHorizontalGroup(
            ThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
        );
        ThongkeLayout.setVerticalGroup(
            ThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongkeLayout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 474, Short.MAX_VALUE))
        );

        jPanel2.add(Thongke, "card7");

        jLabel23.setBackground(new java.awt.Color(0, 204, 204));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("QuanLý Khách Hàng");
        jLabel23.setOpaque(true);

        javax.swing.GroupLayout KhachHangLayout = new javax.swing.GroupLayout(KhachHang);
        KhachHang.setLayout(KhachHangLayout);
        KhachHangLayout.setHorizontalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
        );
        KhachHangLayout.setVerticalGroup(
            KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhachHangLayout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 474, Short.MAX_VALUE))
        );

        jPanel2.add(KhachHang, "card8");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        openMenu();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        closeMenu();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void lbBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBanHangMouseClicked
        BanHang.setVisible(true);
        Quanlyhoadon.setVisible(false);
        TaiKhoan.setVisible(false);
        KhachHang.setVisible(false);
        Thongke.setVisible(false);
        GiamGia.setVisible(false);

    }//GEN-LAST:event_lbBanHangMouseClicked

    private void lbQLSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQLSachMouseClicked
        this.showQuanLySach(this);
     }//GEN-LAST:event_lbQLSachMouseClicked

    private void lbTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTaiKhoanMouseClicked
        BanHang.setVisible(false);

        Quanlyhoadon.setVisible(false);
        TaiKhoan.setVisible(true);
        KhachHang.setVisible(false);
        Thongke.setVisible(false);
        GiamGia.setVisible(false);
    }//GEN-LAST:event_lbTaiKhoanMouseClicked

    private void lbQuanLyKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuanLyKHMouseClicked
        BanHang.setVisible(false);

        Quanlyhoadon.setVisible(false);
        TaiKhoan.setVisible(false);
        KhachHang.setVisible(true);
        Thongke.setVisible(false);
        GiamGia.setVisible(false);     }//GEN-LAST:event_lbQuanLyKHMouseClicked

    private void lbQuanLyHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuanLyHDMouseClicked
        BanHang.setVisible(false);

        Quanlyhoadon.setVisible(true);
        TaiKhoan.setVisible(false);
        KhachHang.setVisible(false);
        Thongke.setVisible(false);
        GiamGia.setVisible(false);     }//GEN-LAST:event_lbQuanLyHDMouseClicked

    private void lbThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThongKeMouseClicked
        BanHang.setVisible(false);

        Quanlyhoadon.setVisible(false);
        TaiKhoan.setVisible(false);
        KhachHang.setVisible(false);
        Thongke.setVisible(true);
        GiamGia.setVisible(false);     }//GEN-LAST:event_lbThongKeMouseClicked

    private void lbgiamgiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbgiamgiaMouseClicked
        BanHang.setVisible(false);

        Quanlyhoadon.setVisible(false);
        TaiKhoan.setVisible(false);
        KhachHang.setVisible(false);
        Thongke.setVisible(false);
        GiamGia.setVisible(true);     }//GEN-LAST:event_lbgiamgiaMouseClicked

    private void lbDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDangXuatMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbDangXuatMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PolybookJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PolybookJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PolybookJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PolybookJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PolybookJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BanHang;
    private javax.swing.JPanel GiamGia;
    private javax.swing.JPanel KhachHang;
    private javax.swing.JPanel Quanlyhoadon;
    private javax.swing.JPanel TaiKhoan;
    private javax.swing.JPanel Thongke;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbBanHang;
    private javax.swing.JLabel lbDangXuat;
    private javax.swing.JLabel lbQLSach;
    private javax.swing.JLabel lbQuanLyHD;
    private javax.swing.JLabel lbQuanLyKH;
    private javax.swing.JLabel lbTaiKhoan;
    private javax.swing.JLabel lbThongKe;
    private javax.swing.JLabel lbgiamgia;
    private javax.swing.JPanel main;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
 @Override
    public void init() {
        this.setIconImage(XIcon.getIcon("/images/logo.png").getImage());
        this.setLocationRelativeTo(null);

        this.showWelcomeJDialog(this);
        this.showLoginJDialog(this);
//        XIcon.setIcon(lblPhoto, "photos/" + XAuth.user.getPhoto());
//        lblFullname.setText(XAuth.user.getFullname());
//
//        if (!XAuth.user.isManager()) {
//            pnlManager.setVisible(false);
//            getContentPane().revalidate(); 
//            getContentPane().repaint();
//        }    }
    }

    @Override
    public void exit() {
        PolybookController.super.exit(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showJDialog(JDialog dialog) {
        PolybookController.super.showJDialog(dialog); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showWelcomeJDialog(JFrame frame) {
        PolybookController.super.showWelcomeJDialog(frame); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showLoginJDialog(JFrame frame) {
        PolybookController.super.showLoginJDialog(frame); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void showQuanLySach(JFrame frame) {
        PolybookController.super.showQuanLySach(frame); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
