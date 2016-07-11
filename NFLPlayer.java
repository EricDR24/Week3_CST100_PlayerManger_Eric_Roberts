
/** Program: NFl Class
* File: PlayerClass.java
* Summary: NFL Player Class to get and set stats
* Author: Eric Roberts
* Date: July 2, 2016 
**/

public class NFLPlayer {
		//player info
		private String name;
		private String position;
		private String team;
		private int number;
		private double height;
		private double weight;
		private int age;
		private String College;
		private int experience;
		
		//player stats
		private int touchDowns;
		private int interceptions;
		private double yards;
		private double rating;
		private int carries;
		private double rushAverageYards;
		private int receptions;
		private double receptionAverageYards;
		private double tackels;
		private double sacks;
		private int forcedFumbles;
		
		//getters for Player info
		public String getName() {
			return name;
		}
		
		public String getPosition() {
			return position;
		}
		
		public String getTeam() {
			return team;
		}
		
		public int getNumber() {
			return number;
		}
		
		public double getHeight() {
			return height;
		}
		
		public double getWeight() {
			return weight;
		}
		
		public int getAge() {
			return age;
		}
		
		public String getCollege() {
			return College;
		}
		
		public int getExperience() {
			return experience;
		}
		
		//getters for player stats
		public int getTouchDowns() {
			return touchDowns;
		}
		
		public int getInterceptions() {
			return interceptions;
		}
		
		public double getYards() {
			return yards;
		}
		
		public double getRating() {
			return rating;
		}
		
		public int getCarries() {
			return carries;
		}
		
		public double getRushAverageYards() {
			return rushAverageYards;
		}
		
		public int getReceptions() {
			return receptions;
		}
		
		public double getReceptionAverageYards() {
			return receptionAverageYards;
		}
		
		public double getSacks() {
			return sacks;
		}
		
		public double getTackels() {
			return tackels;
		}
		
		public int getForcedFumbles() {
			return forcedFumbles;
		}
		
		//setters for player info
		public void setName(String playerName) {
			name = playerName;			
		}
		
		public void setPosition(String playerPosition) {
			position = playerPosition;
		}
		
		public void setTeam(String playerTeam) {
			team = playerTeam;
		}
		
		public void setNumber(int playerNumber) {
			number = playerNumber;
		}
		
		public void setHeight(double playerHeight) {
			height = playerHeight;
		}
		
		public void setWeight(double playerWeight) {
			weight = playerWeight;
		}
		
		public void setAge(int playerAge) {
			age = playerAge;
		}
		
		public void setCollege(String playerCollege) {
			College = playerCollege;
		}
		
		public void setExperience(int playerExperience) {
			experience = playerExperience;
		}
		
		//setters for player stats
		public void setTouchDowns(int playerTouchDowns) {
			touchDowns = playerTouchDowns;
		}
		
		public void setInterceptions(int playerInterceptions) {
			interceptions = playerInterceptions;
		}
		
		public void setYards(double playerYards) {
			yards = playerYards;
		}
		
		public void setRating(double playerRating) {
			rating = playerRating;
		}
		
		public void setCarries(int playerCarries) {
			carries = playerCarries;
		}
		
		public void setRushAverageYards(double playerRushAverageYards) {
			rushAverageYards = playerRushAverageYards;
		}
		
		public void setReceptions(int playerReceptions) {
			receptions = playerReceptions;
		}
		
		public void setReceptionsAverageYards(double playerRecptionsAverageYards) {
			receptionAverageYards = playerRecptionsAverageYards;
		}
		
		public void setTackels(double playerTackels) {
			tackels = playerTackels;
		}
		
		public void setSacks(double playerSacks) {
			sacks = playerSacks;
		}
		
		public void setForcedFumbles(int playerForcedFumbles) {
			forcedFumbles = playerForcedFumbles;
		}

}