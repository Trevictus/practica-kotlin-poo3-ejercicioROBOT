fun main(){
    val robot1 = Robot("R2D2")

    val camino1: Array<Int> = arrayOf(-10, -5, 2, 4, -8)

    robot1.mover(camino1)
    println(robot1)
}