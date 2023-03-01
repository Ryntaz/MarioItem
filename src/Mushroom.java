public class Mushroom extends Item {

    public Mushroom(){
        setName("Mushroom");
    }

    @Override
    public void show(){
        setAppear(true);
        System.out.println("Block is cracked! Mushroom is appearing!");
    }
    public void run(int[] distance){
        if(getAppear()){
            int[] currentLocation = getLocation();
            System.out.println("Item is at"+currentLocation[0]+","+currentLocation[1]);
            System.out.println("Mushroom is at moving...");
            currentLocation[0] = currentLocation[0] + distance[0];// x cor
            currentLocation[1] = currentLocation[1] + distance[1];// x cor
            System.out.println("Item is at"+currentLocation[0]+","+currentLocation[1]);
        }
        else{
            System.out.println("Mushroom is disappear!!!");
        }
    }
}
