package service;

import java.util.List;

import domain.RecordBean;

public class RecordserviceImpl implements RecordService{

	private static RecordService instance = new RecordserviceImpl();
	public static RecordService getInstance() {return instance;}
	public RecordserviceImpl() {}

	@Override
	public List<RecordBean> listRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RecordBean> findRecord(String rec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecordBean findRecordById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countRecord() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void createRecord(RecordBean rec) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRecord(RecordBean rec) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRecord(RecordBean rec) {
		// TODO Auto-generated method stub
		
	}

}
