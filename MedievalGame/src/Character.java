//abstract so that other classes can inherit from this class
public abstract class Character {
    //attributes
    protected String name;
    WeaponBehavior weaponBehavior;
    //constructor
    public Character(String name){
        this.name=name;
    }
    //methods to be used in other subclasses
    public abstract void display();
    public void attack(){
        weaponBehavior.attack();
    }
    public void setWeaponBehavior(WeaponBehavior wb){
        this.weaponBehavior=wb;
    }
}
