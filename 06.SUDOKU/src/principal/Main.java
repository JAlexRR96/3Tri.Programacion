package principal;

import java.awt.EventQueue;

import formulario.frmSudoku;

public class Main {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						frmSudoku frame = new frmSudoku();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

