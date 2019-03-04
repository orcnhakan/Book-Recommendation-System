

package yazlab1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GirisEkrani extends javax.swing.JFrame {

    Database dat = new Database();
    
    public GirisEkrani() {
        initComponents();
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kullanici_adi_alani = new javax.swing.JTextField();
        Giris = new javax.swing.JButton();
        Kayit_ol = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mesaj_yazisi = new javax.swing.JLabel();
        sifre_alani = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kullanici_adi_alani.setToolTipText("");
        kullanici_adi_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_adi_alaniActionPerformed(evt);
            }
        });

        Giris.setText("Giriş");
        Giris.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                GirisAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirisActionPerformed(evt);
            }
        });

        Kayit_ol.setText("Kayıt Ol");
        Kayit_ol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kayit_olActionPerformed(evt);
            }
        });

        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        jLabel1.setText("Kullanıcı Adı:");

        jLabel2.setText("Şifre:");

        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 0));

        sifre_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifre_alaniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kullanici_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifre_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 219, Short.MAX_VALUE)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Kayit_ol, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(Giris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullanici_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifre_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(mesaj_yazisi)
                .addGap(27, 27, 27)
                .addComponent(Giris, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Kayit_ol)
                .addGap(18, 18, 18)
                .addComponent(admin)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullanici_adi_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_adi_alaniActionPerformed
       
    }//GEN-LAST:event_kullanici_adi_alaniActionPerformed

    private void GirisAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_GirisAncestorAdded
        
    }//GEN-LAST:event_GirisAncestorAdded

    private void GirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirisActionPerformed
        
        mesaj_yazisi.setText("");
        String ad = kullanici_adi_alani.getText();
        String sifre =new String(sifre_alani.getPassword());
        
        boolean giriskontrol = dat.girisYap(ad, sifre);
        int userId;
        if(giriskontrol){
            
            icerisi icerisi = null;
            try {
                userId = dat.bringUserID(ad, sifre);
                System.out.println("Giris ekrani userId : " + userId);
                Users currentUser = dat.getCurrentUserRatings(userId);
                icerisi = new icerisi(this, true, currentUser, this);
            } catch (IOException ex) {
                Logger.getLogger(GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
            setVisible(false);
            icerisi.setVisible(true);
            
        }
        else{
            
            mesaj_yazisi.setText("Giriş Başarısız,Lütfen Tekrar Deneyin !");
            
        }
       
    }//GEN-LAST:event_GirisActionPerformed

    private void Kayit_olActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kayit_olActionPerformed
        
      KayitOlmaAlani kayitolmaalani = new KayitOlmaAlani(this,true,this);
      setVisible(false);
      kayitolmaalani.setVisible(true);
      
        
    }//GEN-LAST:event_Kayit_olActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        
        AdminPaneli adminalani = new AdminPaneli(this,true,this);
        setVisible(false);
        adminalani.setVisible(true);
    }//GEN-LAST:event_adminActionPerformed

    private void sifre_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifre_alaniActionPerformed
        
    }//GEN-LAST:event_sifre_alaniActionPerformed
    public void setKullaniciAdiAlani(String text) {
        this.kullanici_adi_alani.setText(text);
    }
    public void setSifreAlani(String text) {
        this.sifre_alani.setText(text);
    }
  
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Giris;
    private javax.swing.JButton Kayit_ol;
    private javax.swing.JButton admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField kullanici_adi_alani;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JPasswordField sifre_alani;
    // End of variables declaration//GEN-END:variables
}
