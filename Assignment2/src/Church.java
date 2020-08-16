public class Church {


    // Properties -> Encapsulation,Inheritance,Abstraction and polymorphism
private Address address;
private String name;
private String preacher;


public String returnName(){
    return name;
}

    public Address myAddress(){
        return address;
    }

    public void setAddress(Address address){
    this.address = address;
    }

    public void setPreacher(String preacher){
        this.preacher = preacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Behaviours
    public Church(String name, Address address, String preacher) {
        this.address = address;
        this.name = name;
        this.preacher = preacher;
    }




    }


