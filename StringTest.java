class StringTest{
	public static void main(String args[]){
		
String s1 = new String("HelloWorld");
char ch[] = {'k', 'r', 'i', 's', 'h', 'n', 'a'};
String s2 = new String(ch);
String s3 = new String("test");

System.out.println(s1);
System.out.println(s1.charAt(3));  //char charAt method
System.out.println(s1.length());   // int length method
System.out.println(ch);
System.out.println(s1.contains("World")); //boolen contain method
System.out.println(s3.isEmpty());   // boolean isEmpty method
System.out.println(s3.replace("test", "testing"));   // string replace method
System.out.println(s1.concat("HelloWorld"));      // string concat method

StringBuffer a = new StringBuffer("Hello");
System.out.println(a.append("Java"));     // String buffer append method
StringBuffer b = new StringBuffer("Hello");
System.out.println(b.insert(1,"Java"));  // String buffer insert method
StringBuffer c = new StringBuffer("Test");
System.out.println(c.reverse());   // String buffer reverse method

}
}