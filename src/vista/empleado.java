/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Carlo
 */
public class empleado extends Persona{
    
    public empleado (String nombre, String apellidos, String direccion, String telefono, String fechaNacimiento, String sueldo, String bonificacion, String codigo){
    super(nombre, apellidos, direccion, telefono, fechaNacimiento, sueldo, bonificacion, codigo);
    
    }
    
    @Override
    protected String[] crear(){
        try {
            String[] datos = new String[8];
            datos[0] = getCodigo();
            datos[1] = getNombres();
            datos[2] = getApellidos();
            datos[3] = getDireccion();
            datos[4] = getTelefono();
            datos[5] = getFehca_nacimiento();
            datos[6] = getSueldo();
            datos[7] = getBonificacion();
            return datos;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
}
