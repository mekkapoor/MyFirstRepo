import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputDataPractice {

	public static String getInputData(String prompt) {
	BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println(prompt);
	System.out.flush();
	try {
		return stdin.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	

	}
	public static void main(String args[])
	{
		String s1=getInputData("Enter a value");
		System.out.println(s1);
	}

}
