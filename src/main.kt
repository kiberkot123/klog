import java.time.temporal.TemporalAccessor

fun main()
{




    print("Введите скорость первого автомобиля:")
    var V1 = readLine()!!.toDouble()
    print("Введите скорость второго автомобиля:")
    var V2 = readLine()!!.toDouble()
    print("Введите расстояние на момент начала рассчета")
    var S_begin = readLine()!!.toDouble()
    print("Время прошедшее со старта:")
    var T = readLine()!!.toDouble()
    var s_final =  S_begin+V1*T+V2*T
    print("Итоговый рассчет: $S_final")
////
/////



}