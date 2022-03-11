package com.github.truongbb.controller;

import com.github.truongbb.entity.Driver;
import com.github.truongbb.service.DriverService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/driver")
public class DriverController {
  DriverService driverService = new DriverService();

  @RequestMapping(method = RequestMethod.GET)
  public String getAll(Model model){
    model.addAttribute("listDriver", driverService.getAll());
    return "driver/index";
  }

  @RequestMapping(value = "/create", method = RequestMethod.GET)
  public String create(Model model){
    model.addAttribute("driver",new Driver());
    return "driver/create";
  }

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public String createDriver(@ModelAttribute("driver") Driver driver){
    System.out.println(driver);
    driverService.insert(driver);
   return "redirect:/driver";
  }
//Edit
  @RequestMapping(value = "/driver-update/{id}", method = RequestMethod.GET)
  public String update(@PathVariable("id") int id, Model model){
    Driver driver = driverService.findDriverById(id);
    model.addAttribute("driver", driver);
    return "driver/update";
  }

  @RequestMapping(value = "/driver-update/{id}", method = RequestMethod.POST)
  public String updateDriver(@ModelAttribute("driver") Driver driver){
    driverService.update(driver);
    return "redirect:/driver";
  }

//Delete
  @RequestMapping(value = "/driver-delete/{id}", method = RequestMethod.GET)
  public String delete(@PathVariable("id") int id){
    driverService.deleteById(id);
    return "redirect:/driver";
  }
}
