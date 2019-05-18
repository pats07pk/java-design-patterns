package com.builder.pattern;

public interface ComputerBuilder {
	
	public void setDisplay(String display);
	public void setBrand(String brand);
	public void setKeyboard(String keyboard);
	public void setCpu(String cpu);
	public void setMotherboard(String motherboard);
	public void setGraphicsCard(String graphicsCard);
	public Computer getCustomPc();
}
