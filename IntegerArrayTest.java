
public class IntegerArrayTest {

	public static void main(String[] args) 
	{
		int indScore[]= {10,20,30,40};
		int ausScore[]= new int[15];
		
		ausScore[0]=50;
		ausScore[1]=60;
		ausScore[2]=70;
		ausScore[3]=80;
		ausScore[4]=90;
		
		for(int i=0;i<indScore.length;i++)
		{
		
		System.out.println("score 1:"+indScore[i]);
		
		}
		for(int i=0;i<ausScore.length;i++)
		{
		
		System.out.println("score 2 :"+ausScore[i]);
		
		}
	}

}
