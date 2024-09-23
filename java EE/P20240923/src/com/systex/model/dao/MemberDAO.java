package com.systex.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.systex.model.Member;

public class MemberDAO {

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crmdb", "root", "welcome1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public void create(Member member) {
		try (
				Connection con = this.getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into member values(?,?,?,?,?)");
				){
			pstmt.setInt(1, member.getId());
			pstmt.setString(2, member.getFirstNmae());
			pstmt.setString(3, member.getLastName());
			pstmt.setString(4, member.getStreet());
			pstmt.setString(5, member.getCity());
			int count = pstmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Member新增成功");
	}
	
	public void update(Member member) {
		try (
				Connection con = this.getConnection();
				PreparedStatement pstmt = con.prepareStatement("update member set FIRSTNAME=?, LASTNAME=?, STREET=?, CITY=? where ID=?");
				){

			pstmt.setString(1, member.getFirstNmae());
			pstmt.setString(2, member.getLastName());
			pstmt.setString(3, member.getStreet());
			pstmt.setString(4, member.getCity());
			pstmt.setInt(5, member.getId());
			int count = pstmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Member新增成功");
	}
		
	public Member get(int id) {
		Member member = null;
		ResultSet rs = null;
		try (
				Connection con = this.getConnection();
//				Statement stmt = con.createStatement();
				PreparedStatement pstmt = con.prepareStatement("select * from member where id = ?");
			)
		{
			//建立連線物件
			
			
			//執行 CRUD 資料存取邏輯
			
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
				
			//建立 SQL 包裝物
			while(rs.next()) {
				member = new Member();
				member.setId(rs.getInt("ID"));
				member.setFirstNmae(rs.getString("FIRSTNAME"));
				member.setLastName(rs.getString("LASTNAME"));
				member.setStreet(rs.getString("STREET"));
				member.setCity(rs.getString("CITY"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return member;
	}
	
	public List<Member> getAll() {
		LinkedList<Member> allMembers = new LinkedList<>();
		//建立並註冊 Driver 物件
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//建立連線物件
			con = this.getConnection();	
			stmt = con.createStatement();
			//執行 CRUD 資料存取邏輯
			rs = stmt.executeQuery("select * from member");
			//建立 SQL 包裝物
			Member member;
			while(rs.next()) {
				member = new Member();
				member.setId(rs.getInt("ID"));
				member.setFirstNmae(rs.getString("FIRSTNAME"));
				member.setLastName(rs.getString("LASTNAME"));
				member.setStreet(rs.getString("STREET"));
				member.setCity(rs.getString("CITY"));
				allMembers.add(member);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 處理回傳結果
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
			
		//關閉所有連線物件
		return allMembers;
	}
	
	public static void main(String[] args) {
		MemberDAO memberDao = new MemberDAO();
		List<Member> allMembers = memberDao.getAll();
		Member member = new Member(50, "Micheal", "Jordan", "Wall Street Blvd.", "New Yorkaaa");
//		memberDao.create(member);
		memberDao.update(member);
		
		System.out.println(memberDao.get(50));
	}
}
