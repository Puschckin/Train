abstract class BaseVoter implements Voter {
    private final AgeCategory ageCategory;

    BaseVoter(int age) {
        ageCategory = AgeCategory.valueOf(age);
    }

    @Override
    public AgeCategory getAgeCategory() {
        return ageCategory;
    }
}
