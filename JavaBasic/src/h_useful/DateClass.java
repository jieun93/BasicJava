package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date today = new Date();// ���糯¥
		System.out.println(today);

		// ��¥ ->����->���ڿ�
		SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-DD");
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss.sss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss a");

		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		//���ڿ� -> ���� -> ��¥
		String str = "2020�� 1��11��";
		
		SimpleDateFormat sdf5=new SimpleDateFormat("yyyy�� mm�� dd��");
		try {
		Date datestr = sdf5.parse(str);
		System.out.println(sdf1.format(datestr));
		} catch (ParseException e) {
			e.printStackTrace();
		}
			
		//��¥����ϱ�
		Calendar cal = Calendar.getInstance();
		
		//��¥ ����
		cal.setTime(new Date());
		cal.set(2020, 0, 10);//2020/1/10(���� 0���� ����)
		System.out.println(sdf3.format(cal.getTime()));
	
		
		cal.add(Calendar.YEAR,1);
		cal.add(Calendar.MONTH,2);
		cal.add(Calendar.DAY_OF_MONTH, -3);
		cal.add(Calendar.HOUR, 3);
		cal.add(Calendar.MINUTE, 5);
		cal.add(Calendar.SECOND, -10);
		
		System.out.println(sdf3.format(cal.getTime()));
		
	}
	
	
}
