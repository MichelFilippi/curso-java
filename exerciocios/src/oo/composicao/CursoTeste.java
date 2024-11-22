package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Carlos");
		Aluno aluno3 = new Aluno("Tales");
		
		Curso curso1 = new Curso("programador");
		Curso curso2 = new Curso("design");
		Curso curso3 = new Curso("mamador");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);	
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou no curso "+curso3+" Sou o "+ aluno.nome);
		}
		System.out.println(aluno1.cursos.get(2).alunos);
		
		Curso cursoEncontrado = aluno1.getCursoNome("mamador");
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
