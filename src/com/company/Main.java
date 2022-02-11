package com.company;

import com.company.dominio.Bootcamp;
import com.company.dominio.Curso;
import com.company.dominio.Dev;
import com.company.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Kotlin");
        curso2.setDescricao("Descrição curso Kotlin");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcampo Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJohn = new Dev();
        devJohn.setNome("John");
        devJohn.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de John: " + devJohn.getConteudosInscritos());
        devJohn.progredir();
        devJohn.progredir();
        System.out.println("-após conclusão-");
        System.out.println("Conteúdos inscritos de John: " + devJohn.getConteudosInscritos());
        System.out.println("Conteúdos concluidos de John: " + devJohn.getConteudosConcluidos());
        System.out.println("Xp: " + devJohn.calcularXpTotal());

        System.out.println("------");

        Dev devFelix = new Dev();
        devFelix.setNome("Felix");
        devFelix.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Felix: " + devFelix.getConteudosInscritos());
        devFelix.progredir();
        System.out.println("-após conclusão-");
        System.out.println("Conteúdos inscritos de Felix: " + devFelix.getConteudosInscritos());
        System.out.println("Conteúdos concluidos de Felix: " + devFelix.getConteudosConcluidos());
        System.out.println("Xp: " + devFelix.calcularXpTotal());




    }
}
