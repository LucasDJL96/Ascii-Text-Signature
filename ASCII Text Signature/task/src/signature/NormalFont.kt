package signature

/** Object representing the font where each letter is represented by their unicode symbol */
object NormalFont : Font {
    override val fontSize = 1
    override val spaceSize = 1
    override fun get(letter: Letter): String {
        return letter.symbol.toString()
    }
}
