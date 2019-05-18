package com.builder.pattern;

public class AcerBuilder implements ComputerBuilder {

	private Computer computer;
	
	public AcerBuilder() {
		computer = new Computer();
	}
	
	@Override
	public void setDisplay(String display) {
		this.computer.setDisplay(display);
	}

	@Override
	public void setBrand(String brand) {
		this.computer.setBrand(brand);
	}

	@Override
	public void setKeyboard(String keyboard) {
		this.computer.setKeyboard(keyboard);
	}

	@Override
	public void setCpu(String cpu) {
		this.computer.setCpu(cpu);
	}

	@Override
	public void setMotherboard(String motherboard) {
		this.computer.setMotherboard(motherboard);
	}

	@Override
	public void setGraphicsCard(String graphicsCard) {
		this.computer.setGraphicsCard(graphicsCard);
	}

	@Override
	public Computer getCustomPc() {
		return this.computer;
	}

}
