package com.isys.erp.comdata.service.Impl;

import com.isys.erp.comdata.dto.CompanyDto;
import com.isys.erp.comdata.entity.CompanyEntity;
import com.isys.erp.comdata.mapper.CompanyMapper;
import com.isys.erp.comdata.repository.CompanyRepository;
import com.isys.erp.comdata.service.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private CompanyRepository companyRepository;
    @Override
    public CompanyDto createCompany(CompanyDto companyDto) {
        CompanyEntity companyEntity=companyMapper.toEntity(companyDto);
        companyEntity =companyRepository.save(companyEntity);
        return companyMapper.toDto(companyEntity);
    }
}
