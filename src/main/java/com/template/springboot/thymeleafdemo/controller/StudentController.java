package com.template.springboot.thymeleafdemo.controller;


import com.template.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {


    @Value("${systems}")
    private List<String> systems;


    @Value("${languages}")
    private List<String> languages;

    @Value("${countries}")
    private List<String> countries;




     @GetMapping("/showStudentForm")
    public String showForm(Model model){


          Student theStudent = new Student();

          model.addAttribute("student", theStudent);

          model.addAttribute("countries", countries);

          model.addAttribute("languages",languages);

          model.addAttribute("systems", systems);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){

        System.out.println("theStudent:"+ theStudent.getFirstName() + " " + theStudent.getLastName());

         return "student-confirmation";

    }
}
