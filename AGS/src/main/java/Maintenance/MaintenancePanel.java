/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Maintenance;
/**
 *
 * @author emine
 */
public class MaintenancePanel extends javax.swing.JPanel {

    /**
     * Creates new form MaintenancePanel
     */
    public MaintenancePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JLabel();
        backicon = new javax.swing.JLabel();
        userType = new javax.swing.JLabel();
        lineSeparator = new javax.swing.JSeparator();
        flightNumTextArea = new swing.MyTextFieldArea();
        planeReadyTextField = new swing.MyTextFieldArea();
        enterFlightNum = new javax.swing.JButton();
        ready = new javax.swing.JCheckBox();
        notReady = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(204, 204, 204));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Username");
        username.setOpaque(true);

        backicon.setText("backicon");

        userType.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userType.setText("Maintenance");

        lineSeparator.setForeground(new java.awt.Color(0, 0, 0));

        flightNumTextArea.setBackground(new java.awt.Color(102, 102, 255));
        flightNumTextArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        flightNumTextArea.setText("Enter the flight number");
        flightNumTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNumTextAreaActionPerformed(evt);
            }
        });

        planeReadyTextField.setBackground(new java.awt.Color(102, 102, 255));
        planeReadyTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        planeReadyTextField.setText("Is the plane ready?");
        planeReadyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planeReadyTextFieldActionPerformed(evt);
            }
        });

        enterFlightNum.setText("Enter");

        ready.setText("Yes");

        notReady.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lineSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userType)
                                    .addComponent(backicon)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(flightNumTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(planeReadyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ready)
                                        .addGap(29, 29, 29)
                                        .addComponent(notReady))
                                    .addComponent(enterFlightNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(backicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightNumTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterFlightNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(planeReadyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ready, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notReady, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void flightNumTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNumTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNumTextAreaActionPerformed

    private void planeReadyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planeReadyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planeReadyTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backicon;
    private javax.swing.JButton enterFlightNum;
    private swing.MyTextFieldArea flightNumTextArea;
    private javax.swing.JSeparator lineSeparator;
    private javax.swing.JCheckBox notReady;
    private swing.MyTextFieldArea planeReadyTextField;
    private javax.swing.JCheckBox ready;
    private javax.swing.JLabel userType;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}