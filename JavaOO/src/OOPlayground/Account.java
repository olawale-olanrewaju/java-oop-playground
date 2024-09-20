package OOPlayground;

public abstract class Account {
    
    private String id;

    public Account(String id){
        this.id = id;
    }

    public Account(Account source){
        this.id = source.id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract Account clone();
}
