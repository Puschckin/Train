public class Woman extends BaseVoter {
    public Woman(int age) {
        super(age);
    }

    public Gender getGender() {
        return Gender.FEMALE;
    }
}
