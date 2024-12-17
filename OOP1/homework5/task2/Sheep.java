package bg.tu_varna.sit.b2.f23621689.homework5.task2;

public class Sheep extends Animal {
    @Override
    public void sleep() {
        energy = Math.min(energy + 5, 100);
    }

    @Override
    public void eat() {
        energy = Math.min(energy + 10, 100);
    }

    @Override
    public void moving() {
        energy = Math.max(energy - 25, 0);
    }
}
