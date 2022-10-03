package JavaEclipsVezbe.class32.class31.task1;

//1)Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
//Create 3 subclasses Car, Pet, Health.
// Car class has it’s own attribute as carModel and Class Pet has petType attribute.
// Create 3 objects of the sub classes and store them in ArrayList.
//Using for loop/advanced for loop/ iterator access all methods of the class.

public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
}

class Car extends Insurance{
    String carModel;
    Car(String insuranceName,String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }


    @Override
    public void getQuote() {

        System.out.println("Gets a quot for car Model "+carModel+" with "+insuranceName);
    }

    @Override
    public void cancelInsurance() {

        System.out.println("Cancel the insurance"+insuranceName+" for car model"+carModel);
    }
}

class Pet extends Insurance{

    String petType;

    Pet(String insuranceName,String petType)
     {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quot for car Model "+petType+" with "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance"+insuranceName+" for car model"+petType);
    }
}

class Health extends Insurance{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quot from"+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance"+insuranceName);
    }
}
