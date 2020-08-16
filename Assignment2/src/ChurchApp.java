public class ChurchApp {

    /* Assignment                                                                               7/16/2020
Create an app that keeps records of church members.
 1. Create a church class with appropriate properties and behaviour to capture the necessary requirement for a church.

 2. Create a member class with appropriate properties and behaviours to capture required church member information.

 3. Create a third class ChurchApp that links a particular member(instantiate 10member to a particular church(instantiate 3churches).

 4. Get tithe and Attendance of church members.
 */


        public static void main(String[] args) {

            Address address1 = new Address();
            address1.setState("GA");
            address1.setCity("Decatur");
            address1.setZip("30142");
            address1.setStreet("some waldrop road");





            Church church = new Church("RCCG",address1,"Pastor Ben");


            Member m = new Member("Osho","23","some address");
            m.setChurch(church);
            m.setTithe(20);
            m.setAttendance(200);
          //  System.out.println(m.getChurch().getPreacher());
         //   System.out.println();


            Member m1 = new Member("Olu","25","new address");
            m1.setChurch(church);
            m1.setTithe(50);
            m1.setAttendance(100);
          //  System.out.println(m1.getAttendance());
          //  System.out.println(m1.getTithe());


            Church church3 = new Church("House of prayer",address1,"Pastor Bode");

            Member m2 = new Member("Bayo","29","one address");
            m2.setChurch(church3);
            m2.setTithe(500);
            m2.setAttendance(50);
          //  System.out.println(m2.getName());
           // System.out.println(m2.getChurch().getPreacher());


            Member m3 = new Member("Ben","89","121232");
            m3.setChurch(church3);
            m3.setTithe(25);
            m3.setAttendance(25);


            Church church4 = new Church("Gods Church",address1,"Pastor Mimi");

            Member m4 = new Member("Sam","22","10101010");
            m4.setChurch(church);
            m4.setTithe(10);
            m4.setAttendance(20);


            Member m10 = new Member("Mike","40","12345");
            m10.setChurch(church4);
            m10.setTithe(500);
            m10.setAttendance(30);


          //  System.out.println("Church zip code:\n" + m4.getChurch().getAddress().getStreet().toLowerCase());
            //m2.getChurch().setPreacher("some Preacher");
          //  System.out.println(m.getChurch());


            m2.setChurch(church4);
          //  System.out.println("Name: "+m2.getName() + " Church: "+m2.getChurch().getPreacher());
           // System.out.println("Name:\n "+m4.getName() + "\nChurch:\n"+church4.getName() + "\nAttendance:\n"+ m4.getAttendance() + "  " +"\ntithe:\n"+m4.getTithe() );
          //  System.out.println("\tName:\t"+m2.getName() + "\tChurch:\t" + church3.getName() +"\nAttendance:" + m2.getAttendance() +"\ttithe:"+m2.getTithe());
            System.out.println("\tName:"+m1.getName() + "\tAge:"+m1.getAge() + "\tchurch:" + m1.getChurch().returnName()+"\nAddress:"+address1.getStreet()+"\nAttendance:" + m1.getAttendance() +"\ttithe:"+m1.getTithe());



          // System.out.println(m.getChurch().getName().toUpperCase());
          //  System.out.println(church3.getPreacher()  +  "  " +church4.getName()+ "  " +church3.getAddress());
           // System.out.println(m2.getName() + "  "+m2.getAddress()+ "  "+m2.getAge());
         //  System.out.println(m3.getName() + "  "+ m3.getAddress()+"  "+m3.getChurch()+ "  "+m3.getAge());
          //  System.out.println(church3.getName()+ "  "+church3.getPreacher()+" "+church3.getAddress()+ "  "+m4.getName()+ "  "+m4.getAge()+ "  "+m4.getAddress());
//            System.out.println(m2.getChurch().getPreacher());







        }

    }

