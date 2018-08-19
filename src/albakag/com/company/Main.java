package albakag.com.company;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        LessonException exception = new LessonException();
        exception.checkArray(new String[][]{{"2","4","5","1"},{"3","6","4","5"}, {"2","5","4","3"}, {"6","4","9","2"}});
    }
}
