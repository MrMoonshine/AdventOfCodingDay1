import java.util.Scanner;

class Day1
{

public static void main(String[] args)
{
	System.out.println("Länge: ");
	Scanner scan = new Scanner(System.in);
	int length = scan.nextInt();
	System.out.println("Geben sie "+ length + "ganze Zahlen zwischen 1 und 9 ein:");
	int[] ArrayA = new int[100]; 
for(int n = 0;n < length;n++) //array einlesen
{
	System.out.print("Array element" + n + "eingeben: ");
	

	ArrayA[n] = scan.nextInt();
	System.out.println();
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
