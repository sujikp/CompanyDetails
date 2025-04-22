package org.company;

public class CompanyInfo {
	
private void companyName(String name) {
	
		System.out.println("Company name :"+name);
	}
private void companyName(int id,String name) {
	
		System.out.println("Company id:"+id);
		System.out.println("Company name :"+name);
	}
private void companyName(int id ,String name,String location) {
	
	    System.out.println("Company id:"+id);
		System.out.println("Company name :"+name);
		System.out.println("Company id:"+location);
	}
  public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName("softTech");
	c.companyName(1,"softTech");
	c.companyName(2,"softTech","chennai");
}
  private void companyAddress(String name) {
		
		System.out.println("Company name :"+name);
	}
}
