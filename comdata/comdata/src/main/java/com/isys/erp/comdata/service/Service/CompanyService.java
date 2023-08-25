package com.isys.erp.comdata.service.Service;

import com.isys.erp.comdata.dto.CompanyDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CompanyService {
    ResponseEntity<CompanyDto>createCompany (CompanyDto companyDto);

    ResponseEntity<CompanyDto> getCompanyById(Long companyId);

    ResponseEntity<List<CompanyDto>> getAllCompanies();

    ResponseEntity<CompanyDto> updateCompany(Long companyId, CompanyDto companyDto);

    ResponseEntity<Void> deleteCompany(Long companyId);

//    ResponseEntity<Page<CompanyDto>> getAllCompaniesPaged(int page, int size);

//    ResponseEntity<Page<CompanyDto>> getAllCompanies(int page, int size, String sortBy, String filterName);

}
