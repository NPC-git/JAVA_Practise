public class Role_Test {
    public static void main(String[] args) {


        Role r1 = new Role("Naruto", 100, '男');
        Role r2 = new Role("Sakura", 100, '女');

        r1.showRoleInfo();
        r2.showRoleInfo();

        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r2.getname() + " is dead");
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r1.getname() + " is dead");
                break;
            }
        }

    }
}












