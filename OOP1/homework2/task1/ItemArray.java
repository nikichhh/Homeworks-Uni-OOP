package bg.tu_varna.sit.b2.f23621689.homework2.task1;

public class ItemArray {
    Item[] items;
    int countQuantity;
    double sum;

    public ItemArray(Item[] items) {
        this.items = items;
        this.countQuantity = 0;
        this.sum = 0;
    }

    public double calculateAverage() {
        for (Item item : items) {
            sum += item.getPrice() * item.getQuantity();
            countQuantity += item.getQuantity();
        }

        return sum / countQuantity;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public int getCountQuantity() {
        return countQuantity;
    }

    public void setCountQuantity(int countQuantity) {
        this.countQuantity = countQuantity;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
