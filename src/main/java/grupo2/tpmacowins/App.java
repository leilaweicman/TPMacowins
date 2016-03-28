package grupo2.tpmacowins;
import java.util.Date;
import java.util.Scanner;

public class App 
{
	private static Scanner in;
    public static void main( String[] args )
    {
    	RegistrarVentas();
    }
    
    public static void RegistrarVentas(){
    	Negocio macowins = new Negocio();
    	in = new Scanner(System.in);    	
    	String prenda;
    	int cantidad;
    	
    	System.out.println("Ingresar prenda (c: camisa, p: pantalon, s:saco)");
    	prenda = in.next();
    	while(!prenda.equals("terminar")){
        	System.out.println("Ingresar cantidad");
        	cantidad = in.nextInt();
        	
        	RegistrarVenta(prenda, cantidad, macowins);
        	
        	System.out.println("Ingresar prenda (c: camisa, p: pantalon, s:saco");
        	prenda = in.next();
    	}
    	System.out.println("terminó");   
    	for(int i=0; i<macowins.getVentas().size();i++){
    		System.out.println("La venta numero "+i+" fue de "+macowins.getVentas().get(i).getCantidad()+" "+macowins.getVentas().get(i).getPrenda() + " al precio de " + macowins.getVentas().get(i).getPrenda().PrecioFinal()+" cada una, el dia "+macowins.getVentas().get(i).getFecha().toString());
    	}
    	
    }
    
    public static void RegistrarVenta(String prenda, int cantidad, Negocio neg){
    	Venta v = new Venta();
    	v.setCantidad(cantidad);
    	v.setFecha(new Date());
    	Prenda.setValorNegocio(20);
		Prenda p = new Prenda();
		
		if(prenda.equals("c")){
			p= new Camisa();
			p.setOrigen(new Importada());
		}else if (prenda.equals("p")){
			p= new Pantalon();
			p.setOrigen(new Importada());
		}else if(prenda.equals("s")){
			p= new Saco();
			p.setOrigen(new Nacional());
		}			
		v.setPrenda(p);
		neg.registrarVenta(v);
    	System.out.println("Prenda agregada");
    }
}