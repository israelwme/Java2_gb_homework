public class Track implements Let {
    private float size;

    public Track(int length) {
        size = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(this);
    }

    @Override
    public float getSize() {
        return size;
    }
}