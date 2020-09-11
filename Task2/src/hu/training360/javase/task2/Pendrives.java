package hu.training360.javase.task2;

import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendriveList) {

        if(pendriveList.isEmpty())
            return null;

        Pendrive pendrive = pendriveList.get(0);
        Pendrive p;

        for (int i = 1; i < pendriveList.size(); i++) {
            p = pendriveList.get(i);
            if(p.comparePricePerCapacity(pendrive) == 1) {
                pendrive = p;
            }
        }

        return pendrive;
    }

    public Pendrive cheapest(List<Pendrive> pendriveList) {

        if(pendriveList.isEmpty())
            return null;

        Pendrive pendrive = pendriveList.get(0);
        Pendrive p;

        for (int i = 1; i < pendriveList.size(); i++) {
            p = pendriveList.get(i);
            if(p.cheaperThan(pendrive)) {
                pendrive = p;
            }
        }

        return pendrive;
    }

    public void risePrieceWhereCapacity(List<Pendrive> pendriveList, int percent, int capacity) {

        for(Pendrive pendrive : pendriveList) {
            if(pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }
}
