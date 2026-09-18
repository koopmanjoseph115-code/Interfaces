public class ShortWordFilter implements Filter {
    @Override
    public boolean accept(Object x) {
        if (x instanceof String){
            String word = x.toString();
            if (word.length()<5){
                return true;
            }
        }
        return false;
    }
}
