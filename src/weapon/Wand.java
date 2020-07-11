package weapon;

public class Wand {
	private String name;
	private double power;

	public double getPower() {
		return this.power;
	}

	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎます");
		} else {
			this.name = name;
		}
	}

	public void setPower(double power) {
		if(power < 0.5) {
			throw new IllegalArgumentException("値が小さすぎます");
		} else if(power > 100) {
			throw new IllegalArgumentException("値が大きすぎます");
		} else {
			this.power = power;
		}
	}
}
