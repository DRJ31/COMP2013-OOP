/* We can't take Animal Dog or Bird through Flyer
 * We can't take Animal or Dog because they didn't implement Flyer
 * We can't take Bird because bird is an abstract class and it can't be initialized
 * 
 * @author Renjie Deng
 *
 */
public class Start {
	public static void main(String[] args) {
		Animal.testAnimal();
		Dog.testDog();
		Bird.testBird();
		Magpie.testMagpie();
		Ostrich.testOstrich();
		Pegasus.testPegasus();
	}
}
