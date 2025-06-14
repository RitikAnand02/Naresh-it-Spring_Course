package com.nt.service;

import java.util.List;

import com.nt.document.StockDetails;

public interface IStockMgmtService {
   public String  registerStock(StockDetails deatails);
   public   String  registerMultipleStocks(List<StockDetails> list);
   public  List<StockDetails>  showStocksByPriceRange(double start,double end);
   public  String    updateExchangeByPrice(double start,double end,String newExchange);
   public   String    registerOrUpdateStock(String  name, String  exchnage, double price);
   public  String  removeStocksByPrice(double start,double end);
   
}
