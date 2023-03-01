public class Item {
    private String name;
    private boolean appear;
    private int[] location = new int[]{0,50};

    public int[] getLocation(){
        return this.location;
    }
    public String getName(){
        return this.name;
    }
    public boolean getAppear(){
        return this.appear;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAppear(boolean appear){
        this.appear = appear;
        if(appear == true){
            System.out.printf("\nSet item %s to appear!",getName());
        }
        else{
            System.out.printf("\nSet item %s to disappear!",getName());
        }
    }
    public void setLocation(int[] location){
        this.location = location;
    }
    public void show(){
        setAppear(true);
        System.out.println("Block is cracked! Item is appearing!!!");
    }


/**
 * 
 * @param distance
 */
public void run(int[] distance){
    if(getAppear()){
        int[] currentLocation = getLocation();
        System.out.println("Item is at"+currentLocation[0]+","+currentLocation[1]);
        currentLocation[0] = currentLocation[0 + distance[0]];// x cor
        currentLocation[1] = currentLocation[1 + distance[1]];// x cor
        System.out.println("Item is at"+currentLocation[0]+","+currentLocation[1]);
    }
    else{
        System.out.println("Item is disappear!!!");
    }
    }
}
