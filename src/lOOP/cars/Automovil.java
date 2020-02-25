package lOOP.cars;

import libs.Input;

public class Automovil {
	
	//Atributos
	
	private String marca;
	private double velocidadActual;
	private double maximaVelocidad;
	private String tipoDeTransmision;
	private int numDePuertas;
	private int numDeLlantas;
	
	Automovil() {
		marca = "Ford";
		velocidadActual = 0.0;
		maximaVelocidad = 200.0;
		tipoDeTransmision = "Manual";
		numDePuertas = 2;
		numDeLlantas = 4;
	}
	
	Automovil(String marca, double maximaVel, String tipoTransmision, int numPuertas, int numLlantas) {
		this.marca = marca;
		this.velocidadActual = 0.0;
		this.maximaVelocidad = maximaVel;
		this.tipoDeTransmision = tipoTransmision;
		this.numDePuertas = numPuertas;
		this.numDeLlantas = numLlantas;
	}
	//comportamiento
	public void acelerar() {
		Input.print("run run\n");
		if (velocidadActual>maximaVelocidad-10) {
			velocidadActual=maximaVelocidad;
		}
		else
			
		velocidadActual= velocidadActual+10;
	}
	
	public void frenar() {
		Input.print("Screeeeech!\n");
		velocidadActual = 0;
	}
	
	public void retroceder() {
		Input.print("piii piii piii piii\n");
		velocidadActual= velocidadActual-10;
		//Tarea poner limite al frenado
	}
	
	public double getVelocidad() {
		return velocidadActual;
		
	}
	
	public void setVelocidad(double vel) {
		this.velocidadActual = vel;
	}
	

}
