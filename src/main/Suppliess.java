/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public class Suppliess {
	private String supId;
	private String productId;
	private String suppliedDate;
	private String itemType;
	private String itemName;
	private String quantity;
	private String discountFromSup;
	private String payment;
	
	public Suppliess(String supId,String productId,String suppliedDate,String itemType,String itemName,String quantity,String discountFromSup,String payment) {
		this.supId = supId;
		this.productId = productId;
		this.suppliedDate = suppliedDate;
		this.itemType = itemType;
		this.itemName = itemName;
		this.quantity = quantity;
		this.discountFromSup = discountFromSup;
		this.payment = payment;
	}

	public String getSupId() {
		return supId;
	}

	public void setSupId(String supId) {
		this.supId = supId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSuppliedDate() {
		return suppliedDate;
	}

	public void setSuppliedDate(String suppliedDate) {
		this.suppliedDate = suppliedDate;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDiscountFromSup() {
		return discountFromSup;
	}

	public void setDiscountFromSup(String discountFromSup) {
		this.discountFromSup = discountFromSup;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	
}
