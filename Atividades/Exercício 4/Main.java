import java.util.List;


public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente(01, "Carlinhos", 20000.00);
        Programador p1 = new Programador(11, "Beatriz Andrade", 6000.00);
        Programador p2 = new Programador(12, "Josué Tavares", 6000.00);
        Analista a1 = new Analista(21, "João Gabriel", 7000.00);
        Analista a2 = new Analista(22, "Bruna Daniele", 7000.00);

        p1.horaEntrada(13);
        p1.horaSaida(18);
        p2.horaEntrada(9);
        p2.horaSaida(19);
        a1.horaEntrada(10);
        a1.horaSaida(16);
        a2.horaEntrada(9);
        a2.horaSaida(18);


        Departamento departamentoTecno = new Departamento<>();
        departamentoTecno.adicionarGerente(g1);
        departamentoTecno.adicionarFuncionario(p1);
        departamentoTecno.adicionarFuncionario(p2);
        departamentoTecno.adicionarFuncionario(a1);
        departamentoTecno.adicionarFuncionario(a2);


        String formato = "%1$-2s %2$-20s %3$-19s %4$-15s";

        System.out.println("DEPARTAMENTO DE TECNOLOGIA");
        System.out.printf(formato, "ID", " | NOME" , " | HORA DE ENTRADA", " | SALÁRIO");
        List<Funcionario> funcionarios = departamentoTecno.listarFuncionarios();
        System.out.println(" ");

        for (Funcionario funcionario : funcionarios) {
            System.out.printf(formato, funcionario.getId(),
                    " | " + funcionario.getNome(),
                    " | " + funcionario.getHoraEntrada() + "h",
                    " | " + funcionario.getSalario());

            System.out.println();
        }


        String formato2 = "%1$-2s %2$-20s %3$-19s";

        //Atrasados
        List<Funcionario> atrasados = departamentoTecno.listarFuncionariosAtrasados(9);
        System.out.println("\nFUNCIONÁRIOS ATRASADOS:");


        for (Funcionario atrasado : atrasados) {
            System.out.printf(formato2, atrasado.getId(),
                                 " | " + atrasado.getNome(),
                                 " | " + atrasado.getHoraEntrada() + "h");
            System.out.println(" ");
        }
    }
}