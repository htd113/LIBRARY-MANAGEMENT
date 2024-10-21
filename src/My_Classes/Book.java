/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package My_Classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author htd11
 */
public class Book {
    
    private String isbn;
    private String name;
    private String author_id;
    private String genre_id;
    private Integer quantity;
    private String publisher;
    private double price;
    private String date_received;
    private String description;
    private byte[] cover;
    
    public Book () {}
    
    public Book (String isbn, String name, String author_id, String genre_id,
                 Integer quantity, String publisher, double price, String date_received,
                 String description, byte[] cover) {
        this.isbn = isbn;
        this.name = name;
        this.author_id = author_id;
        this.genre_id = genre_id;
        this.quantity = quantity;
        this.publisher = publisher;
        this.price = price;
        this.date_received = date_received;
        this.description = description;
        this.cover = cover;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(String genre_id) {
        this.genre_id = genre_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate_received() {
        return date_received;
    }

    public void setDate_received(String date_received) {
        this.date_received = date_received;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }
    
    public void addBook(String _isbn, String _name, String _author_id, String _genre_id,
                 Integer _quantity, String _publisher, double _price, String _date_received,
                 String _description, byte[] _cover) {
        String insertQuery = "INSERT INTO `books`(`isbn`, `name`, `author_id`, `genre_id`, `quantity`, `publisher`, `price`, `date_received`, `description`, `cover`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, _isbn);
            ps.setString(2, _name);
            ps.setString(3, _author_id);
            ps.setString(4, _genre_id);
            ps.setInt(5, _quantity);
            ps.setString(6, _publisher);
            ps.setDouble(7, _price);
            ps.setString(8, _date_received);
            ps.setString(9, _description);
            ps.setBytes(10, _cover);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Book Added", "add Book", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book Not Added", "add Book", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
