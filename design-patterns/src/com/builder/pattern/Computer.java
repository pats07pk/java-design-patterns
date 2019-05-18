package com.builder.pattern;

public class Computer {

	@Override
	public String toString() {
		return "Computer [display=" + display + ", brand=" + brand + ", keyboard=" + keyboard + ", cpu=" + cpu
				+ ", motherboard=" + motherboard + ", graphicsCard=" + graphicsCard + "]";
	}

	private String display;
	private String brand;
	private String keyboard;
	private String cpu;
	private String motherboard;
	private String graphicsCard;

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	public String getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

}
