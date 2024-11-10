public class University {
    
    public String name;
    public String address = "badda";
    public int departments;
    public int courses;

    public String getName(){
        return "University name is : " + name;
    }

    public int addCourse(){
        System.out.println("Adding a course...");
        return courses += 1;
    }

    public int dropCourse(){
        System.out.println("Dropping a course...");
        return courses -= 1;
    }

}
