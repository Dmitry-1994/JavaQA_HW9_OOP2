package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStation.csv")
    public void shouldNextStation(int curentRadiostation, int expected) {
        Radio radio = new Radio();
        radio.setNumderCurentRadiostation(curentRadiostation);
        radio.next();
        int actual = radio.getNumderCurentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStation.csv")
    public void shouldPrevtStation(int curentRadiostation, int expected) {
        Radio radio = new Radio();
        radio.setNumderCurentRadiostation(curentRadiostation);
        radio.prev();
        int actual = radio.getNumderCurentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    public void shouldIncreaseVolume(int curentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurentVolume(curentVolume);
        radio.increaseVolume();
        int actual = radio.getCurentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreaseVolume.csv")
    public void shouldDecreaseVolume(int curentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurentVolume(curentVolume);
        radio.decreaseVolume();
        int actual = radio.getCurentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/notSetStation.csv")
    public void shouldNotSetStation(int curentRadiostation, int newRadiostation, int expected) {
        Radio radio = new Radio();
        radio.setNumderCurentRadiostation(curentRadiostation);
        radio.setNumderCurentRadiostation(newRadiostation);
        int actual = radio.getNumderCurentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/notSetVolume.csv")
    public void shouldNotSetVolume(int curentVolume, int newVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurentVolume(curentVolume);
        radio.setCurentVolume(newVolume);
        int actual = radio.getCurentVolume();
        Assertions.assertEquals(expected, actual);
    }
}