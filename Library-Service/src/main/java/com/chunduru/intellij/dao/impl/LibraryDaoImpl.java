package com.chunduru.intellij.dao.impl;

import com.chunduru.intellij.dao.LibraryDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by sande on 3/29/2017.
 */
public class LibraryDaoImpl implements LibraryDao {
    private static final Logger logger = LoggerFactory.getLogger(LibraryDaoImpl.class);

    @Override
    public void updateBookTitle(String bookId, String bookTitle) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "oracle");
            PreparedStatement stmt = conn.prepareStatement("UPDATE BOOKS SET TITLE=? WHERE BOOK_ID=?");
            stmt.setString(1, bookTitle);
            stmt.setString(2, bookId);

            stmt.executeUpdate();
            logger.info("***** The Query has been executed successfully *****");
            conn.close();
            logger.info("***** The Connection is closed successfully *****");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
