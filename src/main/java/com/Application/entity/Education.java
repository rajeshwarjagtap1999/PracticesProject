package com.Application.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Education {

@Id
private int EDU_ID	;				
private int	CASE_NUM ;				
private String	HIGHEST_QUALIFICATION	;
private LocalDate	GRADUTATION_YEAR	;	
}
