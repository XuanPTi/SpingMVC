package com.github.truongbb.controller;

import com.github.truongbb.entity.Driver;
import com.github.truongbb.service.DriverService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/test")
@WebServlet(name = "democontrol", value = "/democontrol")
public class controller {
  DriverService driverService = new DriverService();

  @RequestMapping(method = RequestMethod.GET)
  public List<Driver> getAll(){
//đẩy dữ liệu và view
    List<Driver> drivers =  driverService.getAll();
    return drivers;
  }
}
