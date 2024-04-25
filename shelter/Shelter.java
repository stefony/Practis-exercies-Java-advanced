package shelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public boolean add(Animal animal) {
        if (data.size() < capacity) {
            data.add(animal);
            return true;
        }
        return false;
    }

    public boolean remove(String name) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)) {
                data.remove(i);
                return true;
            }
        }
        return false;
    }

    public Animal getAnimal(String name, String caretaker) {
        for (Animal animal : data) {
            if (animal.getName().equals(name) && animal.getCaretaker().equals(caretaker)) {
                return animal;
            }
        }
        return null;
    }

    public Animal getOldestAnimal() {
        Animal oldest = null;
        for (Animal animal : data) {
            if (oldest == null || animal.getAge() > oldest.getAge()) {
                oldest = animal;
            }
        }
        return oldest;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The shelter has the following animals:\n");
        for (Animal animal : data) {
            sb.append(animal.getName()).append(" ").append(animal.getCaretaker()).append("\n");
        }
        return sb.toString();
    }
}
