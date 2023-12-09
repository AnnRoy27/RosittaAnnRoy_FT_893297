import java.util.ArrayList;
import java.util.List;

class Box {
    private int boxCapacity;
    private int boxNumber;
    private List<Object> boxItems;

    public Box(int boxCapacity, int boxNumber) {
        this.boxCapacity = boxCapacity;
        this.boxNumber = boxNumber;
        this.boxItems = new ArrayList<>();
    }

    public void addItem(Object item) {
        if (boxItems.size() < boxCapacity) {
            boxItems.add(item);
        } else {
            System.out.println("Box is full");
        }
    }

    public List<Object> getItems() {
        return boxItems;
    }

    public int getBoxNumber() {
        return boxNumber;
    }
}