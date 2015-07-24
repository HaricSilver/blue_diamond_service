package com.bluediamond.model;

public class BaseDiamond {
	public enum DiamondType {
		RED, YELLOW
	}

	protected DiamondType type;

	public DiamondType getType() {
		return type;
	}

	public void setType(DiamondType type) {
		this.type = type;
	}

}
