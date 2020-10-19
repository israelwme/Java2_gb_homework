public class Robot implements Competitor {
    private float runLimit;
    private float jumpLimit;
    private boolean active;

    public Robot (float runLimit, float jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.active = true;
    }

    @Override
    public void run(Track track) {
        if (active) {
            if (track.getSize() >= runLimit) {
                System.out.printf("%s не смог пробежать трэк. Длина трека: %.2f, предел: %.2f.%n", this.getClass().getSimpleName(), track.getSize(), runLimit);
                active = false;
            } else {
                System.out.printf("%s успешно пробежал трэк. Длина трека: %.2f, предел: %.2f.%n", this.getClass().getSimpleName(), track.getSize(), runLimit);
            }
        }
    }

    @Override
    public void jump(Wall wall) {
        if (active) {
            if (wall.getSize() > jumpLimit) {
                System.out.printf("%s не смог перепрыгнуть стену. Высота стены: %.2f, предел: %.2f.%n", this.getClass().getSimpleName(), wall.getSize(), jumpLimit);
                active = false;
            } else {
                System.out.printf("%s успешно перепрыгнул стену. Высота стены: %.2f, предел: %.2f.%n", this.getClass().getSimpleName(), wall.getSize(), jumpLimit);
            }
        }
    }

}