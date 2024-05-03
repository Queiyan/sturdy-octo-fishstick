package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// p529
// input.txt 파일을 직접 작성하고 저장 -> 그 파일을 읽어서 output.text(자동생성)에 출력
public class _04_FileOutputStream {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("D:\\dev03\\file\\4_inputStream.txt");	// 내가 직접 파일 작성
			// true를 주면 한번 생성된 자료에 추가되어 출력된다.
			fos = new FileOutputStream("D:\\dev03\\file\\4_outputStream.txt",true);	// 자동생성
			
			int i;
			// 4_inputStream.txt 데이터를 1byte씩 읽어들여서 아스키값으로 저장
			while((i=fis.read()) != -1) {		// -1 : 파일의 끝
				System.out.print((char)i);	// 아스키코드를 문자로 바꾸어 출력
				fos.write(i);
			}
			System.out.println();
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(68);
			fos.write(69);
			fos.write(70);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) fis.close();
			if(fos != null) fos.close();
 		}
		
		
	}
}
