package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] a={3,2,11,4,6,7};
		
		int[] b={1,2,8,4,9,7};
		
		int size1=a.length;
		
		int size2=b.length;
		
		for(int i=0;i<size1;i++) {
			
			for(int j=0;j<size2;j++) {
				
				if(a[i]==b[j])
				{
					System.out.println(b[j]);
				}
			}
		}

	}

}
