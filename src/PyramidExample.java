
public class PyramidExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sequence pyramid
		/*int k=1;
		for(int i=0; i<=4; i++) {
			//System.out.println("outer for loop start");
			
			for(int j=1; j<=4-i; j++) {
				System.out.print(k +"\t");
				
				k++;
			}
			
			System.out.println(" ");
		}
		
		
		//inverted sequence pyramid
		int k=1;
		for(int i=1; i<5; i++) {
			
			//System.out.println("outer for loop start");
			for(int j=1; j<=i; j++) {
				System.out.print(j + "\t");
				
				k++;
			}
			
			System.out.println(" ");
		}
		
		*/
		int k=3;
		for(int i=1; i<4; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(k + "\t");
				k=k+3;
			}
			System.out.println(" ");
		}

	}

}
