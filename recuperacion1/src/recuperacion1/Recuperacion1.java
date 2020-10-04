package recuperacion1;
import java.util.Scanner;
import java.util.Stack;
public class Recuperacion1 {
    int i=0;
        public void braketparentesis(){
      Scanner sc = new Scanner (System.in);
      System.out.println("Introduce tu bracket : ");
      String entrada =sc.next();
      Stack <Character>pila = new <Character>Stack();
      int i=0;
      int tam = entrada.length();
      while(i<tam){
          if(entrada.charAt(i) == '(')
              pila.push('(');
          else{
              if(pila.isEmpty())
                  break;
              else
                  pila.pop();
          }
              i++;
      }
      if(pila.isEmpty() & i==tam)
          System.out.println("Cadena Valida");
      else
          System.out.println("Cadena no Valida");
        }
        public void braketllave(){
      Scanner sc = new Scanner (System.in);
      System.out.println("Introduce tu bracket : ");
      String entrada =sc.next();
      Stack <Character>pila = new <Character>Stack();
      int i=0;
      int tam = entrada.length();
      while(i<tam){
          if(entrada.charAt(i) == '[')
              pila.push('[');
          else{
              if(pila.isEmpty())
                  break;
              else
                  pila.pop();
          }
              i++;
      }
      if(pila.isEmpty() & i==tam)
          System.out.println("Cadena Valida");
      else
          System.out.println("Cadena no valida");
        }
        public void braketcorchete(){
      Scanner sc = new Scanner (System.in);
      System.out.println("Introduce tu bracket : ");
      String entrada =sc.next();
      Stack <Character>pila = new <Character>Stack();
      int i=0;
      int tam = entrada.length();
      while(i<tam){
          if(entrada.charAt(i) == '{')
              pila.push('{');
          else{
              if(pila.isEmpty())
                  break;
              else
                  pila.pop();
          }
              i++;
      }
      if(pila.isEmpty() & i==tam)
          System.out.println("Cadena valida");
      else
          System.out.println("Cacadena no valida");
        }
        public void braketvarios(){
      Scanner sc = new Scanner (System.in);
      System.out.println("Introduce tu bracket : ");
      String entrada =sc.next();
      Stack <Character>pila = new <Character>Stack();
      int i=0;
      int tam = entrada.length();
      while(i<tam){
          if(entrada.charAt(i) == '(')
              pila.push('(');
          else{
              if(pila.isEmpty())
                  break;
              else
                  pila.pop();
          }
              i++;
      }
      while(i<tam){
          if(entrada.charAt(i) == '[')
              pila.push('[');
          else{
              if(pila.isEmpty())
                  break;
              else
                  pila.pop();
          }
              i++;
      }
      while(i<tam){
          if(entrada.charAt(i) == '{')
              pila.push('{');
          else{
              if(pila.isEmpty())
                  break;
              else
                  pila.pop();
          }
              i++;
      }
      if(pila.isEmpty() & i==tam)
          System.out.println("Cadena no valida");
      else
          System.out.println("Cadena valida");
        }
    public static void main(String[] args) {
        Recuperacion1 c = new Recuperacion1();
        Scanner sc = new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("B R A C K E T S");
            System.out.println("Menu\n"
                    + "1- Llenar bracket parentesis\n"
                    + "2- Llenar bracket llaves\n"
                    + "3- Llenar bracket corchetes\n"
                    + "4- Llenar bracket varios\n"
                    + "5- Salir");
            switch(opcion= sc.nextInt()){
                case 1:
                    c.braketparentesis();
                    break;
                case 2:
                    c.braketllave();
                    break;
                case 3:
                    c.braketcorchete();
                    break;
                case 4:
                    c.braketvarios();
                    break;
            }
        }while (opcion != 5);
    }    
}


