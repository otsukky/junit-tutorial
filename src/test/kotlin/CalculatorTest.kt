import org.example.Calculator
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.hamcrest.CoreMatchers.`is`


class CalculatorTest {
    @Test
    fun `multiplyで乗算結果が取得できる`() {
            val calculator = Calculator()
            val expected = 12
            val actual = calculator.multiply(3, 4)

            assertThat(actual, `is`(equalTo(expected)))
        }
}