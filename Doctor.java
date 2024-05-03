public class Doctor{
    private String Nombre;
    private String Documento;
    private String U_Cita;

    public Doctor(String nombre,String documento,String u_cita){
        Nombre=nombre;
        Documento=documento;
        U_Cita=u_cita;
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public String getU_Cita() {
        return U_Cita;
    }

    public void setU_Cita(String u_Cita) {
        U_Cita = u_Cita;
    }

}