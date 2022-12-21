package com.ncs.jpademo.controller;

import com.ncs.jpademo.dto.PropertyDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class PropertyController {

    @GetMapping("")
    public String index() {
        return "Hello World";
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public PropertyDto saveProperty(PropertyDto propertyDto) {
        return propertyDto;
    }
}