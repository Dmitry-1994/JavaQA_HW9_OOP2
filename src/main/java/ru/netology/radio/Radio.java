package ru.netology.radio;

public class Radio {
    private int numderCurentRadiostation;
    private int curentVolume;

    public int getNumderCurentRadiostation() {
        return numderCurentRadiostation;
    }

    public void setNumderCurentRadiostation(int newNumderRadiostation) {
        if ((0 <= newNumderRadiostation) & (newNumderRadiostation <= 9)) {
            numderCurentRadiostation = newNumderRadiostation;
        } else {
            return;
        }
    }

    public int getCurentVolume() {
        return curentVolume;
    }

    public void setCurentVolume(int newCurentValume) {
        if ((0 <= newCurentValume) & (newCurentValume <= 100)) {
            curentVolume = newCurentValume;
        } else {
            return;
        }
    }

    public void next() {
        if (numderCurentRadiostation == 9) {
            numderCurentRadiostation = 0;
        } else {
            numderCurentRadiostation++;
        }
    }

    public void prev() {
        if (numderCurentRadiostation == 0) {
            numderCurentRadiostation = 9;
        } else {
            numderCurentRadiostation--;
        }
    }

    public void increaseVolume() {
        if (curentVolume < 100) {
            curentVolume++;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
        if (curentVolume > 0) {
            curentVolume--;
        } else {
            return;
        }
    }
}