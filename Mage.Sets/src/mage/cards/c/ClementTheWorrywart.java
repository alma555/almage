package mage.cards.c;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldThisOrAnotherTriggeredAbility;
import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.abilities.keyword.VigilanceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.ComparisonType;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.filter.FilterCard;
import mage.filter.common.FilterControlledCreaturePermanent;

/**
 *
 * @author alma5
 */
public final class ClementTheWorrywart extends CardImpl {

    private static final FilterControlledCreaturePermanent manaFilter = new FilterControlledCreaturePermanent("creature you control with lesser mana value" + permanent.getManaCost().manaValue());
    manaFilter.add(new ManaValuePredicate(ComparisonType.FEWER_THAN, permanent.getManaCost().manaValue()));

    public ClementTheWorrywart(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{G}{U}");

        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.FROG);
        this.subtype.add(SubType.DRUID);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        this.addAbility(VigilanceAbility.getInstance());
        Ability bounceAbility = new EntersBattlefieldThisOrAnotherTriggeredAbility(
                new ReturnToHandTargetEffect());
        bounceAbility.addTarget();
    }

    private ClementTheWorrywart(final mage.cards.c.ClementTheWorrywart card) {
        super(card);
    }

    @Override
    public mage.cards.c.ClementTheWorrywart copy() {
        return new mage.cards.c.ClementTheWorrywart(this);
    }
}
