/**
 * 
 */
package com.unab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 * @author Luis Zenteno, Barbara Carvajal
 * @version 1.1
 * 
 * Esta sub clase heredada de Persona utilizara los siguientes parametros para cada metodo:
	 * @param mensaje se muestra al usuario para solicitar el ingreso del valor que guardará cada atributo.
	 * @param sc Scanner para la entrada de datos por parte del usuario.
	 * @return La cadena de caracteres correspondiente al valor ingresado, validado y asignado a cada atributo.
 */
public class Usuario extends Persona {
	
	String nombre, fechaNac;
	
	/**
	 * Constructor que instancia la clase, incluyendo super que llama a la superclase.
	 */
	public Usuario() {
		super();
	}
	
	
	/**
	 * Metodo que valida la fecha con el uso de la clase SimpleDateFormat en formato dd-mm-yyyy
	 */
	public String validarFecha(String mensaje, Scanner sc) {
		
		boolean condFecha = true;
		String input = "";
		
		while(condFecha) {
			
			System.out.print("\n" + mensaje);
			input = sc.nextLine();
			
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	        format.setLenient(false); // establecer en falso para validación estricta

	        try {
	            format.parse(input);
	            condFecha = false;
	            
	        } catch (ParseException e) {
	            System.out.println(input + " no es una fecha válida, intentalo nuevamente");
	        }
		}
		return input;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNac=" + fechaNac + ", rut=" + rut + "]";
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the fechaNac
	 */
	public String getFechaNac() {
		return fechaNac;
	}

	
	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
}
