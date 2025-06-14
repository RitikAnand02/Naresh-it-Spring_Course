package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.Product;

public interface IProductRepository extends MongoRepository<Product, String> {
	  //finder methods
    public  List<Product>  findByPriceBetween(float start,float end);
    
      // Query methods  
    //@Query(value="{name:?0}", fields="{name:1,price:1}")
    @Query(value="{name:?0}", fields="{id:0,name:1,price:1}")
    public  List<Object[]>  showProductsDataByName(String name);

    @Query(value="{name:?0}")
    public  List<Product>  showProductsByName(String name);
   
    @Query(value="{name:?0,status:?1}")
    public  List<Product>  showProductsByNameAndStatus(String name,String status);
    
    @Query(value="{price: { $gte: ?0, $lte: ?1 }}", fields="{name:1,price:1}")
    public  List<Object[]>  showProductsDataPriceRange(float start,float end);
   
    @Query(value="{$or: [{name:?0},{company:?1} ]}", fields="{name:1,price:1,company:1}")
    public  List<Object[]>  showProductsDataByNameOrCompany(String name,String company);
    
    @Query(value="{name: {$in:?0 }}")
    public  List<Product>  showProductsByNames(List<String> names);
    
    //@Query(value="{name: {'$regex':?0}}")
    @Query(value="{name: {'$regex':?0 , '$options':'i' }}")
    public  List<Product>  showProductsByNameChars(String initChars);
    
    
    
    
    
}
