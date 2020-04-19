package by.alhr.Hw2_Task4_RandomGenerator.bean;

import java.io.Serializable;
import java.util.Objects;

public class RandomGenerator implements Serializable {
    private int diapazonA;
    private int diapazonB;
    private int diapazonC;

    public RandomGenerator() {
    }

    public RandomGenerator(int diapazonA, int diapazonB, int diapazonC) {
        this.diapazonA = diapazonA;
        this.diapazonB = diapazonB;
        this.diapazonC = diapazonC;
    }

    public int getDiapazonA() {
        return diapazonA;
    }

    public void setDiapazonA(int diapazonA) {
        this.diapazonA = diapazonA;
    }

    public int getDiapazonB() {
        return diapazonB;
    }

    public void setDiapazonB(int diapazonB) {
        this.diapazonB = diapazonB;
    }

    public int getDiapazonC() {
        return diapazonC;
    }

    public void setDiapazonC(int diapazonC) {
        this.diapazonC = diapazonC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandomGenerator that = (RandomGenerator) o;
        return diapazonA == that.diapazonA &&
                diapazonB == that.diapazonB &&
                diapazonC == that.diapazonC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diapazonA, diapazonB, diapazonC);
    }

    @Override
    public String toString() {
        return "RandomGenerator{" +
                "diapazonA=" + diapazonA +
                ", diapazonB=" + diapazonB +
                ", diapazonC=" + diapazonC +
                '}';
    }
}
