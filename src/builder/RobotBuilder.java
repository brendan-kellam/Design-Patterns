package builder;

/**
 * The interface for building different robots
 */

public interface RobotBuilder {
	
	public void buildRobotHead();
	public void buildRobotTorso();
	public void buildRobotArms();
	public void buildRobotLegs();
	
	public Robot getRobot();
}
