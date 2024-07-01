package com.example.aoptest;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public ProductVo findProduct(String keyword) {
		System.out.println("finding [" + keyword + "] ...");
		
		//	상품 검색하고 있다고 가정 
		
		return new ProductVo(keyword);
	}
}
