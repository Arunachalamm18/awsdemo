package mathematics;

public class reversingaNum {

	public static void main(String[] args) {
		
		int num=432;
		int rev=0;
		int temp=num;
		while(temp>0)
		{
		rev=(rev*10)+temp%10;
		temp/=10;
		}
		System.out.println(rev);
	}
	

}
