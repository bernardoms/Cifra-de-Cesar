package ex1;

public class Main {

	public static void main(String[] args) {
		char[] cripto1;
		char[] cripto2;
		Criptografia d = new Criptografia("GHVHMR XP RWLPR FDUQDYDO SDUD WRGRV", 3);
		Criptografia c = new Criptografia("desejo um otimo carnaval para todos", 3);
		cripto1 = c.criptografar();
		cripto2 = d.descriptografar();
		System.out.println(cripto1);
		System.out.println(cripto2);
	}

}
