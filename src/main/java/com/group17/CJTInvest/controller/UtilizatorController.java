package com.group17.CJTInvest.controller;

import com.group17.CJTInvest.Util.ResponseMessage;
import com.group17.CJTInvest.model.dto.ProiectDTO;
import com.group17.CJTInvest.model.dto.UtilizatorDTO;
import com.group17.CJTInvest.service.UtilizatorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UtilizatorController {

    private final UtilizatorService utilizatorService;

    @Autowired
    private UtilizatorController(UtilizatorService utilizatorService) {
        this.utilizatorService = utilizatorService;
    }

    @ApiOperation(value = "Returneaza toti utilizatorii")
    @GetMapping("/cjtinvest/utilizatori")
    public ResponseMessage getUtilizatori() {
        return new ResponseMessage(utilizatorService.getUsers(), "Utilizatori gasiti cu succes");
    }

    @ApiOperation(value = "Adauga utilizator")
    @PostMapping("/cjtinvest/addUtilizator")
    public ResponseMessage addProiect(@RequestBody() UtilizatorDTO utilizatorDTO) {
        return new ResponseMessage(utilizatorService.save(utilizatorDTO), "Utilizator adaugat cu succes");
    }

    @RequestMapping(value = {"/",}, method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @RequestMapping(value = {"/dashboard",}, method = RequestMethod.GET)
    public ModelAndView dashboard() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("dashboard");
        return modelAndView;
    }

    @RequestMapping(value = {"/users",}, method = RequestMethod.GET)
    public ModelAndView users() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users");
        return modelAndView;
    }
}