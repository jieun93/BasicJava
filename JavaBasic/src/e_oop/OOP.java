package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * <<OOP(Object Oriented Programming): °´Ã¼ÁöÇâ ÇÁ·Î±×·¡¹Ö>>
		 *  ÇÁ·Î±×·¡¹ÖÀ» ´Ü¼øÈ÷ ÄÚµåÀÇ ¿¬¼ÓÀ¸·Î º¸´À°ÍÀÌ ¾Æ´Ï¶ó °´Ã¼°¡ÀÇ»óÈ£ÀÛ¿ëÀ¸·Î º¸´Â°Í.
		 *  ÄÚµåÀÌ Àç»ó¿ë¼ºÀÌ ³ô°í À¯Áöº¸¼ö°¡ ¿ëÀÌÇÏ´Ù.
		 *  
		 *  
		 * <<°´Ã¼»ı¼º(ÀÎ½ºÅÏ½ºÈ­)>>
		 *   Å¬·¡½½¸¦ »ç¿ëÇÏ±âÀ§ÇØ ¸Ş¸ğ¸®(Heap¿µ¿ª)¿¡ ¿Ã·Á ³õÀº °Í
		 *   new Å¬·¡½º ¸í();-> °´Ã¼°¡ ÀúÀåµÈ ¸Ş¸ğ¸® ÁÖ¼Ò¹İÈ¯
		 *   °´Ã¼ µÚ¿¡ ÂüÁ¶¿¬»êÀÚ(.)¸¦ ºÙ¿© °´Ã¼ÀÇ º¯¼ö¿Í ¸Ş¼­µå¿¡ Á¢±ÙÇÒ ¼ö ÀÖ´Ù.
		 *   °´Ã¼´Â »ı¼º µÉ¶§¸¶´Ù »õ·Î¿î °´Ã¼°¡ »ı¼ºµÇ°í, ¿©·¯°³ÀÇ °´Ã¼°¡ µ¿½Ã¿¡ Á¸ÀçÇÒ ¼ö ÀÖ´Ù.
		 */
		
		SampleClass sc = new SampleClass();
		
		sc.method1();
		
		sc.method2(5);
		
		
		//System.out.println(sc.method3);
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(6, 8);
		System.out.println(returnInt);
		
		sc.flowTest1();
		
		//¹æ±İ ¸¸µç Å¬·¡½ºÀÇ °´Ã¼¸¦ »ı¼ºÇÏ°í º¯¼ö¿¡ ÀúÀåÇØÁÖ¼¼¿ä.
		//°´Á¦°¡ ÀúÀåµÈ º¯¼ö¸¦ÅëÇØ ¸Ş¼­µåµéÀ» È£­„ÇØÁÖ¼¼¿ä.
		//ÆÄ¶ó¹ÌÅÍ°¡ ÀÖ´Â ¸Ş¼­µå´Â Å¸ÀÔ¿¡ ¸Â´Â °ªÀ» ³Ñ°ÜÁÖ½Ã°í,
		//¸®ÅÏÅ¸ÀÔÀÌ ÀÖ´Â¸Ş¼­µå´Â ¸®ÅÏ ¹ŞÀº °ªÀ» Ãâ·ÂÇØÁÖ¼¼¿ä.¤Ó
		
		ClassMaker cm = new ClassMaker();
		
		cm.method1();
		
		cm.method2(3);
		
		int return1 = cm.method3(2, 3);
		System.out.println(return1);
		
		
		
		Calculator ca = new Calculator();
		
		double addre = ca.add(123456,654321);
		System.out.println(addre);
		
		double mulre = ca.mul(addre, 123456);
		System.out.println(mulre);
		
		double divre = ca.div(mulre,123456);
		System.out.println(divre);
		
		double minre = ca.min(divre,654321);
		System.out.println(minre);
		
		double remre = ca.rem(minre, 123456);
		System.out.println(remre);
		
		
		//½É¸®Å×½ºÆ®
		new SimLiTest().q1();
		
		
		
		
		
		
		

	}

}
