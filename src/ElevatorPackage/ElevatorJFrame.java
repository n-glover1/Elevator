/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElevatorPackage;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Noah
 */
public class ElevatorJFrame extends javax.swing.JFrame {

    Color openDoor = new Color(153, 255, 153);
    Color closeDoor = new Color(255, 255, 153);
    String doorClose = "=][=";
    String doorOpen = "]  [";
    JLabel[] allLabels;
    Elevator elevator1 = new Elevator();
    JPanel[] elevator1Panels;
    JLabel[] elevator1Labels;
    Elevator elevator2 = new Elevator();
    JPanel[] elevator2Panels;
    JLabel[] elevator2Labels;
    int direction = 0;      //if direction = 1, means someone has called to move up. if direction = 2, means someone has called to move down

    /**
     * Creates new form ElevatorJFrame
     */
    public ElevatorJFrame() {
        initComponents();
        allLabels = new JLabel[]{elv1flr3Label, elv1flr2Label, elv1flr1Label, elv2flr3Label, elv2flr2Label, elv2flr1Label};
        elevator1Labels = new JLabel[]{null, elv1flr1Label, elv1flr2Label, elv1flr3Label};
        elevator1Panels = new JPanel[]{null, elv1flr1Panel, elv1flr2Panel, elv1flr3Panel};
        elevator2Labels = new JLabel[]{null, elv2flr1Label, elv2flr2Label, elv2flr3Label};
        elevator2Panels = new JPanel[]{null, elv2flr1Panel, elv2flr2Panel, elv2flr3Panel};
        for (int i = 0; i < 6; i++) {
            allLabels[i].setText(doorClose);
        }
        elv1flr1Panel.setBackground(closeDoor);
        elv2flr1Panel.setBackground(closeDoor);
        elevator2.setCurrentFloor(3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        Elevator1 = new javax.swing.JPanel();
        elv1flr3Panel = new javax.swing.JPanel();
        elv1flr3Label = new javax.swing.JLabel();
        elv1flr2Panel = new javax.swing.JPanel();
        elv1flr2Label = new javax.swing.JLabel();
        elv1flr1Panel = new javax.swing.JPanel();
        elv1flr1Label = new javax.swing.JLabel();
        Elevator2 = new javax.swing.JPanel();
        elv2flr3Panel = new javax.swing.JPanel();
        elv2flr3Label = new javax.swing.JLabel();
        elv2flr2Panel = new javax.swing.JPanel();
        elv2flr2Label = new javax.swing.JLabel();
        elv2flr1Panel = new javax.swing.JPanel();
        elv2flr1Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Elevator");

        Elevator1.setBackground(new java.awt.Color(51, 0, 102));
        Elevator1.setLayout(new java.awt.GridLayout(3, 0));

        elv1flr3Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elv1flr3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout elv1flr3PanelLayout = new javax.swing.GroupLayout(elv1flr3Panel);
        elv1flr3Panel.setLayout(elv1flr3PanelLayout);
        elv1flr3PanelLayout.setHorizontalGroup(
            elv1flr3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elv1flr3PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(elv1flr3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        elv1flr3PanelLayout.setVerticalGroup(
            elv1flr3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elv1flr3PanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(elv1flr3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        Elevator1.add(elv1flr3Panel);

        elv1flr2Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elv1flr2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout elv1flr2PanelLayout = new javax.swing.GroupLayout(elv1flr2Panel);
        elv1flr2Panel.setLayout(elv1flr2PanelLayout);
        elv1flr2PanelLayout.setHorizontalGroup(
            elv1flr2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, elv1flr2PanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(elv1flr2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        elv1flr2PanelLayout.setVerticalGroup(
            elv1flr2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elv1flr2PanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(elv1flr2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        Elevator1.add(elv1flr2Panel);

        elv1flr1Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elv1flr1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout elv1flr1PanelLayout = new javax.swing.GroupLayout(elv1flr1Panel);
        elv1flr1Panel.setLayout(elv1flr1PanelLayout);
        elv1flr1PanelLayout.setHorizontalGroup(
            elv1flr1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, elv1flr1PanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(elv1flr1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        elv1flr1PanelLayout.setVerticalGroup(
            elv1flr1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elv1flr1PanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(elv1flr1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        Elevator1.add(elv1flr1Panel);

        Elevator2.setBackground(new java.awt.Color(0, 153, 0));
        Elevator2.setLayout(new java.awt.GridLayout(3, 0));

        elv2flr3Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elv2flr3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout elv2flr3PanelLayout = new javax.swing.GroupLayout(elv2flr3Panel);
        elv2flr3Panel.setLayout(elv2flr3PanelLayout);
        elv2flr3PanelLayout.setHorizontalGroup(
            elv2flr3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elv2flr3PanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(elv2flr3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        elv2flr3PanelLayout.setVerticalGroup(
            elv2flr3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elv2flr3PanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(elv2flr3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        Elevator2.add(elv2flr3Panel);

        elv2flr2Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elv2flr2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout elv2flr2PanelLayout = new javax.swing.GroupLayout(elv2flr2Panel);
        elv2flr2Panel.setLayout(elv2flr2PanelLayout);
        elv2flr2PanelLayout.setHorizontalGroup(
            elv2flr2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elv2flr2PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(elv2flr2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        elv2flr2PanelLayout.setVerticalGroup(
            elv2flr2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, elv2flr2PanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(elv2flr2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        Elevator2.add(elv2flr2Panel);

        elv2flr1Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elv2flr1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout elv2flr1PanelLayout = new javax.swing.GroupLayout(elv2flr1Panel);
        elv2flr1Panel.setLayout(elv2flr1PanelLayout);
        elv2flr1PanelLayout.setHorizontalGroup(
            elv2flr1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, elv2flr1PanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(elv2flr1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        elv2flr1PanelLayout.setVerticalGroup(
            elv2flr1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(elv2flr1PanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(elv2flr1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        Elevator2.add(elv2flr1Panel);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Down: W");

        jLabel2.setText("Up: A");

        jLabel3.setText("Down: S");

        jLabel4.setText("Up: D");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addComponent(Elevator1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Elevator2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Elevator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Elevator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(73, 73, 73)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        elevator1.OpenDoor();
        if (elevator1.isDoorOpen()) {
            elevator1Labels[elevator1.getFloor()].setText(doorOpen);
            elevator1Panels[elevator1.getFloor()].setBackground(openDoor);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        elevator1.CloseDoor();
        if (!elevator1.isDoorOpen()) {
            elevator1Labels[elevator1.getFloor()].setText(doorClose);
            elevator1Panels[elevator1.getFloor()].setBackground(closeDoor);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        elevator1.setTargetFloor(3);
        elevator1.move();
        if (elevator1.isDoorOpen()) {
            elevator1Labels[elevator1.getFloor()].setText(doorOpen);
            elevator1Panels[elevator1.getFloor()].setBackground(openDoor);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ElevatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElevatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElevatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElevatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElevatorJFrame().setVisible(true);
            }
        });
    }

    public Elevator closestElevator(int direction) {
        if (direction == 1) {
            if (elevator1.isOccupied() && elevator2.isOccupied() == false) {
                return elevator2;
            }
            if (elevator1.isOccupied() == false && elevator2.isOccupied() && elevator2.isOccupied()) {
                return elevator1;
            }
            if(elevator1.isMoving() == false && elevator2.isMoving())
                return elevator1;
            if(elevator1.isMoving() && elevator1.isOccupied() && elevator2.isMoving() == false)
                return elevator2;
            //do other things
        }
        if (direction == 2) {
            if (elevator1.isOccupied() && elevator2.isOccupied() == false) {
                return elevator2;
            }
            if (elevator1.isOccupied() == false && elevator2.isOccupied()) {
                return elevator1;
            }
            //do other things
        }
        return elevator1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Elevator1;
    private javax.swing.JPanel Elevator2;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel elv1flr1Label;
    private javax.swing.JPanel elv1flr1Panel;
    private javax.swing.JLabel elv1flr2Label;
    private javax.swing.JPanel elv1flr2Panel;
    private javax.swing.JLabel elv1flr3Label;
    private javax.swing.JPanel elv1flr3Panel;
    private javax.swing.JLabel elv2flr1Label;
    private javax.swing.JPanel elv2flr1Panel;
    private javax.swing.JLabel elv2flr2Label;
    private javax.swing.JPanel elv2flr2Panel;
    private javax.swing.JLabel elv2flr3Label;
    private javax.swing.JPanel elv2flr3Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
