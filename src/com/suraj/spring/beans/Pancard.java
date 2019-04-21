package com.suraj.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pancard {

	@Value("#{employee.employeeName}")
	private String panHolderName;
	@Value("DHX1749P")
	private String panNum;
	
	public String getPanHolderName() {
		return panHolderName;
	}
	
	public void setPanHolderName(String panHolderName) {
		this.panHolderName = panHolderName;
	}
	
	public String getPanNum() {
		return panNum;
	}
	
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
}
