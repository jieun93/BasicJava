package z_exam;

public class Exam09 {

	public static void main(String[] args) {
		String s = new String("Hello");
		System.out.println(s);
		
		char[] c = {'H','e','l','l','o'};
		String s1 = new String(c);
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Hello");
		String s2 = new String(sb);
		System.out.println(s2);
		
		String s3 = "Hello";
		String n = "0123456";
		char c1 = s3.charAt(1);
		char c2 = n.charAt(1);
		
		
		int i= "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		
		String s4 = "Hello";
		String s5 = s4.concat("World");
		
		String s6 = "abcdefg";
		boolean b = s6.contains("bc");
		
		String file = "Hello.txt";
		boolean b1 =file.endsWith("txt");
		
		String s7 = "Hello";
		boolean b2 = s7.equals("Hello");
		boolean b3 = s7.equals("Hello");
		
		String s8 = "Hello";
		boolean b4 = s8.equalsIgnoreCase("Hello");
		boolean b5 = s8.equalsIgnoreCase("Hello");
		
		String s9 = "Hello";
		int idx1 = s9.indexOf('o');
		int idx2 = s9.indexOf('k');
		
		String s10 = "Hello";
		int idx3 = s.indexOf('e',0);
		int idx4 = s.indexOf('e',2);
		
		String s11 = "ABCDEFG";
		int idx = s.indexOf("CD");
		
		String s12 = new String("abc");
		String s13 = new String("abc");
		boolean b6 = (s12==s13);
		boolean b7 = s12.equals(s13);
		boolean b8 = (s.intern()==s13.intern());
		
		
		String s14 = "java.lang.Object";
		int idx5 = s14.lastIndexOf('.');
		int idx6 = s14.indexOf('.');
		
		String s15 = "java.lang.java";
		int idx7 = s15.lastIndexOf("java");
		int idx8 = s15.indexOf("java");
		
		String s16 ="Hello";
		int length = s16.length();
		
		String s17 = "Hello";
		String s18 = s17.replace('H','C');
		
		String s19 = "Hellolo";
		String s20 = s19.replace("11", "LL");
		
		String ab = "AABBAABB";
		String r = ab.replaceAll("BB","bb");
		
		String ab1 = "AABBAABB";
		String r1 = ab1.replaceAll("BB","bb");
		
		
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		

		String animals1 = "dog,cat,bear";
		String[] arr1 = animals.split(",",2);
		
		String s21 = "java.langObject";
		boolean b9 = s21.startsWith("java");
		boolean b10 = s21.startsWith("lang");
		
		String s22 = "java.langObject";
		String s23 = "java.langObject";
		String s24 = "java.langObject";
		
		String s25 = "Hello";
		String s26 =s25.toLowerCase();
		
		String s27 = "Hello";
		String s28 = s27.toString();
		
		String s29 = "Hello";
		String s30 = s29.toUpperCase();
		
		String s31= "  Hello World  ";
		String s32 = s31.trim();
		
		String b11 = String.valueOf(true);
		String c3 = String.valueOf('a');
		String i1 = String.valueOf(100);		
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.0);
		java.util.Date dd= new java.util.Date();
		String date = String.valueOf(dd);
		
}

}
