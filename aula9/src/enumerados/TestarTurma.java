package enumerados;

public class TestarTurma {

	public static void main(String[] args) {
		Turma t1 = new Turma("PHP", PeriodoDoCurso.MANHA);
		Turma t2 = new Turma("Front End", PeriodoDoCurso.INTEGRAL);
		
		System.out.println(t1.getCurso());
		System.out.println(t1 + " " + t1.getPeriodoDoCurso().getCargaHoraria());
		System.out.println(t2.getCurso());
		System.out.println(t2 + " " + t2.getPeriodoDoCurso().getCargaHoraria());
	}

}
