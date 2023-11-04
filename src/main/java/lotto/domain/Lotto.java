package lotto.domain;

import java.util.Collections;
import java.util.List;
import lotto.utility.vo.LottoResponse;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    private void sortIncreasingOrder() {
        Collections.sort(numbers);
    }

    public LottoResponse convertToResponse() {
        sortIncreasingOrder();
        return new LottoResponse(numbers);
    }
}