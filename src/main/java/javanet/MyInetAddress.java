package javanet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Example take from the book Java Networking Programming 4th Edition
 */
public class MyInetAddress {
	
	public void loadInetAddress() {
		try {
			InetAddress address = InetAddress.getByName("www.google.com");
			System.out.println(address);
			
			address = InetAddress.getByName("23.216.99.61");
			System.out.println(address.getHostName());
			
			address = InetAddress.getLocalHost();
			System.out.println(address);
			System.out.println(address.getHostName());
			System.out.println(address.getHostAddress());
			
		} catch (UnknownHostException ex) {
			System.out.println("Could not find www.google.com");
		}
	}
	
	public void loadInetAddressArray() {
		try {
			InetAddress[] addresses = InetAddress.getAllByName("www.oreilly.com");
			for (InetAddress address : addresses) {
				System.out.println(address);
			}
		} catch (UnknownHostException ex) {
			System.out.println("Could not find www.oreilly.com");
		}
	}


}
