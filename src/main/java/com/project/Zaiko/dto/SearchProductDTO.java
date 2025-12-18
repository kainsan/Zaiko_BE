package com.project.Zaiko.dto;

import lombok.Data;

@Data
public class SearchProductDTO {
    private String productCodeFrom;
    private String productCodeTo;

    private String name1;
    private String upcCd1;
    private String upcCd2;

    private String categoryCode1;
    private String categoryCode2;
    private String categoryCode3;
    private String categoryCode4;
    private String categoryCode5;

    private Long repositoryId;
    private Long locationId;

    private String isSet;
}
