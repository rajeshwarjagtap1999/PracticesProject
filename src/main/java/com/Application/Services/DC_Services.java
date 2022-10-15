package com.Application.Services;

import java.util.List;

import com.Application.binding.ChildrenBinding;
import com.Application.binding.CreatecaseBinding;
import com.Application.binding.EducationBinding;
import com.Application.binding.Incomebinding;
import com.Application.entity.Education;
import com.Application.entity.Income;


public interface DC_Services {

	
	
	public boolean createcase(CreatecaseBinding ccb); //  to create case number
	public boolean incomedetails(Incomebinding income);// to insert income details
	public boolean educationdetails (EducationBinding education); // to insert education deatils
	public boolean kiddetail(ChildrenBinding childrens); // to  insert kid details
	public List<Education> getAlleducation();
	public List<Income> getAllIncome();
}
