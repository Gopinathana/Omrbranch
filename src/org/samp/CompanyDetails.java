package org.samp;

public class CompanyDetails {

	
	
	private void companyName() {
			System.out.println("a");
		}
	private void companyId() {
			System.out.println("b");
		}
	private void companyAddress() {
			System.out.println("c");
		}
		
	public static void main (String[]arg) {
		CompanyDetails print =new CompanyDetails();
		
		print.companyName();
		print.companyId();
		print.companyName();
		print.companyAddress();
		
	}
}

