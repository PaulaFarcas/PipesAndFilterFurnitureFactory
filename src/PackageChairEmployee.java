public class PackageChairEmployee implements Employees{

    @Override
    public Chair action(Chair chair) {
        chair.setPackageChair(true);
        System.out.println("Chair packaged\n");
        return chair;
    }
}
