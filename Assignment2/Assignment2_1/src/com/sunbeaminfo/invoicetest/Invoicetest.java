package com.sunbeaminfo.invoicetest;

import com.sunbeaminfo.invoice.Invoice;

public class Invoicetest {

	public static void main(String[] args) 
	{
		Invoice invoice = new Invoice();
		invoice.acceptData();
		System.out.println("Final amount : "+invoice.calculateAmount());
	}

}
