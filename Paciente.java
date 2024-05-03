public class Paciente{
    private int Edad;
    private String Sangre;
    private String ult_Cita;

    public Paciente(int edad,String sangre,String ult_cita){
        Edad=edad;
        Sangre=sangre;
        ult_Cita=ult_cita;
    
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getSangre() {
        return Sangre;
    }

    public void setSangre(String sangre) {
        Sangre = sangre;
    }

    public String getUlt_Cita() {
        return ult_Cita;
    }

    public void setUlt_Cita(String ult_Cita) {
        this.ult_Cita = ult_Cita;
    }

}