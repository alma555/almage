package mage.cards.c;

import java.util.Objects;
import java.util.UUID;
import mage.MageInt;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.common.counter.AddCountersSourceEffect;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.constants.Zone;
import mage.counters.CounterType;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.common.FilterControlledPermanent;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.ZoneChangeGroupEvent;
import mage.game.permanent.PermanentImpl;
import mage.game.permanent.token.SquirrelToken;
import mage.abilities.Ability;
import mage.abilities.common.SacrificePermanentTriggeredAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.common.ForageCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.continuous.GainAbilityControlledEffect;
import mage.abilities.effects.common.counter.AddCountersAllEffect;
import mage.abilities.keyword.MenaceAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;

/**
 * @author alma555
 */
public final class CamelliaTheSeedmiser extends CardImpl {

    private static final FilterPermanent filterFood =
            new FilterPermanent(SubType.FOOD, "one or more Foods");

    private static final FilterControlledPermanent filterSquirrels =
            new FilterControlledPermanent(SubType.SQUIRREL,"Squirrels");

    public CamelliaTheSeedmiser(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{B}{G}");

        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.SQUIRREL);
        this.subtype.add(SubType.WARLOCK);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        // Menace
        this.addAbility(new MenaceAbility());

        // Other Squirrels you control have menace.
        Ability lordAbility = new SimpleStaticAbility(Zone.BATTLEFIELD,new GainAbilityControlledEffect(
                new MenaceAbility(false),
                Duration.WhileOnBattlefield,
                filterSquirrels,
                true
        ));
        this.addAbility(lordAbility);

        // Whenever you sacrifice one or more Foods, create a 1/1 green Squirrel creature token.
        Ability tokenAbility = new SacrificePermanentTriggeredAbility(
                new CreateTokenEffect(new SquirrelToken()), filterFood);
        this.addAbility(tokenAbility);

        // {2}, Forage: Put a +1/+1 counter on each other Squirrel you control.
        Ability forageAbility = new SimpleActivatedAbility(
                new AddCountersAllEffect(CounterType.P1P1.createInstance(), filterSquirrels),
                new ManaCostsImpl<>("{2}")
        );
        forageAbility.addCost(new ForageCost());
        this.addAbility(forageAbility);
    }

    private CamelliaTheSeedmiser(final CamelliaTheSeedmiser card) {
        super(card);
    }

    @Override
    public CamelliaTheSeedmiser copy() {
        return new CamelliaTheSeedmiser(this);
    }
}

class CamelliaTheSeedmiserTriggeredAbility extends TriggeredAbilityImpl {

    CamelliaTheSeedmiserTriggeredAbility() {
        super(Zone.BATTLEFIELD, new AddCountersSourceEffect(CounterType.P1P1.createInstance()), false);
    }

    private CamelliaTheSeedmiserTriggeredAbility(final CamelliaTheSeedmiserTriggeredAbility ability) {
        super(ability);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.ZONE_CHANGE_GROUP;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        ZoneChangeGroupEvent zEvent = (ZoneChangeGroupEvent) event;
        return Zone.BATTLEFIELD == zEvent.getToZone()
                && zEvent.getTokens() != null
                && zEvent
                .getTokens()
                .stream()
                .filter(Objects::nonNull)
                .map(PermanentImpl::getControllerId)
                .anyMatch(this::isControlledBy);
    }

    @Override
    public CamelliaTheSeedmiserTriggeredAbility copy() {
        return new CamelliaTheSeedmiserTriggeredAbility(this);
    }
}

