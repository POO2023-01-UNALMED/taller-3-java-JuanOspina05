package taller3.televisores;

public class TV {
    private static int _numTV = 0;
    private String _marca;
    private boolean _estado;
    private int _canal;
    private int _volumen;
    private int _precio;
    private Control _control;
  
    public TV(String marca, boolean estado) {
    this._marca = marca;
    this._estado = estado;
    this._canal = 1;
    this._volumen = 1;
    this._precio = 500;
    this._control = null;
    TV._numTV += 1;
}

public void setVolumen(int volumen) {
    this._volumen = volumen;
}

public int getVolumen() {
    return this._volumen;
}

public void setMarca(String marca) {
    this._marca = marca;
}

public String getMarca() {
    return this._marca;
}

public void setCanal(int canal) {
    if (this._estado && canal >= 1 && canal <= 120) {
        this._canal = canal;
    }
}

public int getCanal() {
    return this._canal;
}

public void turnOn() {
    this._estado = true;
}

public void turnOff() {
    this._estado = false;
}

public boolean getEstado() {
    return this._estado;
}

public void canalUp() {
    if (this._estado && this._canal < 120) {
        this._canal += 1;
    }
}

public void canalDown() {
    if (this._estado && this._canal > 1) {
        this._canal -= 1;
    }
}

public void volumenUp() {
    if (this._estado && this._volumen < 7) {
        this._volumen += 1;
    }
}

public void volumenDown() {
    if (this._estado && this._volumen > 0) {
        this._volumen -= 1;
    }
}

public void setControl(Control control) {
    this._control = control;
}

public Control getControl() {
    return this._control;
}

public void setPrecio(int precio) {
    this._precio = precio;
}

public int getPrecio() {
    return this._precio;
}

public static void setNumTV(int numTV) {
    TV._numTV = numTV;
}

public static int getNumTV() {
    return TV._numTV;
}
}
