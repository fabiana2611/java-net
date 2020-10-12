package javanet;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class MyURL {

	public static void main(String[] args) {
		MyURL url = new MyURL();
		url.otherMethods();
	}

	public void openConnection() {
		try {
			URL u = new URL("http://www.google.com");
			URLConnection rc = u.openConnection();
			System.out.println(rc.getContentType());
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
	
	public void openStream() {
		InputStream in = null;
		try {
			URL u = new URL("http://www.google.com");
			in = u.openStream();
			int c;
			while ((c = in.read()) != -1)
				System.out.write(c);
		} catch (IOException ex) {
			System.err.println(ex);
		}
	
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				// ignore
			}
		}
	}
	
	public void otherMethods() {
		try {
			URL u = new URL("http://www.google.com");
			System.out.println("Host: "+ u.getHost());
			System.out.println("Port: "+ u.getPort());
			System.out.println("Protocol: "+ u.getProtocol());
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}

	public void openStreamJava7() {
		try {
			URL u = new URL("http://www.google.com");

			try (InputStream in = u.openStream()) {
				int c;
				while ((c = in.read()) != -1)
					System.out.write(c);
			}
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
	
	
}
