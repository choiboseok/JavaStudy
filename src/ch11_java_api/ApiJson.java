package ch11_java_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiJson {

	//upbit rest api 코인 종목 리스트, get방식, json 데이터 형태
		
	public static void main(String[] args) throws Exception {
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
			StringBuffer response = new StringBuffer();
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
}