public class Student {
    
    public String name = "not set";
    public String[] cources = new String[3];
    public int courses = 0;

    public String[] addCourse(String ak){
        if (courses < cources.length) {
            System.out.println("adding a course" + ak);
            cources[courses] = ak;
            courses ++;
        }
        else{System.out.println("cannot add another course.");}

        return cources;
    }
    
    public void printInfo() {
        if (name.equals("not set")) {
            System.out.println("Name is not set. add name");
        }else{
            System.out.println("Name is : " + name);
            System.out.println("Has " + courses + " courses.");
            System.out.println("Course list : ");
            for (int i = 0; i < cources.length; i++) {
                System.out.println(cources[i]);
            }
        }
        
    }
    



    

}
