package com.nt.service;

public interface IpurchaseOrder {
	public String purchase(String []items, double[] prices,String[] toEmails) throws Exception;
}
