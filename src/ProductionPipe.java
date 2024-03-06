import java.util.ArrayList;

public class ProductionPipe {
    private ArrayList<Employees> employeesList=new ArrayList<>();

    public boolean checkCondition(){
        Employees employee1=employeesList.get(0);
        Employees employeeLast=employeesList.get(employeesList.size()-1);
        boolean condition=false;
        for(Employees e: employeesList){
            if(e instanceof AssembleFeetEmployee){
                condition=true;
                break;
            }
            if(e instanceof AssembleStabilizerBarEmployee){
                break;
            }
        }

        return employee1 instanceof CutSeatEmployee && employeeLast instanceof PackageChairEmployee && condition;
    }

    public void attachEmployee(Employees e){
        employeesList.add(e);
    }

    public void assembleChair(Chair chair){
        for(Employees e: employeesList){
            e.action(chair);
        }
    }
}
