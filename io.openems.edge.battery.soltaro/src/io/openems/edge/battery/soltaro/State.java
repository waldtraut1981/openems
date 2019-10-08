package io.openems.edge.battery.soltaro;

import io.openems.common.types.OptionsEnum;

public enum State implements OptionsEnum {
	UNDEFINED("Undefined", -1), //
	PENDING("Pending", 0), //
	OFF("Off", 1), //
	INIT("Initializing", 2), //
	RUNNING("Running", 3), //
	STOPPING("Stopping", 4), //
	ERROR("Error", 5), //	
	ERRORDELAY("Errordelay", 6), //
	ERROR_CELL_VOLTAGES_DRIFT("Error cell voltages drift", 7),  //
    ONE_CELL_DRIFTING("One cell is drifting", 8)
	;

	private State(String name, int value) {
		this.name = name;
		this.value = value;
	}

	private int value;
	private String name;

	@Override
	public int getValue() {
		return this.value;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public OptionsEnum getUndefined() {
		return UNDEFINED;
	}

}
