import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.example.problem2.CoinCombination;

public class CoinCombinationTest {

	private CoinCombination coinCombination;

	@BeforeEach
	void setUp() {
		coinCombination = new CoinCombination();
	}

	@Test
	@DisplayName("동전 조합 테스트 케이스 - 1")
	void countCoinCombinations() {
		int[] coins = {1, 2, 3};
		int sum = 4;
		int expected = 4;

		int actual = coinCombination.countCoinCombination(coins, sum);

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	@DisplayName("동전 조합 테스트 케이스 - 2")
	void countCoinCombinations2() {
		int[] coins = {2, 5, 3, 6};
		int sum = 10;
		int expected = 5;

		int actual = coinCombination.countCoinCombination(coins, sum);

		assertThat(actual).isEqualTo(expected);

	}

	@Test
	@DisplayName("동전 배열의 값이 주어지지 않을 경우 IllegalArgumentException를 던진다")
	void testCountCoinCombinationsEmptyCoinsArray() {
		int[] coins = {};
		int sum = 10;

		assertThatThrownBy(()->coinCombination.countCoinCombination(coins,sum)).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	@DisplayName("동전 합계 값이 음수 일 경우 IllegalArgumentException를 던진다")
	void testCountCoinCombinationsSumIsNegative() {
		int[] coins = {1,2,3,4};
		int sum = -10;

		assertThatThrownBy(() -> coinCombination.countCoinCombination(coins, sum)).isInstanceOf(
			IllegalArgumentException.class);
	}
}
