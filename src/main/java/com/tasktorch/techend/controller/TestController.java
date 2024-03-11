package com.tasktorch.techend.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class TestController {

  @CrossOrigin
  @GetMapping("/api/test")
  public String getSuccess(){
    return "SUCCESS";
  }


}
