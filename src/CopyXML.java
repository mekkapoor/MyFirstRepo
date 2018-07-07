import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyXML {

	public static void main(String[] args) throws IOException {
		File f1=new File("D:\\eclipse-workspace\\Practice\\Employee.xml");
		File f2=new File("CopiedXML.xml");
		
		InputStream in=new FileInputStream(f1);
		OutputStream out=new FileOutputStream(f2);
	byte[] buf=new byte[1024];
	int len;
	while((len=in.read(buf))>0)
	{
		out.write(buf, 0, len);
	}
	in.close();
	out.close();
	

	}

}
