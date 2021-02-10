package Aggregation_Encapsulation;

public class TestCustomer {

	public static void main(String[] args) {
				
		Address addr = new Address("1st Main HSR Layout","Bangalore");
		Customer c = new Customer("John",addr);
		
		c.getResidentialAddress();
		c.getCustomerDetails();
		
	}

}
