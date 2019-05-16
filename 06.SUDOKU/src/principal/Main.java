package principal;

import java.awt.EventQueue;

import formulario.frmSudoku;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
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

