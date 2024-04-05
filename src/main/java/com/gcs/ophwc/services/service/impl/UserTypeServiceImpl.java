package com.gcs.ophwc.services.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcs.ophwc.services.persistance.dao.entity.UserTypes;
import com.gcs.ophwc.services.persistance.dao.interfaces.UserTypeDao;
import com.gcs.ophwc.services.service.UserTypeService;

@Service
public class UserTypeServiceImpl implements UserTypeService {
	
	private static final Logger applicationLog = Logger.getLogger("applicationLogger");
	private static final Logger errorLog = Logger.getLogger("errorLoggger");

	@Autowired
	private UserTypeDao userTypeDao;

	@Override
	@Transactional
	public void saveUserType(UserTypes userTypes) {
		applicationLog.debug("Came Into saveUserType()");
		userTypeDao.save(userTypes);		
	}

	@Override
	public UserTypes getUserTypeById(Long id) {
		applicationLog.debug("Came Into getUserTypeById()");
		return userTypeDao.findOne(id);
	}

	@Override
	public List<UserTypes> getAllUserTypes() {
		applicationLog.debug("Came Into getAllUserTypes()");
		return userTypeDao.findAll();
	}

	@Override
	@Transactional
	public void deleteUserType(Long id) {
		applicationLog.debug("Came Into deleteUserType()");
		userTypeDao.deleteById(id);		
	}

	@Override
	@Transactional
	public void updateUserType(UserTypes userType) {
		applicationLog.debug("Came Into updateUserType()");
		userTypeDao.update(userType);		
	}

	@Override
	@Transactional
	public void deActivateUserType(Long id) {
		applicationLog.debug("Came Into deActivateUserType()");
		userTypeDao.deActivateType(id);
		
	}

	@Override
	@Transactional
	public void activateUserType(Long id) {
		applicationLog.debug("Came Into activateUserType()");
		userTypeDao.activateType(id);
		
	}
}
