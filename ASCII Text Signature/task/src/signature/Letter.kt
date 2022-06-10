package signature

/** Enum class representing the letters in lower and upper case, and the space */
enum class Letter(val symbol: Char) {
    A_LOWER('a'), A_UPPER('A'),
    B_LOWER('b'), B_UPPER('B'),
    C_LOWER('c'), C_UPPER('C'),
    D_LOWER('d'), D_UPPER('D'),
    E_LOWER('e'), E_UPPER('E'),
    F_LOWER('f'), F_UPPER('F'),
    G_LOWER('g'), G_UPPER('G'),
    H_LOWER('h'), H_UPPER('H'),
    I_LOWER('i'), I_UPPER('I'),
    J_LOWER('j'), J_UPPER('J'),
    K_LOWER('k'), K_UPPER('K'),
    L_LOWER('l'), L_UPPER('L'),
    M_LOWER('m'), M_UPPER('M'),
    N_LOWER('n'), N_UPPER('N'),
    O_LOWER('o'), O_UPPER('O'),
    P_LOWER('p'), P_UPPER('P'),
    Q_LOWER('q'), Q_UPPER('Q'),
    R_LOWER('r'), R_UPPER('R'),
    S_LOWER('s'), S_UPPER('S'),
    T_LOWER('t'), T_UPPER('T'),
    U_LOWER('u'), U_UPPER('U'),
    V_LOWER('v'), V_UPPER('V'),
    W_LOWER('w'), W_UPPER('W'),
    X_LOWER('x'), X_UPPER('X'),
    Y_LOWER('y'), Y_UPPER('Y'),
    Z_LOWER('z'), Z_UPPER('Z'),
    SPACE(' '),
    ;

    companion object {
        /** Map from the symbol to the letter */
        val fromChar = buildMap {
            for (letter in Letter.values()) {
                put(letter.symbol, letter)
            }
        }
    }

}
