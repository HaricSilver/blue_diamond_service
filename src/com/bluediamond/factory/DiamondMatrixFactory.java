package com.bluediamond.factory;

import java.util.Random;

import com.bluediamond.model.BaseDiamond;
import com.bluediamond.model.BaseDiamond.DiamondType;

public class DiamondMatrixFactory {

	public static void fillMatrix(BaseDiamond[][] diamondMatrix) {
		Random rd = new Random();
		for (int i = 0; i < diamondMatrix.length; i++) {
			for (int j = 0; j < diamondMatrix[0].length; j++) {
				diamondMatrix[i][j] = new BaseDiamond();
				diamondMatrix[i][j].setType(randomDiamondType(rd));
			}
		}
	}

	private static DiamondType randomDiamondType(Random rd) {
		switch (rd.nextInt(9)) {
		case 0:
			return DiamondType.RED;
		case 1:
			return DiamondType.YELLOW;
		default:
			return DiamondType.YELLOW;
		}
	}

}
