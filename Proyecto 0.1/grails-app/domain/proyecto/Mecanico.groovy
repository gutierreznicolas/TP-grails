package proyecto

class Mecanico {
	String nombre
	String apellido
	Double dni
	static hasMany =[arreglosAsignados:Arreglo]
    static constraints = {
    }
    String toString() { return nombre}
}
