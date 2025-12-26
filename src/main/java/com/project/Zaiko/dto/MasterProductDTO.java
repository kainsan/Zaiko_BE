package com.project.Zaiko.dto;

import com.project.Zaiko.jpa.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MasterProductDTO {
    private ProductEntity productEntity;
    private Category1Entity category1Entity;
    private Category2Entity category2Entity;
    private Category3Entity category3Entity;
    private Category4Entity category4Entity;
    private Category5Entity category5Entity;
    private RepositoryEntity repositoryEntity;
    private LocationEntity locationEntity;
    private UnitNameEntity packCsUnitName;
    private UnitNameEntity packBlUnitName;
    private UnitNameEntity pieceUnitName;
    private SupplierEntity supplierEntity;
}
