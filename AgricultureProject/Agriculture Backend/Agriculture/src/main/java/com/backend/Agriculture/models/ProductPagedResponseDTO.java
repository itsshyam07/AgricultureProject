package com.backend.Agriculture.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class ProductPagedResponseDTO {
	
	private List<ProductResponseDto> plist;
	
	private int current;
	
	private long total;
	
	private int pagesize;
	
	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public void setPlist(List<ProductResponseDto> plist) {
		this.plist = plist;
	}

	public List<ProductResponseDto> getPlist() {
		return plist;
	}
}
