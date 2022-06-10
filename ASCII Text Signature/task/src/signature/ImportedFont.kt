package signature

import java.io.File
import java.io.FileNotFoundException

/**
 * Utility class to get a font from a file. The file must have in the first line
 * the vertical size of the letters (which must be the same for all) and the number of
 * letter separated by a space. For each letter the file must have a first line with the
 * symbol of the letter as the first character and then the lines with the representation
 * of the latter in the font
 *
 * @param file the file defining the font
 * @param spaceSize the size of the space in the font
 */
class ImportedFont(file: File, override val spaceSize: Int = 5) : Font {

    /**
     * Constructor from file path and space size
     *
     * @param path the path to the file defining the font
     * @param spaceSize
     */
    constructor(path: String, spaceSize: Int) : this(File(path), spaceSize)

    /**
     * Constructor from file path
     *
     * @param path the path to the file defining the font
     */
    constructor(path: String) : this(File(path))


    override val fontSize: Int

    private val fontMap: Map<Char, String>

    /**
     * Initializes the values by reading from the file
     *
     * @throws FileNotFoundException if the file doesn't exist
     */
    init {
        if (!file.exists()) throw FileNotFoundException()
        val lines = file.readLines()
        fontSize = lines[0].split(" ")[0].toInt()
        val number = lines[0].split(" ")[1].toInt()
        fontMap = buildMap {
            for (i in 0 until number) {
                val letterBuilder = StringBuilder()
                for (j in 1 .. fontSize) {
                    letterBuilder
                        .append(lines[1 + i * (fontSize + 1) + j])
                        .append('\n')
                }
                letterBuilder.deleteCharAt(letterBuilder.lastIndex)
                put(lines[1 + i * (fontSize + 1)][0], letterBuilder.toString())
            }
            put(' ', space)
        }
    }

    override fun get(letter: Letter): String {
        return fontMap[letter.symbol]!!
    }
}
