package com.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Alumno;



@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("loginHome", "login", new Alumno());
    }
 
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@Validated @ModelAttribute("login")Alumno employee, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("usuario", employee.getUsuario());
        model.addAttribute("codigo", employee.getCodigo());
     
        return "loginView";
    }
	
}
