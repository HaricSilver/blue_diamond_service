package com.bluediamond.gameplay;

import com.bluediamond.factory.DiamondMatrixFactory;
import com.bluediamond.model.BaseDiamond;

public class BlueDiamondGame {
	public static final int SIZE = 26;
	private BaseDiamond[][] diamondMatrix;

	public BlueDiamondGame() {
		diamondMatrix = new BaseDiamond[SIZE][SIZE];
		DiamondMatrixFactory.fillMatrix(diamondMatrix);
	}

	public void onStartGame() {

	}

	public void onEndGame() {

	}
	
	public BaseDiamond[][] getDiamondMatrix() {
		return diamondMatrix;
	}

}
