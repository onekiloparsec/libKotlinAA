open interface NumericType(value: Double) {
    val value: Double

    init(value: Double)
    {
        this.value = value
    }
}