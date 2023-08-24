package com.isys.erp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {
    private String companyCode;
    private String companyName;
    private String companyGroupCode;
    private String description;
    private String createdBy;
    private String updatedBy;

}
