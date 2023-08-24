package com.isys.erp.service.Impl;

import com.isys.erp.dto.CompanyDto;
import com.isys.erp.entity.CompanyEntity;
import com.isys.erp.mapper.CompanyMapper;
import com.isys.erp.repository.CompanyRepository;
import com.isys.erp.service.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public ResponseEntity<CompanyDto> createCompany(CompanyDto companyDto) {
        CompanyEntity companyEntity=companyMapper.toEntity(companyDto);
        CompanyEntity saveCompanyEntity=companyRepository.save(companyEntity);
        CompanyDto saveCompanyDto=companyMapper.toModel(saveCompanyEntity);
        return new ResponseEntity<>(saveCompanyDto, HttpStatus.OK );
    }

    @Override
    public CompanyDto GetByUserId(Long id) {

        return null;
    }

    /*@Override
    public CompanyDto GetByUserId(Long id) {
        CompanyEntity companyEntity = companyRepository.findBy(id).orElse(null);
        if (companyEntity != null) {
            return companyMapper.toModel(companyEntity);
        } else {
            return null;
        }
    }*/
}
