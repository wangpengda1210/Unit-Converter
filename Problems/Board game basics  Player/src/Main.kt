class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        private var id = -1
        fun create(name: String): Player {
            id++
            return Player(id, name, 100)
        }
    }
}