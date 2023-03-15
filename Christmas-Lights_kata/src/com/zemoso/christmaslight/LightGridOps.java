package com.zemoso.christmaslight;

public class LightGridOps implements LightGridOpsInterface{

	@Override
	public int getNumberOfLightsSwitchedOn(int size, int[][] lightGridMatrix) {
		// TODO Auto-generated method stub
		 int lightsSwitchedOn=0;

	        for(int i=0;i<size;i++){
	            for(int j=0;j<size;j++){
	                if(lightGridMatrix[i][j]==1) lightsSwitchedOn++;
	            }
	        }

	        return lightsSwitchedOn;
	}

}
