public enum coins {
    ONE(1.0),
    TWO(2.0),
    FIVE(5.0),
    TEN(10.0);

    private final double value;
    coins (double data) {
        this.value = data;
    }
    public double getValue() {
        return value;
    }
}
