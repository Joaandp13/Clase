import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alimentacio extends Producte {
	
	private LocalDate dataCaducitat;

	public Alimentacio(float preu, String nom, String codi, LocalDate datac) {
		super(preu, nom, codi);
		dataCaducitat = datac;
	}

	@Override
	public float getPreu() {
		float preu = super.getPreu();
		long dif;
		dif = ChronoUnit.DAYS.between(dataCaducitat,LocalDate.now());
		float descompte = (float) ((1.0 / (dif + 1)) + 0.1);
		return Math.max(preu * (1 - descompte), 0);
	}

	@Override
	public String toString() {
		return new String(getNom() + " " + getPreu());
	}



}
