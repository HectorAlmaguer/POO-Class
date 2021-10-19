package com.generation;

public class Main {

    public static void main(String[] args) {
	    Perro lomito = new Perro();
	    lomito.nombre = "Cheems";
	    lomito.edad = 6;
	    lomito.raza = "Callejera";
		lomito.tamanio = "wrande";
		lomito.caracteristicas();
		lomito.dormir();

		Perro lomito2= new Perro();

		lomito2.nombre = "Firulais";
		lomito2.edad = 2;
		lomito2.raza = "PUG";
		lomito2.tamanio = "Chiquitillo";

		lomito2.caracteristicas();
		lomito2.jugar();

		Perro lomito3 = new Perro("milaneso","Husky",4,"Gigante")
    }
}
