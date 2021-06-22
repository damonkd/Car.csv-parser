package systemIOAssignment;

public class Car {
	private String car;
	private String mpg;
	private double mpgDouble;
	private String cylinders;
	private int cylindersInt;
	private String displacement;
	private double displacementDouble;
	private String horsepower;
	private double horsepowerDouble;
	private String weight;
	private double weightDouble;
	private String acceleration;
	private double accelerationDouble;
	private String model;
	private int modelInt;
	private String origin;
	/**
	 * @param car
	 * @param mpg
	 * @param cylinders
	 * @param displacement
	 * @param horsepower
	 * @param weight
	 * @param acceleration
	 * @param model
	 * @param origin
	 */
	public Car(String car, String mpg, String cylinders, String displacement, String horsepower, String weight,
			String acceleration, String model, String origin) {
		super();
		this.car = car;
		this.mpg = mpg;
		this.cylinders = cylinders;
		this.displacement = displacement;
		this.horsepower = horsepower;
		this.weight = weight;
		this.acceleration = acceleration;
		this.model = model;
		this.origin = origin;
	}
	/**
	 * @param car
	 * @param mpgDouble
	 * @param cylindersInt
	 * @param displacementDouble
	 * @param horsepowerDouble
	 * @param weightDouble
	 * @param accelerationDouble
	 * @param modelInt
	 * @param origin
	 */
	public Car(String car, double mpgDouble, int cylindersInt, double displacementDouble, double horsepowerDouble,
			double weightDouble, double accelerationDouble, int modelInt, String origin) {
		super();
		this.car = car;
		this.mpgDouble = mpgDouble;
		this.cylindersInt = cylindersInt;
		this.displacementDouble = displacementDouble;
		this.horsepowerDouble = horsepowerDouble;
		this.weightDouble = weightDouble;
		this.accelerationDouble = accelerationDouble;
		this.modelInt = modelInt;
		this.origin = origin;
	}
	/**
	 * 
	 */
	public Car() {
		super();
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getMpg() {
		return mpg;
	}
	public void setMpg(String mpg) {
		this.mpg = mpg;
	}
	public double getMpgDouble() {
		return mpgDouble;
	}
	public void setMpgDouble(double mpgDouble) {
		this.mpgDouble = mpgDouble;
	}
	public String getCylinders() {
		return cylinders;
	}
	public void setCylinders(String cylinders) {
		this.cylinders = cylinders;
	}
	public int getCylindersInt() {
		return cylindersInt;
	}
	public void setCylindersInt(int cylindersInt) {
		this.cylindersInt = cylindersInt;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	public double getDisplacementDouble() {
		return displacementDouble;
	}
	public void setDisplacementDouble(double displacementDouble) {
		this.displacementDouble = displacementDouble;
	}
	public String getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}
	public double getHorsepowerDouble() {
		return horsepowerDouble;
	}
	public void setHorsepowerDouble(double horsepowerDouble) {
		this.horsepowerDouble = horsepowerDouble;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public double getWeightDouble() {
		return weightDouble;
	}
	public void setWeightDouble(double weightDouble) {
		this.weightDouble = weightDouble;
	}
	public String getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(String acceleration) {
		this.acceleration = acceleration;
	}
	public double getAccelerationDouble() {
		return accelerationDouble;
	}
	public void setAccelerationDouble(double accelerationDouble) {
		this.accelerationDouble = accelerationDouble;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getModelInt() {
		return modelInt;
	}
	public void setModelInt(int modelInt) {
		this.modelInt = modelInt;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
	
}
