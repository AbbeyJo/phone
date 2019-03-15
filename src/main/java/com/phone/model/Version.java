package com.phone.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Table(name = "tb_version")
@Data
public class Version implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer versionId;
    private Integer productId;
    private String versionName;
    private Float versionPrice;

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Float getVersionPrice() {
        return versionPrice;
    }

    public void setVersionPrice(Float versionPrice) {
        this.versionPrice = versionPrice;
    }

    @Override
    public String toString() {
        return "Version{" +
                "versionId=" + versionId +
                ", productId=" + productId +
                ", versionName='" + versionName + '\'' +
                ", versionPrice=" + versionPrice +
                '}';
    }
}
