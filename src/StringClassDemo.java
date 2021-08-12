
public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = " javatraning";
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("t"));
		System.out.println(a.substring(3,6));
		
		System.out.println(a.concat("Its"));
		
		System.out.println(a.length());
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		System.out.println(a.trim());
		
		String arr[] = a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(a.replace("t", "s"));
		
		

	}

}
