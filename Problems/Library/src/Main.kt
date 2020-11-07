object Math {
    
    fun abs(number: Int): Int {
        return when {
            number < 0 -> -number
            else -> number
        }
    }
    
    fun abs(number: Double): Double {
        return when {
            number < 0 -> -number
            else -> number
        }
    }
    
}