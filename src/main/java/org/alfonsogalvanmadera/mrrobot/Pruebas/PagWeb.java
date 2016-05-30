package org.alfonsogalvanmadera.mrrobot.Pruebas;

/**
 *
 * @author MBI
 */


public abstract class PagWeb {
    private String campoUsuario;
    private String campoPass;
    private String boton;
    private String cadena;
    

    public String getCampoUsuario() {
        return campoUsuario;
    }

    public void setCampoUsuario(String campoUsuario) {
        this.campoUsuario = campoUsuario;
    }

    public String getCampoPass() {
        return campoPass;
    }

    public void setCampoPass(String campoPass) {
        this.campoPass = campoPass;
    }

    public String getBoton() {
        return boton;
    }

    public void setBoton(String boton) {
        this.boton = boton;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    
    
    
    
}
