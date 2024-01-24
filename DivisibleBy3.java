package Day2Assinment;

public class DivisibleBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num=new int[10];
		int index=0;
		
		for(int i=1;i<=30;i++)
		{
			if(i%3==0)
			{
				num[index]=i;
				
				index++;
			}
		}
		
		for(int j=1;j<num.length;j++)
		{
	      System.out.println(num[j]);
		}
		
		
		}
		
	}


