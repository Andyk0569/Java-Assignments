package concept_implementation;

class Counter {
    private static int count = 0;

    Counter() {
        count++;
    }

    public int getCount() {
        return count;
    }

}

public class StaticKeywordExample {
    public static void main(String[] args) {

        Counter cnt = new Counter();
        Counter cnt1 = new Counter();
        Counter cnt2 = new Counter();

        cnt.getCount();
        cnt1.getCount();

        System.out.println(cnt2.getCount());

    }
}

/*
 * What This Shows
 * ✔ count is static
 * 
 * There is only one copy of this variable, shared among all Counter instances.
 * 
 * ✔ The constructor increments it
 * 
 * Every time you do new Counter(), the static count increases.
 */