package modelo;

public class Atendimento {
   //modelo de atendimento com determinados dados... construtor vazio e seus gatters e setters
  Paciente pessoa;
  int horaChegada;
  int minChegada;
  int minSaida;
  int horaSaida;
  double temperatura;
  int prioridade;
  String parecer;
  String data;
  public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

private int hAtend;
  private int mAtend;

    public int gethAtend() {
        return hAtend;
    }

    public void sethAtend(int hAtend) {
        this.hAtend = hAtend;
    }

    public int getmAtend() {
        return mAtend;
    }

    public void setmAtend(int mAtend) {
        this.mAtend = mAtend;
    }

  public Atendimento(){}

    public Atendimento(Paciente pessoa, String data, int horaChegada, int minChegada) {
        this.pessoa = pessoa;
        this.data = data;
        this.horaChegada = horaChegada;
        this.minChegada = minChegada;
    }
    public Paciente getPessoa() {
        return pessoa;
    }

    public void setPessoa(Paciente pessoa) {
        this.pessoa = pessoa;
    }

    public int getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(int horaChegada) {
        this.horaChegada = horaChegada;
    }

    public int getMinChegada() {
        return minChegada;
    }

    public void setMinChegada(int minChegada) {
        this.minChegada = minChegada;
    }

    public int getMinSaida() {
        return minSaida;
    }

    public void setMinSaida(int minSaida) {
        this.minSaida = minSaida;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getParecer() {
        return parecer;
    }

    public void setParecer(String parecer) {
        this.parecer = parecer;
    }
  
}
