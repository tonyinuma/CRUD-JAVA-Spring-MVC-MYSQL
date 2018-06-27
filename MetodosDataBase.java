/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonyinuma.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class MetodosDataBase {
    
    JdbcTemplate jdbcTemplate;
    
    public String consultar(){
        String sql ="select * from usuarios";
        return sql;
    }
    
    public String insertar(){
        String sql = "insert into usuarios(nombre, correo, telefono)";
        return sql;
    }
    
}
