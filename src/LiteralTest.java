
public class LiteralTest {

	public static void main(String[] args) {
		//Data : Literal 상수
		//type 변수 = data;
		int num = 1; //정수
		String name = "혁"; //문자열 최대2Gb까지 기록가능 
		double height = 185.2; //실수
		float weight = 90.1f;
		int bYear = 1984;
		int tYear = 2026;
		String address = "부산 부산진구";
		char grade = 'A';
		char grade1 = '김'; //UTF-8에 따라 6byte까지 변동 한글자기록 한글 3byte 한자 4byte
		boolean adult = true;
		boolean female = false;
		int balance = 1234567890;
		long lBalance = 12345678900L;
		int age = tYear - bYear;
		System.out.println("번호: " + num);
		System.out.println("이름: " + name);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		System.out.println("생년: " + bYear);
		System.out.println("지금연도: " + tYear);
		System.out.println("나이: " + age);
		
		int data = 65;
		System.out.printf("문자:%c 숫자:%d 16진수:%x ", data , data, data); //%c = char, %d = decimal int, %x 16진수
		System.out.println(3+2*5);
	}

}
