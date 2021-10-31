class stringdemo{
	public static void main(String[]args){
		/*Object s1 = new String ("hello");
		Object s2 = new String ("hello");
		Object s3 = s1;
		Object s4= new String ("Hello");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(((String)s1).equalsIgnoreCase((String)s4 ));*/

		
		String str = "Weclome";
		
		char carr[] = new char[50];
		
		str.getChars(2,4,carr,0);
		System.out.println(carr);
		
		byte[]b= str.getBytes();
		for (byte val : b){
			System.out.print(val);
		}
		
		char []arr1 = str.toCharArray();
		for (char c: arr1){
			System.out.println(c);
		}
	}
}