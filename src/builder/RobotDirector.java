package builder;

/**
 * <h1>RobotDirector</h1>
 * <p>The director accepts a new robotBuilder type (essentially a blueprint) and then <br>
 * proceeds to build a new robot from said blueprint</p>
 */

public class RobotDirector {
	
	private RobotBuilder robotBuilder;
	
	// constructor accepts new robot builder (can be of any type)
	public RobotDirector(RobotBuilder robotBuilder){
		this.robotBuilder = robotBuilder;
	}
	
	
	public Robot getRobot(){
		return this.robotBuilder.getRobot();
	}
	
	public void makeRobot(){
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
	}

}
