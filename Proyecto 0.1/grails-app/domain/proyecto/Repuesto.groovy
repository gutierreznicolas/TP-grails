package proyecto

class Repuesto {
	String nombre;
	String marca;
	String especificacion;
	byte[] foto;
	Double precio;
	String datosRemito;
	Double costoDeFabrica
	Integer stock
	static belongsTo=[categoria:Categoria]

    static constraints = {
    	categoria nullable:true
    	foto nullable:true
    }
    String toString() { return nombre}
}
