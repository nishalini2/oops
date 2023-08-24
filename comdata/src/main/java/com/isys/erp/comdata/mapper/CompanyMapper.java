package com.isys.erp.comdata.mapper;


import com.isys.erp.comdata.dto.CompanyDto;
import com.isys.erp.comdata.entity.CompanyEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    CompanyEntity toEntity(CompanyDto dto);
    CompanyDto toDto(CompanyEntity entity);
}

