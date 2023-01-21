
public class Prueba {

	public static void main(String[] args) {
		int numero = 10;
		System.out.println(numero);
		numero = numero / 10;
		System.out.println(numero);
		
		new Thread(new Runnable() {
				
				@Override
				public void run() {
					int numero2 = 10;
					System.out.println(numero2);
					try {
						numero2 = numero2 / 0;
						System.out.println(numero2);
					} catch(Exception ex) {
						ex.printStackTrace();
					}
					
					System.out.println(numero2);
					System.out.println(numero2);
					System.out.println(numero2);
					System.out.println(numero2);
					System.out.println(numero2);
					System.out.println("hola");
					System.out.println(numero2);
					System.out.println(numero2);
					System.out.println("hola");
					System.out.println("hola");System.out.println("hola");
					System.out.println("hola");System.out.println("hola");
					System.out.println("hola");System.out.println("hola");
					System.out.println(numero2);
					System.out.println(numero2);
					System.out.println(numero2);
					System.out.println(numero2);
					System.out.println(numero2);
					System.out.println(numero2);
					System.out.println(numero2);
					
				}
				
				
		}).run();
		
	}

}
