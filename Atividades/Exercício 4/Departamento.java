import java.util.ArrayList;
import java.util.List;

public class Departamento<T extends Funcionario & Ponto>{
    private List<T> funcionariosPonto = new ArrayList<>();
    private List<Gerente> gerentes = new ArrayList<>();

    //add func e gerente
    public void adicionarFuncionario(T funcionario){
        funcionariosPonto.add(funcionario);
    }

    public void adicionarGerente(Gerente gerente){
        gerentes.add(gerente);
    }

    public List<Funcionario> listarFuncionarios(){
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.addAll(funcionariosPonto);
        return funcionarios;
    }

    public List<T> listarFuncionariosAtrasados(int horaReferencia){
        List<T> atrasado = new ArrayList<>();

        for (T funcionario : funcionariosPonto){
            if (funcionario instanceof Programador || funcionario instanceof Analista){
                if (funcionario.getHoraEntrada() > horaReferencia){
                    atrasado.add(funcionario);
                }
            }
        }
        return atrasado;
    }
}