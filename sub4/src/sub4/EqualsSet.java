package sub4;

import java.util.HashSet;
import java.util.Set;

public class EqualsSet {

	public static void main(String[] args) {
		Member member1= new Member ("1","mimi");
		Member member2= new Member ("2","mimi");
		Member member3= new Member ("3","mimi");
		
		Set<Member> memberSet = new HashSet<Member>();
		
		memberSet.add(member3);
		memberSet.add(member2);
		memberSet.add(member1);
		
		System.out.println(memberSet.contains(member3));
		
	}

}
