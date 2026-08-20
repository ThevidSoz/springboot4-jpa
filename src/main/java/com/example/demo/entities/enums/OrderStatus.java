package com.example.demo.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), 
	PAID(2), 
	PACKING(3), 
	SHIPPED(4), 
	DELIVERED(5), 
	CANCELED(6);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valuerOF(int code) {
		for (OrderStatus status : OrderStatus.values()) {
			if (status.getCode() == code) {
				return status;
			}
		}
		throw new IllegalArgumentException("Invalide Order Status Code");
	}
}
