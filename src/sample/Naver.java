package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Naver {

   private static final String CLIENT_ID = "r80vcnBCMritWH12NS2_";
   private static final String SECRET = "AT8ZXK7FNW";

   public static String getNaver(String query) {
      int start = 1;
      // 한글 인코딩
      try {
         String encodedQuery = URLEncoder.encode(query, "UTF-8");
//         String urlString = "https://openapi.naver.com/v1/search/local?query=" + encodedQuery + "&start=" + start
//               + "&display=20";
         String urlString = "https://openapi.naver.com/v1/search/blog.json?query=" + encodedQuery + "&start=" + start
        		 + "&display=20";
         URL url = new URL(urlString);
         HttpURLConnection conn = (HttpURLConnection) url.openConnection();
         conn.setRequestMethod("GET");
         conn.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
         conn.setRequestProperty("X-Naver-Client-Secret", SECRET);

         int responseCode = conn.getResponseCode();
         BufferedReader br;
         if (responseCode == 200) { // 정상 호출
            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
         } else { // 오류 발생
            br = new BufferedReader(new InputStreamReader(conn.getErrorStream(), "UTF-8"));
         }

         StringBuilder response = new StringBuilder();
         String line;
         while ((line = br.readLine()) != null) {
            response.append(line);
         }
         br.close();
         return response.toString();

      } catch (Exception e) {
         e.printStackTrace();
         return null;
      }
   }

   public static void main(String[] args) {
      String query = "특수동물병원";
      String result = getNaver(query);
      // JSON 파서 생성
      JSONParser parser = new JSONParser();
      JSONObject jsonObject;
      try {
         jsonObject = (JSONObject) parser.parse(result);
         // JSON 데이터 추출
         String lastBuildDate = (String) jsonObject.get("lastBuildDate");
         long total = (long) jsonObject.get("total");
         long start = (long) jsonObject.get("start");
         long display = (long) jsonObject.get("display");

         System.out.println("=== 네이버 검색 결과 ===");
         System.out.println("마지막 업데이트: " + lastBuildDate);
         System.out.println("총 개수: " + total);
         System.out.println("시작 인덱스: " + start);
         System.out.println("표시 개수: " + display);
         System.out.println("-------------------------");

         // "items" 배열 추출
         JSONArray itemsArray = (JSONArray) jsonObject.get("items");

         for (Object obj : itemsArray) {
            JSONObject item = (JSONObject) obj;

            String title = (String) item.get("title");
            String link = (String) item.get("link");
            String description = (String) item.get("description");
            String bloggername = (String) item.get("bloggername");
            String bloggerlink = (String) item.get("bloggerlink");
            String postdate = (String) item.get("postdate");
            String mapy = (String) item.get("mapy");

            System.out.println("가게 이름: " + title);
            System.out.println("설명: " + description);
            System.out.println("블로그 이름: " + bloggername);
            System.out.println("블로그 주소: " + bloggerlink);
            System.out.println("등록날짜: " + postdate);
//            System.out.println("지도 좌표: (" + mapx + ", " + mapy + ")");
            System.out.println("링크: " + link);
            System.out.println("-------------------------");
         }
//         for (Object obj : itemsArray) {
//             JSONObject item = (JSONObject) obj;
//
//             String title = (String) item.get("title");
//             String link = (String) item.get("link");
//             String category = (String) item.get("category");
//             String address = (String) item.get("address");
//             String roadAddress = (String) item.get("roadAddress");
//             String mapx = (String) item.get("mapx");
//             String mapy = (String) item.get("mapy");
//
//             System.out.println("가게 이름: " + title);
//             System.out.println("카테고리: " + category);
//             System.out.println("주소: " + address);
//             System.out.println("도로명 주소: " + roadAddress);
//             System.out.println("지도 좌표: (" + mapx + ", " + mapy + ")");
//             System.out.println("링크: " + link);
//             System.out.println("-------------------------");
//          }
      } catch (ParseException e) {
         e.printStackTrace();
      }

   }

}
