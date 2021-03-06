package com.ync365.seed.dto.goods;

import java.math.BigDecimal;
import java.util.List;


/**
 * 商品详情页面DTO
 *     
 * @Title：SkuDetailDTO  
 * @Description: TODO   
 * @author: robo        
 * @date: 2015年10月2日 上午11:32:55      
 * @version     
 *
 */
public class SkuDetailDTO {

	private Integer skuId;

    /**
     * 商品主键
     */
    private Integer goodsId;
 
    /**
     * 商品货号
     */
    private String sn;
    
    /**
     *库存(goods_stocks表)
     *(sku表不存)
     * 
     */
    private Integer stockNum;

    /**
     * 市场价
     */
    private BigDecimal marketPrice;

    
    /**
     * 成本价
     */
    private BigDecimal costPrice ;

    /**
     * 下限
     */
    private BigDecimal lowerLimit;

    /**
     * 上限
     */
    private BigDecimal upperLimit;

    /**
     * 商品名称 
     */
    private String goodsName;
    
    /**
     * 全称
     */
    private String fullName;

    private int ftype;

    private Integer sort;

    /**
     * 销售数量 
     */
    private Long salesCount;
    
    /**
     * 
     */
    private int isGood;
    
    /**
     * 热销
     */
    private int isHot;

    /**
     * 1:通过  2：未通过  3：上架  4：下架   0：默认未审核
     */
    private int status;

    /**
     * 商品条码
     */
    private String barCode;

    /**
     * 商品编码
     */
    private String goodsCode;
 
 
    
    /**
     * 删除标识符  1删除 0未删除
     */
    private Integer isDelete;
 
    
    /**
     * 店铺Id
     */
    private Integer storeId;
    
    /**
     * 店铺中文名称
     */
    private String storeName ;
 
    /**
     * 访问数量
     */
    private Integer visitCount ;
    
    /**
     * 商品副标题
     */
    private String subtitle;
    
    /**
     * 活动类型
     */
    private Integer activityType ;
    
    /**
     * 规格属性值
     */
    private List<FeatureDTO> specList ;
    
    /**
     * 非规格属性列表
     */
    private List<FeatureDTO> featureList;
    
    /**
     * 送达时间
     */
    private String sendTime ;
    
    /**
     * 主图片地址
     */
    private String tagImgId;
    
    /**
     * 区域价
     */
    private BigDecimal regionPrice;
    
    /**
	 * 重量
	 */
	private Integer weight;
	
    /**
     * 单位
     */
    private String unit;
    
    /**
     * 分类Id
     */
    private Integer categoryId;
    
    /**
     * 供应商编号
     */
    private String popStoreNum;
   

	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public Integer getStockNum() {
		return stockNum;
	}

	public void setStockNum(Integer stockNum) {
		this.stockNum = stockNum;
	}

	public BigDecimal getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}

	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public BigDecimal getLowerLimit() {
		return lowerLimit;
	}

	public void setLowerLimit(BigDecimal lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public BigDecimal getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(BigDecimal upperLimit) {
		this.upperLimit = upperLimit;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getFtype() {
		return ftype;
	}

	public void setFtype(int ftype) {
		this.ftype = ftype;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Long getSalesCount() {
		return salesCount;
	}

	public void setSalesCount(Long salesCount) {
		this.salesCount = salesCount;
	}

	public int getIsGood() {
		return isGood;
	}

	public void setIsGood(int isGood) {
		this.isGood = isGood;
	}

	public int getIsHot() {
		return isHot;
	}

	public void setIsHot(int isHot) {
		this.isHot = isHot;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getVisitCount() {
		return visitCount;
	}

	public void setVisitCount(Integer visitCount) {
		this.visitCount = visitCount;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public Integer getActivityType() {
		return activityType;
	}

	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}

	public List<FeatureDTO> getSpecList() {
		return specList;
	}

	public void setSpecList(List<FeatureDTO> specList) {
		this.specList = specList;
	}

	public List<FeatureDTO> getFeatureList() {
		return featureList;
	}

	public void setFeatureList(List<FeatureDTO> featureList) {
		this.featureList = featureList;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getTagImgId() {
		return tagImgId;
	}

	public void setTagImgId(String tagImgId) {
		this.tagImgId = tagImgId;
	}

	public BigDecimal getRegionPrice() {
		return regionPrice;
	}

	public void setRegionPrice(BigDecimal regionPrice) {
		this.regionPrice = regionPrice;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getPopStoreNum() {
		return popStoreNum;
	}

	public void setPopStoreNum(String popStoreNum) {
		this.popStoreNum = popStoreNum;
	}
    
	
	
}
