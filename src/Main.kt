fun main(){
    val robot1 = Robot("R2D2")

    val camino1: Array<Int> = arrayOf(1, -5, 0, -9)

    robot1.mover(camino1)
    println(robot1)
}