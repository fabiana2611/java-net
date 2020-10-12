package javanet;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * The openConnection() method opens a socket to the specified URL and returns a
 * URLConnection object. A URLConnection represents an open connection to a
 * network resource. If the call fails, openConnection() throws an IOException .
 * 
 * https://www.academia.edu/35702018/Java_Network_Programming_4th_Edition
 * 
 */
public class MyURLConnection {

	public void openConnection() {
		try {
			URL u = new URL("https://news.ycombinator.com/");
			try {
				URLConnection uc = u.openConnection();
				InputStream in = uc.getInputStream();
				// read from the connection...
			} catch (IOException ex) {
				System.err.println(ex);
			}
		} catch (MalformedURLException ex) {
			System.err.println(ex);
		}
	}

	public void getContent() {
		try {
			URL u = new URL("https://news.ycombinator.com/");
			Object o = u.getContent();
			System.out.println("I got a " + o.getClass().getName());
		} catch (MalformedURLException ex) {
			System.err.println("https://news.ycombinator.com/" + " is not a parseable URL");
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}

	public void getContentType() {
		try {
			URL u = new URL("http://www.nwu.org");
			Class<?>[] types = new Class[3];
			types[0] = String.class;
			types[1] = Reader.class;
			types[2] = InputStream.class;
			Object o = u.getContent(types);

			if (o instanceof String) {
				System.out.println(o);
			} else

			if (o instanceof Reader) {
				int c;
				Reader r = (Reader) o;
				while ((c = r.read()) != -1)
					System.out.print((char) c);
				r.close();
			} else

			if (o instanceof InputStream) {
				int c;
				InputStream in = (InputStream) o;
				while ((c = in.read()) != -1)
					System.out.write(c);
				in.close();
			} else {
				System.out.println("Error: unexpected type " + o.getClass());
			}
		} catch (MalformedURLException ex) {
			System.err.println("https://news.ycombinator.com/" + " is not a parseable URL");
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}


}
