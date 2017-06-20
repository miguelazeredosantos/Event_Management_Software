/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import lapr.project.model.EventCenter;
import lapr.project.utils.XMLReader;

/**
 *
 * @author Miguel Santos <1161386@isep.ipp.pt>
 */
public class MainWindow extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
    private EventCenter eventCenter;
    private boolean loginStatus = false;
    private boolean userStatus = false;
    private boolean organizerStatus = false;
    private boolean eventEmployeeStatus = false;
    private boolean eventManagerStatus = false;

    /**
     * Creates new form MainWindow
     *
     * @param eventCenter
     */
    public MainWindow(EventCenter eventCenter) {

        initComponents();
        this.eventCenter = eventCenter;
        updateLogin();
        this.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        loginMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        registerMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        createEventMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        defineUser = new javax.swing.JMenu();
        defineEventManagerMenuItem = new javax.swing.JMenuItem();
        defineOrganizerMenuItem = new javax.swing.JMenuItem();
        defineEmployeeMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        createStandMenuItem = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        submitApplicationMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        decideApplicationItem = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        statisticsMenu = new javax.swing.JMenu();
        showStandInformationMenuItem = new javax.swing.JMenuItem();
        showEmployeeMeanRatingMenuItem = new javax.swing.JMenuItem();
        showGlobalMeanRatingMenuItem = new javax.swing.JMenuItem();
        showEventsSubmissionKeywordsMenuItem = new javax.swing.JMenuItem();
        showEventAcceptanceRate = new javax.swing.JMenuItem();
        showGlobalAcceptanceRateMenuItem = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        helpMenuItem = new javax.swing.JMenuItem();
        importExportMenu = new javax.swing.JMenu();
        importXmlFileMenuItem = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        importMenuItem = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        exportMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Event Management");
        setResizable(false);

        jPanel1.setLayout(null);

        userNameLabel.setBackground(new java.awt.Color(0, 102, 204));
        userNameLabel.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(0, 204, 255));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(userNameLabel);
        userNameLabel.setBounds(430, 10, 160, 20);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagementImage.jpg"))); // NOI18N
        jLabel2.setText("asdasd");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 330);

        menu.setText("Menu");

        loginMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/keyring-icon.png"))); // NOI18N
        loginMenuItem.setText("Login");
        loginMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuItemActionPerformed(evt);
            }
        });
        menu.add(loginMenuItem);
        menu.add(jSeparator3);

        registerMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-user-group-new-icon.png"))); // NOI18N
        registerMenuItem.setMnemonic('M');
        registerMenuItem.setText("Register");
        registerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMenuItemActionPerformed(evt);
            }
        });
        menu.add(registerMenuItem);
        menu.add(jSeparator1);

        createEventMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calendar-icon.png"))); // NOI18N
        createEventMenuItem.setText("Create Event");
        createEventMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEventMenuItemActionPerformed(evt);
            }
        });
        menu.add(createEventMenuItem);
        menu.add(jSeparator4);

        defineUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Relationship-icon.png"))); // NOI18N
        defineUser.setText("Define User");

        defineEventManagerMenuItem.setText("Define Event Manager");
        defineEventManagerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEventManagerMenuItemActionPerformed(evt);
            }
        });
        defineUser.add(defineEventManagerMenuItem);

        defineOrganizerMenuItem.setText("Define Organizer");
        defineOrganizerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineOrganizerMenuItemActionPerformed(evt);
            }
        });
        defineUser.add(defineOrganizerMenuItem);

        defineEmployeeMenuItem.setText("Define Employee");
        defineEmployeeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineEmployeeMenuItemActionPerformed(evt);
            }
        });
        defineUser.add(defineEmployeeMenuItem);

        menu.add(defineUser);
        menu.add(jSeparator5);

        createStandMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-icon (1).png"))); // NOI18N
        createStandMenuItem.setText("Create Stand");
        createStandMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStandMenuItemActionPerformed(evt);
            }
        });
        menu.add(createStandMenuItem);
        menu.add(jSeparator7);

        submitApplicationMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Messaging-Gmail-Login-icon.png"))); // NOI18N
        submitApplicationMenuItem.setText("Submit Application");
        submitApplicationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitApplicationMenuItemActionPerformed(evt);
            }
        });
        menu.add(submitApplicationMenuItem);
        menu.add(jSeparator2);

        decideApplicationItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yellow-ok-icon.png"))); // NOI18N
        decideApplicationItem.setText("Decide Application");
        decideApplicationItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decideApplicationItemActionPerformed(evt);
            }
        });
        menu.add(decideApplicationItem);
        menu.add(jSeparator15);

        statisticsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphic.png"))); // NOI18N
        statisticsMenu.setText("Statistic");

        showStandInformationMenuItem.setText("Show Stands Information");
        showStandInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStandInformationMenuItemActionPerformed(evt);
            }
        });
        statisticsMenu.add(showStandInformationMenuItem);

        showEmployeeMeanRatingMenuItem.setText("Show Employee Mean Rating");
        showEmployeeMeanRatingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEmployeeMeanRatingMenuItemActionPerformed(evt);
            }
        });
        statisticsMenu.add(showEmployeeMeanRatingMenuItem);

        showGlobalMeanRatingMenuItem.setText("Show Global Mean Rating");
        showGlobalMeanRatingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGlobalMeanRatingMenuItemActionPerformed(evt);
            }
        });
        statisticsMenu.add(showGlobalMeanRatingMenuItem);

        showEventsSubmissionKeywordsMenuItem.setText("Show Event Submission Keywords");
        showEventsSubmissionKeywordsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEventsSubmissionKeywordsMenuItemActionPerformed(evt);
            }
        });
        statisticsMenu.add(showEventsSubmissionKeywordsMenuItem);

        showEventAcceptanceRate.setText("Show Event Acceptance Rate");
        showEventAcceptanceRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEventAcceptanceRateActionPerformed(evt);
            }
        });
        statisticsMenu.add(showEventAcceptanceRate);

        showGlobalAcceptanceRateMenuItem.setText("Show Global Acceptance Rate");
        showGlobalAcceptanceRateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGlobalAcceptanceRateMenuItemActionPerformed(evt);
            }
        });
        statisticsMenu.add(showGlobalAcceptanceRateMenuItem);

        menu.add(statisticsMenu);
        menu.add(jSeparator8);

        helpMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button-Info-icon.png"))); // NOI18N
        helpMenuItem.setText("Help");
        helpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuItemActionPerformed(evt);
            }
        });
        menu.add(helpMenuItem);

        jMenuBar1.add(menu);

        importExportMenu.setText("Import/Export");

        importXmlFileMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xml icon.png"))); // NOI18N
        importXmlFileMenuItem.setText("Import XML File");
        importXmlFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importXmlFileMenuItemActionPerformed(evt);
            }
        });
        importExportMenu.add(importXmlFileMenuItem);
        importExportMenu.add(jSeparator9);

        importMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/import-icon.png"))); // NOI18N
        importMenuItem.setText("Import File");
        importMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importMenuItemActionPerformed(evt);
            }
        });
        importExportMenu.add(importMenuItem);
        importExportMenu.add(jSeparator6);

        exportMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/export-icon.png"))); // NOI18N
        exportMenuItem.setText("Export File");
        exportMenuItem.setToolTipText("");
        exportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportMenuItemActionPerformed(evt);
            }
        });
        importExportMenu.add(exportMenuItem);

        jMenuBar1.add(importExportMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createEventMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEventMenuItemActionPerformed
        CreateEvent event = new CreateEvent(eventCenter);
    }//GEN-LAST:event_createEventMenuItemActionPerformed

    private void registerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerMenuItemActionPerformed
        CreateUser ur = new CreateUser(eventCenter);
    }//GEN-LAST:event_registerMenuItemActionPerformed

    private void loginMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuItemActionPerformed
        LoginUI login = new LoginUI(loginStatus, eventCenter, userNameLabel, userStatus, organizerStatus, eventEmployeeStatus, eventManagerStatus, MainWindow.this);

    }//GEN-LAST:event_loginMenuItemActionPerformed

    private void defineOrganizerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defineOrganizerMenuItemActionPerformed
        DefineOrganizer defineOrganizer = new DefineOrganizer(eventCenter);
    }//GEN-LAST:event_defineOrganizerMenuItemActionPerformed

    private void defineEventManagerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defineEventManagerMenuItemActionPerformed
        DefineEventManager dem = new DefineEventManager(eventCenter);
    }//GEN-LAST:event_defineEventManagerMenuItemActionPerformed

    private void defineEmployeeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defineEmployeeMenuItemActionPerformed
        DefineEventEmployee dee = new DefineEventEmployee(eventCenter);
    }//GEN-LAST:event_defineEmployeeMenuItemActionPerformed

    private void submitApplicationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitApplicationMenuItemActionPerformed
        try {
            SubmitApplication s = new SubmitApplication(eventCenter);
        } catch (ParseException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitApplicationMenuItemActionPerformed

    private void decideApplicationItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decideApplicationItemActionPerformed
        try {
            DecideApplicationUI dapp = new DecideApplicationUI(userNameLabel.getText(), eventCenter);
        } catch (ParseException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_decideApplicationItemActionPerformed

    private void exportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportMenuItemActionPerformed

        FileOutputStream outFile = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("/Documents"));
        int retrival = fileChooser.showSaveDialog(MainWindow.this);
        if (retrival == JFileChooser.APPROVE_OPTION) {

            SecretKey keyToMaximumScoreInLAPR = new SecretKeySpec(new byte[]{0x13, 0x45, 0x27, 0x19, 0x34, 0x50, 0x67, 0x024, 0x047, 0x09}, "blowfish");
            FileOutputStream file = null;
            try {
                Cipher cipher = Cipher.getInstance("blowfish");
                cipher.init(Cipher.ENCRYPT_MODE, keyToMaximumScoreInLAPR);
                SealedObject sealedObject = new SealedObject(eventCenter, cipher);
                file = new FileOutputStream(fileChooser.getSelectedFile() + ".bin");
                CipherOutputStream cipherOutputStream = new CipherOutputStream(new BufferedOutputStream(file), cipher);
                ObjectOutputStream outputStream = new ObjectOutputStream(cipherOutputStream);
                outputStream.writeObject(sealedObject);
                outputStream.close();
                JOptionPane.showMessageDialog(null, "All data saved!");
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    file.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Problem with reading from file");
                } catch (NullPointerException npx) {
                    JOptionPane.showMessageDialog(null, "Problem with outputing to file");
                }

            }

        }

    }//GEN-LAST:event_exportMenuItemActionPerformed


    private void importMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importMenuItemActionPerformed
        try {
            FileInputStream inputFile = null;
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("/Documents"));
            int retrival = fileChooser.showOpenDialog(MainWindow.this);
            if (retrival == JFileChooser.APPROVE_OPTION) {
                SecretKey keyToMaximumScoreInLAPR = new SecretKeySpec(new byte[]{0x13, 0x45, 0x27, 0x19, 0x34, 0x50, 0x67, 0x024, 0x047, 0x09}, "blowfish");
                FileInputStream file = null;
                try {
                    Cipher cipher = Cipher.getInstance("blowfish");
                    cipher.init(Cipher.DECRYPT_MODE, keyToMaximumScoreInLAPR);
                    file = new FileInputStream(fileChooser.getSelectedFile());
                    CipherInputStream cipherInputStream = new CipherInputStream(new BufferedInputStream((file)), cipher);
                    ObjectInputStream inputStream = new ObjectInputStream(cipherInputStream);
                    SealedObject sealedObject = (SealedObject) inputStream.readObject();
                    this.eventCenter = (EventCenter) sealedObject.getObject(cipher);

                    JOptionPane.showMessageDialog(null, "All data imported!");

                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    try {
                        file.close();
                    } catch (NullPointerException npx) {
                        JOptionPane.showMessageDialog(null, "Problem with reading from file");
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_importMenuItemActionPerformed

    private void showStandInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStandInformationMenuItemActionPerformed
        ShowEventStandsInformationUI sesi = new ShowEventStandsInformationUI(eventCenter);
    }//GEN-LAST:event_showStandInformationMenuItemActionPerformed

    private void showEmployeeMeanRatingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEmployeeMeanRatingMenuItemActionPerformed
        ShowEmployeeMeanRating semr = new ShowEmployeeMeanRating(eventCenter);
    }//GEN-LAST:event_showEmployeeMeanRatingMenuItemActionPerformed

    private void showEventsSubmissionKeywordsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEventsSubmissionKeywordsMenuItemActionPerformed
        ShowEventSubmissionKeywordsUI swsk = new ShowEventSubmissionKeywordsUI(eventCenter);
    }//GEN-LAST:event_showEventsSubmissionKeywordsMenuItemActionPerformed

    private void createStandMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStandMenuItemActionPerformed
        CreateStand createStand = new CreateStand(eventCenter);
    }//GEN-LAST:event_createStandMenuItemActionPerformed

    private void showEventAcceptanceRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEventAcceptanceRateActionPerformed
        ShowEventAcceptanceRateUI sear = new ShowEventAcceptanceRateUI(eventCenter);
    }//GEN-LAST:event_showEventAcceptanceRateActionPerformed

    private void showGlobalAcceptanceRateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGlobalAcceptanceRateMenuItemActionPerformed
        ShowGlobalAcceptanceRateUI sgar = new ShowGlobalAcceptanceRateUI(eventCenter);

    }//GEN-LAST:event_showGlobalAcceptanceRateMenuItemActionPerformed

    private void helpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuItemActionPerformed
        openWebPage("https://www.google.pt/");

    }//GEN-LAST:event_helpMenuItemActionPerformed

    private void showGlobalMeanRatingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGlobalMeanRatingMenuItemActionPerformed
        ShowGlobalMeanRatingUI sgmr = new ShowGlobalMeanRatingUI(eventCenter);
    }//GEN-LAST:event_showGlobalMeanRatingMenuItemActionPerformed

    private void importXmlFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importXmlFileMenuItemActionPerformed
        try {
            
            JFileChooser fileChooser = new JFileChooser();
            
            int retrival = fileChooser.showOpenDialog(MainWindow.this);
            if (retrival == JFileChooser.APPROVE_OPTION) {              
                
                try {
                    File file = fileChooser.getSelectedFile();
                     XMLReader xmlFile = new XMLReader(file.getAbsolutePath());
                     eventCenter = xmlFile.readValuesFromXML(eventCenter);
                    JOptionPane.showMessageDialog(null, "All data imported!");

                } catch (Exception ex) {
                    ex.printStackTrace();
                } 
            }
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_importXmlFileMenuItemActionPerformed

    private void openWebPage(String url) {
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }

    public void setOrganizerStatus(boolean organizerStatus) {
        this.organizerStatus = organizerStatus;
    }

    public void setEventEmployeeStatus(boolean eventEmployeeStatus) {
        this.eventEmployeeStatus = eventEmployeeStatus;
    }

    public void setEventManagerStatus(boolean eventManagerStatus) {
        this.eventManagerStatus = eventManagerStatus;
    }

    public void setStatisticsMenu(JMenu statisticsMenu) {
        this.statisticsMenu = statisticsMenu;
    }
    
    

    public void updateLogin() {
        System.out.println(loginStatus);
        if (!loginStatus) {
            jSeparator3.setVisible(true);
            registerMenuItem.setVisible(true); // v
            jSeparator1.setVisible(false);
            createEventMenuItem.setVisible(false); // v
            jSeparator4.setVisible(false); // v
            defineUser.setVisible(false); // v
            jSeparator5.setVisible(false); // v
            createStandMenuItem.setVisible(false); // v
            jSeparator7.setVisible(false); // v
            submitApplicationMenuItem.setVisible(false); // v
            jSeparator2.setVisible(false); // v
            decideApplicationItem.setVisible(false); // v
            jSeparator15.setVisible(false); // v
            statisticsMenu.setVisible(false); // v
            //--- Menu Item ---
            showGlobalAcceptanceRateMenuItem.setVisible(false); // v
            showEventAcceptanceRate.setVisible(false); // v
            showEventsSubmissionKeywordsMenuItem.setVisible(false); // v
            showEmployeeMeanRatingMenuItem.setVisible(false); // v
            showStandInformationMenuItem.setVisible(false); // v
            //--- End Menu Item ---
            jSeparator8.setVisible(false); // v
            helpMenuItem.setVisible(false); // v

            importExportMenu.setVisible(false); // v

        } else {
            jSeparator3.setVisible(false);
            registerMenuItem.setVisible(false);
            jSeparator8.setVisible(true);
            helpMenuItem.setVisible(true);
            importExportMenu.setVisible(false);
            if (eventManagerStatus) {
                importExportMenu.setVisible(true);
                defineUser.setVisible(true);
                jSeparator4.setVisible(true);
                createEventMenuItem.setVisible(true);
                jSeparator4.setVisible(true);
                defineUser.setVisible(true);
                jSeparator5.setVisible(true);
                createStandMenuItem.setVisible(true);

                //Create Event, Create Stand
                // Statistic -> Others
                statisticsMenu.setVisible(true);

                //--- Menu Item ---
                showGlobalAcceptanceRateMenuItem.setVisible(true);
                showEventAcceptanceRate.setVisible(true);
                showEventsSubmissionKeywordsMenuItem.setVisible(true);
                showEmployeeMeanRatingMenuItem.setVisible(true);
                showStandInformationMenuItem.setVisible(true);
                //--- End Menu Item ---

                jSeparator15.setVisible(true);
            }
            if (organizerStatus) {
                //Assign application
                //Show event employee mean rating, show stand information
                statisticsMenu.setVisible(true);
                jSeparator15.setVisible(true);
                //--- Menu Item ---
                showGlobalAcceptanceRateMenuItem.setVisible(false);
                showEventAcceptanceRate.setVisible(false);
                showEventsSubmissionKeywordsMenuItem.setVisible(false);
                showEmployeeMeanRatingMenuItem.setVisible(true);
                showStandInformationMenuItem.setVisible(true);
                //--- End Menu Item ---

            }
            if (eventEmployeeStatus) {
                //Decide application
                decideApplicationItem.setVisible(true);
                jSeparator2.setVisible(true);
            }
            if (userStatus) {
                //Submit Application
                jSeparator7.setVisible(true);
                submitApplicationMenuItem.setVisible(true);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem createEventMenuItem;
    private javax.swing.JMenuItem createStandMenuItem;
    private javax.swing.JMenuItem decideApplicationItem;
    private javax.swing.JMenuItem defineEmployeeMenuItem;
    private javax.swing.JMenuItem defineEventManagerMenuItem;
    private javax.swing.JMenuItem defineOrganizerMenuItem;
    private javax.swing.JMenu defineUser;
    private javax.swing.JMenuItem exportMenuItem;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JMenu importExportMenu;
    private javax.swing.JMenuItem importMenuItem;
    private javax.swing.JMenuItem importXmlFileMenuItem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem loginMenuItem;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem registerMenuItem;
    private javax.swing.JMenuItem showEmployeeMeanRatingMenuItem;
    private javax.swing.JMenuItem showEventAcceptanceRate;
    private javax.swing.JMenuItem showEventsSubmissionKeywordsMenuItem;
    private javax.swing.JMenuItem showGlobalAcceptanceRateMenuItem;
    private javax.swing.JMenuItem showGlobalMeanRatingMenuItem;
    private javax.swing.JMenuItem showStandInformationMenuItem;
    private javax.swing.JMenu statisticsMenu;
    private javax.swing.JMenuItem submitApplicationMenuItem;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
