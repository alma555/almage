package mage.cards.a;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BecomesTargetSourceTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.common.DiscardSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.*;
import mage.abilities.effects.common.continuous.BoostControlledEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.FilterCard;
import mage.filter.StaticFilters;
import mage.filter.common.FilterLandCard;
import mage.game.permanent.token.TreasureToken;

import java.util.UUID;

/**
 *
 * @author alma555
 */

public final class AltanakTheThriceCalled extends CardImpl {

    private static final FilterCard filter = new FilterLandCard("land card from your graveyard");

    public AltanakTheThriceCalled(UUID ownerId, CardSetInfo setInfo) {

        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "5GG");

        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.INSECT);
        this.subtype.add(SubType.BEAST);
        this.power = new MageInt(9);
        this.toughness = new MageInt(9);

        // Whenever AltanakTheThriceCalled becomes the target of a spell or ability an opponent controls, draw a card.
        this.addAbility(new BecomesTargetSourceTriggeredAbility(new DrawCardSourceControllerEffect(1)));

        //{1}{G}, Discard Altanak, the Thrice-Called: Return target land card from your graveyard to the battlefield tapped.
        Ability ability = new SimpleActivatedAbility(Zone.HAND, new ReturnFromGraveyardToBattlefieldTargetEffect(true), TargetController.YOU, new ManaCostsImpl<>("{1}{G}"));
        ability.addCost(new DiscardSourceCost());
        this.addAbility(ability);
    }
    private AltanakTheThriceCalled(final AltanakTheThriceCalled card) {
        super(card);
    }

    @Override
    public AltanakTheThriceCalled copy() {
        return new AltanakTheThriceCalled(this);
    }
}
