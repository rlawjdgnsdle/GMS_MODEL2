package service;

import java.util.List;


import domain.RecordBean;

public interface RecordService {
	public void createRecord(RecordBean rec);
	public void updateRecord(RecordBean rec);
	public void deleteRecord(RecordBean rec);
	public List<RecordBean> listRecord();
	public List<RecordBean> findRecord(String rec);
	public RecordBean findRecordById(String Id);
	public int countRecord();
}
