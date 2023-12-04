import java.util.ArrayList;

public class iAlunoRepository implements Interface{
    ArrayList<Aluno> Aluno = new ArrayList<Aluno>();

    public void listar(){
        for( Aluno aluno : Aluno){
            System.out.println(aluno.getNome() + " : "+ aluno.getMatricula());
        } 
    }
    public void adicionar(Aluno aluno){
        Aluno.add(aluno);
    }

    // return>-1 achou o aluno   -----   return < 0 não achou 
    public int busca(String nome){
        for(Aluno aluno : Aluno){
            if(aluno.getNome().equals(nome)){
                return Aluno.indexOf(aluno);
            }
        }
        return -1;
    }

    public void remover(String nome){
        int busca = this.busca(nome);
        if (busca > -1) {
            Aluno.remove(Aluno.get(busca));
            System.out.println("Aluno removido com sucesso!");
            System.out.println("Alunos Restantes:");
            this.listar();
        }
        else{
            System.out.println("Aluno não cadastrado no sistema!");
        }
    }

    public void buscar(String nome){
        int busca = this.busca(nome);

        if (busca > -1) {
            System.out.println("Aluno encontrado!");
        }
        else{
            System.out.println("Aluno não cadastrado no sistema!");
        }
    }
}