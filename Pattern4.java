public class Pattern4 {

	public static void main(String []arg){
	    int n=15;
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(i-j>=(n-1)/2||j+i>=(n-1)/2+(n-1)||i==n-2)
	            System.out.print("*");
	            else 
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	}

}