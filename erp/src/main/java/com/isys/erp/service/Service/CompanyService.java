package com.isys.erp.service.Service;

import com.isys.erp.dto.CompanyDto;
import org.springframework.http.ResponseEntity;

public interface CompanyService {
    ResponseEntity<CompanyDto>createCompany (CompanyDto companyDto);
    CompanyDto GetByUserId (Long id);
}
