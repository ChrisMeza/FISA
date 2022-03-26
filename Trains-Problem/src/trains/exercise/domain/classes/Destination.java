package trains.exercise.domain.classes;

/**
 * Represents a Destination
 * @author cmeza
 *
*/
public class Destination extends Route{
	
	/**
	 * @param name
	 * @param weight
	 */
	public Destination(Town town, int weight) {
		super(town, weight);
	}
		
}
