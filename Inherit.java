class FoodUser extends User{
    String favFood;
    FoodUser(String name,String phone,String location,String favFood){
        super(name,phone,location);
        this.favFood=favFood;
    }
    public void userDetails()
    {
        System.out.println("Name:"+name+"+phone:"+phone+ "Favorite Food:"+ favFood);
    }
}
public class Inherit{
    public static void main(String[] args){
       FoodUser user1=new FoodUser("foodie","987654321","chennai","briyani");
       user1.userDetails();
    
    }
    }