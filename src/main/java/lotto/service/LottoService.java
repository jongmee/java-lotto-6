package lotto.service;

import static lotto.constants.Condition.MAXIMUM_VALUE;
import static lotto.constants.Condition.MINIMUM_VALUE;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import lotto.domain.IssuedLottos;
import lotto.domain.Lotto;
import lotto.domain.PurchaseNumber;
import lotto.utility.vo.PurchaseAmountRequest;

public class LottoService {
    public IssuedLottos generateLottos(PurchaseAmountRequest purchaseAmount) {
        PurchaseNumber purchaseNumber = purchaseAmount.calculatePurchaseNumber();

        Integer count = 0;
        List<Lotto> lottoTickets = purchaseNumber.createLottoTickets();
        while(purchaseNumber.lessThanPurchaseNumber(count)) {
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(MINIMUM_VALUE, MAXIMUM_VALUE, 6);
            Lotto lotto = new Lotto(numbers);
            lottoTickets.add(lotto);
            count += 1;
        }

        return new IssuedLottos(lottoTickets);
    }
}