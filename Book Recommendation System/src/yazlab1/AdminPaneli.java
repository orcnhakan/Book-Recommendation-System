package yazlab1;

import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import sun.security.x509.X500Name;

public class AdminPaneli extends javax.swing.JDialog {

    Database dat = new Database();
    DefaultTableModel kitaplar_model;
    DefaultTableModel kullanici_model;
    ArrayList<Kitaplar> kitaplar;
    ArrayList<Users> kullanicilar;
    TableRowSorter<DefaultTableModel> findbook;
    TableRowSorter<DefaultTableModel> finduser;
    GirisEkrani giris;

    public AdminPaneli(java.awt.Frame parent, boolean modal,GirisEkrani giris) {
        super(parent, modal);
        initComponents();
        this.giris = giris;

        kitaplar_model = (DefaultTableModel) booksTable.getModel();
        kullanici_model = (DefaultTableModel) usersTable.getModel();
        kitaplar = new ArrayList<Kitaplar>();
        kullanicilar = new ArrayList<Users>();

        findbook = new TableRowSorter<DefaultTableModel>(kitaplar_model);
        finduser = new TableRowSorter<DefaultTableModel>(kullanici_model);

        verileriGoruntule();

    }

    public void dinamikAra(String ara) {

        booksTable.setRowSorter(findbook);
        findbook.setRowFilter(RowFilter.regexFilter(ara));

    }

    public void dinamikAra1(String ara) {

        usersTable.setRowSorter(finduser);
        finduser.setRowFilter(RowFilter.regexFilter(ara));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        bookınsert = new javax.swing.JButton();
        bookdelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        userdelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        arama_cubugu = new javax.swing.JTextField();
        arama_cubugu1 = new javax.swing.JTextField();
        bookupdate = new javax.swing.JButton();
        userupdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ısbn = new javax.swing.JTextField();
        booktitle = new javax.swing.JTextField();
        bookauthor = new javax.swing.JTextField();
        yearofpublication = new javax.swing.JTextField();
        publisher = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        userıd = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        mesaj_yazisi1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        geri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Book Title", "Book Author", "Year of Publication", "Publisher"
            }
        ));
        booksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booksTable);

        bookınsert.setText("Insert");
        bookınsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookınsertActionPerformed(evt);
            }
        });

        bookdelete.setText("Delete");
        bookdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookdeleteActionPerformed(evt);
            }
        });

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "User Name", "Location", "Age", "Password"
            }
        ));
        usersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(usersTable);

        userdelete.setText("Delete");
        userdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userdeleteActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("BOOKS");

        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("USERS");

        arama_cubugu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        arama_cubugu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        arama_cubugu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_cubugu1ActionPerformed(evt);
            }
        });
        arama_cubugu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubugu1KeyReleased(evt);
            }
        });

        bookupdate.setText("Update");
        bookupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookupdateActionPerformed(evt);
            }
        });

        userupdate.setText("Update");
        userupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userupdateActionPerformed(evt);
            }
        });

        jLabel3.setText("ISBN:");

        jLabel4.setText("Book Title:");

        jLabel5.setText("Publisher:");

        jLabel6.setText("Year of Publication:");

        jLabel7.setText("Book Author:");

        booktitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booktitleActionPerformed(evt);
            }
        });

        jLabel8.setText("User ID:");

        jLabel9.setText("User Name");

        jLabel10.setText("Age");

        jLabel11.setText("Location");

        userıd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userıdActionPerformed(evt);
            }
        });

        jLabel12.setText("Password:");

        geri.setText("Geri");
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
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(arama_cubugu1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(22, 22, 22)
                                        .addComponent(userıd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                            .addComponent(password))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(age)
                                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mesaj_yazisi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(85, 85, 85))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(userupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(userdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(arama_cubugu, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(57, 57, 57)
                                        .addComponent(bookauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel2)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(67, 67, 67)
                                        .addComponent(booktitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ısbn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(yearofpublication)
                                    .addComponent(publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bookınsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bookdelete, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(bookupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(238, 238, 238)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(bookupdate)
                                            .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bookınsert)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bookdelete))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(31, 31, 31)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(booktitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel4)))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel6)
                                                                .addComponent(yearofpublication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(ısbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel3))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jLabel5)
                                                            .addGap(7, 7, 7))
                                                        .addComponent(publisher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(1, 1, 1)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bookauthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mesaj_yazisi)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(arama_cubugu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(userıd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesaj_yazisi1)
                            .addComponent(jLabel12)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userupdate)
                            .addComponent(userdelete))
                        .addGap(68, 68, 68))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased

        String ara = arama_cubugu.getText();
        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void arama_cubugu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_cubugu1ActionPerformed


    }//GEN-LAST:event_arama_cubugu1ActionPerformed

    private void arama_cubugu1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubugu1KeyReleased
        String ara = arama_cubugu1.getText();
        dinamikAra1(ara);
    }//GEN-LAST:event_arama_cubugu1KeyReleased

    private void userıdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userıdActionPerformed

    }//GEN-LAST:event_userıdActionPerformed

    private void booktitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booktitleActionPerformed

    }//GEN-LAST:event_booktitleActionPerformed

    private void bookınsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookınsertActionPerformed
        mesaj_yazisi.setText("");

        String ISBN = ısbn.getText();
        String Book_Title = booktitle.getText();
        String Publisher = publisher.getText();
        String Publication = yearofpublication.getText();
        String Author = bookauthor.getText();

        Object[] o = {ISBN, Book_Title, Publisher, Publication, Author};

        int Publication1 = Integer.parseInt(Publication);
        dat.adminkitapkaydi(ISBN, Book_Title, Author, Publication1, Publisher, "books");
        dat.adminkitapkaydi(ISBN, Book_Title, Author, Publication1, Publisher, "recent_books");


        kitaplar_model.addRow(o);

        mesaj_yazisi.setText("Kayıt Başarıyla Gerçekleşti");

    }//GEN-LAST:event_bookınsertActionPerformed

    private void usersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersTableMouseClicked

        int selectedrow = usersTable.getSelectedRow();
        String userId = kullanici_model.getValueAt(selectedrow, 0).toString();
        if ( userId != null )
            userıd.setText(userId);
        else
            userıd.setText("NULL");
        
        try {
            String uName = kullanici_model.getValueAt(selectedrow, 1).toString();
            username.setText(uName);
        } catch (Exception e) {
            username.setText("NULL");
        }
        try {
            String a = kullanici_model.getValueAt(selectedrow, 3).toString();
            age.setText(a);
        } catch (Exception e) {
            age.setText("NULL");
        }
        
        try {
            String l = kullanici_model.getValueAt(selectedrow, 2).toString();
            location.setText(l);
        } catch (Exception e) {
            location.setText("NULL");
        }
        try {
            String p = kullanici_model.getValueAt(selectedrow, 4).toString();
            password.setText(p);
        } catch (Exception e) {
            password.setText("NULL");
        }

    }//GEN-LAST:event_usersTableMouseClicked

   
    
    private void userupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userupdateActionPerformed

        mesaj_yazisi1.setText("");

        String userId = userıd.getText();
        int userId1 = Integer.parseInt(userId);
        String userName = username.getText();
        String Age = age.getText();
        String Location = location.getText();
        String Password = password.getText();

        int selectedrow = usersTable.getSelectedRow();

        Object[] eklenecek = {userId, userName, Location, Age, Password};

        if (selectedrow == -1) {
            mesaj_yazisi1.setText("Kolon Boş");
        } else {

            int id = (int) kullanici_model.getValueAt(selectedrow, 0);

            dat.userUpdate(id, userName, Age, Location, Password);

            mesaj_yazisi1.setText("Kayit Başarıyla Güncellendi");

            kullanici_model.setValueAt(userId, selectedrow, 0);
            kullanici_model.setValueAt(userName, selectedrow, 1);
            kullanici_model.setValueAt(Location, selectedrow, 2);
            kullanici_model.setValueAt(Age, selectedrow, 3);
            kullanici_model.setValueAt(Password, selectedrow, 4);

        }
        // verileriGoruntule();

    }//GEN-LAST:event_userupdateActionPerformed

    private void userdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userdeleteActionPerformed

        String userID = userıd.getText();

        int selectedrow = usersTable.getSelectedRow();
        kullanici_model.removeRow(selectedrow);

        dat.kullaniciSil(userID);

        mesaj_yazisi1.setText("Kullanıcı Başarıyla Silindi");

    }//GEN-LAST:event_userdeleteActionPerformed

    private void booksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksTableMouseClicked
        int selectedrow = booksTable.getSelectedRow();

        ısbn.setText(kitaplar_model.getValueAt(selectedrow, 0).toString());
        booktitle.setText(kitaplar_model.getValueAt(selectedrow, 1).toString());
        bookauthor.setText(kitaplar_model.getValueAt(selectedrow, 3).toString());
        publisher.setText(kitaplar_model.getValueAt(selectedrow, 4).toString());
        yearofpublication.setText(kitaplar_model.getValueAt(selectedrow, 3).toString());
    }//GEN-LAST:event_booksTableMouseClicked

    private void bookdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookdeleteActionPerformed

        String ISBN = ısbn.getText();

        int selectedrow = booksTable.getSelectedRow();
        kitaplar_model.removeRow(selectedrow);

        dat.kitapSil(ISBN);

        mesaj_yazisi.setText("Kitap Başarıyla Silindi");
    }//GEN-LAST:event_bookdeleteActionPerformed

    private void bookupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookupdateActionPerformed

        mesaj_yazisi.setText("");

        String ISBN = ısbn.getText();
        String bookTitle = booktitle.getText();
        String bookAuthor = bookauthor.getText();
        String yearOP = yearofpublication.getText();
        String Publisher = publisher.getText();
        
        int yearOFPi = new Integer(yearOP) ;
       
        int selectedrow = booksTable.getSelectedRow();

        Object[] eklenecek = {ISBN, bookTitle, bookAuthor, yearOP, Publisher};

        if (selectedrow == -1) {
            mesaj_yazisi.setText("Kolon Boş");
        } else {

            
            

            dat.bookUpdate(ISBN, bookTitle, bookAuthor, yearOFPi, Publisher);

            mesaj_yazisi.setText("Kayit Başarıyla Güncellendi");

            kitaplar_model.setValueAt(ISBN, selectedrow, 0);
            kitaplar_model.setValueAt(bookTitle, selectedrow, 1);
            kitaplar_model.setValueAt(bookAuthor, selectedrow, 2);
            kitaplar_model.setValueAt(yearOP, selectedrow, 3);
            kitaplar_model.setValueAt(Publisher, selectedrow, 4);

        }
        // verileriGoruntule();


    }//GEN-LAST:event_bookupdateActionPerformed

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        
        this.setVisible(false);
        giris.setVisible(true);
    }//GEN-LAST:event_geriActionPerformed

    public void verileriGoruntule() {
        kitaplar_model.setRowCount(0);
        kullanici_model.setRowCount(0);
        
        kullanicilar = dat.kullaniciGetir();
        kitaplar = dat.kitaplarigetir();

        if (kitaplar != null) {
            for (Kitaplar kitap : kitaplar) {

                Object[] eklenecek = {kitap.getISBN(),
                    kitap.getKitapadi(),
                    kitap.getYazaradi(),
                    kitap.getYayinyili(),
                    kitap.getYayinevi()};

                kitaplar_model.addRow(eklenecek);
            }
        }
        if (kullanicilar != null) {

            for (Users user : kullanicilar) {

                Object[] eklenecek = {user.getuserId(),
                    user.getKullaniciAdi(),
                    user.getLokasyon(),
                    user.getYas(),
                    user.getKullaniciSifre()};

                kullanici_model.addRow(eklenecek);
            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JTextField arama_cubugu1;
    private javax.swing.JTextField bookauthor;
    private javax.swing.JButton bookdelete;
    private javax.swing.JTable booksTable;
    private javax.swing.JTextField booktitle;
    private javax.swing.JButton bookupdate;
    private javax.swing.JButton bookınsert;
    private javax.swing.JButton geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField location;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JLabel mesaj_yazisi1;
    private javax.swing.JTextField password;
    private javax.swing.JTextField publisher;
    private javax.swing.JButton userdelete;
    private javax.swing.JTextField username;
    private javax.swing.JTable usersTable;
    private javax.swing.JButton userupdate;
    private javax.swing.JTextField userıd;
    private javax.swing.JTextField yearofpublication;
    private javax.swing.JTextField ısbn;
    // End of variables declaration//GEN-END:variables
}
