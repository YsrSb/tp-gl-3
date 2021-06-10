/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.gui;

import java.beans.PropertyChangeEvent;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.sender.service.MessagingService;
import org.emp.gl.sender.service.MessagingServiceListener;

/**
 *
 * @author billal
 */
public class MessagingReceiverGui extends javax.swing.JFrame implements MessagingServiceListener {

    private final String recieverName;
    private StringBuilder stringBuilder = new StringBuilder();

    /**
     * Creates new form MessagingTestFrame
     *
     * @param name
     */
    public MessagingReceiverGui(String name) {
        this.recieverName = name;

        initComponents();

        autresInitialisations();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textZone = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textZone.setColumns(20);
        textZone.setRows(5);
        jScrollPane1.setViewportView(textZone);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
                
        stringBuilder
                .append("\n")
                .append("------- new message -------")
                .append("\n")
                .append(evt.getNewValue())
                .append("\n")
                .append("------- message end -------")
                .append("\n");

        textZone.setText(stringBuilder.toString());
    }

    @Override
    public String getRecieverName() {
        return this.recieverName;
    }
    
    private void autresInitialisations() {        
        setSize(400, 400);
        setTitle("reciver : " + recieverName);

        MessagingService ms = Lookup.getInstance().getService(MessagingService.class);
        if (ms != null) {
            ms.subscribe(this);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textZone;
    // End of variables declaration//GEN-END:variables

}