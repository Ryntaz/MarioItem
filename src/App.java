public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
    
    Mushroom m1 = new Mushroom();
    m1.show();
    int[] distance = new int[]{10,10};
    m1.run(distance);
    m1.run(new int[]{10,10});
    //System.out.prinln("Block is cracked, Mushroom is appearing");

    FireFlower f1 = new FireFlower();
    int[] g = new int[]{10,10};
    f1.run(distance);
    

    Starman s1 = new Starman();
    int[] distance = new int[]{10,10};
    s1.run(distance);
    }

}
