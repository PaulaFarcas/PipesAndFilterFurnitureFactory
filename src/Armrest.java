public class Armrest implements Employees {

    @Override
    public Chair action(Chair chair) {
        chair.setArms(true);
        System.out.println("Armrest assembled");
        return chair;
    }
}
