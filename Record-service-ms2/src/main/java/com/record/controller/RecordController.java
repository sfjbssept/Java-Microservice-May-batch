package com.record.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.record.entity.Record;
import com.record.service.IRecordService;

@RestController
@RequestMapping("/record")
public class RecordController {
	
	@Autowired
	IRecordService iRecordService;
	
	@GetMapping("/{eId}")
	public List<Record> getRecord(@PathVariable("eId") Long eId){
		return iRecordService.getRecordofEmployee(eId);
	}
}
