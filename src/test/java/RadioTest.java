import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void setCurrentRadioStationRegularTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        int actual = radio.getCurrentRadioStation();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationNineTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.setCurrentRadioStation(10);
        int actual = radio.getCurrentRadioStation();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationOverMaxRadioStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(3);
        radio.setCurrentRadioStation(20);
        int actual = radio.getCurrentRadioStation();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationZeroTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.setCurrentRadioStation(-1);
        int actual = radio.getCurrentRadioStation();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.next();
        int actual = radio.getCurrentRadioStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setAfterNineRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.next();
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void setAfterMaxRadioStationTest() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(19);
        radio.next();
        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void setPrevRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.prev();
        int actual = radio.getCurrentRadioStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setBeforeZeroRadioStationTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();
        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void setBeforeZeroRadioStationWithMaxRadioStationTest() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(0);
        radio.prev();
        int actual = radio.getCurrentRadioStation();
        int expected = 19;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void setSoundVolumeTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(18);
        int actual = radio.getSoundVolume();
        int expected = 18;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setSoundVolumeAfter100Test() {
        Radio radio = new Radio();
        radio.setSoundVolume(18);
        radio.setSoundVolume(101);
        int actual = radio.getSoundVolume();
        int expected = 18;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setSoundVolumeBeforeZeroTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(18);
        radio.setSoundVolume(-1);
        int actual = radio.getSoundVolume();
        int expected = 18;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setIncreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(18);
        radio.increaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 19;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setDecreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(18);
        radio.decreaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 17;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setIncreaseVolumeAfter100Test() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.increaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setDecreaseVolumeBeforeZeroTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.decreaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
}