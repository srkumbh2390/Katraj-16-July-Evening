package integer;

public class T {

	public static void main(String[] args) {
		String a =  "423";
		Integer aa = Integer.valueOf(a);
		int aaa = System.identityHashCode(aa);
		Integer bb = Integer.valueOf("423");
		int bbb = System.identityHashCode(bb);
		
		//System.out.println(aa == bb)
		System.out.println(aaa);
		System.out.println(bbb);
		

	}

}
