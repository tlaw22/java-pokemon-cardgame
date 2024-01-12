public class Pokemon {
    int id;
    String name;
    String Type1;
    String Type2;
    public Pokemon(int id, String name, String type1, String type2, int total, int hP, int attack, int defense,
            int spAttack, int spDefense, int speed, int generation, boolean legendary) {
        this.id = id;
        this.name = name;
        Type1 = type1;
        Type2 = type2;
        this.total = total;
        HP = hP;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }
    int total;
    int HP;
    int attack;
    int defense;
    int spAttack;
    int spDefense;
    int speed;
    int generation;
    boolean legendary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType1() {
        return Type1;
    }
    public void setType1(String type1) {
        Type1 = type1;
    }
    public String getType2() {
        return Type2;
    }
    public void setType2(String type2) {
        Type2 = type2;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int hP) {
        HP = hP;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getSpAttack() {
        return spAttack;
    }
    public void setSpAttack(int spAttack) {
        this.spAttack = spAttack;
    }
    public int getSpDefense() {
        return spDefense;
    }
    public void setSpDefense(int spDefense) {
        this.spDefense = spDefense;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getGeneration() {
        return generation;
    }
    public void setGeneration(int generation) {
        this.generation = generation;
    }
    public boolean isLegendary() {
        return legendary;
    }
    public void setLegendary(boolean legendary) {
        this.legendary = legendary;
    }
}
