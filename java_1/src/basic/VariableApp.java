package basic;

// 리터럴(Literal) : 프로그램에서 사용하기 위해 표현되는 값(Value)
// 변수(Variable) : 리터럴을 저장하기 위해 메모리(Memory)에 부여된 이름

// 변수 선언 - 메모리에 변수 생성
// 형식 : 자료형 변수명;
// => 자료형(DataType) : 변수에 저장될 리터럴의 형태 - 원시형(PrimitiveType) 또는 참조형 (ReferenceType)
// => 변수명 : 리터럴을 저장해 메모리를 구분하기 위해 사용되는 식별자

// 식별자 작성 규칙
// => 영문자, 숫자, 특수문자(_ 또는 $)를 조합하여 작성 - Java에서는 한글을 식별자로 사용 가능
// => 숫자로 시작되도록 작성 불가능
// => 영문자는 대소문자를 구분하여 작성
// => 기존에 사용되는 단어(키워드 또는 식별자)로 식별자 선언 불가능

// Java에서 사용되는 식별자 작성 방법 - 표기법 : 영문자의 소문자를 기본으로 식별자 작성
// => 파스칼 표기법(PascalCase): 조합된 단어의 첫문자를 대문자로 표현하여 작성 - 클래스명, 인터페이스명 등
// => 카멜 표기먼(CamelCase) : 첫번째 단어를 제외한 나머지 단어의 첫문자를 대문자로 표현하여 작성 - 변수명, 메소드명
// => 스네이크 표기법(SnakeCase): 조합된 단어를 _로 구분하여 작성 - 상수(Constant : 상수명은 무조건 대문자로 작성)

public class VariableApp {

	public static void main(String[] args) {
		int su; // 정수값을 저장하기 위한 변수 선언(생성)
		// 값을 저장하기 위한 변수는 대입연산자 왼쪽에 반드시 작성
		su = 100; // 대입연산자(=)를 이용하여 값을 변수에 저장
		System.out.print("초기값 = ");
		System.out.println(su);
		
		
		

	}

}