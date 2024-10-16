package ru.netology.radio;

public class Radio {
    private int numderCurentRadiostation;
    private int curentVolume;
    private int countRadiiostation;
    private int maxNumderRadiostation;
    private int minNumderRadiostation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
        this.countRadiiostation = 10;
        this.maxNumderRadiostation = countRadiiostation - 1;
    }

    public Radio(int countRadiiostation) {
        if (countRadiiostation > 0) {
            this.countRadiiostation = countRadiiostation;
        } else {
            this.countRadiiostation = 10;
        }
        this.maxNumderRadiostation = this.countRadiiostation - 1;
    }

    public int getNumderCurentRadiostation() {
        return numderCurentRadiostation;
    }

    public void setNumderCurentRadiostation(int newNumderRadiostation) {
        if ((minNumderRadiostation <= newNumderRadiostation) & (newNumderRadiostation <= maxNumderRadiostation)) {
            this.numderCurentRadiostation = newNumderRadiostation;
        } else {
            return;
        }
    }

    public int getCurentVolume() {
        return curentVolume;
    }

    public void setCurentVolume(int newCurentValume) {
        if ((0 <= newCurentValume) & (newCurentValume <= 100)) {
            this.curentVolume = newCurentValume;
        } else {
            return;
        }
    }

    public void next() {
        if (numderCurentRadiostation == maxNumderRadiostation) {
            numderCurentRadiostation = minNumderRadiostation;
        } else {
            numderCurentRadiostation++;
        }
    }

    public void prev() {
        if (numderCurentRadiostation == minNumderRadiostation) {
            numderCurentRadiostation = maxNumderRadiostation;
        } else {
            numderCurentRadiostation--;
        }
    }

    public void increaseVolume() {
        if (curentVolume < maxVolume) {
            curentVolume++;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
        if (curentVolume > minVolume) {
            curentVolume--;
        } else {
            return;
        }
    }
}