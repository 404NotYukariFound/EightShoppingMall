package com.eight.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ProductInfo {
    // 商品ID
    private Long productId;
    // 商品编码
    private String productCore;
    // 商品名称
    private String productName;
    // 一级分类ID
    private Integer oneCategoryId;
    // 二级分类ID
    private Integer twoCategoryId;
    // 商品销售价格
    private BigDecimal price;
    // 商品原价
    private BigDecimal realPrice;
    // 上下架状态：0下架1上架
    private Integer publishStatus;
    // 生产日期
    private Timestamp productionDate;
    // 商品有效期
    private Integer shelfLife;
    // 商品描述
    private String descript;
    // 商品录入时间
    private Timestamp indate;
    // 最后修改时间
    private Timestamp modifiedTime;

    // 无参构造器
    public ProductInfo() {
    }

    // 有参构造器，进行属性值的初始化
    public ProductInfo(Long productId, String productCore, String productName, Integer oneCategoryId, Integer twoCategoryId, BigDecimal price, BigDecimal realPrice, Integer publishStatus, Timestamp productionDate, Integer shelfLife, String descript, Timestamp indate, Timestamp modifiedTime) {
        this.productId = productId;
        this.productCore = productCore;
        this.productName = productName;
        this.oneCategoryId = oneCategoryId;
        this.twoCategoryId = twoCategoryId;
        this.price = price;
        this.realPrice = realPrice;
        this.publishStatus = publishStatus;
        this.productionDate = productionDate;
        this.shelfLife = shelfLife;
        this.descript = descript;
        this.indate = indate;
        this.modifiedTime = modifiedTime;
    }

    // 获取 商品ID 的属性值
    public Long getProductId() {
        return productId;
    }

    // 设置 商品ID 的属性值
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    // 获取 商品编码 的属性值
    public String getProductCore() {
        return productCore;
    }

    // 设置 商品编码 的属性值
    public void setProductCore(String productCore) {
        this.productCore = productCore;
    }

    // 获取 商品名称 的属性值
    public String getProductName() {
        return productName;
    }

    // 设置 商品名称 的属性值
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // 获取 一级分类ID 的属性值
    public Integer getOneCategoryId() {
        return oneCategoryId;
    }

    // 设置 一级分类ID 的属性值
    public void setOneCategoryId(Integer oneCategoryId) {
        this.oneCategoryId = oneCategoryId;
    }

    // 获取 二级分类ID 的属性值
    public Integer getTwoCategoryId() {
        return twoCategoryId;
    }

    // 设置 二级分类ID 的属性值
    public void setTwoCategoryId(Integer twoCategoryId) {
        this.twoCategoryId = twoCategoryId;
    }

    // 获取 商品销售价格 的属性值
    public BigDecimal getPrice() {
        return price;
    }

    // 设置 商品销售价格 的属性值
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // 获取 商品原价 的属性值
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    // 设置 商品原价 的属性值
    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    // 获取 上下架状态：0下架1上架 的属性值
    public Integer getPublishStatus() {
        return publishStatus;
    }

    // 设置 上下架状态：0下架1上架 的属性值
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    // 获取 生产日期 的属性值
    public Timestamp getProductionDate() {
        return productionDate;
    }

    // 设置 生产日期 的属性值
    public void setProductionDate(Timestamp productionDate) {
        this.productionDate = productionDate;
    }

    // 获取 商品有效期 的属性值
    public Integer getShelfLife() {
        return shelfLife;
    }

    // 设置 商品有效期 的属性值
    public void setShelfLife(Integer shelfLife) {
        this.shelfLife = shelfLife;
    }

    // 获取 商品描述 的属性值
    public String getDescript() {
        return descript;
    }

    // 设置 商品描述 的属性值
    public void setDescript(String descript) {
        this.descript = descript;
    }

    // 获取 商品录入时间 的属性值
    public Timestamp getIndate() {
        return indate;
    }

    // 设置 商品录入时间 的属性值
    public void setIndate(Timestamp indate) {
        this.indate = indate;
    }

    // 获取 最后修改时间 的属性值
    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    // 设置 最后修改时间 的属性值
    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    // 重写toString方法，使用该方法可以在控制台打印属性的数据
    @Override
    public String toString() {
        return "ProductInfo {" +
                ", productId='" + productId + '\'' +
                ", productCore='" + productCore + '\'' +
                ", productName='" + productName + '\'' +
                ", oneCategoryId='" + oneCategoryId + '\'' +
                ", twoCategoryId='" + twoCategoryId + '\'' +
                ", price='" + price + '\'' +
                ", realPrice='" + realPrice + '\'' +
                ", publishStatus='" + publishStatus + '\'' +
                ", productionDate='" + productionDate + '\'' +
                ", shelfLife='" + shelfLife + '\'' +
                ", descript='" + descript + '\'' +
                ", indate='" + indate + '\'' +
                ", modifiedTime='" + modifiedTime + '\'' +
                "}";
    }
}