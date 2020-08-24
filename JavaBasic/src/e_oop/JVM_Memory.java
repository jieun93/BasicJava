package e_oop;

public class JVM_Memory {

	/*
	 * <<JVM(Java Virtual Machine)>>
	 * 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
	 * 운영체제->JVM->자바 프로그램
	 * 장점: 운영체제에 상관없이 실행할 수 있다.
	 * 단점 : 속도가 느리다.
	 * 
	 * <<JVM 메모리 구조>>
	 * Method Area:  클래스가 저장된다.
	 * Call Stack: 현재 호출되어 있는  메서드가 저장된다.
	 * Heap : 객체가 저장된다.
	 * 
	 * 
	 * 예) static 클래스 두고 보기
	 * 
	 * <<Method Area : 클래스>>
	 * 
	 * Math가 저장된다.
	 * random()가 저장된다.
	 * System
	 * out
	 * ClassMember
	 * classVar : 클래스 변수 변경
	 * classMethod()
	 * 프로그램이 종료되어야지만  데이터가 삭제된다.
	 * 
	 * 
	 * <<Call Stack : 실행중인 메서드>>
	 * main() 실행
	 * random() 실행-> 실행  후 삭제된다.
	 * println() 실행-> 실행  후 삭제된다.
	 * println() 실행-> 실행  후 삭제된다.
	 * println() 실행-> 실행  후 삭제된다.
	 * instanceMethod() 실행-> 실행  후 삭제된다.
	 * println() 실행-> 실행  후 삭제된다.
	 * classMethod() 실행-> 실행  후 삭제된다.
	 * 
	 * <<Heap : 객체>>
	 * cm1(ClasMember)
	 * instanceVar : 인스턴스 변수
	 * instanceMethod()
	 * cm2(ClasMember)
	 * instanceVar : 인스턴스 변수 변경
	 * instanceMethod()
	 * 
	 */

	}


