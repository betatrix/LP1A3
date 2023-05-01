public class Analista extends Funcionario implements Ponto{
    public Analista( int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void horaEntrada(int horaEntrada) {
        setHoraEntrada(horaEntrada);
    }
    @Override
    public void horaSaida(int horaSaida) {
        setHoraSaida(horaSaida);
    }

}