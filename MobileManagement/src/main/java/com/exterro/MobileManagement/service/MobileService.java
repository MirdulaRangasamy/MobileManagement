package com.exterro.MobileManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exterro.MobileManagement.entity.Mobile;

@Service
public interface MobileService {
	public Mobile addMobile(Mobile mobile);
	public Mobile getMobile(String imeiNo);
	public List<Mobile> getAllMobile();
	public Mobile updateMobile(Mobile mobile);
	public String deleteMobile(String imeiNo);
}
