package oop1;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7); //indirim
		product1.setUnitPrice(7500); //birim fiyatı
		product1.setUnitsInstock(3); //birim stok
		product1.setImageUrl("image1jpg"); //resim uzantısı
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInstock(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInstock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("123456789");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Atakan");
		individualCustomer.setFirstName("Çetin");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCopmanyName("Kodlama.io");
		corporateCustomer.setPhone("05050001122");
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setCustomerNumber("54321");
	}

}
