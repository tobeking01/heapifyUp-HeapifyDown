/**
 * 
 * @author Tobechi Onwenu
 * GamesDriver Class
 *
 */
public class GamesDriver {

	public static void main(String[] args) {
		Games game1 = new Games("Destiny", 2015, 49.99, true);
		Games game2 = new Games("Tekken", 2012, 29.99, true);
		Games game3 = new Games("PES2020", 2010, 39.99, true);
		Games game4 = new Games("Sekiro", 2018, 52.78, true);
		Games game5 = new Games("Batman", 2013, 19.99, false);
		Games game6 = new Games("Fallout", 2017, 43.98, true);
		Games game7 = new Games("Steep", 2014, 27.78, false);
		Games game8 = new Games("Assasin", 2018, 37.78, true);
		Games game9 = new Games("Mafia", 2015, 19.99, false);
		
		GamesHeap store1 = new GamesHeap(10);
		store1.insert(game1);
		store1.insert(game2);
		store1.insert(game3);
		store1.insert(game4);
		store1.insert(game5);
		store1.insert(game6);
		store1.insert(game7);
		store1.insert(game8);
		store1.insert(game9);
		
		System.out.println(store1);
		
		Games game10 = new Games("Shadow of the Tomb Raider", 2016, 59.99, true);
		Games game11 = new Games("Red Dead Redemption 2", 2017, 49.99, true);
		Games game12 = new Games("Devil May Cry 5", 2012, 39.99, true);
		Games game13 = new Games("Darksiders Warmastered ", 2015, 27.78, false);
		Games game14 = new Games("The Last Guardian ", 2014, 19.99, false);
		Games game15 = new Games("Rachet and Clank ", 2012, 29.99, false);
		Games game16 = new Games("Uncharted Nathan Drake", 2017, 37.28, true);
		Games game17 = new Games("Horizon Zero Dawn ", 2015, 47.99, true);
		Games game18 = new Games("Final Fantasy XV ", 2017, 49.78, true);
		Games game19 = new Games("Street Fighter V", 2014, 19.99, false);
		
		GamesHeap store2 = new GamesHeap(10);
		store2.insert(game10);
		store2.insert(game11);
		store2.insert(game12);
		store2.insert(game13);
		store2.insert(game14);
		store2.insert(game15);
		store2.insert(game16);
		store2.insert(game17);
		store2.insert(game18);
		store2.insert(game19);

		
		System.out.println(store2);
		
		System.out.println("Size of the store1 is: " + store1.size() + "\n");

		System.out.println("Searching for \'Sekiro\' in store1: " + store1.search("sekiro") + "\n");
		
		System.out.println("Contanis \'game5\' in store1: " + store1.countains(game5) + "\n");
		
		System.out.printf("Total price in store1 is: $%4.2f \n", store1.total());
		
		System.out.printf("Average price in store1 is: $%4.2f \n", store1.average());

		System.out.println("Position of game6 \'Fallout\' in store1 is: " + store1.positionOf(game6) + "\n");
		
		store2.delete(store2.positionOf(game13));
		System.out.println("Store 2 after deleting " + game13.getGameName() + " is: \n" + store2);




	}

}
