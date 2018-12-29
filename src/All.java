import java.util.HashMap;
import java.util.Random;

public class All {
    HashMap<Integer,String> hash = new HashMap<>();
    Random rand  = new Random();
    public void mapping(){
        for (int i = 0;i<5;i++){
            hash.put(i,random_name());
        }
    }

    public String random_name(){
        String name = "abcdrfghijklmopqrstuvwxyz";
        String names = "";
        for(int i = 0;i < rand.nextInt(10);i++){
            names += name.charAt(rand.nextInt(10));
        }
        return names;
    }

    public void outall(){
        System.out.println(hash.values());
    }
    public void out(int number) {
        hash.get(number);
    }
}
