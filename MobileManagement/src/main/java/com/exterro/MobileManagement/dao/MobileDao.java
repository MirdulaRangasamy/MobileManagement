package com.exterro.MobileManagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exterro.MobileManagement.entity.Mobile;
@Repository
public interface MobileDao extends JpaRepository<Mobile,String> {
	List<Mobile> findByModel(String model);
}
