package com.mockitoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.mockitotest.entity.Product;
import com.mockitotest.interfaces.Service;

public class ProductTest {
	
	
	Service service = Mockito.mock(Service.class);
	Product product = new Product(service);

	@Test
	public void testGetTotalCost() {
		int expectedCost = 200;
		Mockito.when(service.totalproduct()).thenReturn(20);
		Mockito.when(service.productPrice()).thenReturn(10);
		assertEquals(expectedCost,product.getTotalCost());
		
	}
	
	
	
	
}
