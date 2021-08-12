package abstrac;

public class ChildAircraft extends AirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildAircraft c = new ChildAircraft();
		c.safty();
		c.guidliance();
		c.bodyColor();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("body color is red");
		
	}

}
