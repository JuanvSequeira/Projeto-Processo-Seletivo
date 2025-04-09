package Candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
      String [] candidatos = {"Fernando","Josue","Juan","Debora","Jessica"};
      for(String candidato : candidatos) {
        entrandoEmContato(candidato);
      }
  }
  static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do{
      atendeu = atender();
      continuarTentando =! atendeu;
      if(continuarTentando){
      tentativasRealizadas++;
      }else
      System.out.println("Contato Realizado com sucesso");
    }while(continuarTentando && tentativasRealizadas< 3);
    if(atendeu){
      System.out.println("Conseguimos contato com " + candidato + " Na " + tentativasRealizadas + "° tentativa ");
    }else
    System.out.println("Não conseguimos contato com " + candidato + " , Numero maximo de tentativas " + tentativasRealizadas  );
  }
  static boolean atender(){
    return new Random().nextInt(3)== 1;
  }
  static void ImprimirSelecionados(){
    String [] candidatos = {"Fernando","Josue","Juan","Debora","Jessica"};
    System.out.println("Imprimir a Lista de candidatos imprimindo o índice");
    for(int indice = 0;indice < candidatos.length ; indice++){
      System.out.println("O candidato de n° " + (indice+1)+ " é o " + candidatos[indice]);
    }
  }

  static void selecaoCandidato(){
   String[] candidatos = {"Fernando","Josue","Juan","Debora","Jessica","Larissa","Lais","Osvaldo"};
   int candidatoSelecionado = 0;
   int candidatoAtual = 0;
   double salarioBase = 2000;
   
   while(candidatoSelecionado < 5 && candidatoAtual < candidatos.length){
    String candidato = candidatos[candidatoAtual];
    double salarioPretendido = valorPretendido();
   
    System.out.println("O candidato "+ candidato + " Solicitou esse valor "+ salarioPretendido);
   
    if(salarioBase >= salarioPretendido){
      System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
      candidatoSelecionado++;
    }
      candidatoAtual++;
    } 
  }
  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
  static void analisarCandidato(double salarioPretendido){
    double salarioBase = 2000;
    if(salarioBase > salarioPretendido){
      System.out.println("Ligar para candidato");
    }else if(salarioBase==salarioPretendido){
      System.out.println("Ligar para candidato com contra Proposta");
    }else{
      System.out.println("Aguardando os resultados das demais Candidaturas");
    }
  }
}
