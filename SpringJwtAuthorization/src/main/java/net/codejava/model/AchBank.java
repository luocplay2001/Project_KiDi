package net.codejava.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ach_banks")
public class AchBank {

    @Id
    private Integer id;

    @Column
    private Integer bankId;

    @Column
    private String bankCode;

    @Column
    private String bankName;

    @Column
    private String fullName;

    @Column
    private String fullNameEng;

    @Column
    private String bicCodeSwift;

    @Column
    private Integer bankIdCitad;

    @Column
    private String secretKey;

    @Column
    private String password;

    @Column
    private String createdUser;

    @Column
    private Date createdDate;

    @Column
    private String updatedUser;

    @Column
    private Date updatedDate;

    public AchBank() {
    }

    public AchBank(Integer id, Integer bankId, String bankCode, String bankName, String fullName, String fullNameEng,
                   String bicCodeSwift, Integer bankIdCitad, String secretKey, String password, String createdUser,
                   Date createdDate, String updatedUser, Date updatedDate) {
        this.id = id;
        this.bankId = bankId;
        this.bankCode = bankCode;
        this.bankName = bankName;
        this.fullName = fullName;
        this.fullNameEng = fullNameEng;
        this.bicCodeSwift = bicCodeSwift;
        this.bankIdCitad = bankIdCitad;
        this.secretKey = secretKey;
        this.password = password;
        this.createdUser = createdUser;
        this.createdDate = createdDate;
        this.updatedUser = updatedUser;
        this.updatedDate = updatedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullNameEng() {
        return fullNameEng;
    }

    public void setFullNameEng(String fullNameEng) {
        this.fullNameEng = fullNameEng;
    }

    public String getBicCodeSwift() {
        return bicCodeSwift;
    }

    public void setBicCodeSwift(String bicCodeSwift) {
        this.bicCodeSwift = bicCodeSwift;
    }

    public Integer getBankIdCitad() {
        return bankIdCitad;
    }

    public void setBankIdCitad(Integer bankIdCitad) {
        this.bankIdCitad = bankIdCitad;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
