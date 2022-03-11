package com.github.truongbb.controller;

import com.github.truongbb.entity.Router;
import com.github.truongbb.service.RouterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/router")
public class RouterController {
  RouterService routerService = new RouterService();

  @RequestMapping(method = RequestMethod.GET)
  public String getAll(Model model){
    model.addAttribute("listRouter", routerService.getAll());
    return "router/index";
  }
  @RequestMapping(value = "/create",method = RequestMethod.GET)
  public String create(Model model){
    model.addAttribute("router",new Router());
    return "router/create";
  }

  @RequestMapping(value = "/create",method = RequestMethod.POST)
  public String creatRouter(@ModelAttribute("router") Router router){
    routerService.insert(router);
    return "redirect:/router";
  }
//edit
  @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
  public String update(@PathVariable("id") int id, Model model ){
    Router router = routerService.findRouterId(id);
    model.addAttribute("router",router);
    return "router/update";
  }

  @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
  public String updateRouter(@ModelAttribute("router") Router router){
    routerService.update(router);
    return "redirect:/router";
  }
  //Del
  @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
  public String delete(@PathVariable("id") int id){
    routerService.delete(id);
    return "redirect:/router";
  }
}
