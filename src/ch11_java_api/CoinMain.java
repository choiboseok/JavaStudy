package ch11_java_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CoinMain {
	public static void main(String[] args) throws IOException, ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("코인 정보 시스템입니다.");
		
		// 코인 종목코드 출력
		CoinList();
		
		while(true) {
			System.out.println("\n어떤 종목을 보여들리까요?(end:q)");
			String msg = scan.nextLine();
			if(msg.equals("q")) {
				System.out.println("종료");
				break;
			}
			
			// 해당 코인의 최저가(low), 최고가(high), 현재가(trade) 출력
			JSONObject resultObj = getCoin(msg);
			DecimalFormat format = new DecimalFormat("#,###.##");
			System.out.println("trade_price : " + format.format(resultObj.get("trade_price")) + "원");
			System.out.println("low_price : " + format.format(resultObj.get("low_price")) + "원");
			System.out.println("high_price : " + format.format(resultObj.get("high_price")) +"원");
		}
	}
	
	public static void CoinList() throws IOException, ParseException {
		String coinInfoUrl = "https://api.upbit.com/v1/market/all";
		
		URL url = new URL(coinInfoUrl);
		HttpsURLConnection conn = (HttpsURLConnection)url.openConnection(); //url 요청 하기
		//요청 방식설정
		conn.setRequestMethod("GET");
		conn.setReadTimeout(5000); // 5초까지 기다림
		int resCode = conn.getResponseCode(); // 응답에 따른 요청 코드 리턴(200정상), 실시간 요청
		if(resCode==200) {
			System.out.println(resCode);
			//실시간 스트리밍 데이터
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer(); //하나의 메모리 공간에서 재사용
			// 내용이 없을때까지
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println(response);
			// json 데이터 형태 객체화 하기
			JSONParser parser = new JSONParser(); // 문자를 객체로 parse,  .jar 파일을 이용해서 외부에서 가져옴
			JSONArray jsonArr = (JSONArray)parser.parse(response.toString()); //parser = 해당 문서 형태로 읽어들이겠다, 배열 형식으로 바꿔서 
			for(Object object: jsonArr) { // for문으로 출력
				JSONObject obj = (JSONObject)object;
				System.out.println("market:" + obj.get("market"));
				System.out.println("kor:" + obj.get("korean_name"));
			}
		}
	}
	
	public static JSONObject getCoin(String code) throws IOException, ParseException {
		String detailUrl = "https://api.upbit.com/v1/ticker?markets=" + code; //  
		URL url = new URL(detailUrl);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		int resCode = conn.getResponseCode();
		JSONObject obj = null;
		if(resCode == 200) { // 200코드 정사
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream())); // InputStreamReader - 실시간으로 데이터가 넘어오는 것
			String inputLine;
			StringBuffer res = new StringBuffer(); // 넘겨받은 데이터에 텍스트 정보가 담겨있음.
			while((inputLine = in.readLine()) != null) { // 
				res.append(inputLine);
			}
			in.close();
			JSONParser parser = new JSONParser();
			JSONArray arr = (JSONArray) parser.parse(res.toString()); // 단순 텍스트를 JSON형태로 읽어서 객체화 시키겠다.
			obj = (JSONObject) arr.get(0); // key, value 형태로 담겨져 있음
		}
		return obj;
	}
}
