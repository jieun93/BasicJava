package f_oop2;

public class AccessModifier {
	 public String publicVar = "public : ���������� ����";
	 protected String protectedVar = "protected : ���� ��Ű�� + ��ӹ��� Ŭ�������� ���ٰ���";
	 String defaultVar = "default : ���� ��Ű������ ���� ����";
	 private String privateVar = " private :Ŭ�������ٰ���";
	 
	 public void publicMethod(){
		 System.out.println(publicVar);
		 
	 }
	 protected void protectedMethod(){
		 System.out.println(protectedVar);
		 
	 }
	 void defaultMethod(){
		 System.out.println(defaultVar);
		 
	 }
	 private void privateMethod(){
		 System.out.println(privateVar);
		 
	 }
			 
}
