package signature

/** Extra space between name and status */
const val spacing = 0
/** Path to the file with the font for the name */
const val nameFontPath = "roman.txt"
/** Path to the file with the font for the status */
const val statusFontPath = "medium.txt"

/** Main function. Controls the flow of the program */
fun main() {
    val name = askAndRead("Enter the first and last name:")
    val status = askAndRead("Enter the person's status:")
    val nameLines = fontLines(name, ImportedFont(nameFontPath, 10))
    val statusLines = fontLines(status, ImportedFont(statusFontPath, 5))
    adjustLengths(nameLines, statusLines)
    val length = nameLines[0].length
    println("88${"8".repeat(length)}88")
    for (line in nameLines) {
        println("88${line}88")
    }
    val sep = "88${" ".repeat(length)}88"
    repeat(spacing) {
        println(sep)
    }
    for (line in statusLines) {
        println("88${line}88")
    }
    println("88${"8".repeat(length)}88")
}

/**
 * Prints a prompt and reads the input from the user
 *
 * @param prompt the prompt
 *
 * @return the input from the user
 */
private fun askAndRead(prompt: String): String {
    print("$prompt ")
    return readln().replaceFirst("$prompt ", "")
}

/** Returns the smallest even Int greater than or equal to this Int */
private fun Int.evenUp(): Int = if (this % 2 == 0) this else this + 1

/**
 * Writes the input in the given font
 *
 * @param input the user's input
 * @param font the font in which to write
 *
 * @return List>StringBuilder> with the lines forming the result
 */
private fun fontLines(input: String, font: Font): List<StringBuilder> {
    val prettyName = buildList {
        for (char in input) {
            add(Letter.fromChar[char]!!)
        }
    }
    val lines = buildList {
        repeat(font.fontSize) {
            add(StringBuilder("  "))
        }
    }
    for (letter in prettyName) {
        val bigLetterSplit = font.get(letter).split("\n")
        for (i in 0 until font.fontSize) lines[i].append(bigLetterSplit[i])
    }
    for (line in lines) {
        line.append("  ")
    }
    return lines
}

/**
 * Adjusts the lengths of the lines for the name and status so that they match
 *
 * @param nameLines list with lines for the name
 * @param statusLines list with the lines for the status
 */
private fun adjustLengths(nameLines: List<StringBuilder>, statusLines: List<StringBuilder>) {
    val nameLength = nameLines[0].length
    val statusLength = statusLines[0].length
    if (nameLength > statusLength) {
        val diff = nameLength - statusLength
        for (line in statusLines) {
            line.insert(0, " ".repeat(diff / 2))
                .append(" ".repeat(diff.evenUp() / 2))
        }
    } else {
        val diff = statusLength - nameLength
        for (line in nameLines) {
            line.insert(0, " ".repeat(diff / 2))
                .append(" ".repeat(diff.evenUp() / 2))
        }
    }
}
