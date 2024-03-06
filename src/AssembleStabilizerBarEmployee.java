public class AssembleStabilizerBarEmployee implements Employees{

    @Override
    public Chair action(Chair chair) {
        chair.setStabilizer(true);
        System.out.println("Stabilizer bar assembled");
        return chair;
    }
}
