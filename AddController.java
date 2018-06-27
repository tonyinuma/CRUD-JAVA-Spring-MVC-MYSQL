
package com.tonyinuma.controller;

import com.tonyinuma.model.Conectar;
import com.tonyinuma.model.MetodosDataBase;
import com.tonyinuma.model.Usuarios;
import com.tonyinuma.model.UsuariosValidar;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("add.htm")
public class AddController {
    
    UsuariosValidar usuariosValidar;
    private JdbcTemplate jdbcTemplate;
    MetodosDataBase  metodosDataBase = new MetodosDataBase();

    public AddController() {
        this.usuariosValidar = new UsuariosValidar();
        Conectar con = new Conectar();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView form(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("add");
        mav.addObject("usuarios", new Usuarios());
        return mav;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView form(@ModelAttribute("usuarios")Usuarios u, BindingResult result, SessionStatus status){
        this.usuariosValidar.validate(u, result);
        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("add");
            mav.addObject("usuarios", new Usuarios());
            return mav;
        } else {
        }

        this.jdbcTemplate.update("insert into usuarios(nombre, correo, telefono) values(?,?,?)",
        u.getNombre(),u.getCorreo(), u.getTelefono());
        return new ModelAndView("redirect:/home.htm");
    }
    
}
