package Aggregation_Encapsulation;

public class Address {
	
	private String AddressLine;
	private String City;
	
	Address(String addressLine, String city)
	{
		this.AddressLine = addressLine;
		this.City = city;
	}
	
	void getAddressDetails()
	{
		System.out.println("Address Details are : "+AddressLine + City);
	}

	public String getAddressLine() 
	{
		return AddressLine;
	}

	public void setAddressLine(String addressLine) 
	{
		AddressLine = addressLine;
	}

	public String getCity() 
	{
		return City;
	}

	public void setCity(String city) 
	{
		City = city;
	}

}
