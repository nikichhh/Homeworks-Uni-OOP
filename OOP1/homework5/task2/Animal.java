package bg.tu_varna.sit.b2.f23621689.homework5.task2;

abstract class Animal implements Move{
    protected double energy;

    public Animal() {
        this.energy = 100.0;
    }

    public abstract void sleep();
    public abstract void eat();

    public double getEnergy() {
        return energy;
    }
}
