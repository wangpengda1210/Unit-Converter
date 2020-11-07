class Block(val color: String) {
    object DimProperties {
        var width: Int = 1
        var length: Int = 1
        
        fun blocksInBox(boxLength: Int, boxWidth: Int): Int {
            return (boxLength / length) * (boxWidth / width)
        }
    }
}