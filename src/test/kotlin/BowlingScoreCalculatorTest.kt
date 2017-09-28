import org.junit.Test

import org.assertj.core.api.Assertions.assertThat

class BowlingScoreCalculatorTest {

    private var calculator : BowlingScoreCalculator = BowlingScoreCalculator()

    @Test
    fun shouldShowHello() {
        assertThat(calculator.showHello()).isEqualTo("Hello")
    }

}