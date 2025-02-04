fun main(){
    val robot1 = Robot("R2D2")

    val camino1: Array<Array<Int>> = arrayOf(
        arrayOf(1, -5, 0, -9),
        arrayOf(3, 3, 5, 6, 1, 0, 0, -7),
        arrayOf(2, 1, 0, -1, 1, 1, -4),
        arrayOf(),
        arrayOf(3, 5)
    )
    for(pasos in camino1) {
        robot1.mover(pasos)
        println(robot1)
    }
}