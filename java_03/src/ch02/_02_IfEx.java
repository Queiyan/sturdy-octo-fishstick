package ch02;

public class _02_IfEx {
	public static void main(String[] arg) {
		/*
        [if - else if - else문]
        
        if(조건식1) {   // 조건식1이 참인 경우 수행문1을 실행
           수행문1;
        }
        else if(조건식2) {  // 조건식2이 참인 경우 수행문2을 실행
           수행문2;
        }   
        else if(조건식3) {  // 조건식3이 참인 경우 수행문3을 실행
           수행문3;
        }   
        else {         // 위의 조건이 모두 해당되지 않는 경우 수행문4를 실행
           수행문4;
        }
        
        수행문5;   // 무조건 실행
       */
		
		// num이 양수/음수/0 인지 판단 
	    // int num = -5;  => 결과 : -5는 음수
	    // int num = 0;   => 결과 : 0는 0
	    // int num = 3;   => 결과 : 3는 양수
		
		int num = 3;
		String result =" ";
		
		System.out.println("-------------------");
		
		if(num > 0) {
			System.out.println(num+"은 양수이다");
		}
		else if(num == 0) {
			System.out.println(num+"은 0이다");
		}
		else if(num < 0) {
			System.out.println(num+"은 음수이다");	
		}
		
		;
		System.out.println("------");
		if(num > 0) {
			result = "양수";
		}
		else if(num == 0) {
			result = "0";
		}
		else if(num < 0) {
			result = "음수";
		}
		
		System.out.println("결과: "+num+ "은(는) "+result+" 이다.");
		
		
	}
}
