package Aggregation_Encapsulation;

public class Customer {
	
	private String CustomerName;
	Address ResidentialAddress;
	
	Customer(String customerName, Address ResidentialAddress)
	{
		this.CustomerName = customerName;
		this.ResidentialAddress = ResidentialAddress;
	}
	
	public void getCustomerDetails()
	{
		System.out.println("Customer : "+CustomerName);
		System.out.println("ResidentialAddress : "+ResidentialAddress.getAddressLine()+" "+ResidentialAddress.getCity());
	}
	
	public String getCustomerName()
	{
		return CustomerName;
	}

	public void setCustomerName(String customerName) 
	{
		CustomerName = customerName;
	}

	public Address getResidentialAddress()
	{
		return ResidentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) 
	{
		ResidentialAddress = residentialAddress;
	}

}
