package com.record.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.record.entity.Record;
@Service
public class RecordService implements IRecordService{

	
	List<Record> list=List.of(
			new Record(1L,"TCS",1201L),
			new Record(2L,"Infy",1202L),
			new Record(3L,"Wipro",1201L),
			new Record(4L,"Cognizant",1202L),
			new Record(5L,"Accenture",1203L),
			new Record(6L,"Amazon",1204L),
			new Record(7L,"Tech Mahindra",1205L),
			new Record(8L,"Microsoft",1206L),
			new Record(9L,"Google ",1207L),
			new Record(10L,"KPMG",1208L),
			new Record(11L,"PWC",1209L),
			new Record(12L,"IBM",1210L),
			new Record(13L,"Intel",1209L),
			new Record(14L,"AWS",1202L),
			new Record(15L,"LG",1203L)
			
			);

	@Override
	public List<Record> getRecordofEmployee(Long eId) {

		return list.stream().filter(record -> record.geteId().equals(eId)).collect(Collectors.toList());
	}
	
}
