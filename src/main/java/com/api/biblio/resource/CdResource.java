package com.api.biblio.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/apicadcds")
@Api(value="API REST Cadcd")
@CrossOrigin(origins="*")
public class CdResource {

    @Autowired
    CdResource cr;

    @GetMapping("/cadcd")
    @ApiOperation(value = "Retorna cd")
    public List<CadCds> listaTeste(){
        return cr.findAll();
    }
    
}
