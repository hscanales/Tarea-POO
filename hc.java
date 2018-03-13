public class hc{
	String nombre,apellido,carrera,correo,carne;
	int edad;


	hc(String nombre, String apellido, String carrera,String correo, int edad, String carne){
		this.nombre=nombre;
		this.apellido=apellido;
		this.carrera=carrera;
		this.edad=edad;
		this.correo=correo;
		this.carne=carne;
	}
	public void print(){
		System.out.println("Mis datos son:");
		System.out.println("Nombre: " + nombre +" "+ apellido);
		System.out.println("Mi correo es: "+ correo);
		System.out.println("Estudio: " + carrera);
		System.out.println("Mi Carne es: " + carne);
		System.out.println("Tengo "+edad+" anios");
	}
}