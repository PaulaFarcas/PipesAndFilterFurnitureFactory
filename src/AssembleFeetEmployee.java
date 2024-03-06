public class AssembleFeetEmployee implements Employees{

    @Override
    public Chair action(Chair chair) {
        chair.setFeet(true);
        System.out.println("Chair feet assembled");
        return chair;
    }
}
