package ch07_array;

public class ArrayEx2 {
	public static void main(String[] args) {
		String FindWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		
		int cnt=0;
		
		for(int i=0; i<FindWally.length(); i+=2)
		{
			if(FindWally.substring(i, i+2).equals("월리")) cnt+=1;
		}
		
		System.out.println("월리는 총:" + cnt);
	}
}
