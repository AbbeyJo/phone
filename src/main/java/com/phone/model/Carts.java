package com.phone.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: jiangxinyang
 * @Date: 2019/03/11 10:53
 * @Description: TODO
 */
@Table(name = "tb_cart")
public class Carts implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private Integer productId;

    private Integer buyNum;

    private String buyColor;
    
    private String buyVersion;
    
    private Float buyPrice;

	private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }
    
    public String getBuyColor() {
	return buyColor;
	}

	public void setBuyColor(String buyColor) {
		this.buyColor = buyColor;
	}

	public String getBuyVersion() {
		return buyVersion;
	}

	public void setBuyVersion(String buyVersion) {
		this.buyVersion = buyVersion;
	}

	 public Float getBuyPrice() {
			return buyPrice;
		}

	public void setBuyPrice(Float buyPrice) {
			this.buyPrice = buyPrice;
		}
		
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Carts{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                ", buyNum=" + buyNum +
                ", buyColor=" + buyColor +
                ", buyVersion=" + buyVersion +
                ", buyPrice=" + buyPrice +
                ", createTime=" + createTime +
                '}';
    }
}
