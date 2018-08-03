package dao;

import java.util.List;

import domain.RecordBean;

public class RecordDaoImpl implements RecordDao{
	private static RecordDao instance = new RecordDaoImpl();
	public static RecordDao getInstance() {return instance;}
	private RecordDaoImpl() {}
	@Override
	public void createRecord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRecord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRecord() {
		// TODO Auto-generated method stub
		
	}

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
	public String selectFirstRowNum() {
		// TODO Auto-generated method stub
		return null;
	}

}
