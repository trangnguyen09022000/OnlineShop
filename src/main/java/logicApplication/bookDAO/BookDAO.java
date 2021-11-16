/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicApplication.bookDAO;



import model.book.Book;
import model.book.Supplier;

import model.book.Catogery;
import model.book.Publisher;

import model.book.Translator;
import model.book.Author;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
interface BookDAO {
    public boolean AddBook(Book book);
    public boolean EditBook(Book book);
    public boolean DeleteBook(Book book);
    public ArrayList<Book> SearchBook(String key);            
}
