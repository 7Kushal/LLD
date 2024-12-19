public enum notes {
    FIVE(5.0),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100);

    private final double value;
    notes(double data){
        this.value = data;
    }
    public double getValue() {
        return value;
    }
}
