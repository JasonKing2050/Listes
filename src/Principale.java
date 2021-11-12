import java.util.ArrayDeque;
import java.util.Deque;

public class Principale {


    public static <E> Deque<E> inverser(Deque<E> pile){
        Deque<E> pileInverse = new ArrayDeque<E>();

        while (!pile.isEmpty()){
            pileInverse.push(pile.pop());
        }
        return pileInverse;
    }

    public static <E> void rempiler(Deque<E> pile){
        Deque<E> pileInverse = new ArrayDeque<E>();

        while (!pile.isEmpty()){
            pileInverse.push(pile.pop());
            pile.add(pileInverse.remove());
        }
    }

    public static void main(String[] args) {

        Deque<String> a = new ArrayDeque<>();
        a.push("qwer");
        a.push("fghjh");
        a.push("cghk");
        //ArrayDeque<String> b = new ArrayDeque<>();
        System.out.println(a.pop());
    }
}
