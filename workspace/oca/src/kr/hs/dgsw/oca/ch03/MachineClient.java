package kr.hs.dgsw.oca.ch03;

public class MachineClient {

	public static void main(String[] args) {
		
		Machine machine = new Machine();
		machine.setState(MachineState.IDLE);
		
		MachineState state = machine.getState();
		System.out.println("Current machine state is " + state);
		
		System.out.println("All machine state: ");
		for(MachineState ms : MachineState.values()){
			System.out.println(ms + ":" + ms.ordinal());
		}
	}

}
