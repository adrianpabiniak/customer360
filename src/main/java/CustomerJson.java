

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerJson {

	public CustomerJson () {
	}

	public CustomerJson (
		Address address, 
		String phone, 
		String name, 
		String id, 
		String email) {
		this.address = address;
		this.phone = phone;
		this.name = name;
		this.id = id;
		this.email = email;
	}

	private Address address;
	private String phone;
	private String name;
	private String id;
	private String email;
	public Address getAddress() {
		return address;
	}

	public CustomerJson setAddress(Address address) {
		this.address = address;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Address {

		public Address () {
		}

		public Address (
			String country, 
			String city, 
			String street, 
			String state, 
			String postalCode) {
			this.country = country;
			this.city = city;
			this.street = street;
			this.state = state;
			this.postalCode = postalCode;
		}

		private String country;
		private String city;
		private String street;
		private String state;
		@JsonProperty("postal_code")
		private String postalCode;
		public String getCountry() {
			return country;
		}

		public Address setCountry(String country) {
			this.country = country;
			return this;
		}


		public String getCity() {
			return city;
		}

		public Address setCity(String city) {
			this.city = city;
			return this;
		}


		public String getStreet() {
			return street;
		}

		public Address setStreet(String street) {
			this.street = street;
			return this;
		}


		public String getState() {
			return state;
		}

		public Address setState(String state) {
			this.state = state;
			return this;
		}


		public String getPostalCode() {
			return postalCode;
		}

		public Address setPostalCode(String postalCode) {
			this.postalCode = postalCode;
			return this;
		}

		public String toString() {
			return "Address ["
			+ " country: " + country
			+ " city: " + city
			+ " street: " + street
			+ " state: " + state
			+ " postalCode: " + postalCode
			+ " ]";
		}
	}

	public String getPhone() {
		return phone;
	}

	public CustomerJson setPhone(String phone) {
		this.phone = phone;
		return this;
	}


	public String getName() {
		return name;
	}

	public CustomerJson setName(String name) {
		this.name = name;
		return this;
	}


	public String getId() {
		return id;
	}

	public CustomerJson setId(String id) {
		this.id = id;
		return this;
	}


	public String getEmail() {
		return email;
	}

	public CustomerJson setEmail(String email) {
		this.email = email;
		return this;
	}

	public String toString() {
		return "CustomerJson ["
		+ " address: " + address
		+ " phone: " + phone
		+ " name: " + name
		+ " id: " + id
		+ " email: " + email
		+ " ]";
	}
}
