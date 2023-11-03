package model;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author Lucas Rodríguez, Mario Plaza, Victor Ortega
 *
 */

@Data @Builder
public class Departamento {
	
	Integer codigoDepartamento;
	String nombre;
	Empleado jefe;
	
	@Override
	public String toString() {
		// Construir una cadena que representa el contacto con los atributos.
		return "\n" + String.format("%d | %s | %d", codigoDepartamento, nombre, jefe.getCodigoEmpleado()) ;
		
	}

}
