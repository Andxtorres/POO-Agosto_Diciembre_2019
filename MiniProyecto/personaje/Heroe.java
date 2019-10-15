package personaje;

public abstract class Heroe extends Personaje{
	public int xp;
	public Heroe(String nombre,int ataque, int defensa,int vida,int xp){
		super(nombre,ataque,defensa,vida);
		this.xp=xp;
	}
}