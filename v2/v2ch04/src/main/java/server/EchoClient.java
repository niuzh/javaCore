package server;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * This program makes a socket connection to the atomic clock in Boulder, Colorado, and prints 
 * the time that the server sends.
 * 
 * @version 1.21 2016-04-27
 * @author Cay Horstmann
 */
public class EchoClient {
	public static void main(String[] args) throws IOException {
		try (Socket s = new Socket("localhost", 8189)) {
			Scanner in = new Scanner(s.getInputStream(), "UTF-8");
			PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), "UTF-8"),
					true /* autoFlush */);
			out.println("客户端连接。。。");
			while (true) {
				String line = in.nextLine();
				System.out.println(line);
				Scanner scanner = new Scanner(System.in);
				String lines = scanner.nextLine();
				out.println("客户端命令："+lines);
			}
		}
	}
}
