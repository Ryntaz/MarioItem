public class Starman extends Item{

    public Starman(){
        setName("Starman");
    }
    @Override
    public void show(){
        setAppear(true);
        System.out.println("Block is cracked! Starman is appearing!");
    }
    public void run(int[] distance){
        if(getAppear()){
            int[] currentLocation = getLocation();
            System.out.println("Item is at"+currentLocation[0]+","+currentLocation[1]);
            System.out.println("Starman is jumping");
            currentLocation[0] = currentLocation[0] + distance[0];// x cor
            currentLocation[1] = currentLocation[1] + distance[1];// x cor
            System.out.println("Item is at"+currentLocation[0]+","+currentLocation[1]);
        }
        else{
            System.out.println("Starman is disappear!!!");
        }
    }
}
