package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class TestimoniosController {

 @GetMapping("/testimonios")
 
     public String gettestimoniospage (Model model) {
     return "testimonios";
 }
 
}