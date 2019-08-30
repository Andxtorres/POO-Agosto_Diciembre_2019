public class Usuario{
	private String correo;
	private String contrasenia;

	public String getCorreo(){
		return correo;
	}

	public void setCorreo(String correo){
		this.correo=correo;
	}

	public String getContrasenia(){
		return contrasenia;
	}

	public void setContrasenia(String contrasenia){
		this.contrasenia=contrasenia;
	}

	public boolean login(String correoLogin, String contraseniaLogin){
		if(correo.equals(correoLogin)&&contrasenia.equals(contraseniaLogin)){
			return true;
		}
		return false;
	}

}