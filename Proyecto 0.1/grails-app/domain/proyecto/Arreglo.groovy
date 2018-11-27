package proyecto

class Arreglo {
	String observaciones;
	static hasMany = [repuestos:Repuesto]
	static belongsTo=[mecanico: Mecanico ,tipo:Tipoarreglo]

    static constraints = {
    }
    String toString() { return id
    }
}
