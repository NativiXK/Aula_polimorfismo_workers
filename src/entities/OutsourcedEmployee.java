package entities;

public final class OutsourcedEmployee extends Employee {

	private Double additionalCharge;

	public OutsourcedEmployee() {
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour, true);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public final Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

	@Override
	public StringBuilder resume() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + super.getName() + "\n");
		sb.append("Hours: " + super.getHours() + "\n");
		sb.append("Value per hour: " + super.getValuePerHour() + "\n");
		sb.append("Additional charge: " + additionalCharge +"\n");

		return sb;

	}
}
