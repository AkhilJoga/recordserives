package com.records.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.records.services.RecordServicesImpl;
import com.records.entity.Record;;
@RestController
@RequestMapping("/records")
public class RecordController {

	@Autowired
	RecordServicesImpl recordServicesImpl;
	
	@GetMapping("/emp/{eid}")
	public List<Record> getRecords(@PathVariable("eid") Long eid){
		
		return recordServicesImpl.getRecords(eid);
	}
	
}
