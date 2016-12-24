package builder;

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder(){
		
		// create a new robot
		this.robot = new Robot();
	}
	
	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Firework arms");

	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Rollerskate legs");
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
