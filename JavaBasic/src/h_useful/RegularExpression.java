package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		/*회원가입시 아이디/핸드폰/이메일에 사용된다.
		 * 
		 *정규표현식 : 문자열의 패턴을 검사하는 표현식(아이디,패스워드에 사용할떄)
		 *
		 * ^ 뒷문자로 시작
		 * $ 앞 문자로 종료
		 * . 임의의 문자(줄바꿈 제외)
		 * * 앞 문자가 0개 이상
		 * + 앞 문자가 1개 이상
		 * ? 앞 문자가 없거나 1개
		 * [] 문자의 집합이나 범위([a-z] :a 부터 z까지, [^a-z] : a부터 z가 아닌것)
		 * {} 앞 문자의 개수 ({2} :2개, {2,4}: 2개이상4개이하)
		 * () 그룹화(1개의 문자처럼 인식)
		 * | or연산
		 * \s 공백, 탭, 줄바꿈
		 * \S 공백, 탭, 줄바꿈이 아닌 문자
		 * \w 알파벳이나 숫자
		 * \W 알파베이나 숫자가 아닌 문자
		 * \d 숫자
		 * \D 숫자가 아닌 문자
		 * (?i) 뒷 문자의 대소문자 구분 안함
		 * \ 정규표현식에서 사용되는 특수문자 표현
		 *  
		 */
		
		
		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";//a부터z까지 0부터 9까지 1개이상 올것이다.
//		String regex = "\\w*";
//		String regex = ".*";
		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
		
//		System.out.println(m.matches());
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세여.
		

		String myEmail ="xovud926@naver.com";
				
		String id =  "(?i)[a-z]{5}[0-9]{1,5}";
		//아이디 : [a-z0-9_-]{5,20} "_""-" 두개 특수문자만 사용가능하다.
		String ph = "[0-9]{0,9}";//^0\\d{1,3}-\\d{3,4}-\\d{4} 
		//  \:이스케이프 문자로 사용,  \를 2개를 넣어야 1개로 표현하는 것이다.
		String email = "[a-z]{9}[0-9]{1,9}@[a-z]{7}\\.com";
		//email : [a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?I)(com|net|org|([a-z]{2}\\.kr))$
		Pattern p = Pattern.compile(email);
		Matcher m = p.matcher(myEmail);
		
		System.out.println(m.matches());
	
	}

	
	
}














