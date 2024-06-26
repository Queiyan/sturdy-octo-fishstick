package ch13;

// p455 지역내부 클래스
public class _03_Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable {
			int localNum = 10;
			
			@Override
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum +"(외부 클래스 인스턴스 변수)");
				System.out.println("_03_Outer.sNum = " + _03_Outer.sNum + "(외부 클래스 정적 변수)");
			}
		}
		
		return new MyRunnable();
	}
}
