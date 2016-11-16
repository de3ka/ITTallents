/*
 * Задача 1:
Създайте клас Computer, който представя компютър.
Класът да има следните полета:
year – числова стойност, показваща година на производство на
компютъра
price – числова стойност (не е задължително да е цяло число),
показваща цената на компютъра
isNotebook – булева стойност – дали компютъра е преносим или не
hardDiskMemory – числова стойност за размера на хардиска
freeMemory – числова стойност, показваща размера на свободната
памет
operationSystem – текстово поле за операционната система на
компютъра
Класът да дефинира следните методи:
-метод changeOperationSystem(newOperationSystem), който сменя
стойността на полето operationSystem със стойността, подадена като
параметър.
-метод useMemory(memory), който намалява свободната памет
(freeMemory) със стойността, подадена като аргумент.
Ако стойността на аргумента е по-голяма от свободната памет,
извежда съобщение "Not enough free memory!"
Да се създадат 2 обекта от тип Computer.
Да се зададат стойности на всеки от компютрите за year, price,
hardDiskMemory, freeMemory, operationSystem.Нека единият компютър
да е лаптоп. На единия от двата компютъра да се задели памет 100
(чрез метода useMemory), а на другия, да се смени операционната
система (чрез метода changeOperationSystem), след което да се
изведат на екрана всичките полета на двата компютъра.
 */
import java.util.Scanner;

public class ComputerObjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Computer pcOne = new Computer();
		Computer pcTwo = new Computer();

		pcOne.year = 2015;
		pcOne.price = 1200.99;
		pcOne.hardDiskMemory = 1000;
		pcOne.freeMemory = 750;
		pcOne.operationSystem = "Windows 10";
		pcOne.isNotebook = true;

		pcTwo.year = 2013;
		pcTwo.price = 500.5;
		pcTwo.hardDiskMemory = 350;
		pcTwo.freeMemory = 120;
		pcTwo.operationSystem = "Linux";
		pcTwo.isNotebook = false;

		pcOne.useMemory(100);

		System.out.println("PC one has the following characteristics:");
		System.out.println("Year of manufacturing: " + pcOne.year) ;
		System.out.println("Price: " + pcOne.price+ " BGN");
		System.out.println("Hard Disk Memory: " + pcOne.hardDiskMemory + " GB");
		System.out.println("Operation system: " + pcOne.operationSystem);
		System.out.println("Available free memory: " +pcOne.freeMemory +"GB");
		System.out.println("Is notebook: "+pcOne.isNotebook);
		System.out.println();
		
		System.out.println("PC Two is now running on "+pcTwo.operationSystem);
		System.out.println("Please enter to wich operation system you want PC Two to be changed:");
		String operationSystem = sc.nextLine();
		pcTwo.changeOperationSystem(operationSystem);
		System.out.println("PC two has the following characteristics:");
		System.out.println("Year of manufacturing: " + pcTwo.year );
		System.out.println("Price: " + pcTwo.price+ " BGN");
		System.out.println("Hard Disk Memory: " + pcTwo.hardDiskMemory + " GB");
		System.out.println("Operation system: " + pcTwo.operationSystem);
		System.out.println("Available free memory: " +pcTwo.freeMemory +" GB");
		System.out.println("Is notebook: "+pcTwo.isNotebook);
		sc.close();

	}

}
