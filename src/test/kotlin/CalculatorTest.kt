import org.example.Calculator
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.assertThrows


class CalculatorTest {
    @Test
    fun `multiplyで3と4の乗算結果が取得できる`() {
            val calculator = Calculator()
            val expected = 12
            val actual = calculator.multiply(3, 4)

            assertThat(actual, `is`(equalTo(expected)))
        }

    @Test
    fun `divideで3と2の除算結果が取得できる`() {
        val calculator = Calculator()
        val expected = 1.5f
        val actual = calculator.divide(3, 2)

        assertThat(actual, `is`(equalTo(expected)))
    }

    @Test
    fun `divideで0の除算はIllegalArgumentExceptionになる`() {
        val calculator = Calculator()
        val expected = "divide by zero"

        val error = assertThrows<IllegalArgumentException> {
            calculator.divide(3, 0)
        }

        assertThat(error.message, `is`(equalTo(expected)))
    }
}