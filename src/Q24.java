import java.util.ArrayList;
import java.util.List;

public class Q24 extends Main {

    public static void Alunoestacio() {

        double mediaaluno01;
        double mediaaluno02;
        double mediaaluno03;


        double total01 = 0;
        double total02 = 0;
        double total03 = 0;

        List<Double> Aluno01 = new ArrayList<>();
        List<Double> Aluno02 = new ArrayList<>();
        List<Double> Aluno03 = new ArrayList<>();


        System.out.print("Nota maxima 10\n");

        //armazenando notas
        for (int i = 1; i < 4; i++) {
            System.out.printf("Digite a AV%d do primeiro aluno: ", i);
            Aluno01.add(ler.nextDouble());
        }
        for (int i = 1; i < 4; i++) {
            System.out.printf("Digite a AV%d do segundo aluno: ", i);
            Aluno02.add(ler.nextDouble());
        }
        for (int i = 1; i < 4; i++) {
            System.out.printf("Digite a AV%d do terceiro aluno: ", i);
            Aluno03.add(ler.nextDouble());
        }


        //pegando as duas notas aluno01
        for (int i = 0; i < 2; i++) {
            total01 += Aluno01.get(i);
        }
        //pegando as duas notas aluno02
        for (int i = 0; i < 2; i++) {
            total02 += Aluno02.get(i);
        }
        //pegando as duas notas aluno03
        for (int i = 0; i < 2; i++) {
            total03 += Aluno03.get(i);
        }



        //System.out.print(total);
        //verificando se está na media com av1 e av2 6
        mediaaluno01 = total01 /2;
        mediaaluno02 = total02 /2;
        mediaaluno03 = total03 /2;

        //zerandos os totais
        total01 = 0;
        total02 = 0;
        total03 = 0;


        if (mediaaluno01 >= 6) {
            System.out.printf("\nO aluno 01 está na media com %.2f, \nAPROVADO", mediaaluno01);
        }
        else{
            Aluno01.remove(Menor(Aluno01));
            for (int i = 0; i < 2; i++) {
                total01 += Aluno01.get(i);
            }
            mediaaluno01 = total01/2;

            if (mediaaluno01 >= 6) {
                System.out.printf("\n\n\nO aluno 01 está na media com %.2f, \nAPROVADO", mediaaluno01);
            }
            else{
                System.out.printf("\n\n\nO aluno 01 nao ta na media com %.2f, \nREPROVADO", mediaaluno01);
            }
        }
        if(mediaaluno02 >= 6){
            System.out.printf("\nO aluno 02 está na media com %.2f, \nAPROVADO", mediaaluno02);
        }
        else{
            Aluno02.remove(Menor(Aluno02));
            for (int i = 0; i < 2; i++) {
                total02 += Aluno02.get(i);
            }
            mediaaluno02 = total02/2;

            if (mediaaluno02 >= 6) {
                System.out.printf("\nO aluno 02 está na media com %.2f, \nAPROVADO", mediaaluno02);
            }
            else{
                System.out.printf("\nO aluno 02 nao ta na media com %.2f, \nREPROVADO", mediaaluno02);
            }
        }
        if(mediaaluno03 >= 6){
            System.out.printf("\nO aluno 03 está na media com %.2f, \nAPROVADO", mediaaluno03);
        }
        else{
            Aluno03.remove(Menor(Aluno03));
            for (int i = 0; i < 2; i++) {
                total03 += Aluno03.get(i);
            }
            mediaaluno03 = total03/2;

            if (mediaaluno03 >= 6) {
                System.out.printf("\nO aluno 03 está na media com %.2f, \nAPROVADO", mediaaluno03);
            }
            else{
                System.out.printf("\nO aluno 03 nao ta na media com %.2f, \nREPROVADO", mediaaluno03);
            }
        }

    }
        public static double Menor(List<Double> notas){

            double menor;

            menor = notas.get(0);

            for(Double i: notas){
                if(i < menor){
                    menor = i;
                }
            }

            return menor;
        }





}
