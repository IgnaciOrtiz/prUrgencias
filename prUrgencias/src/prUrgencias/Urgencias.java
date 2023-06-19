package prUrgencias;

import java.io.*;
import java.util.*;

public class Urgencias {
	private int diaIngreso;
	private int mesIngreso;
	private Collection <Ingreso> ingresos;
	
	public Urgencias(int diaIngreso, int mesIngreso) {
		this.diaIngreso = diaIngreso;
		this.mesIngreso = mesIngreso;
		ingresos = new ArrayList<>();
	}
	
	public void agregaServicio(Collection<Ingreso> ingresos) {
		this.ingresos.addAll(ingresos);
	}
	
	public int urgenciasAtendidas() {
        return ingresos.size();
    }
	
	public Collection<String> pacientesPorMedico(String idMedico) {
		List<String> pacientes = new ArrayList<String>();
		for (Ingreso i:ingresos) {
			if (idMedico.equals(i.getIdMedico())) {
				pacientes.add(i.getIdSegSocial());
			}
		}
		return pacientes;
	}
	
	public void presentaIngresos(String nombreFichero) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(nombreFichero);
		presentaIngresos(pw);
		pw.close();
	}
	
	public void presentaIngresos(PrintWriter flujoSalida) {
		flujoSalida.println(diaIngreso + "/" + mesIngreso + "/" + 2022);
		for (Ingreso p : ingresos) {
			flujoSalida.println(p.getHoraIngreso() + " " + p.getHoraAlta() + " " + p.getIdSegSocial() + " "
					+ p.getGradoUrgencia());
		}
	}
}
