package com.builder.pattern;

public class ComputerEngineer implements PcSpecification{

	private ComputerBuilder computerBuilder;
	
	public ComputerEngineer(ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}
	
	@Override
	public ComputerEngineer setDisplay(String display) {
		this.computerBuilder.setDisplay(display);
		return this;
	}

	@Override
	public ComputerEngineer setBrand() {
		this.computerBuilder.setBrand("ACER");
		return this;
	}

	@Override
	public ComputerEngineer setKeyboard(String keyboard) {
		this.computerBuilder.setKeyboard(keyboard);		
		return this;
	}

	@Override
	public ComputerEngineer setCpu(String cpu) {
		this.computerBuilder.setCpu(cpu);		
		return this;
	}

	@Override
	public ComputerEngineer setMotherboard(String motherboard) {
		this.computerBuilder.setMotherboard(motherboard);		
		return this;
	}

	@Override
	public ComputerEngineer setGraphicsCard(String graphicsCard) {
		this.computerBuilder.setGraphicsCard(graphicsCard);		
		return this;
	}
	
	public Computer buildPc() {
		return this.computerBuilder.getCustomPc();
	}
	
}
