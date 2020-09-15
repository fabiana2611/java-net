package javanet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AccessNetTest {
	
	@InjectMocks
	private AccessNet service;
	
	@Test
	public void load(){
		service.load();
	}

}
