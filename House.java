public class House {
    public int roof;
    public int floors;
    public String name;

    public String getName(){
        return "House name : " + name;
    }

    public String houseStats(){
        return "Name : " + name + ", Floors : " + floors + ", Roof : " + roof + " .";
    }

    public void showFloors(){
        System.out.println("This house has : " + floors + " floors.");
    }

    public int addFloor(){
        return floors += 1;
    }
}
