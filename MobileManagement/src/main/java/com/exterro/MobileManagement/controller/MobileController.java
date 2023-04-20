package com.exterro.MobileManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exterro.MobileManagement.entity.Mobile;
import com.exterro.MobileManagement.service.MobileService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MobileController {
	
	@Autowired
	private MobileService mobileSvc;
	
	
	@PostMapping("mobile")
	public ResponseEntity<Mobile> addMobile(@RequestBody Mobile m) {
		System.out.println(m);
		Mobile m1 = mobileSvc.addMobile(m);
		 return ResponseEntity.ok(m1);
	}
	
	@GetMapping("mobile/{imeiNo}")
	public ResponseEntity<Mobile> viewMobile(@PathVariable String imeiNo) {
		Mobile mobile =  mobileSvc.getMobile(imeiNo);
		return ResponseEntity.ok(mobile);
	}
	
	@GetMapping("mobile")
	public ResponseEntity<List<Mobile>> viewAllMobile() {
		return ResponseEntity.ok(mobileSvc.getAllMobile());
	}
	
	@PutMapping("mobile")
	public ResponseEntity<Mobile> updateMobile(@RequestBody Mobile m) {
		System.out.println(m);
		Mobile m1 = mobileSvc.updateMobile(m);
		 return ResponseEntity.ok(m1);
	}
	
	@DeleteMapping("mobile/{imeiNo}")
	public ResponseEntity<String> deleteMobile(@PathVariable String imeiNo) {
		return ResponseEntity.ok(mobileSvc.deleteMobile(imeiNo));
	}
}
