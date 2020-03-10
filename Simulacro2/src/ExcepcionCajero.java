
public class ExcepcionCajero extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensaje;
	public ExcepcionCajero(int cantidad) {
		super();
		this.setMensaje("Actualmente no dispone de efectivo suficiente para satisfacer la cantidad de" + Integer.toString(cantidad));
		
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void añadirMensaje(String newMessage){
        this.setMensaje(this.getMensaje()+newMessage);
    }
}
