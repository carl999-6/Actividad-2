/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author David Valenzuela
 */
public class Cliente extends Persona{
    private String nit;
    
    public Cliente(){}
    public Cliente(String nit, String nombre, String apellidos, String direcciones, String telefono, String fehca_nacimiento) {
        super(nombre, apellidos, direcciones, telefono, fehca_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    @Override
    protected String[] crear(){
        try{
            String datos[] = new String[6];
            datos[0] = getNit();
            datos[1] = getNombre();
            datos[2] = getApellidos();
            datos[3] = getDireccion();
            datos[4] = getTelefono();
            datos[5] = getFehca_nacimiento();
            return datos;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return null;
    
    }
    
}
