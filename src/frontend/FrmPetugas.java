/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.Petugas;
import java.util.ArrayList;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class FrmPetugas extends javax.swing.JFrame {
    String Gender = "";
    /**
     * Creates new form 
     */
    public FrmPetugas() {
        initComponents();
        tampilkanData();
        kosongkanForm();
    }
    
    public final void kosongkanForm(){
        txtIdPetugas.setText("0");
        txtNama.setText("");
        txtAlamat.setText("");
        txtTelepon.setText("");
        groupGender.clearSelection();
    }
    
    public final void tampilkanData(){
        String[] kolom = {"ID", "Nama", "Alamat", "Telepon", "Gender"};
        ArrayList<Petugas> list = new Petugas().getAll();
        Object rowData[] = new Object[5];
        
        tblPetugas.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(Petugas A : list){
            rowData[0] = A.getIdPetugas();
            rowData[1] = A.getNama();
            rowData[2] = A.getAlamat();
            rowData[3] = A.getTelepon();
            rowData[4] = A.getGender();
            
            ((DefaultTableModel)tblPetugas.getModel()).addRow(rowData);
        }
    }
    
    public void cari(String keyword){
        String[] kolom = {"IdPetugas", "Nama", "Alamat", "Telepon", "Gender"};
        ArrayList<Petugas> list = new Petugas().search(keyword);
        Object rowData[] = new Object[5];
        
        tblPetugas.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(Petugas A : list){
            rowData[0] = A.getIdPetugas();
            rowData[1] = A.getNama();
            rowData[2] = A.getAlamat();
            rowData[3] = A.getTelepon();
            rowData[4] = A.getGender();
            
            ((DefaultTableModel)tblPetugas.getModel()).addRow(rowData);
        }
    }

    public void FrmAnggota(){
        initComponents();
        tampilkanData();
        kosongkanForm();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        groupGender = new javax.swing.ButtonGroup();
        groupStudi = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdPetugas = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPetugas = new javax.swing.JTable();
        txtTelepon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rButtonLk = new javax.swing.JRadioButton();
        rButtonPr = new javax.swing.JRadioButton();
        btnRefresh = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuHome = new javax.swing.JMenuItem();
        jMenuAnggota = new javax.swing.JMenuItem();
        jMenuPetugas = new javax.swing.JMenuItem();
        jMenuBuku = new javax.swing.JMenuItem();
        jMenuKategori = new javax.swing.JMenuItem();
        jMenuPeminjaman = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        Quit = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID Petugas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nama Petugas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Alamat");

        txtIdPetugas.setEditable(false);
        txtIdPetugas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIdPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPetugasActionPerformed(evt);
            }
        });

        txtNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtAlamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(153, 102, 255));
        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/gtk-save-as.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahBaru.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnCari.setBackground(new java.awt.Color(255, 255, 153));
        btnCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Text preview.png"))); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 102, 102));
        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/document_delete.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        tblPetugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPetugasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPetugas);

        txtTelepon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleponActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Telepon");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel6.setText("PERPUSTAKAAN Politeknik negeri jember");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(25, 25, 25))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Gender");

        groupGender.add(rButtonLk);
        rButtonLk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rButtonLk.setText("Laki-laki");
        rButtonLk.setAutoscrolls(true);
        rButtonLk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rButtonLkMouseClicked(evt);
            }
        });
        rButtonLk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonLkActionPerformed(evt);
            }
        });

        groupGender.add(rButtonPr);
        rButtonPr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rButtonPr.setText("Perempuan");
        rButtonPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonPrActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel9.setText("Menu PETUGAS");

        jMenu1.setText("Menu");

        jMenuHome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        jMenuHome.setText("Home");
        jMenuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHomeActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuHome);

        jMenuAnggota.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuAnggota.setText("Anggota");
        jMenuAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAnggotaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAnggota);

        jMenuPetugas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuPetugas.setText("Petugas");
        jMenuPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPetugasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuPetugas);

        jMenuBuku.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jMenuBuku.setText("Buku");
        jMenuBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBukuActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuBuku);

        jMenuKategori.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_MASK));
        jMenuKategori.setText("Kategori");
        jMenuKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKategoriActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuKategori);

        jMenuPeminjaman.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuPeminjaman.setText("Peminjaman");
        jMenuPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPeminjamanActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuPeminjaman);

        jMenuBar2.add(jMenu1);

        Edit.setText("Aksi");

        Quit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        Edit.add(Quit);

        jMenuBar2.add(Edit);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSimpan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTambahBaru))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNama))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(39, 39, 39)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(rButtonLk)
                                                            .addGap(15, 15, 15)
                                                            .addComponent(rButtonPr))))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(44, 44, 44)
                                                    .addComponent(txtIdPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnHapus)
                                        .addGap(1, 1, 1)
                                        .addComponent(btnRefresh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCari))))
                            .addComponent(jLabel9))
                        .addGap(0, 115, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtIdPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHapus)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCari)
                        .addComponent(btnRefresh)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rButtonPr)
                            .addComponent(rButtonLk)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnTambahBaru)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        rButtonLk.setActionCommand("Laki-laki");
        rButtonLk.setActionCommand("Perempuan");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPetugasActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        Petugas A = new Petugas();
        ButtonModel gGender = groupGender.getSelection();
        if (gGender != null ) {
            if (rButtonLk.isSelected()) {
                Gender = rButtonLk.getText();
            } else if (rButtonPr.isSelected()) {
                Gender = rButtonPr.getText();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Jenis Kelamin belum diisi!! ");
        }
        
        
        A.setIdPetugas(Integer.parseInt(txtIdPetugas.getText()));
        A.setNama(txtNama.getText());
        A.setAlamat(txtAlamat.getText());
        A.setTelepon(txtTelepon.getText());
        A.setGender(Gender);
        A.save();
        txtIdPetugas.setText(Integer.toString(A.getIdPetugas()));
        tampilkanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblPetugas.getModel();
        int row = tblPetugas.getSelectedRow();
        
        Petugas kat = new Petugas().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        kat.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void tblPetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPetugasMouseClicked
         // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblPetugas.getModel();
        int row = tblPetugas.getSelectedRow();
        
        txtIdPetugas.setText(model.getValueAt(row, 0).toString());
        txtNama.setText(model.getValueAt(row, 1).toString());
        txtAlamat.setText(model.getValueAt(row, 2).toString());
        txtTelepon.setText(model.getValueAt(row, 3).toString());
        String gender = (model.getValueAt(row, 4).toString());
            if(gender.equals(rButtonLk.getActionCommand())){
                rButtonPr.setSelected(true);
            } else {
                rButtonLk.setSelected(true);
            }
    }//GEN-LAST:event_tblPetugasMouseClicked

    private void txtTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeleponActionPerformed

    private void rButtonLkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rButtonLkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rButtonLkMouseClicked

    private void rButtonLkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonLkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rButtonLkActionPerformed

    private void rButtonPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rButtonPrActionPerformed

    private void jMenuKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKategoriActionPerformed
        // TODO add your handling code here
        new FrmKategori().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuKategoriActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        // TODO add your handling code here:
        Object options[] = {"Ya", "Tidak"};
        int result = JOptionPane.showOptionDialog(this, "Apakah anda ingin keluar?", "Konfirmasi",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, options, options[1]);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_QuitActionPerformed

    private void jMenuAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAnggotaActionPerformed
        // TODO add your handling code here:
        new FrmAnggota().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuAnggotaActionPerformed

    private void jMenuBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBukuActionPerformed
        // TODO add your handling code here:
        new FrmBuku().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuBukuActionPerformed

    private void jMenuPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPeminjamanActionPerformed
        // TODO add your handling code here:
        new FrmPeminjaman().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuPeminjamanActionPerformed

    private void jMenuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHomeActionPerformed
        // TODO add your handling code here:
        new FrmMenuAwal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuHomeActionPerformed

    private void jMenuPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPetugasActionPerformed
        // TODO add your handling code here:
        new FrmPetugas().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuPetugasActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        tampilkanData();
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPetugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuItem Quit;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.ButtonGroup groupStudi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuAnggota;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuBuku;
    private javax.swing.JMenuItem jMenuHome;
    private javax.swing.JMenuItem jMenuKategori;
    private javax.swing.JMenuItem jMenuPeminjaman;
    private javax.swing.JMenuItem jMenuPetugas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rButtonLk;
    private javax.swing.JRadioButton rButtonPr;
    private javax.swing.JTable tblPetugas;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdPetugas;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables
}
