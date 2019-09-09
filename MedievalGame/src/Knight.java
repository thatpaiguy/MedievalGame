public class Knight extends Character { //uses methods from abstract Character subclass
    //constructor
    public Knight(String name){
        super(name); //does what is in the Character constructor
        weaponBehavior=new WeaponBow();
    }
    public void display(){
        System.out.println(name + " is a valiant knight");
    }
}
