package org.example.problem2;

public class CoinCombination {
	public int countCoinCombination(int[] coins, int sum) {
		validateInput(coins,sum);
		int[] combinations = new int[sum + 1];
		combinations[0] = 1;

		for (int coin : coins) {
			for (int currentSum = coin; currentSum <= sum; currentSum++) {
				combinations[currentSum] += combinations[currentSum - coin];
			}
		}
		return combinations[sum];
	}

	private void validateInput(int[] coins, int sum) {
		if (coins.length == 0) {
			throw new IllegalArgumentException("동전 배열은 빈 값일 수 없습니다.");
		}
		if (sum < 0) {
			throw new IllegalArgumentException("동전 합계값은 음수 일 수 없습니다.");
		}
	}
}
