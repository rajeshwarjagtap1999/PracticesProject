package com.Application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CreateDCcase {
	
	@Id
	private int CASE_ID ;
	private int CASE_NUM;		
	private int APP_ID	;	
	private int PLAN_ID	;	

}
