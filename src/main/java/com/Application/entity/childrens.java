package com.Application.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class childrens {
	
	
	
@Id
private 	int CHILDREN_ID ;		
private int	CASE_NUM	;
private LocalDate CHILDREN_DOB;
private int	CHILDREN_SSN ;	

}
