package ohm.softa.a03.state;

import ohm.softa.a03.Cat;

public class DeathState extends State {
    public DeathState() {
        super(0);
    }

    @Override
    State successor(Cat cat) {
        return new DeathState();
    }
}
