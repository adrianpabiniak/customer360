

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderJson {

	public OrderJson () {
	}

	public OrderJson (
		java.time.OffsetDateTime orderDate, 
		java.math.BigDecimal totalPrice, 
		String orderId, 
		Items[] items, 
		Customer customer, 
		Status status) {
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.orderId = orderId;
		this.items = items;
		this.customer = customer;
		this.status = status;
	}

	@JsonProperty("order_date")
	private java.time.OffsetDateTime orderDate;
	@JsonProperty("total_price")
	private java.math.BigDecimal totalPrice;
	@JsonProperty("order_id")
	private String orderId;
	private Items[] items;
	private Customer customer;
	private Status status;
	public java.time.OffsetDateTime getOrderDate() {
		return orderDate;
	}

	public OrderJson setOrderDate(java.time.OffsetDateTime orderDate) {
		this.orderDate = orderDate;
		return this;
	}


	public java.math.BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public OrderJson setTotalPrice(java.math.BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
		return this;
	}


	public String getOrderId() {
		return orderId;
	}

	public OrderJson setOrderId(String orderId) {
		this.orderId = orderId;
		return this;
	}


	public Items[] getItems() {
		return items;
	}

	public OrderJson setItems(Items[] items) {
		this.items = items;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Items {

		public Items () {
		}
		public Items (
			Integer quantity, 
			String itemId, 
			java.math.BigDecimal price) {
			this.quantity = quantity;
			this.itemId = itemId;
			this.price = price;
		}


		private Integer quantity;
		@JsonProperty("item_id")
		private String itemId;
		private java.math.BigDecimal price;
		public Integer getQuantity() {
			return quantity;
		}

		public Items setQuantity(Integer quantity) {
			this.quantity = quantity;
			return this;
		}


		public String getItemId() {
			return itemId;
		}

		public Items setItemId(String itemId) {
			this.itemId = itemId;
			return this;
		}


		public java.math.BigDecimal getPrice() {
			return price;
		}

		public Items setPrice(java.math.BigDecimal price) {
			this.price = price;
			return this;
		}

		public String toString() {
			return "Items ["
			+ " quantity: " + quantity
			+ " itemId: " + itemId
			+ " price: " + price
			+ " ]";
		}
	}

	public Customer getCustomer() {
		return customer;
	}

	public OrderJson setCustomer(Customer customer) {
		this.customer = customer;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Customer {

		public Customer () {
		}

		public Customer (
			String name, 
			String id, 
			String email) {
			this.name = name;
			this.id = id;
			this.email = email;
		}

		private String name;
		private String id;
		private String email;
		public String getName() {
			return name;
		}

		public Customer setName(String name) {
			this.name = name;
			return this;
		}


		public String getId() {
			return id;
		}

		public Customer setId(String id) {
			this.id = id;
			return this;
		}


		public String getEmail() {
			return email;
		}

		public Customer setEmail(String email) {
			this.email = email;
			return this;
		}

		public String toString() {
			return "Customer ["
			+ " name: " + name
			+ " id: " + id
			+ " email: " + email
			+ " ]";
		}
	}

	public Status getStatus() {
		return status;
	}

	public OrderJson setStatus(Status status) {
		this.status = status;
		return this;
	}


	public static enum Status { pending,processing,shipped,delivered,cancelled }	public String toString() {
		return "OrderJson ["
		+ " orderDate: " + orderDate
		+ " totalPrice: " + totalPrice
		+ " orderId: " + orderId
		+ " items: " + items
		+ " customer: " + customer
		+ " status: " + status
		+ " ]";
	}
}
