import java.util.ArrayList;

public class Vendedor {

    String nombre;
    String apellido;
    String cedula;
    String direccion;
    ArrayList listaDeProductos;
    ArrayList ListaDeVendedores;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(ArrayList listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public ArrayList getListaDeVendedores() {
        return ListaDeVendedores;
    }

    public void setListaDeVendedores(ArrayList listaDeVendedores) {
        ListaDeVendedores = listaDeVendedores;
    }
}
