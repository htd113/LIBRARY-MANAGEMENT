/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 * @author Admin
 */
public class Func_Class {

    public void displayImage(int width, int height, byte[] imageByte, String imagePath, JLabel label) {
        //get the image
        ImageIcon imgIco;
        if(imageByte != null) {
            // get image using bytes
            imgIco = new ImageIcon(imageByte);
        } else {
            //get image using path
            try {
                //get the image from the project resources
                imgIco = new ImageIcon(getClass().getResource(imagePath));
            } catch(Exception e) {
                //get the image from desktop
                imgIco = new ImageIcon(imagePath);
            }
        }
        //make hte image fit the jlabel
        Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // set the image into the jlabel
        label.setIcon(new ImageIcon(image));

    }

    public void customTable(JTable table) {
        table.setSelectionBackground(new Color(249, 105, 14));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(30);
        table.setShowGrid(false);
        // Set the background color of the JTable
        table.setBackground(new Color(248, 248, 248));
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.ORANGE);

    }

    public void customTableHeader(JTable table, Color back_Color, Integer fontSize) {
        table.getTableHeader().setBackground(back_Color);    // Background color of the header
        table.getTableHeader().setForeground(Color.white);   // Text color of the header
        table.getTableHeader().setFont(new Font("Verdana", Font.BOLD, fontSize));   // Font style of the header
        table.getTableHeader().setOpaque(false);
    }

    public ResultSet getData(String query) {
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }
}
