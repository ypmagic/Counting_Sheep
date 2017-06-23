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
        checkCount();
    }

    private void checkCount() {
        for (int p = 0; p < 13; p++) {
            String temp = String.valueOf(this.n);
            for (int i = 0; i < temp.length(); i++) {
                int digit = Integer.parseInt(temp.substring(i, i+1));
                if (digit == 0) {
                    this.isCounted[0] = true;
                } else if (digit == 1) {
                    this.isCounted[1] = true;
                } else if (digit == 2) {
                    this.isCounted[2] = true;
                } else if (digit == 3) {
                    this.isCounted[3] = true;
                } else if (digit == 4) {
                    this.isCounted[4] = true;
                } else if (digit == 5) {
                    this.isCounted[5] = true;
                } else if (digit == 6) {
                    this.isCounted[6] = true;
                } else if (digit == 7) {
                    this.isCounted[7] = true;
                } else if (digit == 8) {
                    this.isCounted[8] = true;
                } else if (digit == 9) {
                    this.isCounted[9] = true;
                }
            }
            if (isAsleep()) {
                break;
            }
            this.increment++;
            this.n = this.increment * this.n;
        }
    }

    private boolean isAsleep() {
        for (int i = 0; i < this.isCounted.length; i++) {
            if (!this.isCounted[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CountingSheep c = new CountingSheep(2);
    }
}
