
public class Decrypt{
	Model m = new Model();
	String[][] a = m.keyboard;
	public String Decrypt(String pwd) {
		String result="";
		int temp;
		String[] arr = pwd.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			
			temp=Integer.valueOf(arr[i]);
			System.out.println(temp);
			if(temp/10>10){
				result += a[temp/100][temp%100];
			}else {
				result += a[temp/10][temp%10];
			}
		}
		return result;
	}
}
