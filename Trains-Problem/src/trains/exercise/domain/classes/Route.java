package trains.exercise.domain.classes;

/**
 * Represents a directed graph
 * @author cmeza
 *
 */

public abstract class Route  {
	private Town town;
	private int weight;
	
	/**
	 * @param name
	 * @param weight
	 */
	public Route(Town town, int weight) {
		this.town = town;
		this.weight = weight;
	}
	
	public Town getTown() {
		return town;
	}

	public int getWeight() {
		return weight;
	}
}
