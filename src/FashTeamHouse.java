public class FashTeamHouse extends House{
    public FashTeamHouse(int id, String name, String address, int price, int year, String person) {
        super(id, name, address, price, year, String.valueOf(person));
    }

    @Override
    public void city() {
        System.out.println("Fash team House Osh shaarynda jaygashkan");
    }

    @Override
    public void electricity() {
        System.out.println("Айына 1200 сом толойт ");
    }
}
