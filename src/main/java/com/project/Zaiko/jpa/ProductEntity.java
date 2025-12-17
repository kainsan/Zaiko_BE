package com.project.Zaiko.jpa;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T ProductEntity Of Entity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/14      (TanDX)         Create new
*/

@Entity
@Table(name = "m_product")
@NamedQuery(name = "ProductEntity.findAll", query = "SELECT p FROM ProductEntity p")
public class ProductEntity extends CommonEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	// ProductId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    @JsonProperty("productId")
    private Long productId;

    // CompanyId
    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Integer companyId;

    // ProductCode
    @Column(name = "product_code")
    @JsonProperty("productCode")
    private String productCode;

    // UpcCd1
    @Column(name = "upc_cd1")
    @JsonProperty("upcCd1")
    private String upcCd1;

    // UpcCd2
    @Column(name = "upc_cd2")
    @JsonProperty("upcCd2")
    private String upcCd2;

    // Name1
    @Column(name = "name1")
    @JsonProperty("name1")
    private String name1;

    // Name2
    @Column(name = "name2")
    @JsonProperty("name2")
    private String name2;

    // Name3
    @Column(name = "name3")
    @JsonProperty("name3")
    private String name3;

    // Name4
    @Column(name = "name4")
    @JsonProperty("name4")
    private String name4;

    // Name5
    @Column(name = "name5")
    @JsonProperty("name5")
    private String name5;

    // StandardInfo
    @Column(name = "standard_info")
    @JsonProperty("standardInfo")
    private String standardInfo;

    // CategoryCode1
    @Column(name = "category_code_1")
    @JsonProperty("categoryCode1")
    private String categoryCode1;

    // CategoryCode2
    @Column(name = "category_code_2")
    @JsonProperty("categoryCode2")
    private String categoryCode2;

    // CategoryCode3
    @Column(name = "category_code_3")
    @JsonProperty("categoryCode3")
    private String categoryCode3;

    // CategoryCode4
    @Column(name = "category_code_4")
    @JsonProperty("categoryCode4")
    private String categoryCode4;

    // CategoryCode5
    @Column(name = "category_code_5")
    @JsonProperty("categoryCode5")
    private String categoryCode5;

    // Notes
    @Column(name = "notes")
    @JsonProperty("notes")
    private String notes;

    // FifoType
    @Column(name = "fifo_type")
    @JsonProperty("fifoType")
    private String fifoType = "0";

    // IsDatetimeMng
    @Column(name = "is_datetime_mng")
    @JsonProperty("isDateTimeMng")
    private String isDateTimeMng = "0";

    // DatetimeMngType
    @Column(name = "datetime_mng_type")
    @JsonProperty("dateTimeMngType")
    private String dateTimeMngType = "0";

    // IsNumberMng
    @Column(name = "is_number_mng")
    @JsonProperty("isNumberMng")
    private String isNumberMng = "0";

    // CartonWeight
    @Column(name = "carton_weight")
    @JsonProperty("cartonWeight")
    private BigDecimal cartonWeight = new BigDecimal(0);

    // CartonWeightName
    @Column(name = "carton_weight_name")
    @JsonProperty("cartonWeightName")
    private String cartonWeightName;

    // CartonVolume
    @Column(name = "carton_volume")
    @JsonProperty("cartonVolume")
    private BigDecimal cartonVolume = new BigDecimal(0);

    // CartonVolumeName
    @Column(name = "carton_volume_name")
    @JsonProperty("cartonVolumeName")
    private String cartonVolumeName;

    // CartonVertical
    @Column(name = "carton_vertical")
    @JsonProperty("cartonVertical")
    private BigDecimal cartonVertical = new BigDecimal(0);

    // CartonHorizontal
    @Column(name = "carton_horizontal")
    @JsonProperty("cartonHorizontal")
    private BigDecimal cartonHorizontal = new BigDecimal(0);

    // cartonHigh
    @Column(name = "carton_high")
    @JsonProperty("cartonHigh")
    private BigDecimal cartonHigh = new BigDecimal(0);

    // PieceWeight
    @Column(name = "piece_weight")
    @JsonProperty("pieceWeight")
    private BigDecimal pieceWeight = new BigDecimal(0);

    // PieceWeightName
    @Column(name = "piece_weight_name")
    @JsonProperty("pieceWeightName")
    private String pieceWeightName;

    // PieceVolume
    @Column(name = "piece_volume")
    @JsonProperty("pieceVolume")
    private BigDecimal pieceVolume = new BigDecimal(0);

    // PieceVolumeName
    @Column(name = "piece_volume_name")
    @JsonProperty("pieceVolumeName")
    private String pieceVolumeName;

    // PieceVertical
    @Column(name = "piece_vertical")
    @JsonProperty("pieceVertical")
    private BigDecimal pieceVertical = new BigDecimal(0);

    // PieceHorizontal
    @Column(name = "piece_horizontal")
    @JsonProperty("pieceHorizontal")
    private BigDecimal pieceHorizontal = new BigDecimal(0);

    // PieceHigh
    @Column(name = "piece_high")
    @JsonProperty("pieceHigh")
    private BigDecimal pieceHigh = new BigDecimal(0);

    // IsPackCsInput
    @Column(name = "is_pack_cs_input")
    @JsonProperty("isPackCsInput")
    private String isPackCsInput = "0";

    // IsPackCsOutput
    @Column(name = "is_pack_cs_output")
    @JsonProperty("isPackCsOutput")
    private String isPackCsOutput = "0";

    // PackMCsUnitCode
    @Column(name = "pack_cs_unit_code")
    @JsonProperty("packCsUnitCode")
    private String packCsUnitCode;

    // PackCsAmount
    @Column(name = "pack_cs_amount")
    @JsonProperty("packCsAmount")
    private Integer packCsAmount = 1;

    // IsPackBlInput
    @Column(name = "is_pack_bl_input")
    @JsonProperty("isPackBlInput")
    private String isPackBlInput = "0";

    // IsPackBlOutput
    @Column(name = "is_pack_bl_output")
    @JsonProperty("isPackBlOutput")
    private String isPackBlOutput = "0";

    // PackBlUnitCode
    @Column(name = "pack_bl_unit_code")
    @JsonProperty("packBlUnitCode")
    private String packBlUnitCode;

    // PackBlAmount
    @Column(name = "pack_bl_amount")
    @JsonProperty("packBlAmount")
    private Integer packBlAmount = 1;

    // IsPieceInput
    @Column(name = "is_piece_input")
    @JsonProperty("isPieceInput")
    private String isPieceInput = "0";

    // IsPieceOutput
    @Column(name = "is_piece_output")
    @JsonProperty("isPieceOutput")
    private String isPieceOutput = "0";

    // PieceUnitCode
    @Column(name = "piece_unit_code")
    @JsonProperty("pieceUnitCode")
    private String pieceUnitCode;

    // RepositoryId
    @Column(name = "repository_id")
    @JsonProperty("repositoryId")
    private Long repositoryId;

    // LocationId
    @Column(name = "location_id")
    @JsonProperty("locationId")
    private Long locationId;

    // IsReplenishMng
    @Column(name = "is_replenish_mng")
    @JsonProperty("isReplenishMng")
    private String isReplenishMng = "0";

    // MinInventoryQuantity
    @Column(name = "min_inventory_quantity")
    @JsonProperty("minInventoryQuantity")
    private Integer minInventoryQuantity;

    // MinInputQuantity
    @Column(name = "min_input_quantity")
    @JsonProperty("minInputQuantity")
    private Integer minInputQuantity;

    // IsVarious
    @Column(name = "is_various")
    @JsonProperty("isVarious")
    private String isVarious = "0";

    // SupplierId
    @Column(name = "supplier_id")
    @JsonProperty("supplierId")
    private Long supplierId;

    // LeadTime
    @Column(name = "lead_time")
    @JsonProperty("leadTime")
    private Integer leadTime = 0;

    // Tax
    @Column(name = "tax")
    @JsonProperty("tax")
    private String tax = "0";

    // IsSet
    @Column(name = "is_set")
    @JsonProperty("isSet")
    private String isSet = "0";

    // FreeItem1
    @Column(name = "free_item1")
    @JsonProperty("freeItem1")
    private String freeItem1;

    // FreeItem2
    @Column(name = "free_item2")
    @JsonProperty("freeItem2")
    private String freeItem2;

    // FreeItem3
    @Column(name = "free_item3")
    @JsonProperty("freeItem3")
    private String freeItem3;

    // FreeItem4
    @Column(name = "free_item4")
    @JsonProperty("freeItem4")
    private String freeItem4;

    // FreeItem5
    @Column(name = "free_item5")
    @JsonProperty("freeItem5")
    private String freeItem5;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getUpcCd1() {
        return upcCd1;
    }

    public void setUpcCd1(String upcCd1) {
        this.upcCd1 = upcCd1;
    }

    public String getUpcCd2() {
        return upcCd2;
    }

    public void setUpcCd2(String upcCd2) {
        this.upcCd2 = upcCd2;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }

    public String getStandardInfo() {
        return standardInfo;
    }

    public void setStandardInfo(String standardInfo) {
        this.standardInfo = standardInfo;
    }

    public String getCategoryCode1() {
        return categoryCode1;
    }

    public void setCategoryCode1(String categoryCode1) {
        this.categoryCode1 = categoryCode1;
    }

    public String getCategoryCode2() {
        return categoryCode2;
    }

    public void setCategoryCode2(String categoryCode2) {
        this.categoryCode2 = categoryCode2;
    }

    public String getCategoryCode3() {
        return categoryCode3;
    }

    public void setCategoryCode3(String categoryCode3) {
        this.categoryCode3 = categoryCode3;
    }

    public String getCategoryCode4() {
        return categoryCode4;
    }

    public void setCategoryCode4(String categoryCode4) {
        this.categoryCode4 = categoryCode4;
    }

    public String getCategoryCode5() {
        return categoryCode5;
    }

    public void setCategoryCode5(String categoryCode5) {
        this.categoryCode5 = categoryCode5;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getFifoType() {
        return fifoType;
    }

    public void setFifoType(String fifoType) {
        this.fifoType = fifoType;
    }

    public String getIsDateTimeMng() {
        return isDateTimeMng;
    }

    public void setIsDateTimeMng(String isDateTimeMng) {
        this.isDateTimeMng = isDateTimeMng;
    }

    public String getDateTimeMngType() {
        return dateTimeMngType;
    }

    public void setDateTimeMngType(String dateTimeMngType) {
        this.dateTimeMngType = dateTimeMngType;
    }

    public String getIsNumberMng() {
        return isNumberMng;
    }

    public void setIsNumberMng(String isNumberMng) {
        this.isNumberMng = isNumberMng;
    }

    public BigDecimal getCartonWeight() {
        return cartonWeight;
    }

    public void setCartonWeight(BigDecimal cartonWeight) {
        this.cartonWeight = cartonWeight;
    }

    public String getCartonWeightName() {
        return cartonWeightName;
    }

    public void setCartonWeightName(String cartonWeightName) {
        this.cartonWeightName = cartonWeightName;
    }

    public BigDecimal getCartonVolume() {
        return cartonVolume;
    }

    public void setCartonVolume(BigDecimal cartonVolume) {
        this.cartonVolume = cartonVolume;
    }

    public String getCartonVolumeName() {
        return cartonVolumeName;
    }

    public void setCartonVolumeName(String cartonVolumeName) {
        this.cartonVolumeName = cartonVolumeName;
    }

    public BigDecimal getCartonVertical() {
        return cartonVertical;
    }

    public void setCartonVertical(BigDecimal cartonVertical) {
        this.cartonVertical = cartonVertical;
    }

    public BigDecimal getCartonHorizontal() {
        return cartonHorizontal;
    }

    public void setCartonHorizontal(BigDecimal cartonHorizontal) {
        this.cartonHorizontal = cartonHorizontal;
    }

    public BigDecimal getCartonHigh() {
        return cartonHigh;
    }

    public void setCartonHigh(BigDecimal cartonHigh) {
        this.cartonHigh = cartonHigh;
    }

    public BigDecimal getPieceWeight() {
        return pieceWeight;
    }

    public void setPieceWeight(BigDecimal pieceWeight) {
        this.pieceWeight = pieceWeight;
    }

    public String getPieceWeightName() {
        return pieceWeightName;
    }

    public void setPieceWeightName(String pieceWeightName) {
        this.pieceWeightName = pieceWeightName;
    }

    public BigDecimal getPieceVolume() {
        return pieceVolume;
    }

    public void setPieceVolume(BigDecimal pieceVolume) {
        this.pieceVolume = pieceVolume;
    }

    public String getPieceVolumeName() {
        return pieceVolumeName;
    }

    public void setPieceVolumeName(String pieceVolumeName) {
        this.pieceVolumeName = pieceVolumeName;
    }

    public BigDecimal getPieceVertical() {
        return pieceVertical;
    }

    public void setPieceVertical(BigDecimal pieceVertical) {
        this.pieceVertical = pieceVertical;
    }

    public BigDecimal getPieceHorizontal() {
        return pieceHorizontal;
    }

    public void setPieceHorizontal(BigDecimal pieceHorizontal) {
        this.pieceHorizontal = pieceHorizontal;
    }

    public BigDecimal getPieceHigh() {
        return pieceHigh;
    }

    public void setPieceHigh(BigDecimal pieceHigh) {
        this.pieceHigh = pieceHigh;
    }

    public String getIsPackCsInput() {
        return isPackCsInput;
    }

    public void setIsPackCsInput(String isPackCsInput) {
        this.isPackCsInput = isPackCsInput;
    }

    public String getIsPackCsOutput() {
        return isPackCsOutput;
    }

    public void setIsPackCsOutput(String isPackCsOutput) {
        this.isPackCsOutput = isPackCsOutput;
    }

    public String getPackCsUnitCode() {
        return packCsUnitCode;
    }

    public void setPackCsUnitCode(String packCsUnitCode) {
        this.packCsUnitCode = packCsUnitCode;
    }

    public Integer getPackCsAmount() {
        return packCsAmount;
    }

    public void setPackCsAmount(Integer packCsAmount) {
        this.packCsAmount = packCsAmount;
    }

    public String getIsPackBlInput() {
        return isPackBlInput;
    }

    public void setIsPackBlInput(String isPackBlInput) {
        this.isPackBlInput = isPackBlInput;
    }

    public String getIsPackBlOutput() {
        return isPackBlOutput;
    }

    public void setIsPackBlOutput(String isPackBlOutput) {
        this.isPackBlOutput = isPackBlOutput;
    }

    public String getPackBlUnitCode() {
        return packBlUnitCode;
    }

    public void setPackBlUnitCode(String packBlUnitCode) {
        this.packBlUnitCode = packBlUnitCode;
    }

    public Integer getPackBlAmount() {
        return packBlAmount;
    }

    public void setPackBlAmount(Integer packBlAmount) {
        this.packBlAmount = packBlAmount;
    }

    public String getIsPieceInput() {
        return isPieceInput;
    }

    public void setIsPieceInput(String isPieceInput) {
        this.isPieceInput = isPieceInput;
    }

    public String getIsPieceOutput() {
        return isPieceOutput;
    }

    public void setIsPieceOutput(String isPieceOutput) {
        this.isPieceOutput = isPieceOutput;
    }

    public String getPieceUnitCode() {
        return pieceUnitCode;
    }

    public void setPieceUnitCode(String pieceUnitCode) {
        this.pieceUnitCode = pieceUnitCode;
    }

    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getIsReplenishMng() {
        return isReplenishMng;
    }

    public void setIsReplenishMng(String isReplenishMng) {
        this.isReplenishMng = isReplenishMng;
    }

    public Integer getMinInventoryQuantity() {
        return minInventoryQuantity;
    }

    public void setMinInventoryQuantity(Integer minInventoryQuantity) {
        this.minInventoryQuantity = minInventoryQuantity;
    }

    public Integer getMinInputQuantity() {
        return minInputQuantity;
    }

    public void setMinInputQuantity(Integer minInputQuantity) {
        this.minInputQuantity = minInputQuantity;
    }

    public String getIsVarious() {
        return isVarious;
    }

    public void setIsVarious(String isVarious) {
        this.isVarious = isVarious;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Integer leadTime) {
        this.leadTime = leadTime;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getIsSet() {
        return isSet;
    }

    public void setIsSet(String isSet) {
        this.isSet = isSet;
    }

    public String getFreeItem1() {
        return freeItem1;
    }

    public void setFreeItem1(String freeItem1) {
        this.freeItem1 = freeItem1;
    }

    public String getFreeItem2() {
        return freeItem2;
    }

    public void setFreeItem2(String freeItem2) {
        this.freeItem2 = freeItem2;
    }

    public String getFreeItem3() {
        return freeItem3;
    }

    public void setFreeItem3(String freeItem3) {
        this.freeItem3 = freeItem3;
    }

    public String getFreeItem4() {
        return freeItem4;
    }

    public void setFreeItem4(String freeItem4) {
        this.freeItem4 = freeItem4;
    }

    public String getFreeItem5() {
        return freeItem5;
    }

    public void setFreeItem5(String freeItem5) {
        this.freeItem5 = freeItem5;
    }
}
