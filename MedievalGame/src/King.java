public class King extends Character { //uses methods from abstract Character subclass
    //constructor
    public King(String name){
        super(name); //does what is in the Character constructor
        weaponBehavior = new WeaponSword();
    }
    public void display() {
        System.out.println(name + " is a noble king");
    }
}
