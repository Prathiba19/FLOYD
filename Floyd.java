# FLOYD

public class Floyd {

	public static void main(String[] args) {
		int i,j;
		 if(args.length==0)
		 {
			 System.out.println("Enter an integer");
		 }
		 else
		 {
			 int num=Integer.parseInt(args[0]);
		for(i=1;i<=num;i++)
		{
			j=i;
			while(j>0)
			{
				System.out.print("*");
				j--;
			}
			{
				System.out.println("");
			}
			
		}

	}

}

}
