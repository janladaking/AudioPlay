/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import javax.swing.*;
import gui.utils.*;
import gui.types.*;
import types.*;

/**
 *
 * @author Normal
 */
public class LandingPageTA extends MSPanel {
    private TATM a;

    /**
     * Creates new form LandingPageTA
     */
    public LandingPageTA(TATM a) {
	super("TA/TM");
	this.a = a;

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

        tasks_panel = new JPanel();
        marking_button = new JButton();

        tasks_panel.setBorder(BorderFactory.createTitledBorder("Tasks"));

        marking_button.setText("Marking");
        marking_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marking_buttonActionPerformed(evt);
            }
        });

        GroupLayout tasks_panelLayout = new GroupLayout(tasks_panel);
        tasks_panel.setLayout(tasks_panelLayout);
        tasks_panelLayout.setHorizontalGroup(
            tasks_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tasks_panelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(marking_button, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        tasks_panelLayout.setVerticalGroup(
            tasks_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(tasks_panelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(marking_button)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tasks_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tasks_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void marking_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marking_buttonActionPerformed
        GUIUtils.getMasterFrame(this).movePage(new CourseSelection(TA_MARKING, a));
    }//GEN-LAST:event_marking_buttonActionPerformed

    private static final int TA_MARKING = 7;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton marking_button;
    private JPanel tasks_panel;
    // End of variables declaration//GEN-END:variables
}