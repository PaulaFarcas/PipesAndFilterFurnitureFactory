public class Main {
    public static void main(String[] args) {

        Chair chair=new Chair();
        Chair chair2=new Chair();

        ProductionPipe productionPipe =new ProductionPipe();

        Employees cutSeatEmployee=new CutSeatEmployee();
        Employees assembleBackrestEmployee=new AssembleBackrestEmployee();
        Employees assembleFeetEmployee=new AssembleFeetEmployee();
        Employees assembleStabilizerBarEmployee=new AssembleStabilizerBarEmployee();
        Employees packageChairEmployee=new PackageChairEmployee();
        Employees armrestEmployee=new Armrest();

        productionPipe.attachEmployee(cutSeatEmployee);
        productionPipe.attachEmployee(assembleBackrestEmployee);
        productionPipe.attachEmployee(assembleFeetEmployee);
        productionPipe.attachEmployee(assembleStabilizerBarEmployee);
        productionPipe.attachEmployee(packageChairEmployee);

        if(productionPipe.checkCondition()){
            productionPipe.assembleChair(chair);
            productionPipe.assembleChair(chair);
        }
        else{
            System.out.println("Order for assembling the chair is wrong!\n ");
        }


        ProductionPipe productionPipe2 =new ProductionPipe();

        productionPipe2.attachEmployee(assembleFeetEmployee);
        productionPipe2.attachEmployee(assembleBackrestEmployee);
        productionPipe2.attachEmployee(armrestEmployee);
        productionPipe2.attachEmployee(assembleStabilizerBarEmployee);
        productionPipe2.attachEmployee(packageChairEmployee);


        if(productionPipe2.checkCondition()){

            productionPipe2.assembleChair(chair);
        }
        else{
            System.out.println("Order for assembling the chair is wrong!\n ");
        }

    }
}