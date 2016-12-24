package builder;

public class TestRobotBuilder {

	public static void main(String[] args){
		// the old style robot "blueprint"
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		RobotDirector robotDirector = new RobotDirector(oldStyleRobot);
		
		
		robotDirector.makeRobot();
		Robot firstRobot = robotDirector.getRobot();
		
		System.out.println("Robot Built");
		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
		System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
		System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());

	}
	
}
