package javanet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddress {
	
	public void loadInetAddressByName() {
		try {
			InetAddress address = InetAddress.getByName("www.oreilly.com");
			System.out.println(address);
			address = InetAddress.getByName("23.216.99.61");
			System.out.println(address.getHostName());
		} catch (UnknownHostException ex) {
			System.out.println("Could not find www.oreilly.com");
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

	public void loadLocalHost() {
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
			System.out.println(address.getHostName());
			System.out.println(address.getHostAddress());
		} catch (UnknownHostException ex) {
			System.out.println("Could not find www.oreilly.com");
		}
	}
}
