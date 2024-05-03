import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class inicio {
    public static void main(String[] args) {
        LinkedList<Paciente> listaPaciente= new LinkedList<>();
        String cadena="";
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            Paciente paciente=new Paciente(0, null, null);
            System.out.println("Ingrese la edad del paciente");
            paciente.setEdad(sc.nextInt());
            sc.nextLine();
            System.out.println("Ingrese el tipo de sangre del paciente");
            paciente.setSangre(sc.nextLine());
            System.out.println("Ingrese la fecha de la ultima cita del paciente");
            paciente.setUlt_Cita(sc.nextLine());
            listaPaciente.add(paciente);
        }

        for(Paciente paciente:listaPaciente){
            cadena=cadena + paciente.getEdad()+ "\n" + paciente.getSangre() + "\n" + paciente.getUlt_Cita();
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
}