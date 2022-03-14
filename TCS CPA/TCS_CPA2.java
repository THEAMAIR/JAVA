import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        PrimeMangement[] ott = new PrimeManagment[4];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<ott.length;i++){
            int primeId = sc.nextInt();
            sc.nextLine();
            String userProfileName = sc.nextLine();
            String subcriptionType = sc.nextLine();
            double subcriptionPrice = sc.nextDouble();
            int noOfProfiles = sc.nextInt();

            ott[i] = new PrimeManagement(primtId,userProfileName,subcriptionType,subcriptionPrice,
            noOfProfiles);
        }
        String subcriptionTypeinput = sc.nextLine();
        int average= findAvgPriceByType(ott,subcriptionTypeinput);
        if(average>0){
            System.out.println(average);
        }
        else{
            System.out.println("There are no such prime Management");
        }

    }

    public static int findAvgPriceByType(PrimeManagement[] prime,String subscriptionTypeinput){
        int sum = 0;
        int count = 0;
        for(PrimeManagement pr:prime){
            if(pr.getSubcriptionType().equalsIgnoreCase(subcriptionTypeInput)&&
            pr.getNoOfProfiles()>3){
                sum+=pr.getSubcriptionPrice();
                count++;
            }
        }
        if(count>0){
            avg = sum/count;
            return avg;
        }
        else{
            return avg;
        }
    }

}
class PrimeManagement{
    private int primeId;
    private String userProfileName;
    private String subscriptionType;
    private double subscriptionPrice;
    private int noOfProfiles;
    
    public int getPrimeId(){
        return primeId;
    }
    public void setPrimeId(int primeId){
        this.primeId = primeId;
    }
    public String getUserProfileName(){
        return getuserProfileName;
    }
    public void setUserProfileName(String userProfileName){
        this.userProfileName = userProfileName; 
    }
    public String getSubscriptionType(){
        return subscriptionType;
    }
    public void setSubscriptionType(String subscriptionType){
        this.subscriptionType = subscriptionType;
    }
    public double getSubscriptionPrice(){
        return subscriptionPrice;
    }
    public void setSubscriptionPrice(double SubscriptionPrice){
        this.subscriptionPrice = subscriptionPrice;
    }
    public int getNoOfProfiles(){
        return noOfProfiles;
    }
    public void setNoOfProfiles(int noOfProfiles){
        this.noOfProfiles = noOfProfiles;
    }

    public PrimeMangement(int primeId,String userProfileName,String subscriptionType,double subcriptionPrice,int noOfProfiles){
        super();
        this.primeId = primeId;
        this.userProfileName = userProfileName;
        this.subscriptionType = subscriptionType;
        this.subcriptionPrice = subcriptionPrice;
        this.noOfProfile = noOfProfiles;
    }

}