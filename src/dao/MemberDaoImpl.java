package dao;

import java.util.*;
import domain.*;
import enums.Domain;
import enums.MemberQuery;
import enums.Vendor;
import factory.DatabaseFactory;
import pool.DBconstant;
import template.PstmtQuery;
import template.QuertTemplate;

import java.sql.*;

public class MemberDaoImpl implements MemberDao {
	private static MemberDao instance = new MemberDaoImpl();
	public static MemberDao getInstance() {return instance;}
	
	@Override					
	public List<MemberBean> selectAllMember() {
		List<MemberBean> lst = new ArrayList<>();
		MemberBean mem = null;
		try {
			ResultSet rs = DatabaseFactory.createDatabase(Vendor.ORACLE, DBconstant.USERNAME, DBconstant.PASSWORD)
							.getConnection()
							.createStatement()
							.executeQuery(MemberQuery.SELECT_ALL.toString());
			while (rs.next()) {
				mem = new MemberBean(); 
				mem.setMemId(rs.getString("MEM_ID"));
				mem.setMemName(rs.getString("MEM_NAME"));
				mem.setPassword(rs.getString("PASSWORD"));
				mem.setRoll(rs.getString("ROLL"));
				mem.setSsn(rs.getString("SSN"));
				mem.setTeamId(rs.getString("TEAM_ID"));
				lst.add(mem);
			}
	    } catch (Exception e) {
			e.printStackTrace();
		}
	    if(countMember()==lst.size()) {
	    System.out.println("전제리스트 인원 호출성공");
	    }else {
	    	System.out.println("실패");
	    }
	    		return lst;
	}


	@Override
	public int countMember() {
		System.out.println("===============Count DAO===============");
		
		int count = 0;
		System.out.println("DB 가기 전 count : "+ count);
		try {
			ResultSet rs = DatabaseFactory.createDatabase(Vendor.ORACLE, DBconstant.USERNAME, DBconstant.PASSWORD)
					.getConnection()
					.createStatement()
					.executeQuery
					(MemberQuery.COUNT.toString());
			while(rs.next()) {
				count = rs.getInt("count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DB 갔다온 count : "+ count);
		System.out.println("===============Count DAO===============");
		
		return count;
	}

	@Override
	public void updateMember(MemberBean bean) {
		System.out.println("+++++++++++++[updateMember 시작]+++++++++++++");
		try {
			System.out.println("String bean : "+bean);
			System.out.println("updateMember 쿼리 : "+String.format
					(MemberQuery.UPDATE.toString()
					,bean.getPassword().split("/")[1]
					,bean.getTeamId()
					,bean.getRoll()
					,bean.getMemId()
					,bean.getPassword().split("/")[0]));
			
		DatabaseFactory.createDatabase(Vendor.ORACLE,
					DBconstant.USERNAME, DBconstant.PASSWORD)
			.getConnection()
			.createStatement()
			.executeUpdate(
			String.format(
						MemberQuery.UPDATE.toString()
					,bean.getPassword().split("/")[1]
					,bean.getTeamId()
					,bean.getRoll()
					,bean.getMemId()
					,bean.getPassword().split("/")[0]
					)
			
		);
		System.out.println("업데이트 데이터베이스");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("+++++++++++++[updateMember 끝]++++++++++++++");
	}
//	@Override
//	public void updateMember(MemberBean member) {
//		try {
//			DataBaseFactory.createDataBase(Vendor.ORACLE, 
//					DBConstant.USER_NAME, DBConstant.PASSWORD)
//			.getConnection()
//			.createStatement()
//			.executeUpdate(
//					String.format(
//							MemberQuery.UPDATE_MEMBER.toString(), 
//							member.getPass(),
//							member.getMemberId())
//					);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		// 성공 실패 여부
//	}
	

	@Override
	public MemberBean login(MemberBean bean) {
		MemberBean login = null;
		try {
			System.out.println("DAO1 : "+bean.toString());
			ResultSet rs = DatabaseFactory.createDatabase(Vendor.ORACLE, DBconstant.USERNAME, DBconstant.PASSWORD)
			.getConnection()
			.createStatement()
			.executeQuery(
					String.format(MemberQuery.LOGIN.toString()
							, bean.getMemId(),bean.getPassword())
					);
			System.out.println("DAO2 : "+MemberQuery.LOGIN.toString());
			while(rs.next()) {
				login = new MemberBean();
				login.setMemId(rs.getString("MEM_ID"));
				login.setTeamId(rs.getString("TEAM_ID"));
				login.setMemName(rs.getString("MEM_NAME"));
				login.setAge(rs.getString("AGE"));
				login.setRoll(rs.getString("ROLL"));
				login.setPassword(rs.getString("PASSWORD"));
				login.setSsn(rs.getString("SSN"));
			}
			} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DAO의로그인 : "+login);
		return login;
	}
						
	@Override
	public void insertMember(MemberBean Member) {
		try {
			System.out.println("인서트 DAO");
			DatabaseFactory.createDatabase(Vendor.ORACLE, DBconstant.USERNAME, DBconstant.PASSWORD)
			.getConnection()
			.createStatement()
			.executeQuery(String.format(MemberQuery.INSERT_MEMBER.toString(),
					Member.getMemId(), Member.getMemName(), Member.getPassword(), Member.getSsn()));
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void deleteMember(MemberBean bean) {
		try {
			System.out.println("딜리트 DAO");
			DatabaseFactory.createDatabase(Vendor.ORACLE, DBconstant.USERNAME, DBconstant.PASSWORD)
			.getConnection()
			.createStatement()
			.executeUpdate(
					String.format(MemberQuery.DELETE.toString()
							,bean.getMemId(),bean.getPassword())
					);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insertAdminMember(MemberBean Member) {
		try {
			System.out.println("인서트 DAO");
			DatabaseFactory.createDatabase(Vendor.ORACLE, DBconstant.USERNAME, DBconstant.PASSWORD)
			.getConnection()
			.createStatement()
			.executeQuery(String.format(MemberQuery.INSERT_MEMBER.toString(),
					Member.getMemId(), Member.getMemName(), Member.getPassword(), Member.getSsn()));
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public MemberBean adMinLogin(MemberBean bean) {
		MemberBean login = new MemberBean();
		try {
			ResultSet rs = DatabaseFactory.createDatabase(Vendor.ORACLE, DBconstant.USERNAME, DBconstant.PASSWORD)
			.getConnection()
			.createStatement()
			.executeQuery(
					String.format(MemberQuery.LOGIN.toString()
							, bean.getMemId(),bean.getPassword())
					);
			while(rs.next()) {
				login.setMemId(rs.getString("MEM_ID"));
				login.setMemName(rs.getString("MEM_NAME"));
				login.setPassword(rs.getString("PASSWORD"));
				login.setRoll(rs.getString("ROLL"));
				login.setSsn(rs.getString("SSN"));
				login.setTeamId(rs.getString("TEAM_ID"));
			}
			} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DAO의로그인 : "+login);
		return login;
	}
	@Override
	public List<MemberBean> findByName(String word) {
		List<MemberBean> lst1 = new ArrayList<>();
		/*ResultSet rs = DatabaseFactory.createDatabase(Vendor.ORACLE, DBconstant.USERNAME, DBconstant.PASSWORD) 
					.getConnection()
					.createStatement()
					.executeQuery(String.format(MemberQuery.SEARCH,toString(),word));*/
		return lst1;
	}
	@Override
	public List<MemberBean> findByWord(String word) {
		QuertTemplate q = new PstmtQuery();
		List<MemberBean> llst = new ArrayList<>();
		HashMap<String,Object> map = new HashMap<>();
		map.put("column", word.split("/")[0]);
		map.put("value", word.split("/")[1]);
		map.put("table",Domain.MEMBER);
		q.play(map);
		for(Object s: q.getList()) {
			llst.add((MemberBean)s);
		}
		return llst;
	}

	@Override
	public MemberBean findById(String word) {
		MemberBean mem = new MemberBean();
		try {
			System.out.println("===============파인드바이아이디 DAO 시작===============");
			System.out.println("String word : "+word);
			System.out.println("쿼리 : "+MemberQuery.FIND_BY_ID.toString());
			System.out.println("FindById 쿼리 : "+String.format(
								MemberQuery.FIND_BY_ID.toString(),
								word));
			ResultSet rs = DatabaseFactory.createDatabase(Vendor.ORACLE,DBconstant.USERNAME, DBconstant.PASSWORD)
						.getConnection()
						.createStatement()
						.executeQuery(
								String.format(
								MemberQuery.FIND_BY_ID.toString(),
								word)
								);
			while(rs.next()) {
				mem.setMemId(rs.getString("MEM_ID"));
				mem.setMemName(rs.getString("MEM_NAME"));
				mem.setPassword(rs.getString("PASSWORD"));
				mem.setRoll(rs.getString("ROLL"));
				mem.setSsn(rs.getString("SSN"));
				mem.setTeamId(rs.getString("TEAM_ID"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("===============파인드바이아이디 DAO 끝===============");
		return mem;
	}

	@Override
	public List<MemberBean> selectList(Map<?, ?> param) {
		List<MemberBean> lis = new ArrayList<>();
		MemberBean mem = null;
		String beginRow = (String) param.get("beginRow");
		String endRow = (String) param.get("endRow");
		System.out.println("시작 행  : "+ beginRow);
		System.out.println("마지막 행  : "+ endRow);
		try {
			System.out.println("셀렉트리스 DB 가기 전");
			ResultSet rs = DatabaseFactory.createDatabase(Vendor.ORACLE, DBconstant.USERNAME, DBconstant.PASSWORD)
						.getConnection().createStatement().executeQuery(String.format(
								MemberQuery.SELECT_ALL.toString(),
								param.get("beginRow"),param.get("endRow")));
			System.out.println("멤버쿼리 셀렉트올 : "+MemberQuery.SELECT_ALL.toString());
			while (rs.next()) {
				mem = new MemberBean(); 
				mem.setMemId(rs.getString("MEM_ID"));
				mem.setMemName(rs.getString("MEM_NAME"));
				mem.setPassword(rs.getString("PASSWORD"));
				mem.setRoll(rs.getString("ROLL"));
				mem.setSsn(rs.getString("SSN"));
				mem.setTeamId(rs.getString("TEAM_ID"));
				lis.add(mem);
			}
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	System.out.println("셀렉트리스트 DB 갔다 옴…");
			System.out.println("리스트 toString : "+lis.toString());
		
		return lis;
	}
	
	



	}
