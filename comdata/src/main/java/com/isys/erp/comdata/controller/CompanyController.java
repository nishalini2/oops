package com.isys.erp.comdata.controller;

import com.isys.erp.comdata.dto.CompanyDto;
import com.isys.erp.comdata.service.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;


    @PostMapping
    public ResponseEntity<CompanyDto>createCompany(@RequestBody CompanyDto companyDto){
        companyService.createCompany(companyDto);
        return ResponseEntity.ok(companyDto);
    }

}
