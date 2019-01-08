public class Printer {
    public int paper = 500;
    public int toner = 100;

    public int getPaper() {
        return this.paper;
    }

    public void print(int i, int i1) {
        int sheets = i * i1;
        if (sheets < this.paper) {
            this.paper -= sheets;
            this.toner -= sheets;
        }
    }

    public void refillPaper() {
        this.paper = 500;
    }

    public int getToner() {
        return this.toner;
    }

    public void refillToner() {
        this.toner = 100;
    }
}
