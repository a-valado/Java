package Practica6_2;

public class ExcepcionMayus extends Exception{
	@Override
	public String getMessage() {
		String mensaje ="El nombre y el apellido deben ir en mayúsculas.";
		return mensaje;
	}
}
