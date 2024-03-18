public class nuevo {
    
    public static void main(String[] args) {
        
    	int [] num1 = new int [4];
    		System.out.println("VECTOR 1");
    		num1[0] =1;
		num1[1] =2;
		num1[2] =3;
		num1[3] =4;
		
		for (int i=0 ; i<=num1.length -1 ;i++) {
			System.out.print( num1[i]+ ",");
		}
		
		int [] num2 = new int [4];
		System.out.println();
		System.out.println("VECTOR 2");
		num2[0] =5;
		num2[1] =6;
		num2[2] =7;
		num2[3] =8;
	
		for (int i=0 ; i<=num2.length -1 ;i++) {
			System.out.print( num2[i]+ ",");
	}
		System.out.println();
		System.out.println("VECTOR 3 UNIDOS");
		
		int [] num3 = new int [num1.length + num2.length];
        int indiceVector1 = 0;
        int indiceVector2 = 0;
		for (int i=0 ; i<=num3.length -1 ;i++) {
			 if (i % 2 == 0 && indiceVector1 < num1.length) {
	                num3[i] = num1[indiceVector1];
	                indiceVector1++;
	            } else if (indiceVector2 < num2.length) {
	                num3[i] = num2[indiceVector2];
	                indiceVector2++;
	            }
	        }
			for (int num : num3) {
            System.out.print(num + " ");
        }
    }
}