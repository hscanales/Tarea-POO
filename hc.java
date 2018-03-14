public class hc{
	String nombre,apellido,carrera,correo,carne,nacimiento,redessociales;
	int edad;


	hc(String nombre, String apellido, String carrera,String correo, int edad, String carne,String nacimiento,String redessociales){
		this.nombre=nombre;
		this.apellido=apellido;
		this.carrera=carrera;
		this.edad=edad;
		this.correo=correo;
		this.carne=carne;
		this.nacimiento=nacimiento;
		this.redessociales=redessociales;
	}
	public void print(){
		System.out.println("Mis datos son:");
		System.out.println("Nombre: " + nombre +" "+ apellido);
		System.out.println("Mi correo es: "+ correo);
		System.out.println("Estudio: " + carrera);
		System.out.println("Mi Carne es: " + carne);
		System.out.println("Tengo "+edad+" anios");
		System.out.println("Naci el: "+nacimiento)
		System.out.println("Encuentrame en redes sociales como: "+redessociales)
	}
}