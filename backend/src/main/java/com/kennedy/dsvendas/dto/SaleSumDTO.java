package com.kennedy.dsvendas.dto;

import java.io.Serializable;

import com.kennedy.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sallernName;
	private Double sum;
	
	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.sallernName = seller.getName();
		this.sum = sum;
	}

	public String getSallernName() {
		return sallernName;
	}

	public void setSallernName(String sallernName) {
		this.sallernName = sallernName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
}
