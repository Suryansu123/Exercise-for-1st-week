package com.htc.exercise1stwk.main;

public class BankAccountMain {
  public static void main(String[] args) {
	  BankAccount bk= new BankAccount("100","SUUU");
	  
	  System.out.println(bk.accountNo);
	  System.out.println(bk.accountName);
	  System.out.println(bk.balance);
  }
}
