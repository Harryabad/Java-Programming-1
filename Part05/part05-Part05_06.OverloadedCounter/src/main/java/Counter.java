/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harry
 */
public class Counter {

    private int startValue, value;

    public Counter(int startValue) {
        this.startValue = startValue;
        this.value = startValue;

    }

    public Counter() {
        this.startValue = 0;
    }

    public int value() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            value = value;
        } else {

            value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            value = value;
        } else {

            value -= decreaseBy;
        }
    }

}
