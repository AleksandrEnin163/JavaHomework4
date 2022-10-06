package game.hero;

public class Elf4 {

    private long id;

    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String a) {
        nickname = a;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Elf4() {
        System.out.println("Hello from Berlin");
    }

    public Elf4(int id) {
        this.id = id;
        System.out.println(this.id);
    }

    public Elf4(String nickname) {
        this.nickname = nickname;
        System.out.println(this.nickname);
    }

    public Elf4(int id, String nickname) {
        this.id = id;
        this.nickname = nickname;
        System.out.println(this.id, this.nickname);
    }
}
