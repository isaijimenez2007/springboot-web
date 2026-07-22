package com.isai.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.isai.springboot.webapp.springboot_web.models.User;

//Maneja metodos del requert es decir las peticiones del usuario
//Si se usa controller es porque se va  a trabajar con html y thymeleaf, si se usa restcontroller es porque se va a trabajar con json

@Controller
public class UserController {

    //Para enviar parametros a la vista se puede usar el objeto model o un map, ambos funcionan de la misma manera
    
    @GetMapping("/details")
    public String details(Model model) {
        //model se utiliza para pasar parametros a la vista
        User user = new User("Isai", "Jimenez");
        
        model.addAttribute("title", "Titulo de prueba");
        model.addAttribute("user", user);

        return "details";//solo se coloca el nombre del html que se va a mostrar, no es necesario colocar la extension
    }

    @GetMapping("/details2")
    public String details2(Map<String, Object> model) {
        //model se utiliza para pasar parametros a la vista
        model.put("title", "Titulo de prueba con map");
        model.put("name", "Benjamin");
        model.put("lastname", "Jimenez Lara");

        return "details";//solo se coloca el nombre del html que se va a mostrar, no es necesario colocar la extension
    }
}
