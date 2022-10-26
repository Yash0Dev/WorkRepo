public class Ineuron {

	public static void main(String[] args) {
		int n=13;
		for(int i=0;i<n;i++)
		{	//i
			for(int j=0;j<n;j++)
			{
				if(j==4&&i>1&&i!=4||j==3&&i>1&&i!=4)
					System.out.print("*");
				else
					System.out.print(" ");
			}//n
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}//E
			for(int j=0;j<n;j++)
			{
				if(j==1||i==0&&j<n-1&&j>0||i==(n-1)/2&&j>0&&j<(n+3)/2||i==n-1&&j>0&&j<n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}//u
			for(int j=0;j<n;j++)
			{
				if(j==1&&i<n-2||i==n-1&&j>2&&j<n-2||j==2&&i==11||j==11&&i==11||j==n-1&&i<n-2)
					System.out.print("*");
				else
					System.out.print(" ");
			}//r
			for(int j=0;j<n;j++)
			{
				if(j==1||i==0&&j>0&&j<n-2||i==(n-1)/2&&j>0&&j<n-2||j==n-1&&i>1&&i<5||j==11&&i==1||j==11&&i==5||i-j==2&&j!=0&&i!=4&&i!=5)
					System.out.print("*");
				else
					System.out.print(" ");
			}//o
			for(int j=0;j<n;j++)
			{
				if(j==1&&i<n-2&&i>1||i==n-1&&j>2&&j<n-2||j==2&&i==11||j==11&&i==11||j==2&&i==1||j==11&&i==1||j==n-1&&i<n-2&&i>1||i==0&&j>2&&j<n-2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(j==1||j==n-1||i==j&&i!=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();	
		}

	}

}
