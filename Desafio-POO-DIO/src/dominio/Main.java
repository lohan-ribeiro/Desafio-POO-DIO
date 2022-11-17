package dominio;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descriçao curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descriçao curso js");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descriçao mentoria java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp java developer");
    bootcamp.setDescricao("Descriçao Bootcamp java developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);
    System.out.println();

    Dev devLohan = new Dev();
    devLohan.setNome("lohan");
    devLohan.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos lohan: " + devLohan.getConteudosInscritos());
    System.out.println();
    devLohan.progredir();
    devLohan.progredir();
    System.out.println();
    System.out.println("Conteudos concluidos lohan: " + devLohan.getConteudosConcluidos());
    System.out.println("Conteudos inscritos lohan: " + devLohan.getConteudosInscritos());
    System.out.println("XP: " + devLohan.calculaTotalXp());

    System.out.println();

    Dev devCamila = new Dev();
    devCamila.setNome("camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos camila: " + devCamila.getConteudosInscritos());
    System.out.println();
    devCamila.progredir();
    devCamila.progredir();
    devCamila.progredir();
    System.out.println();
    System.out.println("Conteudos concluidos camila: " + devCamila.getConteudosConcluidos());
    System.out.println("Conteudos inscritos camila: " + devCamila.getConteudosInscritos());
    System.out.println("XP: " + devCamila.calculaTotalXp());

    /*System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);*/
  }
}
