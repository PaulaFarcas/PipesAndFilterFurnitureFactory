public class CutSeatEmployee implements Employees{

    @Override
    public Chair action(Chair chair) {
        chair.setCutSeat(true);
        System.out.println("Seat has been cut");
        return chair;
    }
}
