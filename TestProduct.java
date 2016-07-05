package com.niit.shoppingcart;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Product p=new Product();
        
        p.setId("23456");
        p.setName("mobile");
        p.setPrice(-50000);
        
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        
	}

}
