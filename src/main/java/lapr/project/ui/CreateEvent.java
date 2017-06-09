/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import lapr.project.model.Congress;
import lapr.project.model.Exhibition;
import lapr.project.model.ListLocals;
import lapr.project.model.Local;
import lapr.project.model.OrganizersList;

/**
 *
 * @author MarioDias
 */
public class CreateEvent extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
//    private DefaultListModel<String> modelOrganizerList = new DefaultListModel<String>();
//    private DefaultListModel<String> modelOrganizerListEvent = new DefaultListModel<String>();

    /**
     * Creates new form CreateEvent
     */
    public CreateEvent() {
        initComponents();
//        ListLocals list = new ListLocals();
//        Local a = new Local("asdasd", 123);
//        Local a2 = new Local("asdasd", 123);
//        Local a3 = new Local("asdasd", 123);
//        Local a4 = new Local("asdasd", 123);
//        list.addLocal(a4);
//        list.addLocal(a3);
//        list.addLocal(a2);
//        list.addLocal(a);
//        for (int i = 0; i < list.size(); i++) {
//            locals.addItem(list.getLocal(i));
//        }
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextField = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        locals = new javax.swing.JComboBox<>();
        newAddressbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        eventBeginningSpinner = new javax.swing.JSpinner();
        eventEndSpinner = new javax.swing.JSpinner();
        SubmitAppStart = new javax.swing.JSpinner();
        submitAppEnd = new javax.swing.JSpinner();
        congressRadiobtn = new javax.swing.JRadioButton();
        exhibitionRadiobtn = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        removeOrganizerbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addOrganizerbtn = new javax.swing.JButton();
        newEventbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Event");

        jPanel1.setToolTipText("");

        descriptionTextField.setColumns(20);
        descriptionTextField.setRows(5);
        descriptionTextField.setPreferredSize(new java.awt.Dimension(180, 94));
        jScrollPane1.setViewportView(descriptionTextField);

        jLabel1.setText("Event name:");

        jLabel2.setText("Event starts:");

        jLabel3.setText("Event Ends:");

        jLabel4.setText("Address:");

        jLabel6.setText("Description:");

        locals.setMinimumSize(new java.awt.Dimension(180, 20));
        locals.setPreferredSize(new java.awt.Dimension(180, 20));
        locals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localsActionPerformed(evt);
            }
        });

        newAddressbtn.setText("Create new Address");

        jLabel7.setText("Submission Application starts:");

        jLabel8.setText("Submission Application ends:");

        eventBeginningSpinner.setModel(new javax.swing.SpinnerDateModel());

        eventEndSpinner.setModel(new javax.swing.SpinnerDateModel());

        SubmitAppStart.setModel(new javax.swing.SpinnerDateModel());

        submitAppEnd.setModel(new javax.swing.SpinnerDateModel());

        congressRadiobtn.setText("Congress");
        congressRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congressRadiobtnActionPerformed(evt);
            }
        });

        exhibitionRadiobtn.setText("Exhibiton");
        exhibitionRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exhibitionRadiobtnActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jList2);

        removeOrganizerbtn.setText("Remove Organizer");
        removeOrganizerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeOrganizerbtnActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        jLabel9.setText("Organizer for the event");

        jLabel5.setText("Organizer list");

        addOrganizerbtn.setText("Add Organizer");
        addOrganizerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrganizerbtnActionPerformed(evt);
            }
        });

        newEventbtn.setText("New Event");
        newEventbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEventbtnActionPerformed(evt);
            }
        });

        cancelbtn.setText("Cancel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(eventBeginningSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eventEndSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(submitAppEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SubmitAppStart, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(locals, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newAddressbtn))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addOrganizerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(congressRadiobtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(removeOrganizerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(exhibitionRadiobtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(newEventbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelbtn)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eventBeginningSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(eventEndSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(locals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newAddressbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SubmitAppStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(submitAppEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(congressRadiobtn)
                    .addComponent(exhibitionRadiobtn))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addOrganizerbtn)
                    .addComponent(removeOrganizerbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newEventbtn)
                    .addComponent(cancelbtn)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newEventbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEventbtnActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        OrganizersList orgList = new OrganizersList();
        String name = nameTextField.getText();
        String dateBString = sdf.format(eventBeginningSpinner.getValue());
        String dateEString = sdf.format(eventEndSpinner.getValue());
        Local local = new Local("teste", 123);
        String description = descriptionTextField.getText();
        String dateSubB = sdf.format(SubmitAppStart.getValue());
        String dateSubE = sdf.format(submitAppEnd.getValue());
        try {
            Date db = sdf.parse(dateBString);
            Date de = sdf.parse(dateEString);
            if (congressRadiobtn.isSelected()) {
                Congress c = new Congress(name, description, db, de, local);
                System.out.println("Congress");
            } else if (exhibitionRadiobtn.isSelected()) {
                String n = JOptionPane.showInputDialog("Insert the number of invites available for the Exhibition");
                int nInvites = Integer.parseInt(n);
                Exhibition e = new Exhibition(name, description, db, de, local, nInvites);
                System.out.println("Exhibition");
            } else if (!exhibitionRadiobtn.isSelected() && !congressRadiobtn.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please choose the type of event");
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error inserting date");
        }
    }//GEN-LAST:event_newEventbtnActionPerformed

    private void addOrganizerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrganizerbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addOrganizerbtnActionPerformed

    private void removeOrganizerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeOrganizerbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeOrganizerbtnActionPerformed

    private void congressRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congressRadiobtnActionPerformed
        congressRadiobtn.setSelected(true);
        exhibitionRadiobtn.setSelected(false);
    }//GEN-LAST:event_congressRadiobtnActionPerformed

    private void localsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localsActionPerformed

    private void exhibitionRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exhibitionRadiobtnActionPerformed
        congressRadiobtn.setSelected(false);
        exhibitionRadiobtn.setSelected(true);
    }//GEN-LAST:event_exhibitionRadiobtnActionPerformed

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
            java.util.logging.Logger.getLogger(CreateEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SubmitAppStart;
    private javax.swing.JButton addOrganizerbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JRadioButton congressRadiobtn;
    private javax.swing.JTextArea descriptionTextField;
    private javax.swing.JSpinner eventBeginningSpinner;
    private javax.swing.JSpinner eventEndSpinner;
    private javax.swing.JRadioButton exhibitionRadiobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<Local> locals;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton newAddressbtn;
    private javax.swing.JButton newEventbtn;
    private javax.swing.JButton removeOrganizerbtn;
    private javax.swing.JSpinner submitAppEnd;
    // End of variables declaration//GEN-END:variables
}
