package kr.hs.dgsw.ch11;

public class StringInstance {

	public static void main(String[] args) {
		
		String str = "My name is JintaekHong";
		int strLength = str.length();
		System.out.println(strLength);
		System.out.println("My name is JintaekHong".length());
		
		String str1 = "My String";
		String str2 = "My String";
		String str3 = "Your String";
		
		if(str1 == str2){
			System.out.println("������ �ν��Ͻ�");
		}
		else{
			System.out.println("�ٸ� �ν��Ͻ�");
		}
		if(str2 == str3){
			System.out.println("������ �ν��Ͻ�");
		}
		else{
			System.out.println("�ٸ� �ν��Ͻ�");
		}
		
		String str4 = str1.concat(str2).concat(str3);
		System.out.println(str4);
		
		System.out.println(str1.compareTo(str3));
		
		StringBuilder sb = new StringBuilder("ABC");
		sb.append("DEF");
		
		System.out.println(sb); //ABCDEF
		
		String jumin = "720325-1000000";
		char a = jumin.charAt(7);
		if(a=='1'||a=='3'){
			System.out.println("�����Դϴ�");
		}
		else if(a=='2'||a=='4'){
			System.out.println("�����Դϴ�");
		}
		else{
			System.out.println("�ܱ����Դϴ�");
		}
		
	}

}
