package view;

import controller.PotenciaController;

public class Potencia {
	public static void main(String[] args){
		PotenciaController imp = new PotenciaController();
		int retorno = imp.potencia(2,4);
		System.out.println("Total: " + retorno);
	}
}