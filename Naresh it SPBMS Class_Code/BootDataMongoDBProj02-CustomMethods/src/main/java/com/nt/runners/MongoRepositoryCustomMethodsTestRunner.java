package com.nt.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Product;
import com.nt.repository.IProductRepository;

@Component
public class MongoRepositoryCustomMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private  IProductRepository prodRepo;

	@Override
	public void run(String... args) throws Exception {
		/*	try {
				List<Product> list=prodRepo.findByPriceBetween(100.0f, 20000000.0f);
				list.forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/
		try {
			//prodRepo.showProductsDataByName("table").forEach(row->System.out.println(Arrays.toString(row)));
			 // prodRepo.showProductsByName("table").forEach(System.out::println);
			//prodRepo.showProductsByNameAndStatus("table", "active").forEach(System.out::println);
			 // prodRepo.showProductsDataPriceRange(100.0f, 2000000.0f).forEach(row->System.out.println(Arrays.toString(row)));
			 //prodRepo.showProductsDataByNameOrCompany("table","Amul").forEach(row->System.out.println(Arrays.toString(row)));
			//prodRepo.showProductsByNames(List.of("table","chair")).forEach(System.out::println);
			   prodRepo.showProductsByNameChars("t").forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
