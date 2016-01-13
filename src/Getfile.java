import java.io.File;

public class Getfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String b,c;
		b="D:\\HCBA";
		c="\\Testfile";  //divide the path into several parts
		File file=new File(b+c);
		if(!file.exists()){
			a=0;
			System.out.println(a+"File donot exi\n");
			file.mkdirs();
		}
		else {
			a=1;
			System.out.println(a+"Has it\n");}
		System.out.println("Test the git function");
	}

}
