package ����������Ʈ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Player {
	public static void createPlayer(int num, String name, int age, String pos, double avg) {
		try {
			Connection conn=getConnection();
			PreparedStatement insert=conn.prepareStatement(
					"INSERT INTO player(num, name, age, pos, avg)"+"VALUES('"+num+"','"+name+"','"+age+"','"+pos+"','"+avg+"')");
			insert.execute();
			System.out.println("�����߽��ϴ�");
		}catch(Exception e) {
			
		}
	}
	public static void deletePlayer(int num) {
		try {
			Connection conn=getConnection();
			PreparedStatement delete=conn.prepareStatement(
					"DELETE FROM player WHERE num="+num);
			delete.execute();
			System.out.println("�����߽��ϴ�.");
		}catch(Exception e) {
			
		}
	}
	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String pass = "1234";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,user,pass);
			System.out.println("DB ���� �Ϸ�!");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
