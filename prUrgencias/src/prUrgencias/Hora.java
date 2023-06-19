package prUrgencias;

public class Hora implements Comparable<Hora> {
	private int hora;
	private int minutos;

	public Hora(int h, int m) {
		if (h >= 0 && h <= 23 && m > 0 && m <= 59) {
			hora = h;
			minutos = m;
		}
	}

	public int getHora() {
		return hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public boolean equals(Object o) {
		boolean res = o instanceof Hora;
		Hora obj = res ? (Hora) o : null;
		return res && hora == obj.hora && minutos == obj.minutos;
	}

	public int hashCode() {
		return hora + minutos;
	}

	public int compareTo(Hora obj) {
		int resu = Integer.compare(hora, obj.hora);
		if (resu == 0) {
			resu = Integer.compare(minutos, obj.minutos);
		}
		return resu;
	}
	
	public int diferenciaMinutos(Hora hora) {
		int minutos1=this.hora*60 + minutos;
		int minutos2=hora.hora*60 + hora.minutos;
		return Math.abs(minutos1-minutos2);
	}

	@Override
	public String toString() {
		return  "[" + hora + ":" + minutos + "]";
	}
}
