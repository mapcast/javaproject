package ����������Ʈ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class NBA {

	public static void main(String[] args) {
		//createTable(); 
		
		/*createNBA("1968", "������ ��ƽ��", "LA ����Ŀ��", "���� ����Ʈ", "���� �𼿵�");
		createNBA("1969", "���� �н�", "LA ����Ŀ��", "������ ����", "������ ����");
		createNBA("1970", "�п�Ű ����", "��Ƽ��� �Ҹ���", "�� �ٽŴ�", "�� �ٽŴ�");
		createNBA("1971", "LA ����Ŀ��", "���� �н�", "��Ʈ ä�ӹ���", "ī�� �е��ڹ�");
		createNBA("1972", "���� �н�", "LA ����Ŀ��", "������ ����", "���̺� ������");
		createNBA("1973", "������ ��ƽ��", "�п�Ű ����", "�� �Ϻ�ý", "ī�� �е��ڹ�");
		createNBA("1974", "��� ������Ʈ �����", "������ �Ҹ���", "�� ����", "�� �ƾƵ�");
		createNBA("1975", "������ ��ƽ��", "�Ǵн� ����", "�� �� ȭ��Ʈ", "ī�� �е��ڹ�");
		createNBA("1976", "��Ʋ���� Ʈ���Ϻ�������", "�ʷ����Ǿ� ����Ƽ�ļ���", "�� ��ư", "ī�� �е��ڹ�");
		createNBA("1977", "������ �Ҹ���", "�þ�Ʋ ���ۼҴн�", "���� �𼿵�", "�� ��ư");
		createNBA("1978", "�þ�Ʋ ���ۼҴн�", "������ �Ҹ���", "���Ͻ� ����", "������ ����");
		createNBA("1979", "LA ����Ŀ��", "�ʷ����Ǿ� ����Ƽ�ļ���", "���� ����", "ī�� �е��ڹ�");
		createNBA("1980", "������ ��ƽ��", "�޽��� ������", "���帯 �ƽ���", "�ٸ�� ���");
		createNBA("1981", "LA ����Ŀ��", "�ʷ����Ǿ� ����Ƽ�ļ���", "���� ����", "������ ����");
		createNBA("1982", "�ʷ����Ǿ� ����Ƽ�ļ���", "LA ����Ŀ��", "������ ����", "������ ����");
		createNBA("1983", "������ ��ƽ��", "LA ����Ŀ��", "���� ����", "���� ����");
		createNBA("1984", "LA ����Ŀ��", "������ ��ƽ��", "ī�� �е��ڹ�", "���� ����");
		createNBA("1985", "������ ��ƽ��", "�޽��� ������", "���� ����", "���� ����");
		createNBA("1986", "LA ����Ŀ��", "������ ��ƽ��", "���� ����", "���� ����");
		createNBA("1987", "LA ����Ŀ��", "��Ʈ����Ʈ �ǽ�����", "���ӽ� ����", "����Ŭ ����");
		createNBA("1988", "��Ʈ����Ʈ �ǽ�����", "LA ����Ŀ��", "�� �ึ��", "���� ����");
		createNBA("1989", "��Ʈ����Ʈ �ǽ�����", "��Ʋ���� Ʈ���Ϻ�������", "������� �丶��", "���� ����");
		createNBA("1990", "��ī�� �ҽ�", "LA ����Ŀ��", "����Ŭ ����", "����Ŭ ����");
		createNBA("1991", "��ī�� �ҽ�", "��Ʋ���� Ʈ���Ϻ�������", "����Ŭ ����", "����Ŭ ����");
		createNBA("1992", "��ī�� �ҽ�", "�Ǵн� ����", "����Ŭ ����", "���� ��Ŭ��");
		createNBA("1993", "�޽��� ������", "���� �н�", "��Ŵ �ö��ֿ�", "��Ŵ �ö��ֿ�");
		createNBA("1994", "�޽��� ������", "�ö��� ����", "��Ŵ �ö��ֿ�", "���̺�� �κ�");
		createNBA("1995", "��ī�� �ҽ�", "�þ�Ʋ ���ۼҴн�", "����Ŭ ����", "����Ŭ ����");
		createNBA("1996", "��ī�� �ҽ�", "��Ÿ ����", "����Ŭ ����", "Į ����");
		createNBA("1997", "��ī�� �ҽ�", "��Ƽ ����", "����Ŭ ����", "����Ŭ ����");
		createNBA("1998", "�� ����Ͽ� ���۽�", "���� �н�", "�� ����", "Į ����");
		createNBA("1999", "LA ����Ŀ��", "�ε�ֳ� ���̼���", "��ų ����", "��ų ����");
		createNBA("2000", "LA ����Ŀ��", "�ʶ��Ǿ� ����Ƽ�ļ���", "��ų ����", "�ٷ� ���̹���");
		createNBA("2001", "LA ����Ŀ��", "������ ����", "��ų ����", "�� ����");
		createNBA("2002", "������Ͽ� ���۽�", "������ ����", "�� ����", "�� ����");
		createNBA("2003", "��Ʈ����Ʈ �ǽ�����", "LA ����Ŀ��", "õ�� ������", "�ɺ� ����");
		createNBA("2004", "������Ͽ� ���۽�", "��Ʈ����Ʈ �ǽ�����", "�� ����", "��Ƽ�� ����");
		createNBA("2005", "���ֹ̾� ��Ʈ", "��� �Ź�����", "����� ���̵�", "��Ƽ�� ����");
		createNBA("2006", "������Ͽ� ���۽�", "Ŭ������ ĳ�����", "��� ��Ŀ", "�� �����Ű");
		createNBA("2007", "������ ��ƽ��", "LA ����Ŀ��", "�� �Ǿ", "�ں� ����̾�Ʈ");
		createNBA("2008", "LA ����Ŀ��", "�ö��� ����", "�ں� ����̾�Ʈ", "����� ���ӽ�");
		createNBA("2009", "LA ����Ŀ��", "������ ��ƽ��", "�ں� ����̾�Ʈ", "����� ���ӽ�");
		createNBA("2010", "��� �Ź�����", "���ֹ̾� ��Ʈ", "�� �����Ű", "���� ����");
		createNBA("2011", "���ֹ̾� ��Ʈ", "��Ŭ��ȣ����Ƽ ���", "����� ���ӽ�", "����� ���ӽ�");
		createNBA("2012", "������ ��ƽ��", "������Ͽ� ���۽�", "����� ���ӽ�", "�ɺ� ���Ʈ");
		createNBA("2013", "������Ͽ� ���۽�", "���ֹ̾� ��Ʈ", "ī���� ���ʵ�", "�ɺ� ���Ʈ");
		createNBA("2014", "��� ������Ʈ �����", "Ŭ������ ĳ�����", "�ȵ巹 �̱Ŵ޶�", "������ Ŀ��");
		createNBA("2015", "Ŭ������ ĳ�����", "��� ������Ʈ �����", "����� ���ӽ�", "������ Ŀ��");
		createNBA("2016", "��� ������Ʈ �����", "Ŭ������ ĳ�����", "�ɺ� ���Ʈ", "���� ����Ʈ���");
		createNBA("2017", "��� ������Ʈ �����", "Ŭ������ ĳ�����", "�ɺ� ���Ʈ", "���ӽ� �ϵ�");
		createNBA("2018", "����� ���ͽ�", "��� ������Ʈ �����", "ī���� ���ʵ�", "�ߴϽ� ��������");*/
		
		//getConnection();
		
		
	}
	
	public static String[][] getNBA(){
		try {
			Connection con =  getConnection();
			PreparedStatement statement = con.prepareStatement("Select ����,�����,�ؿ����,���̳�MVP,����MVP FROM NBA");
			ResultSet results = statement.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();
			while(results.next()) {
				list.add(new String[] {
						results.getString("����"),
						results.getString("�����"),
						results.getString("�ؿ����"),
						results.getString("���̳�MVP"),
						results.getString("����MVP"),
						});
			}
			System.out.println("������ ��� �ҷ��Դ�!");
			String[][] arr = new String[list.size()][5];
			return list.toArray(arr);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	
	public static void createNBA(String ����,String �����,String �ؿ����,String ���̳�MVP,String ����MVP) {
		try {
			Connection con = getConnection(); //DB���� con��ü 
			PreparedStatement insert = con.prepareStatement(""
					+ "INSERT INTO NBA"
					+ "(����, �����, �ؿ����, ���̳�MVP, ����MVP) "
					+ "VALUES "
					+ "('"+����+"','"+�����+"','"+�ؿ����+"','"+���̳�MVP+"','"+����MVP+"')");
			
			insert.executeUpdate();
			System.out.println("�����Ͱ� �������ϴ�.");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void createTable() {
		try {
			Connection con = getConnection(); //DB���� conn��ü
			PreparedStatement create = con.prepareStatement(
				"CREATE TABLE IF NOT EXISTS " 
				+"nba(���� int NOT NULL AUTO_INCREMENT, " 
				+"����� varChar(255), " 
				+"�ؿ���� varChar(255), " 
				+"���̳�MVP varChar(255) ," 
				+"����MVP varChar(255) ," 
				+"PRIMARY KEY(����))" );
			create.execute();
			System.out.println("���̺��� ��������ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/nba?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
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
