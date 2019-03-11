package com.phone.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Table(name = "tb_receive_adress")
public class ReceiveAddress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer receiveAdressId;
    private Integer userId;
    private String receiver;
    private String province;
    private String city;
    private String district;
    private String address;
    private String signerMobile;
    private Date addTime;

    public Integer getReceiveAdressId() {
        return receiveAdressId;
    }

    public void setReceiveAdressId(Integer receiveAdressId) {
        this.receiveAdressId = receiveAdressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSignerMobile() {
        return signerMobile;
    }

    public void setSignerMobile(String signerMobile) {
        this.signerMobile = signerMobile;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "ReceiveAddress{" +
                "receiveAdressId=" + receiveAdressId +
                ", userId=" + userId +
                ", receiver='" + receiver + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", address='" + address + '\'' +
                ", signerMobile='" + signerMobile + '\'' +
                ", addTime=" + addTime +
                '}';
    }
}
