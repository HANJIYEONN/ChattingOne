package CharOne;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class CharOne {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 7109);

			// Input Keyboard
			InputStream is = System.in;
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);

			// Output -> server
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os);

			System.out.println("Client ready!");
			String data = br.readLine();

			while (data != null) {

				pw.println(data);
				pw.flush();
				data = br.readLine();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
