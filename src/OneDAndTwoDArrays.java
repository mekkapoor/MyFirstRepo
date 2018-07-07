
public class OneDAndTwoDArrays {

	public static void main(String[] args) {
		String[] OneD_Array= {"Mehak","Ankit","Mummy","Papa"};
		for(int i=0;i<OneD_Array.length;i++)
		{
			System.out.println(OneD_Array[i]);
		}
		
		
		String[][] TwoD_Array= new String[4][2];
		TwoD_Array[0][0]="Mehak";
		TwoD_Array[0][1]="IT Engineer";
		TwoD_Array[1][0]="Anki";
		TwoD_Array[1][1]="SBI-PO";
		TwoD_Array[2][0]="Manisha";
		TwoD_Array[2][1]="Boutique";
		TwoD_Array[3][0]="Ashwani";
		TwoD_Array[3][1]="Business";
		
		for(int m=0;m<TwoD_Array.length;m++)
		{
			StringBuilder sd=new StringBuilder();
			for(int n=0;n<TwoD_Array[m].length;n++)
			{
				if(n==0)
				{
					sd.append("The occupation of ");
				}
				else
				{
					sd.append(" is ");
				}
				sd.append(TwoD_Array[m][n]);
			}
			System.out.println(sd);
		}

	}

}
