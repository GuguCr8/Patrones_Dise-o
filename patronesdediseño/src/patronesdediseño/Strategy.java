package patronesdediseño;

/* Define una familia de algoritmos intercambiables, los cuales permiten variar su compor
 * sin importar el cliente que los use.
 * 
 * Es similar al PDEstado, pero el Patron Strategy encapsula un algoritmo y no el estado de un contexto*/
public class Strategy {

	public interface Algoritmo{
		public void moverse();
	}
	
	
	public class EnTierra implements Algoritmo{
		@Override 
		public void moverse(){
			System.out.println("Moviendose sobre ruedas");
		}
	}
	
	
	public class EnAire implements Algoritmo{
		@Override 
		public void moverse(){
			System.out.println("Volando en los aires");
		}
	}
	
	public class EnAireVeloz implements Algoritmo{
		// Los override son una buena practica en la sobrescritura de los metodos.
		@Override 
		public void moverse(){
			System.out.println( "Volando muy rapido!!");
		}
	}
	
	// Clase abstracta 
	
	public abstract class Avion { 
		private Algoritmo miAlgoritmo;
		
		public void setAlgoritmo(Algoritmo a){
			this.miAlgoritmo = a ;
		}
		
		public void mover(){
			this.miAlgoritmo.moverse();
		}
	}
	
	public class AvionComercial extends Avion{
		public AvionComercial(){
			
		}
	}
	
	public class AvionRapido extends Avion{
		public AvionRapido(){
			
		}
	}

}
