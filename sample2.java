class test {

    public void PlayMusic() {

        System.out.println("PlayMusic");
    }

    public String wantapen(int cost) {

        if (cost >= 10)
            return "yougotapen";
        else
            return "notgotapen";

    }
}

public class sample2 {

    public static void main(String[] args) {
        test com = new test();
        com.PlayMusic();
        String str = com.wantapen(2);
        System.out.println(str);
    }
}