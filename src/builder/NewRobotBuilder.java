package builder;

public class NewRobotBuilder implements RobotBuilder {
	
	private Robot robot;
	
	public NewRobotBuilder(){
		this.robot = new Robot();
		
	}
	
	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Titanium head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Diamond Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Carbon Fiber Arms");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Rocket legs");
	}

	@Override
	public Robot getRobot() {
		return robot;
	}

}
