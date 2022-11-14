package com.engine.monitoring.controller;

import com.engine.monitoring.dto.ResponseDto;
import com.engine.monitoring.dto.user.SignInDto;
import com.engine.monitoring.dto.user.SignInReponseDto;
import com.engine.monitoring.dto.user.SignupDto;
import com.engine.monitoring.model.Project;
import com.engine.monitoring.model.User;
import com.engine.monitoring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    // signup

    @PostMapping("/create")
    public ResponseDto signup(@RequestBody SignupDto signupDto) {
        return userService.signUp(signupDto);
    }


    // signIn

    @PostMapping("/signIn")
    public SignInReponseDto signIn(@RequestBody SignInDto signInDto) {
        return userService.signIn(signInDto);
    }

    
}