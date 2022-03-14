import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Watch[] Watch = new Watch[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<Watch.length;i++){
            int watchId = sc.nextInt();
            // sc.NextLine();
            String watchName = sc.nextLine();
            double price = sc.nextDouble();
            //sc.nextLine();
            String brand = sc.nextLine();
            Watch[i]=new Watch(watchid,watchName,price,brand);
        }
        String brand = sc.nextLine();
        int noOfWatches = countWatchesByBrand(Watch,brand);
        if(noOfWatches>0){
            System.out.println(noOfWatches);
        }
        else{
            System.out.println("No such Watch");
        }
        //sc.close();

    }
    public static int countWatchesByBrand(Watch Watch[],String searchBrand){
        int count = 0;
        for(int i =0;i<Watch.length;i++){
            String brand = Watch[i].getBrand().toLowerCase();
            if(brand.equalsignoreCase(searchBrand)&&(brand.startWith("a")||
            brand.startWith("e")||brand.startWith("i")||brand.startWith("o")||brand.startWith("u"))){
                count++;
            }
        }
        return count;
    }
}
class Watch{
    private int watchId;
    private String watchName;
    private double price;
    private String brand;
    
    public int getWatchId(){
        return watchId;
    }
    public void setWatchId(int watchId){
        this.watchId = watchId; 
    }

    public String getWatchName(){
        return watchName;
    }
    public void setWatchName(String watchName){
        this.watchName=watchName;
    }
    
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public Watch(int watchId,String watchName,double price,String brand){
        super();
        this.watchId=watchId;
        this.watchName = watchName;
        this.price = price;
        this.brand = brand;
    }

}