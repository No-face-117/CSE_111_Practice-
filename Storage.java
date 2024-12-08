// a storage class

public class Storage {
    public String[] items;
    public String name = "Default";
    public int count;

    public Storage() {
        items = new String[2];
        count = 0;
    }

    public Storage(int szk_0) {
        items = new String[szk_0];
        count = 0;
    }

    public Storage(String nk_0,int szk_1) {
        name = nk_0;
        items = new String[szk_1];
        count = 0;
    }

    public void addItem(String sk_0) {
        if (count < items.length) {
            System.out.println(sk_0 + " added to the storage.");
            items[count] = sk_0;
            count ++;
        }
        else{System.out.println("Storage is full. Cannot add Extra Item.");}
    }

    public void printDetails() {
        System.out.println("Storage Details : ");
        System.out.print("Name: " + name + ", Capacity : " + items.length + ", Items : ");
        if (count == 0) {
            System.out.print("Empty");
        }
        else{
            for (int i = 0; i < count; i++) {
                System.out.print(items[i] + " ");
            }
        }
        System.out.println();
    }
    
}
