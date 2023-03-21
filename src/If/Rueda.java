package If;

public class Rueda {
	private String tipo;
	private double grosor;
	private double diametro;
	private String marca;
	
	public Rueda () {}
	public Rueda (String tipo, double grosor, double diametro, String marca) {
		this.tipo= tipo;
		this.grosor = grosor;
		this.diametro= diametro;
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getGrosor() {
		return grosor;
	}
	public void setGrosor(double grosor) {
		this.grosor = grosor;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void comprobarDimensiones () {
		if (diametro >1.4)
		{		
			if (grosor <0.4){System.out.println ("El grosor para esta rueda es inferior al recomendado");}			
			System.out.println ("La rueda es para un vehiculo grando");
		}
		else if (diametro<= 1.4 || diametro > 0.8 )
		{	
			if (grosor <0.25) {System.out.println ("La rueda es para un vehículo mediano");}
			
			System.out.println ("El grosor para esta rueda es inferior al recomendado");
		}
		else 
		{
			System.out.println("La rueda es para un vehículo pequeño");
		}
		}
	}

