
public class Encrypt {
	Model m = new Model();
	String[][] a = m.keyboard;
	public String Encrypt(String pwd) {
		String result="";
		String[] arr = new String[pwd.length()];
		for(int i = 0; i < pwd.length(); i++){
			arr[i] =pwd.substring(i, i+1);
		}
		//System.out.println(a[2][13]);
		for(int i = 0; i < pwd.length(); i++) {
			for(int j = 0; j < 8; j++) {
				for(int k = 0; k < 14; k++) {
					if(arr[i].equals(a[j][k])) {
						result += (j*10+k+" ");
					}
				}
			}
		}
		return result;
	}
}
