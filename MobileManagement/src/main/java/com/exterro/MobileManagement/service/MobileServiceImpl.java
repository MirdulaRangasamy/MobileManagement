package com.exterro.MobileManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exterro.MobileManagement.dao.MobileDao;
import com.exterro.MobileManagement.entity.Mobile;
@Service
public class MobileServiceImpl implements MobileService{
	
	@Autowired
	private MobileDao mobileDao;
	
	@Override
	public Mobile addMobile(Mobile mobile) {
		return mobileDao.save(mobile);
	}

	@Override
	public Mobile getMobile(String imeiNo) {
		return mobileDao.findById(imeiNo).orElse(new Mobile());
	}

	@Override
	public List<Mobile> getAllMobile() {
		return mobileDao.findAll();
	}

	@Override
	public Mobile updateMobile(Mobile mobile) {
		Mobile mobile1 = mobileDao.findById(mobile.getImeiNo()).orElse(null);
		if(mobile1 != null) {
			mobileDao.delete(mobile1);
		}
		return mobileDao.save(mobile);
	}

	@Override
	public String deleteMobile(String imeiNo) {
		Mobile mobile1 = mobileDao.findById(imeiNo).orElse(null);
		if(mobile1 != null) {
			mobileDao.delete(mobile1);
			return "Mobile Deleted Successfully";
		}
		return "Mobile Unavailable";
	}

}
