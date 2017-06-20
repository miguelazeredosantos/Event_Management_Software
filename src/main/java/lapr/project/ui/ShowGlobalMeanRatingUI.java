/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import lapr.project.controller.ShowGlobalMeanRatingController;
import lapr.project.model.Application;
import lapr.project.model.EventCenter;
import lapr.project.model.EventEmployee;
import lapr.project.model.EventRegistry;
import lapr.project.model.Review;

/**
 *
 * @author Miguel Santos <1161386@isep.ipp.pt>
 */
public class ShowGlobalMeanRatingUI extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
    private ShowGlobalMeanRatingController controller;
    private EventRegistry listEvents;
    private float globalRate;

    /**
     * Creates new form ShowGlobalMeanRatingUI
     *
     * @param eventCenter
     */
    public ShowGlobalMeanRatingUI(EventCenter eventCenter) {
        controller = new ShowGlobalMeanRatingController(eventCenter);
        initComponents();

        listEvents = controller.getEventsList();

        globalRate = calculateGobalMeanRating();
        
        globalMeanRatingLabel.setText(String.valueOf(globalRate));
        
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

        jLabel1 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        globalMeanRatingLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Show Global Mean Rating");
        setResizable(false);

        jLabel1.setText("Global Mean Rating:");

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(globalMeanRatingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(globalMeanRatingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeBtn)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private float calculateGobalMeanRating() {
        float meanRating = 0;
        float finalRate = 0;
        int counter = 0;

        for (int i = 0; i < listEvents.size(); i++) {
            lapr.project.model.Event e = listEvents.getEvent(i);
            for (int j = 0; j < e.getApplicationsList().size(); j++) {
                Application application = e.getApplicationsList().getApplication(j);
                for (int k = 0; k < application.getReviewList().size(); k++) {
                    Review review = application.getReviewList().get(k);
                    meanRating += (review.getMeanValue());
                    counter++;

                }
            }
        }
        finalRate = meanRating / counter;

        return finalRate;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel globalMeanRatingLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
