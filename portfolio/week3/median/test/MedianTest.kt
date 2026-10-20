// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Check size 1 list [-10.5f] equals -10.5f" {
        median(listOf(-10.5f)) shouldBe (-10.5f plusOrMinus 1e-6f)
    }
    "Check size 2 list [-10.5f, 8.0f] equals -1.25f" {
        median(listOf(-10.5f, 8.0f)) shouldBe (-1.25f plusOrMinus 1e-6f)
    }
    "Check size 3 list [-10.5f, 8.0f, 0f] equals 0f" {
        median(listOf(-10.5f, 8.0f, 0f)) shouldBe (0f plusOrMinus 1e-6f)
    }
    "Check size 4 list [-10.5f, 8.0f, 0f, 32f] equals 4f" {
        median(listOf(-10.5f, 8.0f, 0f, 32f)) shouldBe (4f plusOrMinus 1e-6f)
    }
})
