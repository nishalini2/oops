package com.isys.erp.comdata.controller;

import com.isys.erp.comdata.dto.CompanyDto;
import com.isys.erp.comdata.service.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CompanyController {
    @Autowired
    public CompanyService companyService;
    @PostMapping("/post")
    public ResponseEntity<CompanyDto>createCompany(@RequestBody CompanyDto companyDto){
        return companyService.createCompany(companyDto);
    }

    @GetMapping("/companies/{companyId}")
    public ResponseEntity<CompanyDto> getCompanyById(@PathVariable Long companyId) {
        return companyService.getCompanyById(companyId);
    }

    @GetMapping("/Companies")
    public ResponseEntity<List<CompanyDto>> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @PutMapping("/companies/{companyId}")
    public ResponseEntity<CompanyDto> updateCompany(@PathVariable Long companyId, @RequestBody CompanyDto companyDto) {
        return companyService.updateCompany(companyId, companyDto);
    }

    @DeleteMapping("/companies/{companyId}")
    public ResponseEntity<String> deleteCompany(@PathVariable Long companyId) {
        ResponseEntity<Void>response=companyService.deleteCompany(companyId);
        if (response.getStatusCode().is2xxSuccessful()){
            return ResponseEntity.ok("Deleted Successfully");
        }else {
            return ResponseEntity.status(response.getStatusCode()).build();
        }
    }

  /*  @GetMapping("/companies")
    public ResponseEntity<Page<CompanyDto>> getAllCompaniesPaged(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "1") int size) {
        return companyService.getAllCompaniesPaged(page, size);
    }
*/
  /*  @GetMapping("/companies")
    public ResponseEntity<Page<CompanyDto>> getAllCompanies (
            @RequestParam(defaultValue = "0")int page,
            @RequestParam(defaultValue = "1") int size,
            @RequestParam(defaultValue = "companyName") String sortBy,
            @RequestParam() String filterName)
    {
        return companyService.getAllCompanies(page,size,sortBy,filterName);
    }*/



}
