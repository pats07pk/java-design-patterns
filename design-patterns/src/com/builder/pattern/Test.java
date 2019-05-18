package com.builder.pattern;

public class Test {

	public static void main(String[] args) {
		
		ComputerBuilder computerBuilder = new AcerBuilder();
		ComputerEngineer computerEngineer = new ComputerEngineer(computerBuilder);
		
		computerEngineer.setBrand().setCpu("ASUS").setDisplay("40 inch 4k diaplay")
			.setGraphicsCard("1050 TI").setKeyboard("ACER LEGION")
			.setMotherboard("GIGABYTE");
		Computer pc = computerEngineer.buildPc();
		System.out.println(pc);
		
	}
	
}
