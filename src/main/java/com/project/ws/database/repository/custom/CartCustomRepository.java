package com.project.ws.database.repository.custom;

import java.util.List;

import com.project.ws.database.domain.Cart;

public interface CartCustomRepository {
		
		public List<Cart> getCartByCustomerId(Integer id);

	
}