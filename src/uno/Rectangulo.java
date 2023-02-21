package uno;

	import java.util.Iterator;
import java. util. Scanner;
	public class Rectangulo{
	     public static void main(String[] args) {
	         Scanner in = new Scanner (System. in);
	         int opcion=1;
	         do {
	              System.out.println("----menu-----\n");
	              System.out.println("1. DIBUJAR LINEA");
	              System.out.println("2. DIBUJAR CUADRO");
	              System.out.println("3. DIBUJAR RECTANGULO");
	              System.out.println("4. DIBUJAR Triangulo");
	              System.out.println("5. DIBUJAR Nose");
	              System.out.println("\n0. SALIR");
	              System.out.println("\nELIGE UNA OPCION??");
	              opcion=in.nextInt();
	              switch (opcion) {
	              case 1:
	            	     System.out.println ("\n--------DIBUJAR LINEA--------\n");
	            	     System.out.print("Tamaño: ");
	            	     int n= in.nextInt();
	            	     for (int i = 0; i < n; i++) {
	            	         System. out.print("* ");
	            	     }
	            	     System.out.print("\n\n");
	            	     break;
	            	     case 2:
	            	    	 
	            	     System.out.println("\n--------DIBUJAR Cuadro------\n");
	            	     System.out.println("Tamaño:");
	            	     int n1=in.nextInt();
	            	     for (int i = 0; i < n1; i++) {
	            	    	 for (int j = 0; j < n1; j++) {
								System.out.print("*  ");
							}
							System.out.println(" ");
						}
	            	     System.out.print("\n\n");
	            	     break;	
	            	     case 3:           	    
	            	     System.out.println ("\n ----------RECTANGULO---------\n");
	            	     System.out.println("Tamaño de ancho:");
	            	     int n2=in.nextInt();
	            	     System.out.println("Num:"+n2);
	            	     System.out.println("Tamaño de alto:");
	            	     int n3=in.nextInt();
	            	     System.out.println("Num:"+n3);
	            	     System.out.println("cuadro");
	            	     for (int i = 0; i < n2; i++) {
         	    		    for (int j = 0; j <=n3 ; j++) {
         	    		        System.out.print("* ");
         	    		     }
         	    		    System. out. println(" ");
	            	     }
	            	     break;
	            	     case 4 :
	            	     System.out.println("\n--------DIBUJAR TRIANGULO-........\n");
	            	    		 System.out. print("Alto: ") ;
	            	    		 int n4 = in.nextInt();
	            	    		 for (int i = 0; i < n4; i++) {
	            	    		    for (int j = 0; j <=i ; j++) {
	            	    		        System.out.print("*");
	            	    		     }
	            	    		    System. out. print(" ");
	            	    		 System. out. print("\n\n");
	            	    		 }
	            	    		 break;
	            	     case 5 :
	            	    	 System.out.println("\n--------DIBUJAR TRIANGULO equilatero-........\n");
	            	    	 System.out. print("Alto: ") ;
	            	    	 int n5 = in.nextInt();
	            	    	 for (int i = 0; i < n5; i++) {
	            	    		    for (int j = 0; j <n5-i ; j++) {
	            	    		        System.out.print(" ");
	            	    		     }
	   	            	    	 for (int j = 0; j <=i; j++) {
	   	            	    	 }
		            	    		    for (int j  = 0; j <i ; j++) {
		            	    		        System.out.print("* ");
		            	    		     }
	            	    		    System. out. print(" ");
	   	            	    	 }
	            	    		 System. out. print("\n\n");
	            	    		 
		            	    		 break;
	            	     case 0:
	            	    	 
	            	     System.out.println ("\n ----------adiosssss---------\n");
	            	     break;	         
	            	     default:
	            	    	 System.out.println ("\n ---------esta opcion no existe---------\n");
	            	    	 break;
	              }
	         }while (opcion!=0);
	         }	     
	     }

