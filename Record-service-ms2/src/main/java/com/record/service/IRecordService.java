package com.record.service;
import java.util.List;

import com.record.entity.Record;

public interface IRecordService {
	
	public List<Record> getRecordofEmployee (Long eId);

}
