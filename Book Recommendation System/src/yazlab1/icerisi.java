package yazlab1;

import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class icerisi extends javax.swing.JDialog {

    Database db = new Database();
    GirisEkrani giris;
    private Users currentUser;
    DefaultTableModel girisModel = null;

    public icerisi(java.awt.Frame parent, boolean modal, Users currentUser, GirisEkrani giris) throws IOException {
        super(parent, modal);
        initComponents();
        this.currentUser = currentUser;
        this.giris = giris;
        girisModel = (DefaultTableModel) girisTable.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        girisTable = new javax.swing.JTable();
        label1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        b_recommend = new javax.swing.JMenu();
        b_mostVoted = new javax.swing.JMenu();
        b_highScore = new javax.swing.JMenu();
        b_new = new javax.swing.JMenu();
        b_usual = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        girisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Title", "Author", "YOP", "Publisher"
            }
        ));
        girisTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girisTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(girisTable);

        jButton1.setText("OKU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Çıkış Yap");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        b_recommend.setText("ÖNERİ");
        b_recommend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_recommendMouseClicked(evt);
            }
        });
        jMenuBar1.add(b_recommend);

        b_mostVoted.setText("EN ÇOK OYLANAN KİTAPLAR");
        b_mostVoted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_mostVotedMouseClicked(evt);
            }
        });
        jMenuBar1.add(b_mostVoted);

        b_highScore.setText("EN YÜKSEK PUANLI KİTAPLAR");
        b_highScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_highScoreMouseClicked(evt);
            }
        });
        jMenuBar1.add(b_highScore);

        b_new.setText("EN YENİ 5 KİTAP");
        b_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_newMouseClicked(evt);
            }
        });
        jMenuBar1.add(b_new);

        b_usual.setText("TÜM KİTAPLAR");
        b_usual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_usualMouseClicked(evt);
            }
        });
        b_usual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_usualActionPerformed(evt);
            }
        });
        jMenuBar1.add(b_usual);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton1)
                        .addGap(100, 100, 100))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_recommendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_recommendMouseClicked

        try {
            populateTable();
        } catch (IOException ex) {
            Logger.getLogger(icerisi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_b_recommendMouseClicked

    private void b_mostVotedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_mostVotedMouseClicked

        ArrayList<Kitaplar> mostVotedBooks = db.getMostVotedTenBooks();

        String[] columnName = {"ISBN", "Frequency", " Title", "Author", "Year Of Publication", "Publisher"};
        Object[][] rows = new Object[mostVotedBooks.size()][columnName.length];

        for (int i = 0; i < mostVotedBooks.size(); i++) {
            rows[i][0] = mostVotedBooks.get(i).getISBN();
            rows[i][1] = mostVotedBooks.get(i).getFrequency();
            rows[i][2] = mostVotedBooks.get(i).getKitapadi();
            rows[i][3] = mostVotedBooks.get(i).getYazaradi();
            rows[i][4] = mostVotedBooks.get(i).getYayinyili();
            rows[i][5] = mostVotedBooks.get(i).getYayinevi();
        }
        GirisModel model = new GirisModel(columnName, rows);
        girisTable.setModel(model);
        girisTable.setRowHeight(35);

    }//GEN-LAST:event_b_mostVotedMouseClicked

    private void b_highScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_highScoreMouseClicked
        ArrayList<Kitaplar> highScoreBooks = db.getHighScoreBooks();
        String[] columnName = {"ISBN", " Title", "Author", "Year Of Publication", "Publisher"};
        Object[][] rows = new Object[highScoreBooks.size()][5];

        for (int i = 0; i < highScoreBooks.size(); i++) {
            rows[i][0] = highScoreBooks.get(i).getISBN();
            rows[i][1] = highScoreBooks.get(i).getKitapadi();
            rows[i][2] = highScoreBooks.get(i).getYazaradi();
            rows[i][3] = highScoreBooks.get(i).getYayinyili();
            rows[i][4] = highScoreBooks.get(i).getYayinevi();
        }
        GirisModel model = new GirisModel(columnName, rows);
        girisTable.setModel(model);
        girisTable.setRowHeight(35);


    }//GEN-LAST:event_b_highScoreMouseClicked

    private void girisTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = girisTable.getSelectedRow();
        String isbn = girisTable.getValueAt(selectedRow, 0).toString();
        String u = db.getBookUrl(isbn);
        if (u.length() > 5) {
            URL url;
            System.out.println("get book url : " + u);
            try {
                url = new URL(u);
                Image image = ImageIO.read(url);
                label1.setIcon(new ImageIcon(image));
            } catch (MalformedURLException ex) {
                Logger.getLogger(icerisi.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(icerisi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_girisTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String filepath = "C:\\Users\\hakan\\Desktop\\Yazılım_Lab_I\\db_dvc_book_excerpts.pdf";

        boolean isEmpty = girisTable.getSelectionModel().isSelectionEmpty();

        if (!isEmpty) {
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File(filepath);
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    // no application registered for PDFs
                }
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_newMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_newMouseClicked

        ArrayList<Kitaplar> kitaplar = db.getRecentBooks();

        //String[] columnName = {"Title", "Author", "YOP", "Publisher", "ISBN"};
        String[] columnName = {"ISBN", " Title", "Author", "Year Of Publication", "Publisher"};
        Object[][] rows = new Object[kitaplar.size()][5];

        for (int i = 0; i < kitaplar.size(); i++) {
            rows[i][0] = kitaplar.get(i).getISBN();
            rows[i][1] = kitaplar.get(i).getKitapadi();
            rows[i][2] = kitaplar.get(i).getYazaradi();
            rows[i][3] = kitaplar.get(i).getYayinyili();
            rows[i][4] = kitaplar.get(i).getYayinevi();
        }
        GirisModel model = new GirisModel(columnName, rows);
        girisTable.setModel(model);
        girisTable.setRowHeight(35);
    }//GEN-LAST:event_b_newMouseClicked

    private void b_usualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_usualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_usualActionPerformed

    private void b_usualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_usualMouseClicked

        ArrayList<Kitaplar> allBooks = db.kitaplarigetir();
        String[] columnName = {"ISBN", " Title", "Author", "Year Of Publication", "Publisher"};
        Object[][] rows = new Object[allBooks.size()][5];

        for (int i = 0; i < allBooks.size(); i++) {
            rows[i][0] = allBooks.get(i).getISBN();
            rows[i][1] = allBooks.get(i).getKitapadi();
            rows[i][2] = allBooks.get(i).getYazaradi();
            rows[i][3] = allBooks.get(i).getYayinyili();
            rows[i][4] = allBooks.get(i).getYayinevi();
        }
        GirisModel model = new GirisModel(columnName, rows);
        girisTable.setModel(model);
        girisTable.setRowHeight(35);


    }//GEN-LAST:event_b_usualMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
         
        this.dispose();
        giris.setVisible(true);
        giris.setKullaniciAdiAlani("");        
        giris.setSifreAlani("");
    }//GEN-LAST:event_jButton2ActionPerformed

    public void populateTable() throws MalformedURLException, IOException {

        // Bu fonksiyonu recommender'a koyabiliriz.
        ArrayList<Users> users = db.bringRatings();
        System.out.println("users size : " + users.size());
        ArrayList<Kitaplar> kitaplar = Recommender.getRecBooks(users, currentUser);

        System.out.println(currentUser);
        

        //String[] columnName = {"Title", "Author", "YOP", "Publisher", "ISBN"};
        String[] columnName = {"ISBN", " Title", "Author", "Year Of Publication", "Publisher"};
        Object[][] rows = new Object[kitaplar.size()][5];
        System.out.println("Kitaplar size : " + kitaplar.size());

        for (int i = 0; i < kitaplar.size(); i++) {
            rows[i][0] = kitaplar.get(i).getISBN();
            rows[i][1] = kitaplar.get(i).getKitapadi();
            rows[i][2] = kitaplar.get(i).getYazaradi();
            rows[i][3] = kitaplar.get(i).getYayinyili();
            rows[i][4] = kitaplar.get(i).getYayinevi();
        }
        GirisModel model = new GirisModel(columnName, rows);
        girisTable.setModel(model);
        girisTable.setRowHeight(35);
        //girisTable.getColumnModel().getColumn(5).setPreferredWidth(150);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu b_highScore;
    private javax.swing.JMenu b_mostVoted;
    private javax.swing.JMenu b_new;
    private javax.swing.JMenu b_recommend;
    private javax.swing.JMenu b_usual;
    private javax.swing.JTable girisTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
