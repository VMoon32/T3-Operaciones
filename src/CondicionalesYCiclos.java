public class CondicionalesYCiclos {
    public static void main(String[] args) {
        int i=0;
        while(i < args.length){
            if(args[i].equals("SUMA")){//Dependiendo del escrito hará la operación. TAMBIEN PUEDE SER CAMBIADO A ---SWITCH---
                int operation = Integer.parseInt(args[i + 1]) + Integer.parseInt(args[i + 2]); //Desarrollo de la operación
                System.out.println(args[i + 1] + " + " + args[i+2] + " = " + operation); //Expresión que se mostrará al usuario con los datos ya obtenidos
            }else if(args[i].equals("RESTA")){
                int operation = Integer.parseInt(args[i+1]) - Integer.parseInt(args[i+2]);
                System.out.println(args[i+1] + " - " + args[i+2] + " = " + operation);
            }else if(args[i].equals("MULTIPLICACION")){
                int operation = Integer.parseInt(args[i+1]) * Integer.parseInt(args[i+2]);
                System.out.println(args[i+1] + " * " + args[i+2] + " = " + operation);
            }else{
                int operation = Integer.parseInt(args[i+1]) / Integer.parseInt(args[i+2]);
                System.out.println(args[i+1] + " / " + args[i+2] + " = " + operation);
            }
            i+=3; // iteracion a plus valor
        }
    }
}