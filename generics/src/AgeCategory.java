public enum AgeCategory {
    YOUNG(18, 29),
    ADULT(30, 49),
    OLD(50, 64),
    PENSIONER(65, 100);

    private int left;
    private int right;

    AgeCategory(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public static AgeCategory valueOf(int age) {
        for (AgeCategory ageCategory : values()) {
            if ((ageCategory.left <= age) && (age <= ageCategory.right)) {
                return ageCategory;
            }
        }
        throw new IllegalArgumentException();
    }
}

class AgeCategoryFake {
    private static final AgeCategoryFake[] values;
    private static final AgeCategoryFake YOUNG;
    private static final AgeCategoryFake ADULT;
    private static final AgeCategoryFake OLD;
    private static final AgeCategoryFake PENSIONER;

    static {
        values = new AgeCategoryFake[4];
        values[0] = YOUNG = new AgeCategoryFake(18, 29);
        values[1] = ADULT = new AgeCategoryFake(30, 49);
        values[2] = OLD = new AgeCategoryFake(50, 64);
        values[3] = PENSIONER = new AgeCategoryFake(65, 200);
    }

    private int left;
    private int right;

    private AgeCategoryFake(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public static AgeCategoryFake valueOf(int age) {
        for (AgeCategoryFake ageCategory : values()) {
            if ((ageCategory.left <= age) && (age <= ageCategory.right)) {
                return ageCategory;
            }
        }
        throw new IllegalArgumentException();
    }

    public static AgeCategoryFake[] values() {
        return values;
    }
}
