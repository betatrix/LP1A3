public class Funcionario {
    private int id;
    private String nome;
    private double salario;
    private int horaEntrada;
    private int horaSaida;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome= nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Funcionario outro = (Funcionario) obj;
        return this.id == outro.id;
    }

}