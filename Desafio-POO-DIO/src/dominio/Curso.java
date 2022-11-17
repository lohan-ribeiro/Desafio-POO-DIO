package dominio;

public class Curso extends Conteudo{
  
  private int cargaHoraria;

  public Curso(){}

  @Override
  public double calcularXp() {
    
    return XP_PADRAO * cargaHoraria;
  }

  public int getCargaHoraria(){
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria){
    this.cargaHoraria = cargaHoraria;
  }

  public String toString(){
    return "Curso{" + "titulo='" + getTitulo() + "'" 
            + ", descriçao='" + getDescricao() + "'" 
            + ", carga horaira=" + cargaHoraria + "}";
  }



  
}

