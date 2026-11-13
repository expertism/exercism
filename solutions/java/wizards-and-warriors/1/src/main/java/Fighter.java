class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()){
            return 10;
        } else{
            return 6;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    boolean preparedSpell;

    boolean prepareSpell(){
        return preparedSpell = true;
    }

    @Override
    boolean isVulnerable() {
        if (preparedSpell) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (preparedSpell){
            return 12;
        } else {
            return 3;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}