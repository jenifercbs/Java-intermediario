public class testesoma{

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        var t1 = new minhathreadrunnable("#1", array);
        var t2 = new minhathreadrunnable("#2", array);
    }
}