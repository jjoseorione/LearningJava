
package logica;

/**
 *
 * @author xmx7265
 */
public class Usuario {
    private String curp;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

    public Usuario(String curp, String nombre, String apellido, String correo, String telefono) {
        this.curp = curp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getCurp() {
        return curp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
