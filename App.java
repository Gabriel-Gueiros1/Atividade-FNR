public class App {
        public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Carlos", 1);
        Aluno aluno2 = new Aluno("Julia", 2);
        Aluno aluno3 = new Aluno("Marcio", 3);
        Aluno aluno4 = new Aluno("Jonathan", 4);
        Aluno aluno5 = new Aluno("Josias", 5);
        Aluno aluno6 = new Aluno("Josias", 5);

        iAlunoRepository repositorio = new iAlunoRepository();

        repositorio.adicionar(aluno1);
        repositorio.adicionar(aluno2);
        repositorio.adicionar(aluno3);
        repositorio.adicionar(aluno4);
        repositorio.adicionar(aluno5);
        repositorio.adicionar(aluno6);

        repositorio.listar();

    }
}
