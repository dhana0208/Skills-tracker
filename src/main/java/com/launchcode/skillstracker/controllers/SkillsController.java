package com.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String displayProgrammingLaunguage(){
        return "<h1>Skills Tracker </h1>"+
               "<ol>"+
               "<li> Java </li>" +
               "<li> JavaScript </li>" +
               "<li> Python </li>" +
               "</ol>";

    }
    @GetMapping("form")
    public String  displaySkillsForm(){
        return" <form action = 'form' method='POST'>" +
        "name: <input type = 'text' name= 'username'/> " +
                "<select name = 'firstChoice'>" +
                "<option value = 'Java'>Java </option>" +
                "<option value = 'JavaScript'>JavaScript </option>" +
                "<option value = 'Python'>Python </option>" +
                "</select>"  +
                "<select name = 'secondChoice'>" +
                "<option value = 'Java'>Java </option>" +
                "<option value = 'JavaScript'>JavaScript </option>" +
                "<option value = 'Python'>Python </option>" +
                "</select>" +
                "<select name = 'thirdChoice'>" +
                "<option value = 'Java'>Java </option>" +
                "<option value = 'JavaScript'>JavaScript </option>" +
                "<option value = 'Python'>Python </option>" +
                "</select>" +

                "<button type= 'submit'> Submit </button>" +
                "</form>";

    }
    @PostMapping("form")
    public String submitForm(@RequestParam String username,
                             @RequestParam String firstChoice,
                             @RequestParam String secondChoice,
                             @RequestParam String thirdChoice){
        return "<h1> "+ username + "</h1>" +
                "<ol><li>"+firstChoice +"</li>"+
                "<li>"+secondChoice +"</li>" +
                "<li>"+thirdChoice +"</li>"+
                "</ol>";

    }

}
