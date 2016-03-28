package grupo2.tpmacowins;

public class Prenda {
	private double precioBase;
	private static double valorNegocio;
	private Origen origen;
	
	public double PrecioFinal(){
		//Precio Final = (Valor fijo del negocio + Precio Base de la Prenda) x Tasa de Importación
		return ( (getValorNegocio() + this.getPrecioBase()) * this.getOrigen().tasaDeImportacion());
	}
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public static double getValorNegocio() {
		return valorNegocio;
	}

	public static void setValorNegocio(double valorNeg) {
		valorNegocio = valorNeg;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}
	
}
