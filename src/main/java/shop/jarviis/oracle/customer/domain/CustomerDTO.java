package shop.jarviis.oracle.customer.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class CustomerDTO {
	public int custId;
	public String custName;
	public String address;
	public String phone;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("고객ID: %d, 고객 이름: %s, 고객 주소 : %s, 고객 전화번호 : %s", custId, custName, address, phone);
	}
	
}
