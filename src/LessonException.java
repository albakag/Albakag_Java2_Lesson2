public class LessonException extends Exception{

    //Результат суммирования элементов массива
    private int sum = 0;

    //Метод проверяющий массив
    public void checkArray(String[][] arrayCheck) throws MyArraySizeException, MyArrayDataException {

        for (int i = 0; i < arrayCheck.length; i++) {
            for (int j = 0; j < arrayCheck[i].length; j++) {
                if (arrayCheck[j].length != arrayCheck.length)
                    throw new MyArraySizeException("Нессоответствие размера массива требуемым параметрам");
                if (!isDigit(arrayCheck[i][j])) {
                    throw new MyArrayDataException("Тип элемента в строке - " + i + ", столбец - " + j + "\n"
                            + " не соответствует int, найдено - " + arrayCheck[i][j]);
                } else
                    sum += Integer.parseInt(arrayCheck[i][j]);

            }
        }
        System.out.println("Сумма всех элементов массива равна - " + sum);
    }

    //Метод проверяющий соответствует ли элемент массива  типу int
    private boolean isDigit(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
