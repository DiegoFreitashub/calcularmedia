import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	double P1,P2,P3,P4,PF;
	double N1,N2,NS,NF;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe as notas das provas");
	
	System.out.println("P1: ");
	P1 = sc.nextDouble();
	
	System.out.println("P2: ");
	P2 = sc.nextDouble();
	
	System.out.println("P3: ");
	P3 = sc.nextDouble();
	
	System.out.println("P4: ");
	P4 = sc.nextDouble();
	
	N1 = ((P1 + P2)/2);
	N2 = ((P3 + P4)/2);
	NS = ((N1 + N2)/2);
	
	if (NS>=7){
		System.out.println("Aprovado, nota Final: "+ NS);
	
	}else {
		if (NS>4){
			
			System.out.println("PF: ");
			PF = sc. nextDouble();
			NF = ((NS+PF)/2);
			
			if(NF>5) {
				System.out.println("Aprovado, nota final: " + NF);
			}
			else { 
				System.out.println("Reprovado, nota final: " + NF);
			
			
				}

			}
	
	else {
		
		System.out.println("Reprovado, nota final: " + NS);
		}
	}
	sc.close();

}
}