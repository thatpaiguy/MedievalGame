public class Troll extends Character{ //uses methods from abstract Character subclass
    //constructor
    public Troll(String name){
        super(name); //does what is in the Character constructor
        weaponBehavior=new WeaponAxe();
    }
    public void display(){
        System.out.println(name+ " is a funny troll");
    }
}
