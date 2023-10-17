public abstract class Human implements ClientBehavior {
    protected final String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Human(String name) {
        this.name = name;
    }

    public abstract String getName();
}