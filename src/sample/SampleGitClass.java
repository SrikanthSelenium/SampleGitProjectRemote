package sample;

public class SampleGitClass {
	
	public static void main(String[] args) {
		
		String[] str = new String[4];
		str[0] = "sri";
		str[1] = "kanth";
		str[2] = "chin";
		str[3] = "choli";
		String name = "";
		for(int j=0;j<=str.length-1;j++)
		{
			name=name+str[j];
		}
		System.out.println(name);
		String append="";
		for(int i=str.length-1;i>=0;i--)
		{
			append=append+str[i];
		}
		StringBuilder sb = new StringBuilder(append);
		System.out.println(sb);
		StringBuilder appendrev = sb.reverse();
		System.out.println(appendrev);
		String stsb = appendrev.toString();
		String res="";
		char t[] = stsb.toCharArray();
		for(int i=t.length-1;i>=0;i--)
		{
			res=res+t[i];
		}
		System.out.println(res);

		System.out.println(res);

	}

}
