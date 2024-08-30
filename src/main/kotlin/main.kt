fun main() {
    val commission = 0.75
    val minCommission = 35
   val amount = 10000
   val amount2 = 1000
   val sumCommission = amount / 100 * commission
    val sumCommission2 = amount2 / 100 * commission
    val sizeCommission = if (sumCommission > minCommission) sumCommission else minCommission
  val sizeCommission2 = if (sumCommission2 > minCommission) sumCommission2 else minCommission

    println(sizeCommission)
    println(sizeCommission2)
}
