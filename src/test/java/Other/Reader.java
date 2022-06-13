package Other;

public class Reader {
    String userFirstName;
    String userSecondName;
    String userLastName;
    int ticketNumber;
    String phoneNumber;

    public void takeBooks(int hasTook, int isTaken) {
        int summOfBooks = hasTook + isTaken;
        int sumOfFine = 0;
        int fine = 50;
        int limitOfBooks = 5;
        int differenceOfBooks = summOfBooks - limitOfBooks;
        System.out.println("Читач " + userSecondName + userFirstName + userLastName + "взяв " + hasTook + " книги. " + "Загалом читач взяв " + summOfBooks + " книг.");
        if(summOfBooks > limitOfBooks) {
            for (int i = 0; i < differenceOfBooks; i++) {
                sumOfFine = sumOfFine + fine;
            }
            System.out.println("Ліміт перевищений на " + differenceOfBooks + " книг. " + "Сумма штрафу " + sumOfFine + " грн.\n");
        }
    }

    public void returnBooks(int hasTook, int isReturn) {
        int leftBooks = hasTook - isReturn;
        int sumOfFine = 0;
        int fine = 50;
        int limitOfBooks = 5;
        int differenceOfBooks = hasTook - limitOfBooks;
        int differenceOfBooksAfter = leftBooks - limitOfBooks;
        System.out.println("Читач " + userSecondName + userFirstName + userLastName + "повернув " + isReturn + " книги. " + "Загалом в читача залишається " + leftBooks + " книг.");
        if (hasTook > limitOfBooks) {
            for (int i = 0; i < differenceOfBooks; i++) {
                sumOfFine =  sumOfFine + fine;
            }
            System.out.println("В читача " + userSecondName + userFirstName + userLastName + "було " + hasTook + " книг.");
            System.out.println("Ліміт перевищений на " + differenceOfBooks + " книг. " + "Сумма штрафу " + sumOfFine + " грн.\n");
        }
        sumOfFine = 0;
        if (leftBooks > limitOfBooks) {
            for (int i = 0; i < differenceOfBooksAfter; i++) {
                sumOfFine =  sumOfFine + fine;
            }
            System.out.println("В читача " + userSecondName + userFirstName + userLastName + "залишилось " + leftBooks + " книг.");
            System.out.println("Ліміт перевищений на " + differenceOfBooksAfter + " книг. " + "Сумма штрафу " + sumOfFine + " грн.\n");
        }
    }

    public Reader(String userSecondName, String userFirstName, String userLastName, int ticketNumber, String phoneNumber) {
        this.userSecondName = userSecondName;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.ticketNumber = ticketNumber;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Reader firstReader = new Reader("Bakal ", "Ioann ", "Evheniovuch ", 2, "0639905444");
        firstReader.takeBooks(4,7);
        firstReader.returnBooks(11,4);

    }

}
