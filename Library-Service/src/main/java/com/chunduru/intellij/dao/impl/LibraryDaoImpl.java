package com.chunduru.intellij.dao.impl;

import com.chunduru.intellij.dao.LibraryDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sande on 3/29/2017.
 */
public class LibraryDaoImpl implements LibraryDao
{
    private static final Logger logger = LoggerFactory.getLogger(LibraryDaoImpl.class);

    public NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource (DataSource dataSource)
    {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public void updateBookTitle(String bookId, String bookTitle)
    {

        String updateSQL = "UPDATE BOOKS SET TITLE=:TITLE WHERE BOOK_ID=:BOOK_ID";
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("TITLE", bookTitle);
        param.put("BOOK_ID", bookId);

        int update = jdbcTemplate.update(updateSQL, param);

        logger.info("Update JDBC Value = " + update);
    }
}
