
package mage.cards.l;

import java.util.UUID;
import mage.abilities.condition.common.MorbidCondition;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.effects.common.GainLifeEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.watchers.common.MorbidWatcher;

/**
 *
 * @author ciaccona007
 */
public final class LifeGoesOn extends CardImpl {

    public LifeGoesOn(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{G}");
        

        // You gain 4 life. If a creature died this turn, you gain 8 life instead.
        getSpellAbility().addWatcher(new MorbidWatcher());
        getSpellAbility().addEffect(new ConditionalOneShotEffect(new GainLifeEffect(8), new GainLifeEffect(4), MorbidCondition.instance, "You gain 4 life. If a creature died this turn, you gain 8 life instead"));
    }

    public LifeGoesOn(final LifeGoesOn card) {
        super(card);
    }

    @Override
    public LifeGoesOn copy() {
        return new LifeGoesOn(this);
    }
}
