public class StarHouse extends House{
    public StarHouse(int id, String name, String address, int price, int year, String person) {
        super(id, name, address, price, year, String.valueOf(person));
    }

    @Override
    public void city() {
        System.out.println("Star House JAlal Abad shaarynda jaygashkan");
    }

    @Override
    public void electricity() {
        System.out.println("Айына 1050 сом толойт ");
    }
}
