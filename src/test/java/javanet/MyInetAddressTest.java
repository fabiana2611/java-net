package javanet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyInetAddressTest {
	
	@InjectMocks
	private MyInetAddress service;
	
	@Test
	public void loadInetAddressByName() {
		service.loadInetAddressByName();
	}
	
	@Test
	public void loadInetAddressArray() {
		service.loadInetAddressArray();
	}
	
	@Test
	public void loadLocalHost() {
		service.loadLocalHost();
	}

}
