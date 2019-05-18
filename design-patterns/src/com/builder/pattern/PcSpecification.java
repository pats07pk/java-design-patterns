package com.builder.pattern;

public interface PcSpecification {

	public ComputerEngineer setDisplay(String display);
	public ComputerEngineer setBrand();
	public ComputerEngineer setKeyboard(String keyboard);
	public ComputerEngineer setCpu(String cpu);
	public ComputerEngineer setMotherboard(String motherboard);
	public ComputerEngineer setGraphicsCard(String graphicsCard);
}
