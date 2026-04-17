package Ejemplo_Buider;

public class Chef {

    private Builder builder;

    public Chef (Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void burgerClassic(){
        builder.setCarne();
        builder.setpan();
        builder.setQueso();
    }

    public void burgerVegan(){
        builder.setpan();
        builder.setCarne();
        builder.setLechuga();
        builder.setMayo();
    }


}
