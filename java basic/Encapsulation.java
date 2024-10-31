// Encapsulation : 

class human {

    private int age  ;
    private String name  ;
     
// to name it accessable 
        public int getAge(){
            return age ;
        }
        // to get use input 
        public void setAge(int a){
            age =a;

        }
        //   same for name 
        public String getName(){
            return name;
        }
        public void setName(String n){
            name=n;
            
            
        }
}


public class Encapsulation {

    public static void main(String[] args) {
        human obj =new human();
        obj.setAge(21);
        obj.setName("Dipesh Mahato");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}