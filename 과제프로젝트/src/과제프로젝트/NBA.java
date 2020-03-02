package 과제프로젝트;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class NBA {

	public static void main(String[] args) {
		//createTable(); 
		
		/*createNBA("1968", "보스턴 셀틱스", "LA 레이커스", "제리 웨스트", "웨스 언셀드");
		createNBA("1969", "뉴욕 닉스", "LA 레이커스", "윌리스 리드", "윌리스 리드");
		createNBA("1970", "밀워키 벅스", "볼티모어 불리츠", "루 앨신더", "루 앨신더");
		createNBA("1971", "LA 레이커스", "뉴욕 닉스", "윌트 채임벌린", "카림 압둘자바");
		createNBA("1972", "뉴욕 닉스", "LA 레이커스", "윌리스 리드", "데이브 코웬스");
		createNBA("1973", "보스턴 셀틱스", "밀워키 벅스", "존 하블리첵", "카림 압둘자바");
		createNBA("1974", "골든 스테이트 워리어스", "워싱턴 불리츠", "릭 베리", "밥 맥아두");
		createNBA("1975", "보스턴 셀틱스", "피닉스 선즈", "조 조 화이트", "카림 압둘자바");
		createNBA("1976", "포틀랜드 트레일블레이저스", "필레델피아 세븐티식서스", "빌 월튼", "카림 압둘자바");
		createNBA("1977", "워싱턴 불리츠", "시애틀 슈퍼소닉스", "웨스 언셀드", "빌 월튼");
		createNBA("1978", "시애틀 슈퍼소닉스", "워싱턴 불리츠", "데니스 존슨", "모제스 말론");
		createNBA("1979", "LA 레이커스", "필레델피아 세븐티식서스", "매직 존슨", "카림 압둘자바");
		createNBA("1980", "보스턴 셀틱스", "휴스턴 로케츠", "세드릭 맥스웰", "줄리어스 어빙");
		createNBA("1981", "LA 레이커스", "필레델피아 세븐티식서스", "매직 존슨", "모제스 말론");
		createNBA("1982", "필레델피아 세븐티식서스", "LA 레이커스", "모제스 말론", "모제스 말론");
		createNBA("1983", "보스턴 셀틱스", "LA 레이커스", "래리 버드", "래리 버드");
		createNBA("1984", "LA 레이커스", "보스턴 셀틱스", "카림 압둘자바", "래리 버드");
		createNBA("1985", "보스턴 셀틱스", "휴스턴 로케츠", "래리 버드", "래리 버드");
		createNBA("1986", "LA 레이커스", "보스턴 셀틱스", "매직 존슨", "매직 존슨");
		createNBA("1987", "LA 레이커스", "디트로이트 피스톤즈", "제임스 워디", "마이클 조던");
		createNBA("1988", "디트로이트 피스톤즈", "LA 레이커스", "조 듀마스", "매직 존슨");
		createNBA("1989", "디트로이트 피스톤즈", "포틀랜드 트레일블레이저스", "아이재아 토마스", "매직 존슨");
		createNBA("1990", "시카고 불스", "LA 레이커스", "마이클 조던", "마이클 조던");
		createNBA("1991", "시카고 불스", "포틀랜드 트레일블레이저스", "마이클 조던", "마이클 조던");
		createNBA("1992", "시카고 불스", "피닉스 선즈", "마이클 조던", "찰스 바클리");
		createNBA("1993", "휴스턴 로케츠", "뉴욕 닉스", "하킴 올라주원", "하킴 올라주원");
		createNBA("1994", "휴스턴 로케츠", "올란도 매직", "하킴 올라주원", "데이비드 로빈슨");
		createNBA("1995", "시카고 불스", "시애틀 슈퍼소닉스", "마이클 조던", "마이클 조던");
		createNBA("1996", "시카고 불스", "유타 재즈", "마이클 조던", "칼 말론");
		createNBA("1997", "시카고 불스", "유티 재즈", "마이클 조던", "마이클 조던");
		createNBA("1998", "샌 안토니오 스퍼스", "뉴욕 닉스", "팀 던컨", "칼 말론");
		createNBA("1999", "LA 레이커스", "인디애나 페이서스", "샤킬 오닐", "샤킬 오닐");
		createNBA("2000", "LA 레이커스", "필라델피아 세븐티식서스", "샤킬 오닐", "앨런 아이버슨");
		createNBA("2001", "LA 레이커스", "뉴저지 네츠", "샤킬 오닐", "팀 던컨");
		createNBA("2002", "샌안토니오 스퍼스", "뉴저지 네츠", "팀 던컨", "팀 던컨");
		createNBA("2003", "디트로이트 피스톤즈", "LA 레이커스", "천시 빌럽스", "케빈 가넷");
		createNBA("2004", "샌안토니오 스퍼스", "디트로이트 피스톤즈", "팀 던컨", "스티브 내쉬");
		createNBA("2005", "마이애미 히트", "댈러스 매버릭스", "드웨인 웨이드", "스티브 내쉬");
		createNBA("2006", "샌안토니오 스퍼스", "클리블랜드 캐벌리어스", "토니 파커", "덕 노비츠키");
		createNBA("2007", "보스턴 셀틱스", "LA 레이커스", "폴 피어스", "코비 브라이언트");
		createNBA("2008", "LA 레이커스", "올란도 매직", "코비 브라이언트", "르브론 제임스");
		createNBA("2009", "LA 레이커스", "보스턴 샐틱스", "코비 브라이언트", "르브론 제임스");
		createNBA("2010", "댈러스 매버릭스", "마이애미 히트", "덕 노비츠키", "데릭 로즈");
		createNBA("2011", "마이애미 히트", "오클라호마시티 썬더", "르브론 제임스", "르브론 제임스");
		createNBA("2012", "보스턴 셀틱스", "샌안토니오 스퍼스", "르브론 제임스", "케빈 듀란트");
		createNBA("2013", "샌안토니오 스퍼스", "마이애미 히트", "카와이 레너드", "케빈 듀란트");
		createNBA("2014", "골든 스테이트 워리어스", "클리블랜드 캐벌리어스", "안드레 이궈달라", "스테판 커리");
		createNBA("2015", "클리블랜드 캐벌리어스", "골든 스테이트 워리어스", "르브론 제임스", "스테판 커리");
		createNBA("2016", "골든 스테이트 워리어스", "클리블랜드 캐벌리어스", "케빈 듀란트", "러셀 웨스트브룩");
		createNBA("2017", "골든 스테이트 워리어스", "클리블랜드 캐벌리어스", "케빈 듀란트", "제임스 하든");
		createNBA("2018", "토론토 랩터스", "골든 스테이트 워리어스", "카와이 레너드", "야니스 아테토쿰보");*/
		
		//getConnection();
		
		
	}
	
	public static String[][] getNBA(){
		try {
			Connection con =  getConnection();
			PreparedStatement statement = con.prepareStatement("Select 시즌,우승팀,준우승팀,파이널MVP,시즌MVP FROM NBA");
			ResultSet results = statement.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();
			while(results.next()) {
				list.add(new String[] {
						results.getString("시즌"),
						results.getString("우승팀"),
						results.getString("준우승팀"),
						results.getString("파이널MVP"),
						results.getString("시즌MVP"),
						});
			}
			System.out.println("데이터 모두 불러왔다!");
			String[][] arr = new String[list.size()][5];
			return list.toArray(arr);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	
	public static void createNBA(String 시즌,String 우승팀,String 준우승팀,String 파이널MVP,String 시즌MVP) {
		try {
			Connection con = getConnection(); //DB연결 con객체 
			PreparedStatement insert = con.prepareStatement(""
					+ "INSERT INTO NBA"
					+ "(시즌, 우승팀, 준우승팀, 파이널MVP, 시즌MVP) "
					+ "VALUES "
					+ "('"+시즌+"','"+우승팀+"','"+준우승팀+"','"+파이널MVP+"','"+시즌MVP+"')");
			
			insert.executeUpdate();
			System.out.println("데이터가 저장됬습니다.");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void createTable() {
		try {
			Connection con = getConnection(); //DB연결 conn객체
			PreparedStatement create = con.prepareStatement(
				"CREATE TABLE IF NOT EXISTS " 
				+"nba(시즌 int NOT NULL AUTO_INCREMENT, " 
				+"우승팀 varChar(255), " 
				+"준우승팀 varChar(255), " 
				+"파이널MVP varChar(255) ," 
				+"시즌MVP varChar(255) ," 
				+"PRIMARY KEY(시즌))" );
			create.execute();
			System.out.println("테이블을 만들었습니다.");
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
			System.out.println("DB 연결 완료!");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
