import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class UseDivisionTest:
  @Test
  def testUseDivision(): Unit =
    val dividend = 10.0
    val divisor = 2.0
    val result = UseDivision().divide(dividend, divisor)
    assertEquals(dividend/divisor, result)
