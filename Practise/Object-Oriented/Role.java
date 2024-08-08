import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces={"ハンサム","イケメン","明るい","醜い","いやらしい"};
    String[] girlfaces={"意地悪い","美しい","派手な","可愛い","上品な"};
    String[]attacks_desc={
            "%Sが%Sに精神的な汚染を与えて、",
            "%Sが%Sを軽く叩いて、",
            "%Sがを%S猫に変えて、"
    };
    String[]injureds_desc={
        "%Sは血を吐いた",
                "%Sは全く気にしない",
                "%Sは少し傷を負った"};



    public Role() {

    }
    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if(gender == '男'){
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        }else if(gender == '女'){
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "変な";
        }
    }



    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }


    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack (Role role){
        Random r1 = new Random();
        int index1 = r1.nextInt(attacks_desc.length);
        String attack = attacks_desc[index1];
        System.out.printf(attack, this.getname(), role.getname());


        int hurt = r1.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 :remainBlood;
        role.setBlood(remainBlood);

        Random r2 = new Random();
        int index2 = r2.nextInt(injureds_desc.length);
        String injureds = injureds_desc[index2];
        System.out.printf(injureds, this.getname(), role.getname());
        System.out.println();

    }

    public void showRoleInfo(){
    System.out.println("名前: " + getname());
    System.out.println("体力: " + getBlood());
    System.out.println("性別: " + getGender());
    System.out.println("顔: " + getFace());
}




}
