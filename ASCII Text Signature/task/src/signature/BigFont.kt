package signature

/**
 * Object representing a font with characters of size 3 and represented by the characters
 * |,_,],/,\
 * with space size 5
 */
object BigFont : Font {
    override val fontSize = 3
    override val spaceSize = 5
    override fun get(letter: Letter): String {
        return when (letter) {
            Letter.A_LOWER, Letter.A_UPPER -> """
                            ____ 
                            |__| 
                            |  | 
                        """.trimIndent()
            Letter.B_LOWER, Letter.B_UPPER -> """
                            ___  
                            |__] 
                            |__] 
                        """.trimIndent()
            Letter.C_LOWER, Letter.C_UPPER -> """
                            ____ 
                            |    
                            |___ 
                        """.trimIndent()
            Letter.D_LOWER, Letter.D_UPPER -> """
                            ___  
                            |  \ 
                            |__/ 
                        """.trimIndent()
            Letter.E_LOWER, Letter.E_UPPER -> """
                            ____ 
                            |___ 
                            |___ 
                        """.trimIndent()
            Letter.F_LOWER, Letter.F_UPPER -> """
                            ____ 
                            |___ 
                            |    
                        """.trimIndent()
            Letter.G_LOWER, Letter.G_UPPER -> """
                            ____ 
                            | __ 
                            |__] 
                        """.trimIndent()
            Letter.H_LOWER, Letter.H_UPPER -> """
                            _  _ 
                            |__| 
                            |  | 
                        """.trimIndent()
            Letter.I_LOWER, Letter.I_UPPER -> """
                            _ 
                            | 
                            | 
                        """.trimIndent()
            Letter.J_LOWER, Letter.J_UPPER -> """
                             _ 
                             | 
                            _| 
                        """.trimIndent()
            Letter.K_LOWER, Letter.K_UPPER -> """
                            _  _ 
                            |_/  
                            | \_ 
                        """.trimIndent()
            Letter.L_LOWER, Letter.L_UPPER -> """
                            _    
                            |    
                            |___ 
                        """.trimIndent()
            Letter.M_LOWER, Letter.M_UPPER -> """
                            _  _ 
                            |\/| 
                            |  | 
                        """.trimIndent()
            Letter.N_LOWER, Letter.N_UPPER -> """
                            _  _ 
                            |\ | 
                            | \| 
                        """.trimIndent()
            Letter.O_LOWER, Letter.O_UPPER -> """
                            ____ 
                            |  | 
                            |__| 
                        """.trimIndent()
            Letter.P_LOWER, Letter.P_UPPER -> """
                            ___  
                            |__] 
                            |    
                        """.trimIndent()
            Letter.Q_LOWER, Letter.Q_UPPER -> """
                            ____ 
                            |  | 
                            |_\| 
                        """.trimIndent()
            Letter.R_LOWER, Letter.R_UPPER -> """
                            ____ 
                            |__/ 
                            |  \ 
                        """.trimIndent()
            Letter.S_LOWER, Letter.S_UPPER -> """
                            ____ 
                            [__  
                            ___] 
                        """.trimIndent()
            Letter.T_LOWER, Letter.T_UPPER -> """
                            ___ 
                             |  
                             |  
                        """.trimIndent()
            Letter.U_LOWER, Letter.U_UPPER -> """
                            _  _ 
                            |  | 
                            |__| 
                        """.trimIndent()
            Letter.V_LOWER, Letter.V_UPPER -> """
                            _  _ 
                            |  | 
                             \/  
                        """.trimIndent()
            Letter.W_LOWER, Letter.W_UPPER -> """
                            _ _ _ 
                            | | | 
                            |_|_| 
                        """.trimIndent()
            Letter.X_LOWER, Letter.X_UPPER -> """
                            _  _ 
                             \/  
                            _/\_ 
                        """.trimIndent()
            Letter.Y_LOWER, Letter.Y_UPPER -> """
                            _   _ 
                             \_/  
                              |   
                        """.trimIndent()
            Letter.Z_LOWER, Letter.Z_UPPER -> """
                            ___  
                              /  
                             /__ 
                        """.trimIndent()
            Letter.SPACE -> space

        }
    }

}
