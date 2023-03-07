import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("curso java", "descrição curso java",8);
        Curso curso2 = new Curso("curso js","descrição curso js",4);
        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java",LocalDate.now());

        BootCamp bootCamp = new BootCamp("Bootcamp Java Developer","Descricao Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        System.out.println("-- Dev Adriano --");
        Dev devAdriano = new Dev("Adriano");
        devAdriano.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos Adriano:"+devAdriano.getConteudosInscritos());
        devAdriano.progredir();
        System.out.println("- Depois de progredir");
        System.out.println("Conteúdos Inscritos Adriano:"+devAdriano.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Adriano:"+devAdriano.getConteudosConcluidos());
        System.out.println("XP: "+devAdriano.calcularXp());

        System.out.println("-- Dev Camila --");
        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos Camila:"+devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("- Depois de progredir");
        System.out.println("Conteúdos Inscritos Camila:"+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila:"+devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularXp());


    }
}
