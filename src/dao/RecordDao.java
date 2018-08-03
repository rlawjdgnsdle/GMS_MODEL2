package dao;

import java.util.List;

import domain.RecordBean;

public interface RecordDao {
	public void createRecord();
	public void updateRecord();
	public void deleteRecord();
	public List<RecordBean> listRecord();
	public List<RecordBean> findRecord(String rec);
	public RecordBean findRecordById(String Id);
	public int countRecord();
	public void createRecord(RecordBean rec);
	public String selectFirstRowNum();
}
