package personaje;

public abstract class Personaje{

	public String nombre;
	public int ataque;
	public int defensa;
	public int vida;

	public Personaje(String nombre,int ataque, int defensa,int vida){
		this.nombre=nombre;
		this.ataque=ataque;
		this.defensa=defensa;
		this.vida=vida;
	} 

	public abstract void atacar(Personaje personaje);

}