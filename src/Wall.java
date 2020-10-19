public class Wall implements Let {
    private float size;

    public Wall(int height) {
        size = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(this);
    }

    @Override
    public float getSize() {
        return size;
    }
}