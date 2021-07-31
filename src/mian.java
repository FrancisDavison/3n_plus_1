public class mian
{
	public static void main(String args[])
	{
		long input=7;
		long temp=input;
		System.out.println(temp);
		while(temp!=1)
		{
			if(temp==1)
			{
				break;
			}
			if(temp%2!=0)
			{
				temp=(3*temp)+1;
				System.out.println(temp);
			}
			if(temp%2==0)
			{
				temp=temp/2;
				System.out.println(temp);
			}
		}
	}
}