package hu.training360.javase.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pendrive> pendriveList = new ArrayList<>();
        Pendrives pendrives = new Pendrives();
        Pendrive pendrive;

        pendriveList.add(new Pendrive("X", 100, 3100));
        pendriveList.add(new Pendrive("Y", 200, 3200));
        pendriveList.add(new Pendrive("Z", 300, 3300));

        pendrive = pendrives.best(pendriveList);

        System.out.println(pendrive);

        pendrive = pendrives.cheapest(pendriveList);

        System.out.println(pendrive);


        pendrive.risePrice(20);


        pendrive = pendrives.best(pendriveList);

        System.out.println(pendrive);

        pendrive = pendrives.cheapest(pendriveList);

        System.out.println(pendrive);
    }
}
