import java.util.Scanner;

class Day1
{

public static void main(String[] args)
{
	System.out.println("Bitte Zahlen eingeben: ");
	Scanner scan = new Scanner(System.in);

	int[] ArrayA = new int[999];	
	String ArrayB = scan.nextLine();
	int length = ArrayB.length();

for(int i = 0; i < length;i++)
{
	ArrayA[i] = Integer.parseInt(String.valueOf(ArrayB.charAt(i))); //string zum int-Array  machen
}
for(int n = 0; n < length;n++)	//array ausgeben
{
	System.out.print(ArrayA[n]);	
}
//Chaptcha!!! yay! whooooo!
	int ergebnis=0;
for(int n1 = 0;n1 < length;n1++)
{

if(ArrayA[n1]==ArrayA[n1+1]) //wenn array seinem nebengelegenen entspricht
{
	ergebnis = ergebnis + ArrayA[n1];//addieren
}

}
if(ArrayA[length-1]==ArrayA[0])//wenn 1. und letztes element gleich ist
{
	ergebnis = ergebnis + ArrayA[length-1];
}
	System.out.println();
	System.out.println("Summe ist:"+ergebnis); 	
}
}
