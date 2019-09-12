package main;

public class ejercicio {
	
	static int [][] matIni = {{0,0,0,0,0,0},{0,0,0,1,0,0},{0,1,0,0,0,1},{0,0,1,0,0,0},{0,0,0,0,1,0},{1,0,0,0,0,0}};
	int [] vecIni = {0,0,0,0,0,1};
	static int vecMult [] = new int [6];
	
	public static void main (String [ ] args) {
		cambioEst();
		
	}
	
	
	
	public static void MultiVecMat(int[][] matIni2, int[] vecEst) {
		
		for (int i =0; i<6; i++) {
			int sum = 0;
			for (int j = 0; j<6; j++) {
				sum += vecEst[j] * matIni2[j][i];
			}
			vecMult[i] = sum;
		}
		
	}
	
	public static void cambioEst() {
		
		int [] vecEst = vecMult;
		for(int i=0; i<2019; i++) {
			MultiVecMat(matIni, vecEst);
		}
		
		for(int i=0; i<6; i++) {
			System.out.println(vecMult[i]);
		}
		
	}
	
	

}
