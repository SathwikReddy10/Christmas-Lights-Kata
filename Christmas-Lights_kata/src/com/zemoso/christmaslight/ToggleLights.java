package com.zemoso.christmaslight;

public class ToggleLights implements LightGridInterface{

	@Override
	public void toggle(int turnStatus, int[][] lightGridMatrix, int xStart, int yStart, int xDestination,
			int yDestination) {
		for(int i=xStart;i<=xDestination;i++){
            for(int j=yStart;j<=yDestination;j++){
                lightGridMatrix[i][j]=lightGridMatrix[i][j]==0?1:0;
            }
        }
		
	}

}
