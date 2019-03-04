package yazlab1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class KayitOlmaAlani extends javax.swing.JDialog {

    Database dat = new Database();
    DefaultTableModel model;
    DefaultTableModel secilen_model;
    ArrayList<Kitaplar> secilen;
    GirisEkrani giris;

    public KayitOlmaAlani(java.awt.Frame parent, boolean modal, GirisEkrani giris) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) Kitap_Tablosu.getModel();
        secilen_model = (DefaultTableModel) secilen_table.getModel();
        secilen = new ArrayList<Kitaplar>();
        this.giris = giris;
        kitaplariGoruntule();
        String[] ratings = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        JComboBox comboBox = new JComboBox(ratings);
        secilen_table.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(comboBox));
    }

    void kitaplariGoruntule() {
        model.setRowCount(0);

        ArrayList<Kitaplar> kitaplar = new ArrayList<Kitaplar>();
        kitaplar = dat.kitaplarigetir();

        if (kitaplar != null) {
            for (Kitaplar kitap : kitaplar) {
                Object[] eklenecek = {kitap.getISBN(), kitap.getKitapadi(), kitap.getYazaradi(), kitap.getYayinyili(), kitap.getYayinevi()};
                model.addRow(eklenecek);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Kayit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        KullaniciID = new javax.swing.JLabel();
        Yeni_k_adi = new javax.swing.JTextField();
        Yeni_k_sifre = new javax.swing.JTextField();
        Yeni_k_yas = new javax.swing.JTextField();
        Yeni_k_lokasyon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Kitap_Tablosu = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        secilen_table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        kalan_kitapsayisi = new javax.swing.JLabel();
        emptyWarning = new javax.swing.JLabel();
        geri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Kayit.setText("Kayıt");
        Kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KayitActionPerformed(evt);
            }
        });

        jLabel1.setText("Yeni Kullanıcı Adı");

        jLabel2.setText("Yeni Kullanıcı Şifre");

        jLabel3.setText("Yaş");

        jLabel4.setText("Lokasyon");

        KullaniciID.setText("Yeni Kullanıcı ID : ");

        Yeni_k_sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yeni_k_sifreActionPerformed(evt);
            }
        });

        Kitap_Tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Book Title", "Book Author", "Year of Publician", "Publisher"
            }
        ));
        Kitap_Tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kitap_TablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Kitap_Tablosu);

        jLabel5.setText("Tablodan 10 adet kitap seçmelisiniz.");

        jToolBar1.setRollover(true);

        secilen_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Book Title", "Book Author", "Year of  Publication", "Publisher", "Ratings"
            }
        ));
        jScrollPane2.setViewportView(secilen_table);

        jLabel6.setText("Seçtiğiniz kitapları lütfen oylayın.");

        kalan_kitapsayisi.setText("     .");

        geri.setText("Geri");
        geri.setFocusable(false);
        geri.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        geri.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Yeni_k_sifre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Yeni_k_adi)
                                    .addComponent(Yeni_k_yas, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Yeni_k_lokasyon, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(30, 30, 30)
                                .addComponent(Kayit)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emptyWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KullaniciID, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kalan_kitapsayisi)
                                        .addGap(406, 406, 406))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(jLabel6)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(449, 449, 449)
                                .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(162, 162, 162))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yeni_k_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Yeni_k_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Yeni_k_yas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Yeni_k_lokasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Kayit)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(emptyWarning)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kalan_kitapsayisi)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(KullaniciID)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KayitActionPerformed

        int id = new Integer(dat.getMaxUserId()) + 1;
        String k_adi = Yeni_k_adi.getText();
        String k_sifre = Yeni_k_sifre.getText();
        String k_yas = Yeni_k_yas.getText();
        String k_lokasyon = Yeni_k_lokasyon.getText();

        KullaniciID.setText("Yeni Kullanıcı ID : " + Integer.toString(id));

        if (k_adi.trim().isEmpty() || k_sifre.trim().isEmpty()
                || k_yas.trim().isEmpty() || k_lokasyon.trim().isEmpty()) {
            emptyWarning.setText("Bu alanlar boş bırakılamaz!");
        } else if (canConfirm()) {
            emptyWarning.setText("Kayıt Başarılı!");
            dat.kullaniciKayitYap(id, k_yas, k_lokasyon, k_adi, k_sifre);
            dat.kitapKayit(id, createRatingMap());
        } else {
            int kalanOySayisi = howManyVoteLeft();
            if (kalanOySayisi <= 0) {
                emptyWarning.setText("Oylamadığınız kitaplar var.");
            } else {
                emptyWarning.setText(kalanOySayisi + " kitap oylamanız gerekmektedir.");
            }
        }
    }//GEN-LAST:event_KayitActionPerformed

    private HashMap<String, Integer> createRatingMap() {
        // ratingMap ISBN: rating seklinde kitaplara verilen oyları tutuyor.
        HashMap<String, Integer> ratingMap = new HashMap<>();
        for (int i = 0; i < secilen.size(); i++) {
            ratingMap.put(secilen.get(i).getISBN(), getRating(i));
        }
        return ratingMap;
    }

    private void Yeni_k_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yeni_k_sifreActionPerformed

    }//GEN-LAST:event_Yeni_k_sifreActionPerformed


    private void Kitap_TablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kitap_TablosuMouseClicked
        int selectedRowIndex = Kitap_Tablosu.getSelectedRow();

        Kitaplar tempBook = new Kitaplar(model.getValueAt(selectedRowIndex, 0).toString(),
                model.getValueAt(selectedRowIndex, 1).toString(),
                model.getValueAt(selectedRowIndex, 2).toString(),
                (int) model.getValueAt(selectedRowIndex, 3),
                model.getValueAt(selectedRowIndex, 4).toString());
        if (!secilen.contains(tempBook)) {
            secilen.add(tempBook);
            Object[] eklenecek = {tempBook.getISBN(),
                tempBook.getKitapadi(),
                tempBook.getYazaradi(),
                tempBook.getYayinyili(),
                tempBook.getYayinevi()};
            secilen_model.addRow(eklenecek);

        }

    }//GEN-LAST:event_Kitap_TablosuMouseClicked

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed

        this.setVisible(false);
        giris.setVisible(true);

    }//GEN-LAST:event_geriActionPerformed

    private boolean canConfirm() {
        int kalanOySayisi = howManyVoteLeft();
        // Eğer yeterince kitap oylamadıysak 
        // kayıt işlemi onaylanamaz.
        return !(kalanOySayisi <= 10 && kalanOySayisi > 0) && isBookVoted();
    }

    private int getRating(int row) {
        // row. satırdaki kitabın oyunu getir.
        return new Integer(secilen_table.getValueAt(row, 5).toString());
    }

    private int howManyVoteLeft() {
        int secilenSize = secilen.size();
        //int kalanOySayisi = 10 - secilenSize;
        //return kalanOySayisi <= 0 ? 0: kalanOySayisi;

        Object val = null;
        int count = 10;
        for (int i = 0; i < secilenSize; i++) {
            val = secilen_table.getValueAt(i, 5);
            if (val != null) {
                count--;
            }
        }
        return count;
    }

    private boolean isBookVoted() {
        int table_size = secilen.size();
        boolean isVoted = true;
        Object val;
        for (int i = 0; i < table_size; i++) {
            val = secilen_table.getValueAt(i, 5);
            if (val == null) {
                isVoted = false;
            }
        }
        return isVoted;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kayit;
    private javax.swing.JTable Kitap_Tablosu;
    private javax.swing.JLabel KullaniciID;
    private javax.swing.JTextField Yeni_k_adi;
    private javax.swing.JTextField Yeni_k_lokasyon;
    private javax.swing.JTextField Yeni_k_sifre;
    private javax.swing.JTextField Yeni_k_yas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel emptyWarning;
    private javax.swing.JButton geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel kalan_kitapsayisi;
    private javax.swing.JTable secilen_table;
    // End of variables declaration//GEN-END:variables
}
