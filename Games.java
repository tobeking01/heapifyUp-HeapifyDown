/**
 * 
 * @author Tobechi Onwenu
 * Programming Assignment 6: 
 * Games application using Map [Heaps] concept
 *
 */
public class Games implements Comparable<Games>{

	private String gameName;
	private int year;
	private double price;
	private boolean isGood;
	
	
	public Games(String game, int gameYear, double gamePrice, boolean rate) {
		gameName = game;
		year = gameYear;
		price = gamePrice;
		isGood = rate;
	}
	
	@Override
	public String toString() {
		 return String.format("%-25s %-10d $%-10.2f %-10s", gameName, year, price, isGood);
	}



//	@Override
	public int compareTo(Games object) {
		return gameName.compareToIgnoreCase(object.gameName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Games)) {
			return false;
		}
		Games other = (Games) obj;
		if (gameName == null) {
			if (other.gameName != null) {
				return false;
			}
		} else if (!gameName.equalsIgnoreCase(other.gameName)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the games
	 */
	public String getGameName() {
		return gameName;
	}

	/**
	 * @param games the games to set
	 */
	public void setGameName(String games) {
		this.gameName = games;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the isGood
	 */
	public boolean isGood() {
		return isGood;
	}

	/**
	 * @param isGood the isGood to set
	 */
	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
}
