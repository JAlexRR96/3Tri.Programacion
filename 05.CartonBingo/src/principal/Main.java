package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int[][]boleto=new int[3][9];
		int[][]aleatorio=new int[3][9];
		int[][]huecos=new int[3][9];

		aleatorio=generaaleatorios();
		
		//System.out.println(Arrays.deepToString(aleatorio));
	/*	
		for(int i=0;i<3;i++) {
			for(int x=0;x<9;x++) {
				System.out.print(aleatorio[i][x]);
				System.out.print("  ");
			}
			System.out.println();
		}*/
		
		huecos=generarhuecos();
		
	/*	for(int i=0;i<3;i++) {
			for(int x=0;x<9;x++) {
				System.out.print(huecos[i][x]);
				System.out.print("  ");
			}
			System.out.println();
		}*/
		
		boleto=generarboleto(aleatorio,huecos);
		
		for(int i=0;i<3;i++) {
			for(int x=0;x<9;x++) {
				System.out.print(boleto[i][x]);
				System.out.print("  ");
			}
			System.out.println();
		}
	}

	private static int[][] generarboleto(int[][] aleatorio, int[][] huecos) {
		// TODO Apéndice de método generado automáticamente
		int[][]boleto=new int[3][9];
		for(int i=0;i<3;i++) {
			for(int x=0;x<9;x++) {
				if(huecos[i][x]==-1) {
					boleto[i][x]=huecos[i][x];
				}else {
					boleto[i][x]=aleatorio[i][x];
				}
				
			}
		}
		return boleto;
	}

	private static int[][] generarhuecos() {
		
		boolean norepe=false;
		int ale=0;
		int[][]huecos=new int[3][9];
		for(int i=0;i<3;i++) {
			for(int x=0;x<4;x++) {
				do {
					norepe=false;
					ale=(int)Math.floor(Math.random()*(8-0+1)+0);
				} while (compruebahuecos(ale,huecos,i));
				huecos[i][ale]=-1;
			}
		}
		return huecos;
	
		
	}

	private static boolean compruebahuecos(int ale, int[][] huecos, int i) {
		// TODO Apéndice de método generado automáticamente
		boolean norepe=false;
		int cont=0;
			if(huecos[i][ale]==-1) {
			norepe=true;	
			}
			for(int x=0;x<3;x++) {
				if(huecos[x][ale]==-1) {
					cont++;
				}
			}
			if(cont==2) {
				norepe=true;
			}
			cont=0;
		return norepe;
	}

	private static int[][] generaaleatorios() {
		// TODO Apéndice de método generado automáticamente
		boolean norepe=false;
		int ale=0;
		int[][]aleatorio=new int[3][9];
		int sup=9, inf=1;
		int contador=0;
		List<Integer> columnas=new ArrayList<>();
		
		for(int g=0;g<9;g++) {
			for(int j=0;j<3;j++) {
				do {
					norepe=false;
					ale=(int)Math.floor(Math.random()*(sup-inf+1)+inf);
					for(int x=0;x<3;x++) {
						for(int i=0;i<9;i++) {
							if(aleatorio[x][i]==ale) {
							norepe=true;
							}
						}
		
					}
				} while (norepe);	
				aleatorio[j][g]=ale;
			}	
			if(contador==0) {
				inf=inf+9;
				sup=sup+10;
			}else if(contador==7) {
				sup=sup+11;
				inf=inf+10;
			}else {
				sup=sup+10;
				inf=inf+10;
			}
			contador++;
		}
		//System.out.println(contador);
		for(int g=0;g<9;g++) {
			for(int j=0;j<3;j++) {
				columnas.add(aleatorio[j][g]);
			}
		}	
		columnas.sort(null);
		contador=0;
		for(int g=0;g<9;g++) {
			for(int j=0;j<3;j++) {
				aleatorio[j][g]=columnas.get(contador);
				contador++;
			}
		}	
		
		return aleatorio;
		
	}

}
