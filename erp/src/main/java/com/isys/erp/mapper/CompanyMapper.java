package com.isys.erp.mapper;

import com.isys.erp.dto.CompanyDto;
import com.isys.erp.entity.CompanyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;


@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CompanyMapper extends BaseMapper<CompanyEntity, CompanyDto>{
}