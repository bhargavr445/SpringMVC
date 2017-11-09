package com.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.StudentTrainingDao;
import com.project.entites.StudentTraining;
import com.project.service.StudentTrainingS;


@Service
public class StudentTrainingImpl implements StudentTrainingS {

	
	@Autowired
	StudentTrainingDao studentTrainingDao;
	
	
	public List<StudentTraining> getAllStudents() {
		List<StudentTraining> stuList = studentTrainingDao.getAllStudents();
		return stuList;
		
	}

}