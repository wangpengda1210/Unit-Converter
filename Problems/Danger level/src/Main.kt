enum class DangerLevel(private val danger: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    
    fun getLevel(): Int {
        return this.danger
    }
}