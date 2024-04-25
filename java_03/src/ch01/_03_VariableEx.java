package ch01;

public class _03_VariableEx {
	public static void main(String[] arg) {
		
		System.out.println("*** 연산 ***");
		
		int num1 = 40;
		int num2 = 20;
		
		int result = num1 + num2;
		
		System.out.println("result : "+result);
		
		int subResult = num1 - num2;
		System.out.println("subResult : "+subResult);
		
		int mulResult = num1 * num2;
		System.out.println("mulResult : "+mulResult);
		
		int divResult = num1 / num2;
		System.out.println("divResult : "+divResult);
		
		int num3 = 30;
		int num4 = 20;
		double num5 = 30.0;
		
		int divResult2 = (int) (num5/num4); // (int) (30.0 / 20.0) => (명시적형변환)(묵시적형변환..큰타입으로 자동형변환)
		System.out.println("divResult2 : "+divResult2); //divResult2 : 1
		
		int divResult3 = num3 / num4; // 30 / 20 => 1.5 => 더블형 결과이나 int 변수에 대입되므로 int
		System.out.println("divResult3 : "+divResult3); //divResult3 : 1
		
		double divResult4 = num3 / num4; //int / int => int 1 => 더블형 변수에 대입되므로 1.0
		System.out.println("divResult4 : "+divResult4); // divResult4 : 1.0
		
		double divResult5 = num3 / num4;
		System.out.println("divResult5 : "+divResult5);
		
	}
}
