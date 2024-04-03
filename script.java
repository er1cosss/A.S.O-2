import java.util.Scanner;
import java.util.Locale;

public class script {

	public static void main(String [] args){
	
	Locale.setDefaultLocale(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Bem vindo !");
	System.out.print("Digite sua idade = ");
	
	String idade = sc.next();
	
	if (idade < 18) {
	System.out.println("Menor de idade");
	
	else {
	System.out.println("Maior de idade");

       }	
    }

}	
	
po

