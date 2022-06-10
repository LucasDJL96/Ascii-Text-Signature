package signature

/** Interface representing a font */
interface Font {
    /** The vertical size of the letters in this font */
    val fontSize: Int
    /** The number of space character the space takes up in this font */
    val spaceSize: Int
    /** The representation of the space. By default it's calculated from the font size and space size */
    val space: String
        get() {
            val stringBuilder = StringBuilder()
            val spaces = " ".repeat(spaceSize)
            for (i in 0 until fontSize -1) {
                stringBuilder.append("$spaces\n")
            }
            stringBuilder.append(spaces)
            return stringBuilder.toString()
        }

    /**
     * Returns the representation of a letter as a string
     *
     * @param letter the letter
     */
    fun get(letter: Letter): String

}
