package com.mustafa.hystrixeurekaclientshippingservice.domain;

public class Shipment {

	private String shipper;
	private String address;
	private String phone;
	private String dateToArrive;
	private String item;
	private String weight;
	
	
	public Shipment() {
		super();
	}

	public Shipment(String shipper, String address, String phone, String dateToArrive, String item, String weight) {
		super();
		this.shipper = shipper;
		this.address = address;
		this.phone = phone;
		this.dateToArrive = dateToArrive;
		this.item = item;
		this.weight = weight;
	}

	public String getShipper() {
		return shipper;
	}

	public void setShipper(String shipper) {
		this.shipper = shipper;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDateToArrive() {
		return dateToArrive;
	}

	public void setDateToArrive(String dateToArrive) {
		this.dateToArrive = dateToArrive;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	
	
}

