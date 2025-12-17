package com.project.Zaiko.jpa;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : PurchaseUnitPrice Entity
 *
 * @author: (HoangLLN)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [PurchaseUnitPrice]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/26          (HoangLLN)                  Create new
*/

@Entity
@Table(name = "m_purchase_price")
@NamedQuery(name = "PurchaseUnitPriceEntity.findAll", query = "SELECT pur FROM PurchaseUnitPriceEntity pur")
public class PurchaseUnitPriceEntity extends CommonEntity implements Serializable{
	private static final long serialVersionUID = 1L;
		
		// PurchasePriceId
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "purchase_price_id")
		@JsonProperty("purchasePriceId")
		private Long purchasePriceId;
		
		// SupplierId
		@Column(name = "supplier_id")
		@JsonProperty("supplierId")
		private Long supplierId;
		
		// CompanyId
		@Column(name = "company_id")
		@JsonProperty("companyId")
		private Integer companyId;
		
		// ProductId
		@Column(name = "product_id")
		@JsonProperty("productId")
		private Long productId;
		
		// NumberMng
		@Column(name = "number_mng" ,length = 100)
		@JsonProperty("numberMng")
		private String numberMng;

		// DatetimeMngFrom
		@Column(name = "datetime_mng_from")
		@JsonProperty("dateTimeMngFrom")
		private String dateTimeMngFrom;

		// DatetimeMngTo
		@Column(name = "datetime_mng_to")
		@JsonProperty("dateTimeMngTo")
		private String dateTimeMngTo;

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
		
		//PackCSPrice
		@Column(name = "pack_cs_price")
		@JsonProperty("packCsPrice")
		private BigDecimal packCsPrice = new BigDecimal(0);
		
		//PackBLPrice
		@Column(name = "pack_bl_price")
		@JsonProperty("packBlPrice")
		private BigDecimal packBlPrice = new BigDecimal(0);
		
		//PiecePrice
		@Column(name = "piece_price")
		@JsonProperty("piecePrice")
		private BigDecimal piecePrice = new BigDecimal(0);

		public Long getPurchasePriceId() {
            return purchasePriceId;
        }

        public void setPurchasePriceId(Long purchasePriceId) {
            this.purchasePriceId = purchasePriceId;
        }

        public Long getSupplierId() {
            return supplierId;
        }

        public void setSupplierId(Long supplierId) {
            this.supplierId = supplierId;
        }

        public Integer getCompanyId() {
			return companyId;
		}

		public void setCompanyId(Integer companyId) {
			this.companyId = companyId;
		}

		public Long getProductId() {
			return productId;
		}

		public void setProductId(Long productId) {
			this.productId = productId;
		}

		public String getNumberMng() {
			return numberMng;
		}

		public void setNumberMng(String numberMng) {
			this.numberMng = numberMng;
		}

		public String getDateTimeMngFrom() {
			return dateTimeMngFrom;
		}

		public void setDateTimeMngFrom(String dateTimeMngFrom) {
			this.dateTimeMngFrom = dateTimeMngFrom;
		}

		public String getDateTimeMngTo() {
			return dateTimeMngTo;
		}

		public void setDateTimeMngTo(String dateTimeMngTo) {
			this.dateTimeMngTo = dateTimeMngTo;
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

		public BigDecimal getPackCsPrice() {
			return packCsPrice;
		}

		public void setPackCsPrice(BigDecimal packCsPrice) {
			this.packCsPrice = packCsPrice;
		}

		public BigDecimal getPackBlPrice() {
			return packBlPrice;
		}

		public void setPackBlPrice(BigDecimal packBlPrice) {
			this.packBlPrice = packBlPrice;
		}

		public BigDecimal getPiecePrice() {
			return piecePrice;
		}

		public void setPiecePrice(BigDecimal piecePrice) {
			this.piecePrice = piecePrice;
		}
		
}
