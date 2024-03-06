public class AssembleBackrestEmployee implements Employees{

    @Override
    public Chair action(Chair chair) {
        chair.setBack(true);
        System.out.println("Backrest assembled");
        return chair;
    }
}
