public class VipHouse extends House{
    public VipHouse(int id, String name, String address, int price, int year, String person) {
        super(id, name, address, price, year, String.valueOf(person));
    }

    @Override
    public void city() {
        System.out.println("Vip House Naryn shaarynda jaygashkan ");
    }

    @Override
    public void electricity() {
        System.out.println("Айына 1050 сом толойт");
    }
}
