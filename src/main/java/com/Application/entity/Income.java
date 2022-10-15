package com.Application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Income {
	
	
	@Id
	private int  INCOME_ID	;	
	private int CASE_NUM		;
	private double EMP_INCOME		;
    private double PROPERTY_INCOME	;
    private double RENTINCOME;
}
