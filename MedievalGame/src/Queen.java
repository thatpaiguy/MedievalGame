public class Queen extends Character { //uses methods from abstract Character subclass
    //constructor
    public Queen(String name){
        super(name); //does what is in the Character constructor
        weaponBehavior=new WeaponKnife();
    }
    public void display(){
        System.out.println(name+" is a beautiful queen");
    }
}
