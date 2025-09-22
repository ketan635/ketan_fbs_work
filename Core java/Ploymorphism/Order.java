
class Order {
	int orderId;
	String date;
	double amount;
	String customerName;
	String deliveryAddress;
	String orderStatus;
	
	Order() {
		this.orderId = 101;
		this.date = "2025-09-21";
		this.amount = 1500.50;
		this.customerName = "Dhananjay Sangle";
		this.deliveryAddress = "123 MG Road, Pune";
		this.orderStatus = "Pending";
	}

	Order(int orderId, String date, double amount, String customerName, String deliveryAddress, String orderStatus) {
		this.orderId = orderId;
		this.date = date;
		this.amount = amount;
		this.customerName = customerName;
		this.deliveryAddress = deliveryAddress;
		this.orderStatus = orderStatus;
	}

	int getOrderId() {
		return orderId;
	}

	void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	String getDate() {
		return date;
	}

	void setDate(String date) {
		this.date = date;
	}

	double getAmount() {
		return amount;
	}

	void setAmount(double amount) {
		this.amount = amount;
	}

	String getCustomerName() {
		return customerName;
	}

	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	String getDeliveryAddress() {
		return deliveryAddress;
	}

	void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	String getOrderStatus() {
		return orderStatus;
	}

	void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	void display() {
		System.out.println("Order Id is : "+this.orderId);
		System.out.println("Date is : "+this.date);
		System.out.println("Amount is : "+this.amount);
		System.out.println("Customer name is : "+this.customerName);
		System.out.println("Delivery address is : "+this.deliveryAddress);
		System.out.println("Order status is : "+this.orderStatus);
		
	}
	
}//Order ends here

class OnlineOrder extends Order {
	String paymentMethod;
	String trackingId;
	String expectDelivery;
	OnlineOrder() {
		super();
		this.paymentMethod = "Credit Card";
		this.trackingId = "TRK1001";
		this.expectDelivery = "2025-09-25";
	}
	OnlineOrder(int orderId, String date, double amount, String customerName, String deliveryAddress, String orderStatus,String paymentMethod, String trackingId, String expectDelivery) {
		super(orderId,date,amount,customerName,deliveryAddress,orderStatus);
		this.paymentMethod = paymentMethod;
		this.trackingId = trackingId;
		this.expectDelivery = expectDelivery;
	}
	String getPaymentMethod() {
		return paymentMethod;
	}
	void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	String getTrackingId() {
		return trackingId;
	}
	void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}
	String getExpectDelivery() {
		return expectDelivery;
	}
	void setExpectDelivery(String expectDelivery) {
		this.expectDelivery = expectDelivery;
	}
	
	void display () {
		super.display();
		System.out.println("Payment method is : "+this.paymentMethod);
		System.out.println("Tracking Id is : "+this.trackingId);
		System.out.println("Expect Delivery is : "+this.expectDelivery);
	}
	
}//Online order ends here

class PreOrder extends Order {
	String releaseDate;
	String productName;
	double advancePayment;
	PreOrder() {
		super();
		this.releaseDate = "2025-09-20";
		this.productName = "Smartphone X";
		this.advancePayment = 500.00;
	}
	PreOrder(int orderId, String date, double amount, String customerName, String deliveryAddress, String orderStatus,String releaseDate, String productName, double advancePayment) {
		super(orderId,date,amount,customerName,deliveryAddress,orderStatus);
		this.releaseDate = releaseDate;
		this.productName = productName;
		this.advancePayment = advancePayment;
	}
	String getReleaseDate() {
		return releaseDate;
	}
	void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	String getProductName() {
		return productName;
	}
	void setProductName(String productName) {
		this.productName = productName;
	}
	double getAdvancePayment() {
		return advancePayment;
	}
	void setAdvancePayment(double advancePayment) {
		this.advancePayment = advancePayment;
	}
	
	void display () {
		super.display();
		System.out.println("Release Date is : "+this.releaseDate);
		System.out.println("Product name is : "+this.productName);
		System.out.println("Advance payment is : "+this.advancePayment);
		
	}
	
}//PreOrder ends here

class StoreOrder extends Order {
	String storeLocation;
	String pickupTime;
	String cashierName;
	StoreOrder() {
		super();
		this.storeLocation = "Pune Central";
		this.pickupTime = "10:30 AM";
		this.cashierName = "Rohit Sharma";
	}
	StoreOrder(int orderId, String date, double amount, String customerName, String deliveryAddress, String orderStatus,String storeLocation, String pickupTime, String cashierName) {
		super(orderId,date,amount,customerName,deliveryAddress,orderStatus);
		this.storeLocation = storeLocation;
		this.pickupTime = pickupTime;
		this.cashierName = cashierName;
	}
	String getStoreLocation() {
		return storeLocation;
	}
	void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}
	String getPickupTime() {
		return pickupTime;
	}
	void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
	String getCashierName() {
		return cashierName;
	}
	void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}
	
	void display () {
		super.display();
		System.out.println("Store location is : "+this.storeLocation);
		System.out.println("Pickup Time is : "+this.pickupTime);
		System.out.println("Cashier Name is : "+this.cashierName);
	}
}//Store location ends here

class TestOrder {
	public static void main (String [] args) {
		Order o1 = new Order();
		o1.display();
		
		System.out.println();
		
		o1 = new Order (102, "2025-09-20", 2500.00, "Amit Sharma", "45 Park Street, Mumbai", "Shipped");
		o1.display();
		
		System.out.println();
		
		o1 = new OnlineOrder();
		o1.display();
		
		System.out.println();
		
		o1 = new OnlineOrder(103, "2025-09-19", 3200.75, "Neha Patel", "78 Main Road, Delhi", "Delivered","Debit Card", "TRK1002", "2025-09-24");
		o1.display();
		
		System.out.println();
		
		o1 = new PreOrder ();
		o1.display();
		
		System.out.println();
		
		o1 = new PreOrder (104, "2025-09-18", 1800.00, "Rahul Verma", "12 Green Lane, Bangalore", "Pending","2025-09-18", "Laptop Pro", 1000.00);
		o1.display();
		
		System.out.println();
		
		o1 = new StoreOrder ();
		o1.display();
		
		System.out.println();
		
		o1 = new StoreOrder (105, "2025-09-17", 4000.20, "Pooja Singh", "56 Hill Street, Jaipur", "Cancelled","Mumbai West", "11:00 AM", "Anjali Verma");
		o1.display();
	}
}