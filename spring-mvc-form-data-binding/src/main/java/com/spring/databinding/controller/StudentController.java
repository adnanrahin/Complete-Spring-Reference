package com.spring.databinding.controller;

import com.spring.databinding.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {

        Student theStudent = new Student();

        model.addAttribute("student", theStudent);

        return "student-form";
    }

}
