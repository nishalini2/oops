package com.isys.erp.controller;

import com.isys.erp.dto.CompanyDto;
import com.isys.erp.service.Service.CompanyService;
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
    public CompanyService companyService;
    @PostMapping("/create")
     public ResponseEntity<CompanyDto>createCompany(@RequestBody CompanyDto companyDto){
        return companyService.createCompany(companyDto);
    }


}
