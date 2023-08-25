package com.isys.erp.comdata.mapper;
import com.isys.erp.comdata.dto.CompanyDto;
import com.isys.erp.comdata.entity.CompanyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;


@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CompanyMapper extends BaseMapper<CompanyEntity, CompanyDto>{

}
