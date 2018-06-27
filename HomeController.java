
package com.tonyinuma.controller;

import com.tonyinuma.model.Conectar;
import com.tonyinuma.model.MetodosDataBase;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

public class HomeController {
    
    private JdbcTemplate jdbcTemplate;
    MetodosDataBase  metodosDataBase = new MetodosDataBase();

    public HomeController() {
        Conectar con = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }   
    
    @RequestMapping("home.htm")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        List datos = this.jdbcTemplate.queryForList(metodosDataBase.consultar());
        mav.addObject("datos", datos);
        mav.setViewName("home");
        return mav;
    } 
    
}
