package trains.exercise.domain.classes;

/**
* Represents a Candidate 
* @author cmeza
*
*/
public class Candidate extends Route{
	/**
	 * @param name
	 * @param weight
	 */
	public Candidate(Town town, int weight) {
		super(town, weight);
	}
	
}
