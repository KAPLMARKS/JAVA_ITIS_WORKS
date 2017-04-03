/**
 * Created by acer on 22.03.2017.
 */
public class Animal {
    private int weight;
    private int height;

    public Animal(int weight, int height) {
        if (weight >= 0 && weight <= 120){
            this.weight = weight;
        }else{
            this.weight = 100;
        }

        if (height >= 0 ){
            this.height = height;
    }else{
            this.height = 20;
        }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

     public void feed(int foodAmount){

     }


}
