import java.util.Scanner;
class TestPoint{

	public static void main(String[] args) {
		double x;
		double y;
		double dx;
		double dy;
    Scanner clavier = new Scanner(System.in);
		PointCartesien point1 = new PointCartesien();

		System.out.println("abscisse ?");
		x=clavier.nextDouble();
		System.out.println("ordonnee ?");
		y = clavier.nextDouble();
		PointCartesien point2 = new PointCartesien(x,y);

		//Test des Getters
		System.out.println(point1.getAbs());
		System.out.println(point2.getOrd());
		//Test des Setters
		dx = clavier.nextDouble();
		point1.setAbs(dx);
		System.out.println(point1.getAbs());
		dy = clavier.nextDouble();
		point2.setOrd(dy);

		System.out.println(point2.getOrd());
		System.out.println("Test de la methode toString :");
		System.out.println(point1.toString());
		System.out.println("Test de la methode afficher :");
		point2.afficher();

		System.out.println("abscisse ?");
		x = clavier.nextDouble();
		System.out.println("ordonnee ?");
		y = clavier.nextDouble();

		point1.translation(x,y);
		System.out.println(point2.distanceALOrigine());
		}
}
