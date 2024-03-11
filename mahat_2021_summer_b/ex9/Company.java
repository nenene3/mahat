package mahat_2021_summer_b.ex9;

public class Company {
    private Client[] clients;
    private int numOFClients;

    public void print() {

        for (int i = 0; i < numOFClients; i++) {
            Cable c = clients[i].getCable();
            if(c instanceof Triple)
                c=((Triple) c).getPackage1();
            if(c instanceof ExtendedPackage )
                for(int j=0;i<((ExtendedPackage) clients[i].getCable()).getNumOFChannels();j++)
                    if(((ExtendedPackage) clients[i].getCable()).getNamesOFChannels()[j].equals("sport")){
                        System.out.println(clients[i].getNameClient());
                        break;
                    }


        }

    }
    public int num(){
        int sum=0;

        for (int i = 0; i < numOFClients; i++)
            if (clients[i].getCable() instanceof BasicPackage && !(clients[i].getCable() instanceof ExtendedPackage))
                sum++;
        return sum;
    }
}
