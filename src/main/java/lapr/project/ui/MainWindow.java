/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lapr.project.model.EventCenter;
import lapr.project.model.ExportFile;

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
     * @param eventCenter
     */
    public MainWindow(EventCenter eventCenter) {
        
        initComponents();
//        if(!loginStatus){
//            registerMenuItem.setVisible(false);
//            defineUser.setVisible(false);
//        }
        this.eventCenter = eventCenter;
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
        jMenu1 = new javax.swing.JMenu();
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
        submitApplicationMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        decideApplicationItem = new javax.swing.JMenuItem();
        importExportMenu = new javax.swing.JMenu();
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

        jMenu1.setText("Menu");

        loginMenuItem.setText("Login");
        loginMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loginMenuItem);
        jMenu1.add(jSeparator3);

        registerMenuItem.setMnemonic('M');
        registerMenuItem.setText("Register");
        registerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(registerMenuItem);
        jMenu1.add(jSeparator1);

        createEventMenuItem.setText("Create Event");
        createEventMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEventMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(createEventMenuItem);
        jMenu1.add(jSeparator4);

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

        jMenu1.add(defineUser);
        jMenu1.add(jSeparator5);

        submitApplicationMenuItem.setText("Submit Application");
        submitApplicationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitApplicationMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(submitApplicationMenuItem);
        jMenu1.add(jSeparator2);

        decideApplicationItem.setText("Decide Application");
        decideApplicationItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decideApplicationItemActionPerformed(evt);
            }
        });
        jMenu1.add(decideApplicationItem);

        jMenuBar1.add(jMenu1);

        importExportMenu.setText("Import/Export");

        importMenuItem.setText("Import File");
        importMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importMenuItemActionPerformed(evt);
            }
        });
        importExportMenu.add(importMenuItem);
        importExportMenu.add(jSeparator6);

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
        LoginUI login = new LoginUI(loginStatus, eventCenter, userNameLabel, userStatus, organizerStatus, eventEmployeeStatus, eventManagerStatus);
        
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
        try {
            ExportFile exportFile = new ExportFile("EventCenter.bin", eventCenter);
        } catch (Exception ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_exportMenuItemActionPerformed

//    private void writesFile(EventCenter eventCenter) throws Exception{
//        FileWriter writer = new FileWriter("EventCenter.txt");
//        writer.write(eventCenter);
//    }
    
    private void importMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importMenuItemActionPerformed
       
        
    }//GEN-LAST:event_importMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow(eventCenter).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem createEventMenuItem;
    private javax.swing.JMenuItem decideApplicationItem;
    private javax.swing.JMenuItem defineEmployeeMenuItem;
    private javax.swing.JMenuItem defineEventManagerMenuItem;
    private javax.swing.JMenuItem defineOrganizerMenuItem;
    private javax.swing.JMenu defineUser;
    private javax.swing.JMenuItem exportMenuItem;
    private javax.swing.JMenu importExportMenu;
    private javax.swing.JMenuItem importMenuItem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuItem loginMenuItem;
    private javax.swing.JMenuItem registerMenuItem;
    private javax.swing.JMenuItem submitApplicationMenuItem;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
