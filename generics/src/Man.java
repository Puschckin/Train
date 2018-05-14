public class Man extends BaseVoter {
    public Man(int age) {
        super(age);
    }

    public Gender getGender() {
        return Gender.MALE;
    }
}
