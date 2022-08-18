package com.records.services;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.records.entity.Record;

@Service
public class RecordServicesImpl implements RecordServices{

	
	private List<Record> recordList = List.of(
			new Record(1L,"tat@gmail.com","Arun",900L),
			
			new Record(2L,"info@gmail.com","sundar",800L),
			
			new Record(3L,"exc@gmail.com","Riven",1100L),
			
			new Record(4L,"lad@gmail.com","Jager",200L),
			
			new Record(5L,"iopl@gmail.com","Mark",600L),
			
			new Record(6L,"get@gmail.com","gat",908L)
	
			);
	
	@Override
	public List<Record> getRecords(Long eid) {
		// TODO Auto-generated method stub
		return recordList.stream().filter(record -> record.getEid().equals(eid)).collect(Collectors.toList());
	}

	
}
