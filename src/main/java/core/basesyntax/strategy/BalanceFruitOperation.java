package core.basesyntax.strategy;

import core.basesyntax.model.Fruit;
import core.basesyntax.storage.Storage;

public class BalanceFruitOperation implements FruitOperation {
    @Override
    public boolean operate(Fruit fruit) {
        Storage.fruitStorage.put(fruit.getName(), fruit.getQuantity());
        return true;
    }
}