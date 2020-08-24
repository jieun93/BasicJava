package sub4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LottoSet {

	public static void main(String[] a) {
		// TODO Auto-generated method stub

		Set <Integer> lottoNum = new TreeSet<Integer>();
		
		while(lottoNum.size()<6){
			lottoNum.add((int)(Math.random()*45)+1);
		}
		System.out.println(lottoNum);
	}

}
