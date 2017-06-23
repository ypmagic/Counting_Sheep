/**
 * Created by young on 6/23/17.
 */
public class CountingSheep {

    private boolean[] isCounted;
    private int n;
    private int increment;

    public CountingSheep(int n) {
        this.isCounted = new boolean[10];
        for (boolean a : this.isCounted) {
            a = false;
        }
        this.n = n;
        this.increment = 1; // multiplier for n
    }

}
