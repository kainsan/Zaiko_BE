package com.project.Zaiko.jpa;

import java.io.Serializable;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] LocationEntity.
 *
 * @author: (TanDX)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/07/01      (TanDX)        	  Create table
*/

@Entity
@Table(name = "m_location")
@NamedQuery(name = "LocationEntity.findAll", query = "SELECT lt FROM LocationEntity lt ")
public class LocationEntity extends CommonEntity  implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	//LOCATION ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id")
	@JsonProperty("locationId")
	private Long locationId;

	//COMPANY ID
	@Column(name = "company_id")
	@JsonProperty("companyId")
	private Integer companyId;

	//REPOSITORY ID
	@Column(name = "repository_id")
	@JsonProperty("repositoryId")
	private Long repositoryId;

	//LOCATION CODE
	@Column(name = "location_code")
	@JsonProperty("locationCode")
	private String locationCode;

	//LOCATION NAME
	@Column(name = "location_name")
	@JsonProperty("locationName")
	private String locationName;

	//IS RESERVE MCARTON
	@Column(name = "is_reserve_mcarton")
	@JsonProperty("isReserveMcarton")
	private String isReserveMcarton = "0";

	//IS RESERVE ICARTON
	@Column(name = "is_reserve_icarton")
	@JsonProperty("isReserveIcarton")
	private String isReserveIcarton = "0";

	//IS RESERVE PIECE
	@Column(name = "is_reserve_piece")
	@JsonProperty("isReservePiece")
	private String isReservePiece ="0";

	//IS INPUT BAN
	@Column(name = "is_input_ban")
	@JsonProperty("isInputBan")
	private String isInputBan = "0";

	//IS OUTPUT BAN
	@Column(name = "is_output_ban")
	@JsonProperty("isOutputBan")
	private String isOutputBan = "0";

	//IS RESERVE BAN
	@Column(name = "is_reserve_ban")
	@JsonProperty("isReserveBan")
	private String isReserveBan = "0";

	//ROAD ORDER INVENTORY
	@Column(name = "road_order_inventory")
	@JsonProperty("roadOrderInventory")
	private String roadOrderInventory;

	//ROAD ORDER PICK
	@Column(name = "road_order_pick")
	@JsonProperty("roadOrderPick")
	private String roadOrderPick;

	//NOTES
	@Column(name = "notes")
	@JsonProperty("notes")
	private String notes;

	//FREE ITEM 1
	@Column(name = "free_item1")
	@JsonProperty("freeItem1")
	private String freeItem1;

	//FREE ITEM 2
	@Column(name = "free_item2")
	@JsonProperty("freeItem2")
	private String freeItem2;

	//FREE ITEM 3
	@Column(name = "free_item3")
	@JsonProperty("freeItem3")
	private String freeItem3;

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Long getRepositoryId() {
		return repositoryId;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getIsReserveMcarton() {
		return isReserveMcarton;
	}

	public void setIsReserveMcarton(String isReserveMcarton) {
		this.isReserveMcarton = isReserveMcarton;
	}

	public String getIsReserveIcarton() {
		return isReserveIcarton;
	}

	public void setIsReserveIcarton(String isReserveIcarton) {
		this.isReserveIcarton = isReserveIcarton;
	}

	public String getIsReservePiece() {
		return isReservePiece;
	}

	public void setIsReservePiece(String isReservePiece) {
		this.isReservePiece = isReservePiece;
	}

	public String getIsInputBan() {
		return isInputBan;
	}

	public void setIsInputBan(String isInputBan) {
		this.isInputBan = isInputBan;
	}

	public String getIsOutputBan() {
		return isOutputBan;
	}

	public void setIsOutputBan(String isOutputBan) {
		this.isOutputBan = isOutputBan;
	}

	public String getIsReserveBan() {
		return isReserveBan;
	}

	public void setIsReserveBan(String isReserveBan) {
		this.isReserveBan = isReserveBan;
	}

	public String getRoadOrderInventory() {
		return roadOrderInventory;
	}

	public void setRoadOrderInventory(String roadOrderInventory) {
		this.roadOrderInventory = roadOrderInventory;
	}

	public String getRoadOrderPick() {
		return roadOrderPick;
	}

	public void setRoadOrderPick(String roadOrderPick) {
		this.roadOrderPick = roadOrderPick;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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
}

