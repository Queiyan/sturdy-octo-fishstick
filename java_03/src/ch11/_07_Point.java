package ch11;

// p367
public class _07_Point {

	// 멤버변수
	int x; // 10
	int y; // 20

	public _07_Point() {

	}

	public _07_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}
