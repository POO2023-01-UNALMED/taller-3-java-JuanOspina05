package taller3.televisores;

public class TV {
	private Marca marca;
	Control control;
	private boolean estado;
	int canal = 1; 
	private int precio = 500; 
	int volumen = 1;
	private static int numTV;
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		numTV = numTV + 1;
	}
	
	public void volumenUp() {
		if(this.estado == true && volumen < 7) {
			volumen = volumen + 1;
		}
	}
	
	public void volumenDown() {
		if(this.estado == true && volumen > 0) {
			volumen = volumen - 1;
		}
	}
	
	public void turnOn() {
		this.estado = true;
		
	}
	
	public void turnOff() {
		this.estado = false;
		
	}
	
	public void setCanal(int canal) {
		if(this.estado == true && 1 <= canal && canal <= 120) {
			this.canal = canal;
		}
			
	}
	
    public void canalUp() {
		if(this.estado == true && canal < 120) {
			canal = canal + 1;
		}

	}
	
	public void canalDown() {
		if(this.estado == true && canal > 1) {
			canal = canal - 1;
		}
	}
    
	public boolean getEstado() {
		return this.estado;
		
	}
	
	public static int getNumTV() {
		return TV.numTV;
		
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
		
	}
	
	public int getPrecio() {
		return precio;
		
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
		
	}
	
	public int getVolumen() {
		return volumen;
		
	}
	
	public void setVolumen(int volumen) {
		if(estado == true && 0 <= volumen && volumen <= 7) {
			this.volumen = volumen;
		}
		
	}
	
	public int getCanal() {
		return canal;
		
	}
	
	public Marca getMarca() {
		return marca;
		
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
		
	}
	
	public Control getControl() {
		return control;
		
	}
	
	public void setControl(Control control) {
		this.control = control;
		
	}
	
}
