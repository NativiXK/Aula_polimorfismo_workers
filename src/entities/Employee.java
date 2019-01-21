package entities;

public class Employee {

	private String name;
	private Integer hours;
	private Double valuePerHour;
	private boolean outSourced;

	public Employee() {
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
		this.outSourced = false;
	}

	public Employee(String name, Integer hours, Double valuePerHour, boolean outSourced) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
		this.setOutSourced(outSourced);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public boolean isOutSourced() {
		return outSourced;
	}

	public void setOutSourced(boolean outSourced) {
		this.outSourced = outSourced;
	}

	public Double payment() {
		return hours * valuePerHour;
	}

	public StringBuilder resume() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + name + "\n");
		sb.append("Hours: " + hours + "\n");
		sb.append("Value per hour: " + valuePerHour + "\n");

		return sb;
	}

}
