public class Main {
    public static void main(String[] args) {
        Huntable huntable = new Volf();
        huntable.hunt();
        Huntable huntable1 = new Bear();
        huntable1.hunt();
        Huntable huntable2 = new Lion();
        huntable2.hunt();
        PredatorAbstract predatorAbstract = new Volf();
        predatorAbstract.eat();
        PredatorAbstract predatorAbstract1 = new Bear();
        predatorAbstract1.eat();
        PredatorAbstract predatorAbstract2 = new Lion();
        predatorAbstract2.eat();
    }
}