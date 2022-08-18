package com.records.services;

import java.util.List;

import com.records.entity.Record;

public interface RecordServices {

	public List<Record> getRecords(Long eid);
}
