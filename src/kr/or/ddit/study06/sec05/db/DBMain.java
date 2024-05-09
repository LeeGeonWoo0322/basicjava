package kr.or.ddit.study06.sec05.db;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBMain {
	public static void main(String[] args) {
		DBMain obj=new DBMain();
		obj.process();
	}
	
	public void process() {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		conn=DBConn.getConnection();
		try {
			stmt=conn.createStatement();
			String sql=" SELECT * FROM MEMBER ";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				String id=rs.getNString("mem_id");
				String name=rs.getNString("mem_name");
				String job=rs.getNString("mem_job");
				if(!job.equals("주부"))continue;
				String mail=rs.getNString("mem_mail");
				String like=rs.getNString("mem_like");
				System.out.println(id+"\t"+name+"\t"+job+"\t"+mail+"\t"+like);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
