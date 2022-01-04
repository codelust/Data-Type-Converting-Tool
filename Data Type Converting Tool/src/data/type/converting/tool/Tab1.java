/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package data.type.converting.tool;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.datatransfer.Clipboard;
import javax.swing.*;
import java.awt.*;
/**
/**
 *
 * @author C0delust
 */
public class Tab1 extends javax.swing.JPanel {

    /**
     * Creates new form Tab1
     */
    public Tab1() {
        initComponents();
        String cbItems[] = {"boolean","byte","byte[]","char","double","float","int","long","short","String"};
		
        for (String i : cbItems)
            cb1.addItem(i);
		
        for (String i : cbItems)
            cb2.addItem(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        label2 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        b = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTextArea();
        label3 = new javax.swing.JLabel();

        label1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label1.setText("Convert : ");

        label2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label2.setText("To : ");

        b.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b.setText("Convert !");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        t.setEditable(false);
        t.setColumns(20);
        t.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        t.setRows(5);
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(t);

        label3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 194, 52));
        label3.setText("C o d e   C o p i e d !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(173, 173, 173))))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3)
                .addGap(12, 12, 12))
        );

        label3.setEnabled(false);
    }// </editor-fold>//GEN-END:initComponents

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        if ((cb1.getSelectedItem() == "boolean") & (cb2.getSelectedItem() == "boolean"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "boolean") & (cb2.getSelectedItem() == "byte"))
        t.setText("boolean vIn = true;\nbyte vOut = (byte)(vIn?1:0);");
        else if ((cb1.getSelectedItem() == "boolean") & (cb2.getSelectedItem() == "byte[]"))
        t.setText("boolean vIn = true;\nbyte [] vOut = new byte[]{(byte) (vIn?1:0)};");
        else if ((cb1.getSelectedItem() == "boolean") & (cb2.getSelectedItem() == "char"))
        t.setText("boolean vIn = true;\nchar vOut = (char)(vIn?1:0); //0x01");
        else if ((cb1.getSelectedItem() == "boolean") & (cb2.getSelectedItem() == "double"))
        t.setText("boolean vIn = true;\ndouble vOut = vIn?1.0:0.0;");
        else if ((cb1.getSelectedItem() == "boolean") & (cb2.getSelectedItem() == "float"))
        t.setText("boolean vIn = true;\nfloat vOut = vIn?1.0f:0.0f;");
        else if ((cb1.getSelectedItem() == "boolean") & (cb2.getSelectedItem() == "int"))
        t.setText("boolean vIn = true;\nint vOut = vIn?1:0;");
        else if ((cb1.getSelectedItem() == "boolean") & (cb2.getSelectedItem() == "long"))
        t.setText("boolean vIn = true;\nlong vOut = vIn?1:0;");
        else if ((cb1.getSelectedItem() == "boolean") & (cb2.getSelectedItem() == "short"))
        t.setText("boolean vIn = true;\nshort vOut = (short)(vIn?1:0);");
        else if ((cb1.getSelectedItem() == "boolean") & (cb2.getSelectedItem() == "String"))
        t.setText("boolean vIn = true;\nString vOut = Boolean.toString(vIn);");

        else if ((cb1.getSelectedItem() == "byte") & (cb2.getSelectedItem() == "boolean"))
        t.setText("byte vIn = 1;\nboolean vOut = vIn!=0;");
        else if ((cb1.getSelectedItem() == "byte") & (cb2.getSelectedItem() == "byte"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "byte") & (cb2.getSelectedItem() == "byte[]"))
        t.setText("byte vIn = -128;\nbyte [] vOut = new byte[]{vIn};");
        else if ((cb1.getSelectedItem() == "byte") & (cb2.getSelectedItem() == "char"))
        t.setText("byte vIn = 65;\nchar vOut = (char)vIn; //'A'");
        else if ((cb1.getSelectedItem() == "byte") & (cb2.getSelectedItem() == "double"))
        t.setText("byte vIn = -128;\ndouble vOut = (double)vIn;");
        else if ((cb1.getSelectedItem() == "byte") & (cb2.getSelectedItem() == "float"))
        t.setText("byte vIn = -128;\nfloat vOut = (float)vIn;");
        else if ((cb1.getSelectedItem() == "byte") & (cb2.getSelectedItem() == "int"))
        t.setText("byte vIn = -128;\nint vOut = (int)vIn;");
        else if ((cb1.getSelectedItem() == "byte") & (cb2.getSelectedItem() == "long"))
        t.setText("byte vIn = -128;\nlong vOut = (long)vIn;");
        else if ((cb1.getSelectedItem() == "byte") & (cb2.getSelectedItem() == "short"))
        t.setText("byte vIn = 127;\nshort vOut = (short)vIn;");
        else if ((cb1.getSelectedItem() == "byte") & (cb2.getSelectedItem() == "String"))
        t.setText("byte vIn = -128;\nString vOut = Byte.toString(vIn);");

        else if ((cb1.getSelectedItem() == "byte[]") & (cb2.getSelectedItem() == "boolean"))
        t.setText("byte[] vIn = new byte[] { 1, 1, 0 };\nboolean vOut = vIn[0]!=0; //convert first Byte");
        else if ((cb1.getSelectedItem() == "byte[]") & (cb2.getSelectedItem() == "byte"))
        t.setText("byte[] vIn = new byte[] { 1, 1, 0 };\nbyte vOut = vIn[0]; //convert first Byte");
        else if ((cb1.getSelectedItem() == "byte[]") & (cb2.getSelectedItem() == "byte[]"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "byte[]") & (cb2.getSelectedItem() == "char"))
        t.setText("byte[] vIn = new byte[] { 'F', 'O', 'O' }; \nchar vOut = (char)vIn[0]; //convert first Byte");
        else if ((cb1.getSelectedItem() == "byte[]") & (cb2.getSelectedItem() == "double"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "byte[]") & (cb2.getSelectedItem() == "float"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "byte[]") & (cb2.getSelectedItem() == "int"))
        t.setText("byte[] vInt = new byte[] {\n (byte)(2147483647 >>> 24),\n (byte)(2147483647 >>> 16),\n (byte)(2147483647 >>> 8),\n (byte)2147483647};\n\nint vOut = (vInt[0] << 24)\n + ((vInt[1] & 0xFF) << 16)\n + ((vInt[2] & 0xFF) << 8)\n + (vInt[3] & 0xFF);");
        else if ((cb1.getSelectedItem() == "byte[]") & (cb2.getSelectedItem() == "long"))
        t.setText("byte[] vInt = new byte[] {\n (byte)(9223372036854775807L >>> 56), \n (byte)(9223372036854775807L >>> 48), \n (byte)(9223372036854775807L >>> 40), \n (byte)(9223372036854775807L >>> 32), \n (byte)(9223372036854775807L >>> 24),\n (byte)(9223372036854775807L >>> 16),\n (byte)(9223372036854775807L >>> 8),\n (byte)9223372036854775807L};\n\nlong vOut = (vInt[0] << 56)\n + ((vInt[1] & 0xFF) << 48)\n + ((vInt[2] & 0xFF) << 40)\n + ((vInt[3] & 0xFF) << 32)\n + ((vInt[4] & 0xFF) << 24)\n + ((vInt[5] & 0xFF) << 16)\n + ((vInt[6] & 0xFF) << 8) \n + (vInt[7] & 0xFF);");
        else if ((cb1.getSelectedItem() == "byte[]") & (cb2.getSelectedItem() == "short"))
        t.setText("byte[] vInt = new byte[] { \n (byte)(32767 >>> 8),\n (byte)32767};\n\nint vOut = ((vInt[0] & 0xFF) << 8)\n + (vInt[1] & 0xFF)");
        else if ((cb1.getSelectedItem() == "byte[]") & (cb2.getSelectedItem() == "String"))
        t.setText("byte[] vIn = new byte[] { 'F', 'O', 'O' }; \nString vOut = new String(vIn)");

        else if ((cb1.getSelectedItem() == "char") & (cb2.getSelectedItem() == "boolean"))
        t.setText("char vIn = '1';\nboolean vOut = vIn!=0;");
        else if ((cb1.getSelectedItem() == "char") & (cb2.getSelectedItem() == "byte"))
        t.setText("double vIn = 'A';\nbyte vOut = (byte)vIn; //returns 65");
        else if ((cb1.getSelectedItem() == "char") & (cb2.getSelectedItem() == "byte[]"))
        t.setText("char vIn = 'A';\nbyte [] vOut = new byte[]{(byte)vIn};");
        else if ((cb1.getSelectedItem() == "char") & (cb2.getSelectedItem() == "char"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "char") & (cb2.getSelectedItem() == "double"))
        t.setText("char vIn = 'A'; //65\ndouble vOut = (double)vIn;");
        else if ((cb1.getSelectedItem() == "char") & (cb2.getSelectedItem() == "float"))
        t.setText("char vIn = 'A'; //65\nfloat vOut = (float)vIn;");
        else if ((cb1.getSelectedItem() == "char") & (cb2.getSelectedItem() == "int"))
        t.setText("char vIn = 'A';//65\nint vOut = (int)vIn;");
        else if ((cb1.getSelectedItem() == "char") & (cb2.getSelectedItem() == "long"))
        t.setText("char vIn = 'A'; //65\nlong vOut = (long)vIn;");
        else if ((cb1.getSelectedItem() == "char") & (cb2.getSelectedItem() == "short"))
        t.setText("char vIn = 'A'; //65\nshort vOut = (short)vIn;");
        else if ((cb1.getSelectedItem() == "char") & (cb2.getSelectedItem() == "String"))
        t.setText("char vIn = 'A';\nString vOut = Character.toString(vIn);");

        else if ((cb1.getSelectedItem() == "double") & (cb2.getSelectedItem() == "boolean"))
        t.setText("double vIn = 1.0;\nboolean vOut = vIn!=0.0;");
        else if ((cb1.getSelectedItem() == "double") & (cb2.getSelectedItem() == "byte"))
        t.setText("double vIn = -128.0;\nbyte vOut = (byte)vIn;");
        else if ((cb1.getSelectedItem() == "double") & (cb2.getSelectedItem() == "byte[]"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "double") & (cb2.getSelectedItem() == "char"))
        t.setText("double vIn = 65.0;\nchar vOut = (char)vIn; //'A'");
        else if ((cb1.getSelectedItem() == "double") & (cb2.getSelectedItem() == "double"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "double") & (cb2.getSelectedItem() == "float"))
        t.setText("double vIn = 3.4028235E38;\nfloat vOut = (float)vIn;");
        else if ((cb1.getSelectedItem() == "double") & (cb2.getSelectedItem() == "int"))
        t.setText("double vIn = -2147483648.0;\nint vOut = (int)vIn;");
        else if ((cb1.getSelectedItem() == "double") & (cb2.getSelectedItem() == "long"))
        t.setText("double vIn = -9223372036854775808.0;\nlong vOut = (long)vIn;");
        else if ((cb1.getSelectedItem() == "double") & (cb2.getSelectedItem() == "short"))
        t.setText("double vIn = -32768.0;\nshort vOut = (short)vIn;");
        else if ((cb1.getSelectedItem() == "double") & (cb2.getSelectedItem() == "String"))
        t.setText("double vIn = -1.7976931348623157E308;\nString vOut = Double.toString(vIn);");

        else if ((cb1.getSelectedItem() == "float") & (cb2.getSelectedItem() == "boolean"))
        t.setText("float vIn = 1.0f;\nboolean vOut = vIn!=0.0f;");
        else if ((cb1.getSelectedItem() == "float") & (cb2.getSelectedItem() == "byte"))
        t.setText("float vIn = 127.0f;\nbyte vOut = (byte)vIn;");
        else if ((cb1.getSelectedItem() == "float") & (cb2.getSelectedItem() == "byte[]"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "float") & (cb2.getSelectedItem() == "char"))
        t.setText("float vIn = 65.0f;\nchar vOut = (char)vIn; //'A'");
        else if ((cb1.getSelectedItem() == "float") & (cb2.getSelectedItem() == "double"))
        t.setText("float vIn = 3.4028235E38f;\ndouble vOut = (double)vIn;");
        else if ((cb1.getSelectedItem() == "float") & (cb2.getSelectedItem() == "float"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "float") & (cb2.getSelectedItem() == "int"))
        t.setText("float vIn = -2147483648.0f;\nint vOut = (int)vIn;");
        else if ((cb1.getSelectedItem() == "float") & (cb2.getSelectedItem() == "long"))
        t.setText("float vIn =-9223372036854775808.0f;\nlong vOut = (long)vIn;");
        else if ((cb1.getSelectedItem() == "float") & (cb2.getSelectedItem() == "short"))
        t.setText("float vIn = -32768.0f;\nshort vOut = (short)vIn;");
        else if ((cb1.getSelectedItem() == "float") & (cb2.getSelectedItem() == "String"))
        t.setText("float vIn = 3.4028235E38f;\nString vOut = Float.toString(vIn);");

        else if ((cb1.getSelectedItem() == "int") & (cb2.getSelectedItem() == "boolean"))
        t.setText("int vIn = 1;\nboolean vOut = vIn!=0;");
        else if ((cb1.getSelectedItem() == "int") & (cb2.getSelectedItem() == "byte"))
        t.setText("int vIn = 127;\nbyte vOut = (byte)vIn;");
        else if ((cb1.getSelectedItem() == "int") & (cb2.getSelectedItem() == "byte[]"))
        t.setText("int vInt = -2147483648;\nbyte[] vOut = new byte[] {\n (byte)(vInt >>> 24),\n (byte)(vInt >>> 16),\n (byte)(vInt >>> 8),\n (byte)vInt};");
        else if ((cb1.getSelectedItem() == "int") & (cb2.getSelectedItem() == "char"))
        t.setText("int vIn = 65;\nchar vOut = (char)vIn; //'A'");
        else if ((cb1.getSelectedItem() == "int") & (cb2.getSelectedItem() == "double"))
        t.setText("int vIn = -2147483648;\ndouble vOut = (double)vIn;");
        else if ((cb1.getSelectedItem() == "int") & (cb2.getSelectedItem() == "float"))
        t.setText("int vIn = -2147483648;\nfloat vOut = (float)vIn;");
        else if ((cb1.getSelectedItem() == "int") & (cb2.getSelectedItem() == "int"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "int") & (cb2.getSelectedItem() == "long"))
        t.setText("int vIn = -2147483648;\nlong vOut = (long)vIn;");
        else if ((cb1.getSelectedItem() == "int") & (cb2.getSelectedItem() == "short"))
        t.setText("int vIn = -32768.0;\nshort vOut = (short)vIn;");
        else if ((cb1.getSelectedItem() == "int") & (cb2.getSelectedItem() == "String"))
        t.setText("int vIn = -2147483648;\nString vOut = Integer.toString(vIn);");

        else if ((cb1.getSelectedItem() == "long") & (cb2.getSelectedItem() == "boolean"))
        t.setText("long vIn = 1;\nboolean vOut = vIn!=0;");
        else if ((cb1.getSelectedItem() == "long") & (cb2.getSelectedItem() == "byte"))
        t.setText("long vIn = 127;\nbyte vOut = (byte)vIn;");
        else if ((cb1.getSelectedItem() == "long") & (cb2.getSelectedItem() == "byte[]"))
        t.setText("long vInt = -9223372036854775808L;\nbyte[] vOut = new byte[] {\n (byte)(vInt >>> 56), \n (byte)(vInt >>> 48), \n (byte)(vInt >>> 40),\n  (byte)(vInt >>> 32), \n (byte)(vInt >>> 24),\n (byte)(vInt >>> 16),\n (byte)(vInt >>> 8),\n (byte)vInt};");
        else if ((cb1.getSelectedItem() == "long") & (cb2.getSelectedItem() == "char"))
        t.setText("long vIn = 65L;\nchar vOut = (char)vIn; //'A'");
        else if ((cb1.getSelectedItem() == "long") & (cb2.getSelectedItem() == "double"))
        t.setText("long vIn = 9223372036854775807L;\ndouble vOut = (double)vIn;");
        else if ((cb1.getSelectedItem() == "long") & (cb2.getSelectedItem() == "float"))
        t.setText("long vIn = -9223372036854775808L;\nfloat vOut = (float)vIn;");
        else if ((cb1.getSelectedItem() == "long") & (cb2.getSelectedItem() == "int"))
        t.setText("long vIn = -2147483648;\nint vOut = (int)vIn;");
        else if ((cb1.getSelectedItem() == "long") & (cb2.getSelectedItem() == "long"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "long") & (cb2.getSelectedItem() == "short"))
        t.setText("long vIn = 32767;\nshort vOut = (short)vIn;");
        else if ((cb1.getSelectedItem() == "long") & (cb2.getSelectedItem() == "String"))
        t.setText("long vIn = -9223372036854775808L;\nString vOut = Long.toString(vIn);");

        else if ((cb1.getSelectedItem() == "short") & (cb2.getSelectedItem() == "boolean"))
        t.setText("short vIn = 1;\nboolean vOut = vIn!=0;");
        else if ((cb1.getSelectedItem() == "short") & (cb2.getSelectedItem() == "byte"))
        t.setText("short vIn = 127;\nbyte vOut = (byte)vIn;");
        else if ((cb1.getSelectedItem() == "short") & (cb2.getSelectedItem() == "short[]"))
        t.setText("short vInt = -32768;\nbyte[] vOut = new byte[] { \n (byte)(vInt >>> 8),\n (byte)vInt};");
        else if ((cb1.getSelectedItem() == "short") & (cb2.getSelectedItem() == "char"))
        t.setText("short vIn = 65;\nchar vOut = (char)vIn; //'A'");
        else if ((cb1.getSelectedItem() == "short") & (cb2.getSelectedItem() == "double"))
        t.setText("short vIn = -32768;\ndouble vOut = (double)vIn;");
        else if ((cb1.getSelectedItem() == "short") & (cb2.getSelectedItem() == "float"))
        t.setText("short vIn = -32768;\nfloat vOut = (float)vIn;");
        else if ((cb1.getSelectedItem() == "short") & (cb2.getSelectedItem() == "int"))
        t.setText("short vIn = -32768;\nint vOut = (int)vIn;");
        else if ((cb1.getSelectedItem() == "short") & (cb2.getSelectedItem() == "long"))
        t.setText("short vIn = -32768;\nlong vOut = (long)vIn;");
        else if ((cb1.getSelectedItem() == "short") & (cb2.getSelectedItem() == "short"))
        t.setText("N / A");
        else if ((cb1.getSelectedItem() == "short") & (cb2.getSelectedItem() == "String"))
        t.setText("short vIn = -32768;\nString vOut = Short.toString(vIn);");

        else if ((cb1.getSelectedItem() == "String") & (cb2.getSelectedItem() == "boolean"))
        t.setText("String vIn = \"true\";\nboolean vOut = Boolean.parseBoolean(vIn); //not case sensitive");
        else if ((cb1.getSelectedItem() == "String") & (cb2.getSelectedItem() == "byte"))
        t.setText("String vIn = \"127\";\nbyte vOut = Byte.parseByte(vIn);");
        else if ((cb1.getSelectedItem() == "String") & (cb2.getSelectedItem() == "byte[]"))
        t.setText("String vIn = \"FOO\";\nbyte[] vOut = vIn.getBytes(); ");
        else if ((cb1.getSelectedItem() == "String") & (cb2.getSelectedItem() == "char"))
        t.setText("String vIn = \"A\";\nchar vOut = vIn.charAt(0);");
        else if ((cb1.getSelectedItem() == "String") & (cb2.getSelectedItem() == "double"))
        t.setText("String vIn = \"-1.7976931348623157E308\";\ndouble vOut = Double.parseDouble(vIn);");
        else if ((cb1.getSelectedItem() == "String") & (cb2.getSelectedItem() == "float"))
        t.setText("String vIn = \"3.4028235E38\";\nfloat vOut = Float.parseFloat(vIn);");
        else if ((cb1.getSelectedItem() == "String") & (cb2.getSelectedItem() == "int"))
        t.setText("String vIn = \"-2147483648\";\nint vOut = Integer.parseInt(vIn);");
        else if ((cb1.getSelectedItem() == "String") & (cb2.getSelectedItem() == "long"))
        t.setText("String vIn = \"-9223372036854775808\";\nlong vOut = Long.parseLong(vIn);");
        else if ((cb1.getSelectedItem() == "String") & (cb2.getSelectedItem() == "short"))
        t.setText("String vIn = \"-32768\";\nshort vOut = Short.parseShort(vIn);");
        else if ((cb1.getSelectedItem() == "String") & (cb2.getSelectedItem() == "String"))
        t.setText("N / A");        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void tMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseEntered
        if(!t.getText().equals(""))
        {
            label3.setEnabled(true);
            StringSelection stringSelection = new StringSelection(t.getText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tMouseEntered

    private void tMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseExited
        label3.setEnabled(false); // TODO add your handling code here:
    }//GEN-LAST:event_tMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JTextArea t;
    // End of variables declaration//GEN-END:variables
}
