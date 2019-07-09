package CharOne;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

public static void main(String[] args) {
	try {
		ServerSocket ss = new ServerSocket(7019);
		System.out.println("Server Ready");
		
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		

		String data = br.readLine();
		
		while (data != null) {
		
			System.out.println(data);
			data = br.readLine();
		
		}
	}catch (Exception e) {
			e.printStackTrace();
}
}
}
