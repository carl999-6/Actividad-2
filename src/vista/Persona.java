/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author David Valenzuela
 */
public class Persona {
    //atributos
    private String codigo,nombres,apellidos,direccion,telefono,fehca_nacimiento, sueldo, bonificacion;
    //constructores
    public Persona(){}
        public Persona(String nombre, String apellidos, String direcciones, String telefono, String fehca_nacimiento, String sueldo, String bonificacion, String codigo) {
        this.nombres = nombre;
        this.apellidos = apellidos;
        this.direccion = direcciones;
        this.telefono = telefono;
        this.fehca_nacimiento = fehca_nacimiento;
        this.codigo = codigo;
        this.sueldo = sueldo;
        this.bonificacion = bonificacion;

            }

   


//merodos Crud
protected String[] crear(){return null;}
   protected void leer(){}
   protected void modificar(){}
   protected void eliminar(){}

   
    //metodos
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFehca_nacimiento() {
        return fehca_nacimiento;
    }

    public void setFehca_nacimiento(String fehca_nacimiento) {
        this.fehca_nacimiento = fehca_nacimiento;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(String bonificacion) {
        this.bonificacion = bonificacion;
    }
}
