class Robot(private val nombre: String) {
    private var posX = 0
    private var posY = 0
    private var direccion = Direccion.POSITIVEY

    init{
        require(nombre != ""){"El nombre no puede estar vacío."}
        require(posX == 0){"La coordenada principal X debe ser 0."}
        require(posY == 0){"La coordenada principal Y debe ser 0."}
    }


    fun mover(camino: Array<Int>){
        for(pasos in camino){
            when(direccion){
                Direccion.POSITIVEY -> {
                    posY += pasos
                    obtenerDireccion()
                }
                Direccion.NEGATIVEX -> {
                    posX -= pasos
                    obtenerDireccion()
                }
                Direccion.NEGATIVEY -> {
                    posY -= pasos
                    obtenerDireccion()
                }
                Direccion.POSITIVEX -> {
                    posX += pasos
                    obtenerDireccion()
                }
            }
        }
    }

    private fun obtenerDireccion(): Direccion {
        direccion = when (direccion) {
            Direccion.POSITIVEY -> {
                Direccion.NEGATIVEX
            }

            Direccion.NEGATIVEX -> {
                Direccion.NEGATIVEY
            }

            Direccion.NEGATIVEY -> {
                Direccion.POSITIVEX
            }

            Direccion.POSITIVEX -> {
                Direccion.POSITIVEY
            }
        }
        return direccion
    }

    private fun obtenerPosicion(): String {
        return "($posX,$posY)"
    }

    override fun toString(): String {
        return "$nombre está en ${obtenerPosicion()}, $direccion"
    }
}