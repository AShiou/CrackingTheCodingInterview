package ch3_StacksAndQueues.Q6_AnimalShelter;

import java.util.LinkedList;

public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();
    private int order = 0;

    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;
        if (animal instanceof Dog) {
            dogs.addLast((Dog)animal);
        } else if (animal instanceof  Cat) {
            cats.addLast((Cat)animal);
        }
    }

    public Animal dequeueDog() {
        return dogs.poll();
    }

    public Animal dequeueCat() {
        return cats.poll();
    }

    public Animal dequeueAny() {
        if (dogs.size() == 0) {
            return dequeueCat();
        } else if (cats.size() == 0) {
            return dequeueDog();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        if (dog.isOlderThan(cat)) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    public int size() {
        return dogs.size() + cats.size();
    }
}
