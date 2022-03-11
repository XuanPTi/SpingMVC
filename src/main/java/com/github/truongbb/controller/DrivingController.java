package com.github.truongbb.controller;


import com.github.truongbb.drivingDTO.DrivingDTO;
import com.github.truongbb.entity.Driver;
import com.github.truongbb.entity.Driving;
import com.github.truongbb.entity.Router;
import com.github.truongbb.service.DriverService;
import com.github.truongbb.service.DrivingService;
import com.github.truongbb.service.RouterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/driving")
public class DrivingController {

  DrivingService drivingService = new DrivingService();
  RouterService routerService = new RouterService();
  DriverService driverService = new DriverService();

  @RequestMapping(method = RequestMethod.GET)
  public String getAll(Model model){
    model.addAttribute("listDriving", drivingService.getAll());
    return "driving/index";
  }

  @RequestMapping(value = "/create", method = RequestMethod.GET)
  public String create(Model model){
    List<Router> router = routerService.getAll();
    List<Driver> drivers =  driverService.getAll();
    model.addAttribute("router", router);
    model.addAttribute("diver", drivers);
    model.addAttribute("driving", new DrivingDTO());
    return "driving/create";
  }

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public String createDriver(@ModelAttribute("driving") Driving drivingDTO){
    System.out.println(drivingDTO);
  drivingService.insert(drivingDTO);
    return "redirect:/driving";
  }

}
