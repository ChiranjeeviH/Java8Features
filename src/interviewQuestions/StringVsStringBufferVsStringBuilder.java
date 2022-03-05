package interviewQuestions;

public class StringVsStringBufferVsStringBuilder implements Runnable{
	
	StringBuffer sb = new StringBuffer();
	
	@Override
	public void run() {
		System.out.println("invoked");
		for(int i=0;i<5;i++) {
			sb.append(i);
			if(sb.length() >3) {
				sb.deleteCharAt(2);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		
		StringVsStringBufferVsStringBuilder object = new StringVsStringBufferVsStringBuilder();
		// String comparison and object creations
		String s = "chiru";
		String s4 = "chiru";
		System.out.println(s == s4);
		System.out.println(s.equals(s4));
		String s1 = new String("Chiru");
		String s2 = "Chiru";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		String s3 = s2.intern();
		System.out.println(s.hashCode() + " " +s1.toString()+ " "+ s2.toString());
		System.out.println(s4 == s);
		System.out.println(s2==s3);
		System.out.println(s2.equals(s1));
		// String concatenation - Immutability
		String string1 = "chiru";
		string1.concat("chiranjeevi");
		System.out.println("after concatenitation but not saved into a varibale: "+string1);
		string1 = string1.concat("chiranjeevi");
		System.out.println("after concatenitation and saved into a varibale: "+string1);
	
		// String Buffer and String Builder
		StringBuffer sb = new StringBuffer("chiru");
		StringBuffer sb1= new StringBuffer("chiru");
		System.out.println(sb.hashCode() + " "+ sb1.hashCode());
		System.out.println(sb.toString().equals(sb1.toString()));
		System.out.println(sb.equals(sb1));
		
		StringBuilder sbb = new StringBuilder("chiru");
		StringBuilder sbb1 = new StringBuilder("chiru");
		
		System.out.println(sbb.hashCode() + " "+ sbb1.hashCode());
		System.out.println(sbb.toString().equals(sbb1.toString()));
		
		Thread t1 = new Thread(object,"thread1");
		Thread t2 = new Thread(object,"thread2");
		t1.start();
		t2.start();
		

	}

}
