
package com.tonyinuma.model;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class Conectar {
    
    public DriverManagerDataSource conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/pruebabd");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        
        return dataSource;
    }
    
}
