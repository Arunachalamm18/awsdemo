package mathematics;

public class reversingaNum {

	public static void main(String[] args) {
		
		int number=432;
		int revtemp=0;
		int temp=num;
		while(temp>0)
		{
		revtemp=(revtemp*10)+temp%10;
		temp/=10;
		}
		System.out.println(revtemp);
	}
	

}
