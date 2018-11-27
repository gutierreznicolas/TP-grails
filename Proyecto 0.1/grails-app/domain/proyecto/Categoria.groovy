package proyecto

class Categoria {
	String nombre;
	boolean isPadre;
	static hasMany =[subcategorias:Categoria]
	static belongsTo=[padre:Categoria]

    static constraints = {
    	padre nullable:true
    }
    String toString() { return nombre}
}
