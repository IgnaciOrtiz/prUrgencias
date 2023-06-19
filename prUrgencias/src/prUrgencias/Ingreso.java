package prUrgencias;

public class Ingreso implements Comparable<Ingreso> {
	private Hora horaIngreso;
	private Hora horaAlta;
	private String idSegSocial;
	private String idMedico;
	private String gradoUrgencia;
	
	public Ingreso(Hora horaIngreso, Hora horaAlta, String idSegSocial, String idMedico, String gradoUrgencia) {
		this.horaIngreso = horaIngreso;
		this.horaAlta = horaAlta;
		this.idSegSocial = idSegSocial;
		this.idMedico = idMedico;
		this.gradoUrgencia = gradoUrgencia;
	}
	
	public Hora getHoraIngreso() {
		return horaIngreso;
	}

	public Hora getHoraAlta() {
		return horaAlta;
	}

	public String getIdSegSocial() {
		return idSegSocial;
	}

	public String getIdMedico() {
		return idMedico;
	}

	public String getGradoUrgencia() {
		return gradoUrgencia;
	}

	public boolean equals(Object o) {
		boolean res = o instanceof Ingreso;
		Ingreso obj = res ? (Ingreso) o : null;
		return res && horaIngreso.equals(obj.horaIngreso) && idSegSocial.equals(obj.idSegSocial);
	}
	
	public int hashCode() {
		return horaIngreso.hashCode() + idSegSocial.hashCode();
	}
	
	public int compareTo(Ingreso obj) {
		int resu = horaIngreso.compareTo(obj.horaIngreso);
		if(resu==0) {
			resu=idSegSocial.compareTo(obj.idSegSocial);
		}
		return resu;
	}

	@Override
	public String toString() {
		return "{" + horaIngreso + "-" + idSegSocial + "}";
	}
}
