package kr.hs.dgsw.oca.ch03;

public class Machine {
	private MachineState state;

	public MachineState getState() {
		return state;
	}

	public void setState(MachineState state) {
		this.state = state;
	}
}
