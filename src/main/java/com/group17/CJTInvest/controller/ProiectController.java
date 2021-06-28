package com.group17.CJTInvest.controller;

import com.group17.CJTInvest.Util.ResponseMessage;
import com.group17.CJTInvest.model.dto.ProiectDTO;
import com.group17.CJTInvest.service.ProiectService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProiectController {

    private final ProiectService proiectService;

    @Autowired
    public ProiectController(ProiectService proiectService) {
        this.proiectService = proiectService;
    }

    @ApiOperation(value = "Adauga proiect")
    @PostMapping("/cjtinvest/addProiect")
    public ResponseMessage addProiect(@RequestBody() ProiectDTO proiectDTO) {
        return new ResponseMessage(proiectService.save(proiectDTO), "Proiect adaugat cu succes");
    }

    @ApiOperation(value = "Editeaza proiect")
    @PutMapping("/cjtinvest/updateProiect")
    public ResponseMessage updateProiect(@RequestBody() ProiectDTO proiectDTO) {
        return new ResponseMessage(proiectService.update(proiectDTO), "Proiect modificat cu succes");
    }

    @ApiOperation(value = "Sterge proiect")
    @DeleteMapping("/cjtinvest/deleteProiectById/{id}")
    public ResponseMessage deleteProiect(@RequestBody Long proiectID) {
        proiectService.deleteProiect(proiectID);
        return new ResponseMessage(null, "Proiect sters");
    }

    @ApiOperation(value = "Returneaza toate proiecte")
    @GetMapping("/cjtinvest/proiecte")
    public ResponseMessage getProiecte() {
        return new ResponseMessage(proiectService.getProiecte(), "Proiecte gasite cu succes");
    }

    @RequestMapping(value = {"/addproject",}, method = RequestMethod.GET)
    public ModelAndView addproject() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addproject");
        return modelAndView;
    }
}