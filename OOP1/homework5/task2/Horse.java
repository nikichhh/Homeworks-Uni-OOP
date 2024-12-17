package bg.tu_varna.sit.b2.f23621689.homework5.task2;

public class Horse extends Animal {
    @Override
    public void sleep() {
        energy = Math.min(energy + 7, 100);
    }

    @Override
    public void eat() {
        energy = Math.min(energy + 15, 100);
    }

    @Override
    public void moving() {
        energy = Math.max(energy - 15, 0);
    }
}
