package com.springbootwebtutorial.springbootwebtutorial.Controllers;
import com.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
//@Controller
public class EmployeeController {
//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "secret message : aukhif84hU*#$";
//    }
    @GetMapping(path = "/{EmployeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "EmployeeId") Long id){
        return new EmployeeDTO(id,"karmanya","karmanya905@gamil.com",21, LocalDate.of(2005,8,30),true);
    }

    @GetMapping(path = "")
    public String getAllEmployees(@RequestParam(required = false) Integer age,
                                  @RequestParam(required = false) String sortBy){
        return "hi age = " + age + sortBy;
    }

    @PostMapping
    public String createNewEmployee(){
        return "HELLO from POST";
    }

    @PutMapping
    public String updateEmployeeBId(){
        return "HELLO from PUT";
    }
}
