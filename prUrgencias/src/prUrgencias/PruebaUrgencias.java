package prUrgencias;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaUrgencias {
	public static void main(String[] args) throws FileNotFoundException {
		Ingreso[] ingresos = { new Ingreso(new Hora(9, 15), new Hora(9, 30), "123415", "MI766", "MODERADO"),
				new Ingreso(new Hora(9, 15), new Hora(10, 30), "123543", "MI765", "LEVE"),
				new Ingreso(new Hora(9, 17), new Hora(9, 30), "123734", "TR454", "GRAVE"),
				new Ingreso(new Hora(10, 15), new Hora(10, 31), "123465", "TR325", "LEVE"),
				new Ingreso(new Hora(9, 10), new Hora(9, 20), "123261", "TR325", "LEVE") };

		Urgencias urg = new Urgencias(12, 7);
		urg.agregaServicio(Arrays.asList(ingresos));
		// System.out.println(urg.ingresosPorTiempoDeAtencion());
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el codigo del medico para buscar a los pacientes que ha atendido en urgencias: ");
		String codigo = sc.next();
		System.out.println(urg.pacientesPorMedico(codigo));
		sc.close();

		// Lectura desde fichero
		//urg.agregaServicio("datos.txt");  //ES OPCIONAL, NO ESCRIBIR SI NO LO HAS IMPLEMENTADO

		// Salida a fichero
		urg.presentaIngresos("salida.txt");

		// Salida a pantalla
		urg.presentaIngresos(new PrintWriter(System.out, true));

	}//fIN DEL MAIN
}//fin de la clase
