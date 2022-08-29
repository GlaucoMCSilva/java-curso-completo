package entities;

public class Student {
	
	public String name;
	public double nota1; //vale 30
	public double nota2; //     35
	public double nota3; //     35
	
	public String toString() {
		return "FINAL GRADE = "+ String.format("%.2f\n", notaFinal()) + situacaoFinal();
	}
	
	public double notaFinal() {
		return nota1+nota2+nota3;
	}
	
	public double pontosFaltantes() {
		return 60 - notaFinal(); 
	}
	
	public String situacaoFinal() {
		if ( notaFinal() >= 60 ) {
			return "PASS";
		} else {
			return "FAILED\n"
					+ "MISSING "+ String.format("%.2f",pontosFaltantes()) + " POINTS";
		}
	}
	
	
}
