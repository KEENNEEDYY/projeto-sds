package com.kennedy.dsvendas.dto;

import java.io.Serializable;

import com.kennedy.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sallernName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO() {
	}

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sallernName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSallernName() {
		return sallernName;
	}

	public void setSallernName(String sallernName) {
		this.sallernName = sallernName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
}
