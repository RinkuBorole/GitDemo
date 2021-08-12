package interfac;

public class India implements traffic , control  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		traffic t =new India();
		t.greenGo();
		t.redStop();
		t.yellowflashing();
		
		India a = new India();
		a.walkinh();
		
		control c = new India();
		c.controls();
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Go");
	}

	@Override
	public void yellowflashing() {
		// TODO Auto-generated method stub
		System.out.println("wait");
	}
	
	public void walkinh() {
		System.out.println("walking");
	}

	@Override
	public void controls() {
		// TODO Auto-generated method stub
		System.out.println("control signal");
	}

}
