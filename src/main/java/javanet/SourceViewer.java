package javanet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Example take from the book
 * https://www.academia.edu/35702018/Java_Network_Programming_4th_Edition
 */
public class SourceViewer {

	public static void main(String[] args) {
		
		InputStream in = null;
		try {
			// Open the URL for reading
			URL u = new URL("http://www.google.com");
			in = u.openStream();
			// buffer the input to increase performance
			in = new BufferedInputStream(in);
			// chain the InputStream to a Reader
			Reader r = new InputStreamReader(in);
			int c;
			while ((c = r.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (MalformedURLException ex) {
			System.err.println(args[0] + " is not a parseable URL");
		} catch (IOException ex) {
			System.err.println(ex);
		} 
		
		finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// ignore
				}
			}
		}
	}
	
}
