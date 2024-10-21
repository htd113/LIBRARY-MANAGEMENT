/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Admin
 */
public class Member {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String gender;
    private byte[] picture;
    private String email;

    public Member() {
    }

    public Member(int id, String fname, String lname, String phone, String email, String gender, byte[] picture) {
        this.id = id;
        this.firstName = fname;
        this.lastName = lname;
        this.email = email;
        this.gender = gender;
        this.picture = picture;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void addMember(String _fname, String _lname, String phone, String email, String gender, byte[] picture) {
        String insertQuery = "INSERT INTO `members`(`firstName`, `lastName`, `phone`, `email`, `gender`, `picture`) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setBytes(6, picture);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Added", "add Member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Added", "add Member", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void editMember(Integer id, String _fname, String _lname, String phone, String email, String gender, byte[] picture) {
        String editQuery = "UPDATE `members` SET `firstname` = ?, `lastname` = ?, `phone` = ?, `email` = ?, `gender` = ?, `picture` = ? WHERE `id` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setBytes(6, picture);
            ps.setInt(7, id);
            
            // Ghi log câu lệnh SQL và các tham số
        //System.out.println("Executing query: " + ps.toString());
        
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Edited", "edit member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Edited", "edit member", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    
    public void removeMember(int _id) {
        String removeQuery = "DELETE FROM `members` WHERE `id` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, _id);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Deleted", "remove", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Deleted", "remove", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
 
    public Member getMemberById(Integer _id) {
        Func_Class func = new Func_Class();
        Member member = null;
    
        String query = "SELECT * FROM `members` WHERE `id` = " + _id;
    
        try (ResultSet rs = func.getData(query)) {
            if (rs.next()) {
                member = new Member(rs.getInt(1), rs.getString(2), rs.getString(3),
                                rs.getString(4), rs.getString(5), rs.getString(6),
                                rs.getBytes(7));
            }
        } catch (SQLException e) {
            //e.printStackTrace(); // Consider logging this instead
        }
    
        return member;
    }
    
    //function to populate an arrayList with members
    public ArrayList<Member> membersList(String query) {
        ArrayList<Member> mList = new ArrayList<>();
        My_Classes.Func_Class func = new Func_Class();
        try {
            
            if (query.equals("")) { // if the users enter empty string makes this the default select
                query = "SELECT * FROM `members`";
            }
            
            ResultSet rs = func.getData(query);
            
            Member member;
            
            while (rs.next()) {
                member = new Member(rs.getInt("id"), rs.getString("firstname"),
                                    rs.getString("lastname"), rs.getString("phone"),
                                    rs.getString("email"), rs.getString("gender"),
                                    rs.getBytes("picture")
                                    );
                mList.add(member);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mList;
    }

    public void addBook(String Isbn, String Name, Integer author_id, Integer genre_id, Integer quantity, String Publisher, Double price, Date received_date, String Description, byte[] img) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

                                            