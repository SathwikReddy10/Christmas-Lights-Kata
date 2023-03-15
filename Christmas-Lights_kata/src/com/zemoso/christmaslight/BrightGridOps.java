package com.zemoso.christmaslight;

public class BrightGridOps implements BrightGridOpsInterface{

	@Override
	public int getBrightnessOfLightGrid(int size, int[][] lightGridMatrix) {
		// TODO Auto-generated method stub
		int brightness=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                brightness+=lightGridMatrix[i][j];
            }
        }

        return brightness;
	}

}
