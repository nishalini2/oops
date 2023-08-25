package com.isys.erp.comdata.service.Impl;
import com.isys.erp.comdata.dto.CompanyDto;
import com.isys.erp.comdata.entity.CompanyEntity;
import com.isys.erp.comdata.mapper.CompanyMapper;
import com.isys.erp.comdata.repository.CompanyRepository;
import com.isys.erp.comdata.service.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public ResponseEntity<CompanyDto> getCompanyById(Long companyId) {
        CompanyEntity companyEntity = companyRepository.findById(companyId)
                .orElse(null);

        if (companyEntity != null) {
            CompanyDto companyDto = companyMapper.toModel(companyEntity);
            return new ResponseEntity<>(companyDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<List<CompanyDto>> getAllCompanies() {
        List<CompanyEntity> companyEntities = companyRepository.findAll();
        List<CompanyDto> companyDtos = companyEntities.stream()
                .map(companyMapper::toModel)
                .collect(Collectors.toList());
        return new ResponseEntity<>(companyDtos, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CompanyDto> updateCompany(Long companyId, CompanyDto companyDto) {
        CompanyEntity existingCompanyEntity = companyRepository.findById(companyId)
                .orElse(null);

        if (existingCompanyEntity != null) {
            CompanyEntity updatedCompanyEntity = companyMapper.toEntity(companyDto);
            updatedCompanyEntity.setId(companyId);
            updatedCompanyEntity.setCreatedDate(existingCompanyEntity.getCreatedDate());
            updatedCompanyEntity.setCreatedBy(existingCompanyEntity.getCreatedBy());

            CompanyEntity saveCompanyEntity = companyRepository.save(updatedCompanyEntity);
            CompanyDto saveCompanyDto = companyMapper.toModel(saveCompanyEntity);

            return new ResponseEntity<>(saveCompanyDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Void> deleteCompany(Long companyId) {
        if (companyRepository.existsById(companyId)) {
            companyRepository.deleteById(companyId);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



/*
    @Override
    public ResponseEntity<Page<CompanyDto>> getAllCompaniesPaged(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<CompanyEntity> companyPage = companyRepository.findAll(pageable);

        Page<CompanyDto> companyDtoPage = companyPage.map(companyMapper::toModel);

        return new ResponseEntity<>(companyDtoPage, HttpStatus.OK);
    }
*/

/*
    @Override
    public ResponseEntity<Page<CompanyDto>> getAllCompanies(int page, int size, String sortBy, String filterName) {
        Pageable pageable=PageRequest.of(page, size,Sort.by(sortBy));

        Page<CompanyEntity> companyPage;
        if (filterName !=null && !filterName.isEmpty()){
           companyPage =companyRepository.findByCompanyNameContainingAndStatus(filterName,true,pageable);

        }else {
            companyPage = companyRepository.findAll(pageable);
        }
        Page<CompanyDto> companyDtos= companyPage.map(companyMapper::toModel);
        return ResponseEntity.ok(companyDtos);
    }
*/



}
