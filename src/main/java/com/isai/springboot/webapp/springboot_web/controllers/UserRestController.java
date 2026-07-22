package com.isai.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isai.springboot.webapp.springboot_web.models.User;

//Creacion de un rest controller

@RestController
@RequestMapping("/api")
public class UserRestController {

    //Para enviar parametros a la vista se puede usar el objeto model o un map, ambos funcionan de la misma manera
    
    @GetMapping("/details")
    public Map<String, Object> details(){
        Map <String, Object> body = new java.util.HashMap<>();

        User user = new User("Isai", "Jimenez");
        

        //model no se usa ya que solo es para vista
        body.put("user", "Titulo de prueba");
        body.put("user", user);

        return body;//solo se coloca el nombre del html que se va a mostrar, no es necesario colocar la extension
    }

    @PostMapping("/details2")
    public Map<String, Object> details2(){
        Map <String, Object> body = new java.util.HashMap<>();

        //model no se usa ya que solo es para vista
        body.put("title", "Titulo de prueba");
        body.put("name", "Isai");
        body.put("lastname", "Jimenez");

        return body;//solo se coloca el nombre del html que se va a mostrar, no es necesario colocar la extension
    }
    
}
