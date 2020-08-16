public class Member {

    //Properties
    private String name;
    private String age;
    private String address;
    private int tithe;
    private int Attendance;
    private Church church;



    public Church getChurch() {

        return church;

    }

    public void setChurch( Church church) {
        this.church = church;
    }

    public int getTithe() {
        return tithe;
    }

    public void setTithe(int tithe) {
        this.tithe = tithe;
    }

    public int getAttendance() {
        return Attendance;
    }

    public void setAttendance(int attendance) {
        Attendance = attendance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    // Behaviours


    //Constructor
    public Member(String myName, String myAge, String myAddress) {
       name = myName;
       age = myAge;
       address = myAddress;
       tithe = getTithe();
       Attendance = getAttendance();

    }

   // public Member(int tithe, int Attendance){
     //   tithe = getTithe();
     //   Attendance = getAttendance();

    }

  //  public Member( int getTithe, int getAttendance) {
    //    tithe = getTithe();
      //  Attendance = getAttendance();
   // }
   // public void getTithe(int i) {
 //   }




