/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Forms;

import My_Classes.Author;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 * @author Admin
 */
public class ManageAuthorsForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageGenresForm
     */
    My_Classes.Author author = new My_Classes.Author();

    public ManageAuthorsForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border panelHeaderBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        jPanel1.setBorder(panelHeaderBorder);
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(75, 60,null, "/My_Images/diagram.png", jLabel_FormTitle);
        func.customTable(jTable_Authors_);
        func.customTableHeader(jTable_Authors_, new Color(42, 187, 155), 20);
        jLabel_EmptyFirstName_.setVisible(false);
        jLabel_EmptyLastName_.setVisible(false);
        populateJtableWithAuthors();
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
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel_FirstName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_FirstName = new javax.swing.JTextField();
        jTextField_ID = new javax.swing.JTextField();
        JButton_Edit_ = new javax.swing.JButton();
        JButton_Add_ = new javax.swing.JButton();
        JButton_Delete_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Authors_ = new javax.swing.JTable();
        jLabel_EmptyLastName_ = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jTextField_Expertise = new javax.swing.JTextField();
        jTextField_About = new javax.swing.JTextField();
        jLabel_About = new javax.swing.JLabel();
        jLabel_LastName = new javax.swing.JLabel();
        jLabel_Expertise = new javax.swing.JLabel();
        jLabel_EmptyFirstName_ = new javax.swing.JLabel();
        jLabel_EmptyName_2 = new javax.swing.JLabel();
        jLabel_EmptyName_3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Manage Books Generes");
        jLabel_FormTitle.setToolTipText("");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm_.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_CloseForm_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_.setText("X");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jLabel_FirstName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_FirstName.setText("FirstName:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("ID:");

        jTextField_FirstName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FirstNameActionPerformed(evt);
            }
        });

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        JButton_Edit_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButton_Edit_.setText("Edit");
        JButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_Edit_ActionPerformed(evt);
            }
        });

        JButton_Add_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButton_Add_.setText("ADD");
        JButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_Add_ActionPerformed(evt);
            }
        });

        JButton_Delete_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButton_Delete_.setText("Delete");
        JButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_Delete_ActionPerformed(evt);
            }
        });

        jTable_Authors_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Authors_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Authors_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Authors_);

        jLabel_EmptyLastName_.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_EmptyLastName_.setText("* enter the genre name");
        jLabel_EmptyLastName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyLastName_MouseClicked(evt);
            }
        });

        jTextField_LastName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LastNameActionPerformed(evt);
            }
        });

        jTextField_Expertise.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_Expertise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ExpertiseActionPerformed(evt);
            }
        });

        jTextField_About.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AboutActionPerformed(evt);
            }
        });

        jLabel_About.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_About.setText("About:");

        jLabel_LastName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_LastName.setText("LastName:");

        jLabel_Expertise.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_Expertise.setText("Expertise:");

        jLabel_EmptyFirstName_.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_EmptyFirstName_.setText("* enter the genre name");
        jLabel_EmptyFirstName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyFirstName_MouseClicked(evt);
            }
        });

        jLabel_EmptyName_2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_EmptyName_2.setText("* enter the genre name");
        jLabel_EmptyName_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyName_2MouseClicked(evt);
            }
        });

        jLabel_EmptyName_3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_EmptyName_3.setText("* enter the genre name");
        jLabel_EmptyName_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyName_3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_About, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(JButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_LastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Expertise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_Expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_About, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_EmptyLastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_EmptyName_2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel_EmptyName_3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(492, 492, 492))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(291, 291, 291)
                    .addComponent(jLabel_EmptyFirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(919, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_EmptyLastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyName_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_About, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_About, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyName_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(227, 227, 227)
                    .addComponent(jLabel_EmptyFirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(380, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1231, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jTextField_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FirstNameActionPerformed

    private void JButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_Edit_ActionPerformed
        // TODO add your handling code here:
         String fname = jTextField_FirstName.getText();
         String lname = jTextField_LastName.getText();
         String expertise = jTextField_Expertise.getText();
         String about = jTextField_About.getText();

         if (fname.isEmpty()) {
              jLabel_EmptyFirstName_.setVisible(true);
          } else if (lname.isEmpty()) {
              jLabel_EmptyLastName_.setVisible(true);
          } else {
              try {
                  int id = Integer.parseInt(jTextField_ID.getText());
                  author.editAuthor(id, fname, lname, expertise, about);
                  populateJtableWithAuthors();
              } catch (NumberFormatException ex) {
                  JOptionPane.showMessageDialog(null, "Invalid Author ID - " + ex.getMessage(), "error", 0);
              }

          }
    }//GEN-LAST:event_JButton_Edit_ActionPerformed

    private void JButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_Add_ActionPerformed
        // TODO add your handling code here:
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String expertise = jTextField_Expertise.getText();
        String about = jTextField_About.getText();
        
        if (fname.isEmpty()) {
            jLabel_EmptyFirstName_.setVisible(true);
        } else if (lname.isEmpty()) {
            jLabel_EmptyLastName_.setVisible(true);
        } else {
            author.addAuthor(fname, lname, expertise, about);
        }
        populateJtableWithAuthors();
    }//GEN-LAST:event_JButton_Add_ActionPerformed

    private void JButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_Delete_ActionPerformed
        // TODO add your handling code here
        try {
              int id = Integer.parseInt(jTextField_ID.getText());
              author.removeAuthor(id);
              //populateJtableWithGenres();
              jTextField_ID.setText("");
              jTextField_FirstName.setText("");
              jTextField_LastName.setText("");
              jTextField_Expertise.setText("");
              jTextField_About.setText("");
          } catch (NumberFormatException ex) {
              JOptionPane.showMessageDialog(null, "Invalid Author ID - " + ex.getMessage(), "error", 0);
          }


    }//GEN-LAST:event_JButton_Delete_ActionPerformed

    private void jTable_Authors_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Authors_MouseClicked
        // TODO add your handling code here:
        int index = jTable_Authors_.getSelectedRow();

// get values
          String id = jTable_Authors_.getValueAt(index, 0).toString();
          String firstname = jTable_Authors_.getValueAt(index, 1).toString();
          String lastname = jTable_Authors_.getValueAt(index, 2).toString();
          String expertise = jTable_Authors_.getValueAt(index, 3).toString();
          String about = jTable_Authors_.getValueAt(index, 4).toString();

// show data in textFields
          jTextField_ID.setText(id);
          jTextField_FirstName.setText(firstname);
          jTextField_LastName.setText(lastname);
          jTextField_Expertise.setText(expertise);
          jTextField_About.setText(about);


    }//GEN-LAST:event_jTable_Authors_MouseClicked

    public void populateJtableWithAuthors() {
        ArrayList<My_Classes.Author> authorsList = author.authorsList();
        String[] colNames = {"ID", "F-Name", "L-Name", "Expertise", "About"};
        Object[][] rows = new Object[authorsList.size()][colNames.length];
        for (int i = 0; i < authorsList.size(); i++) {
            rows[i][0] = authorsList.get(i).getId();
            rows[i][1] = authorsList.get(i).getFirstName();
            rows[i][2] = authorsList.get(i).getLastName();
            rows[i][3] = authorsList.get(i).getField_Of_Expertise();
            rows[i][4] = authorsList.get(i).getAbout();

        }
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Authors_.setModel(model);
    }

    private void jLabel_EmptyLastName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyLastName_MouseClicked
        // TODO add your handling code here:
        jLabel_EmptyLastName_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyLastName_MouseClicked

    private void jTextField_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LastNameActionPerformed

    private void jTextField_ExpertiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ExpertiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ExpertiseActionPerformed

    private void jTextField_AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AboutActionPerformed

    private void jLabel_EmptyFirstName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyFirstName_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyFirstName_MouseClicked

    private void jLabel_EmptyName_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyName_2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyName_2MouseClicked

    private void jLabel_EmptyName_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyName_3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyName_3MouseClicked

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
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageAuthorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAuthorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAuthorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAuthorsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAuthorsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_Add_;
    private javax.swing.JButton JButton_Delete_;
    private javax.swing.JButton JButton_Edit_;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_About;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_EmptyFirstName_;
    private javax.swing.JLabel jLabel_EmptyLastName_;
    private javax.swing.JLabel jLabel_EmptyName_2;
    private javax.swing.JLabel jLabel_EmptyName_3;
    private javax.swing.JLabel jLabel_Expertise;
    private javax.swing.JLabel jLabel_FirstName;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_LastName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Authors_;
    private javax.swing.JTextField jTextField_About;
    private javax.swing.JTextField jTextField_Expertise;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    // End of variables declaration//GEN-END:variables
}
