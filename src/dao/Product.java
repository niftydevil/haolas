package dao;

import sun.util.calendar.BaseCalendar.Date;

//商品类
public class Product {
	private int productId;	//产品ID
	private String productName;	//产品名称
	private String materialShortName;	//原材料简称
	private String mnemonicCode;	//助记码
	private int productAttributeId;	//	产品属性ID
	private int productCategoryId;	//产品类别ID
	private int scaleId;	//计量单位ID
	private float weight;	//重量
	private String specification;	//规格
	private float referenceCostPrice;	//参考成本价
	private float offlineSaleUnivalence;	//线下零售价
	private float offlineFirstDgreeUnivalence;	//线下一级批发价
	private float offlineSecondDgreeUnivalence;	//线下二级批发价
	private float offlineThirdDgreeUnivalence;	//线下三级批发价
	private float offlineFourthDgreeUnivalence;	//线下四级批发价
	private float offlineFifthDgreeUnivalence;	//线下五级批发价
	private float offlineSixthDgreeUnivalence;	//线下六级批发价
	private float offlineSeventhDgreeUnivalence;  //线下七级批发价
	private float offlineEighthDgreeUnivalence;	//线下八级批发价
	private float carriage;	//运费
	private float onlineSalesUnivalence;	//线上零售价
	private String nutritionInformation;	//产品营养成分表
	private String picture1;	//图片一
	private String picture2;	//图片二
	private String picture3;	//图片三
	private String picture4;	//图片四
	private String picture5;	//图片五
	private String status;	//状态，N正常，S停用
	private String remark;	//备注
	private Date createDate;	//创建日期
	int createdId;	//创建人
	private Date updateDate;	//修改日期
	int updateId;	//修改人
	private String isDeleted;	//是否删除，默认否

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getMaterialShortName() {
		return materialShortName;
	}

	public void setMaterialShortName(String materialShortName) {
		this.materialShortName = materialShortName;
	}

	public String getMnemonicCode() {
		return mnemonicCode;
	}

	public void setMnemonicCode(String mnemonicCode) {
		this.mnemonicCode = mnemonicCode;
	}

	public int getProductAttributeId() {
		return productAttributeId;
	}

	public void setProductAttributeId(int productAttributeId) {
		this.productAttributeId = productAttributeId;
	}

	public int getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public int getScaleId() {
		return scaleId;
	}

	public void setScaleId(int scaleId) {
		this.scaleId = scaleId;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public float getReferenceCostPrice() {
		return referenceCostPrice;
	}

	public void setReferenceCostPrice(float referenceCostPrice) {
		this.referenceCostPrice = referenceCostPrice;
	}

	public float getOfflineSaleUnivalence() {
		return offlineSaleUnivalence;
	}

	public void setOfflineSaleUnivalence(float offlineSaleUnivalence) {
		this.offlineSaleUnivalence = offlineSaleUnivalence;
	}

	public float getOfflineFirstDgreeUnivalence() {
		return offlineFirstDgreeUnivalence;
	}

	public void setOfflineFirstDgreeUnivalence(float offlineFirstDgreeUnivalence) {
		this.offlineFirstDgreeUnivalence = offlineFirstDgreeUnivalence;
	}

	public float getOfflineSecondDgreeUnivalence() {
		return offlineSecondDgreeUnivalence;
	}

	public void setOfflineSecondDgreeUnivalence(
			float offlineSecondDgreeUnivalence) {
		this.offlineSecondDgreeUnivalence = offlineSecondDgreeUnivalence;
	}

	public float getOfflineThirdDgreeUnivalence() {
		return offlineThirdDgreeUnivalence;
	}

	public void setOfflineThirdDgreeUnivalence(float offlineThirdDgreeUnivalence) {
		this.offlineThirdDgreeUnivalence = offlineThirdDgreeUnivalence;
	}

	public float getOfflineFourthDgreeUnivalence() {
		return offlineFourthDgreeUnivalence;
	}

	public void setOfflineFourthDgreeUnivalence(
			float offlineFourthDgreeUnivalence) {
		this.offlineFourthDgreeUnivalence = offlineFourthDgreeUnivalence;
	}

	public float getOfflineFifthDgreeUnivalence() {
		return offlineFifthDgreeUnivalence;
	}

	public void setOfflineFifthDgreeUnivalence(float offlineFifthDgreeUnivalence) {
		this.offlineFifthDgreeUnivalence = offlineFifthDgreeUnivalence;
	}

	public float getOfflineSixthDgreeUnivalence() {
		return offlineSixthDgreeUnivalence;
	}

	public void setOfflineSixthDgreeUnivalence(float offlineSixthDgreeUnivalence) {
		this.offlineSixthDgreeUnivalence = offlineSixthDgreeUnivalence;
	}

	public float getOfflineSeventhDgreeUnivalence() {
		return offlineSeventhDgreeUnivalence;
	}

	public void setOfflineSeventhDgreeUnivalence(
			float offlineSeventhDgreeUnivalence) {
		this.offlineSeventhDgreeUnivalence = offlineSeventhDgreeUnivalence;
	}

	public float getOfflineEighthDgreeUnivalence() {
		return offlineEighthDgreeUnivalence;
	}

	public void setOfflineEighthDgreeUnivalence(
			float offlineEighthDgreeUnivalence) {
		this.offlineEighthDgreeUnivalence = offlineEighthDgreeUnivalence;
	}

	public float getCarriage() {
		return carriage;
	}

	public void setCarriage(float carriage) {
		this.carriage = carriage;
	}

	public float getOnlineSalesUnivalence() {
		return onlineSalesUnivalence;
	}

	public void setOnlineSalesUnivalence(float onlineSalesUnivalence) {
		this.onlineSalesUnivalence = onlineSalesUnivalence;
	}

	public String getNutritionInformation() {
		return nutritionInformation;
	}

	public void setNutritionInformation(String nutritionInformation) {
		this.nutritionInformation = nutritionInformation;
	}

	public String getPicture1() {
		return picture1;
	}

	public void setPicture1(String picture1) {
		this.picture1 = picture1;
	}

	public String getPicture2() {
		return picture2;
	}

	public void setPicture2(String picture2) {
		this.picture2 = picture2;
	}

	public String getPicture3() {
		return picture3;
	}

	public void setPicture3(String picture3) {
		this.picture3 = picture3;
	}

	public String getPicture4() {
		return picture4;
	}

	public void setPicture4(String picture4) {
		this.picture4 = picture4;
	}

	public String getPicture5() {
		return picture5;
	}

	public void setPicture5(String picture5) {
		this.picture5 = picture5;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getCreatedId() {
		return createdId;
	}

	public void setCreatedId(int createdId) {
		this.createdId = createdId;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getUpdateId() {
		return updateId;
	}

	public void setUpdateId(int updateId) {
		this.updateId = updateId;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

}
