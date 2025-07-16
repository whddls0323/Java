package sub8;

public class RemoteLG implements RemoteControl {

	@Override
	public void powerOn() {		
		System.out.println("LG powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("LG powerOff...");
	}

	@Override
	public void chup() {
		System.out.println("LG shup...");
	}

	@Override
	public void chDown() {
		System.out.println("LG chDown...");
	}

	@Override
	public void soundUp() {		
		System.out.println("LG soundUp...");
	}

	@Override
	public void soundDown() {	
		System.out.println("LG soundDown...");
	}
}
