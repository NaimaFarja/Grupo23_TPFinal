package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class RegistrarmeController {

	 @GetMapping("/registrarme")
	 
     public String getRegistramepage (Model model) {
     return "registrarme";
 }
 
}

