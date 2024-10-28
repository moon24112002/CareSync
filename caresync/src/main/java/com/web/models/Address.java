package com.web.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	    private String pinCode;
	    private String city;
	    private String area;
		public String getPinCode() {
			return pinCode;
		}
		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public Address(String pinCode, String city, String area) {
			super();
			this.pinCode = pinCode;
			this.city = city;
			this.area = area;
		}
		public Address() {
			super();
		}
	    
}
