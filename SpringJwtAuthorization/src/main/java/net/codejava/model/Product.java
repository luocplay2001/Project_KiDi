package net.codejava.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import java.util.Date;


@Entity
@Table(name = "products")
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(nullable = false,length = 64)
	private String bicCode;

	@Column(nullable = false,length = 32)
	private String typeId;

	@Column(nullable = false, length = 50)
	private String typeGroup;

	@Column(nullable = false,length = 50)
	private String createdUser;

	@Column(nullable = false)
	private Date createdDate;

	@Column(nullable = false,length = 50)
	private String updatedUser;

	@Column(nullable = false)
	private Date updatedDate;

	@Column(nullable = false)
	private String tctt;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ach_bank_id")
	private AchBank achBank;

	public Product() {
	}

	public Product(Integer id, String bicCode, String typeId, String typeGroup, String createdUser,
				   Date createdDate, String updatedUser, Date updatedDate, String tctt, AchBank achBank) {
		this.id = id;
		this.bicCode = bicCode;
		this.typeId = typeId;
		this.typeGroup = typeGroup;
		this.createdUser = createdUser;
		this.createdDate = createdDate;
		this.updatedUser = updatedUser;
		this.updatedDate = updatedDate;
		this.tctt = tctt;
		this.achBank = achBank;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AchBank getAchBank() {
		return achBank;
	}

	public void setAchBank(AchBank achBank) {
		this.achBank = achBank;
	}

	public String getBicCode() {
		return bicCode;
	}

	public void setBicCode(String bicCode) {
		this.bicCode = bicCode;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeGroup() {
		return typeGroup;
	}

	public void setTypeGroup(String typeGroup) {
		this.typeGroup = typeGroup;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedUser() {
		return updatedUser;
	}

	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getTctt() {
		return tctt;
	}

	public void setTctt(String tctt) {
		this.tctt = tctt;
	}
}
