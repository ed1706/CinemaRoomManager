package cinema;
import java.util.Scanner;

public class Cinema {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter the number of rows:");
        int numberOfRows = Cinema.sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numberOfSeats = Cinema.sc.nextInt();
        System.out.println();

        CinemaRoom cinemaRoom = new CinemaRoom(numberOfRows, numberOfSeats);

        Cinema.showMenu(cinemaRoom);
    }

    public static void printMenu() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }

    public static void showMenu(CinemaRoom cinemaRoom) throws Exception {
        final int showSeatsButton = 1;
        final int buyTicketButton = 2;
        final int statisticsButton = 3;
        final int exitConst = 0;

        int code;
        do {
            Cinema.printMenu();
            code = Cinema.sc.nextInt();
            switch (code) {
                case showSeatsButton:
                    cinemaRoom.printCinemaPlaces();
                    break;
                case buyTicketButton:
                    cinemaRoom.buyTicket(Cinema.sc);
                    break;
                case statisticsButton:
                    cinemaRoom.showStatistics();
                    break;
                case exitConst:
                    code = 0;
                    break;
                default:
                    System.out.println();
                    break;
            }
        } while (code != 0);
    }
}

class CinemaRoom {

    public CinemaRoom(int numberOfRows, int numberOfSeats) throws Exception {
        if (numberOfRows < 1 ||numberOfSeats < 1) {
            throw new Exception("Exception in CinemaRoom class constructor: "
                + "The number of rows (seats) is invalid value");
        }
        this.rowsCount = numberOfRows;
        this.seatsInRowCount = numberOfSeats;
        cinemaPlaces = new char[rowsCount][seatsInRowCount];
        this.initializeCinemaPlaces();
    }

    public void showStatistics() {
        int[] statisticsArray = calculatePurchasedTicketsNumberAndCurrentIncome();
        int purchasedTicketsNumber = statisticsArray[0];
        int currentIncome = statisticsArray[1];
        double percentage = (double) purchasedTicketsNumber /
                (this.rowsCount * this.seatsInRowCount) * 100;
        int totalIncome = calculateTotalIncome();

        System.out.printf("%nNumber of purchased tickets: %d%n", purchasedTicketsNumber);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.printf("Current income: $%d%n", currentIncome);
        System.out.printf("Total income: $%d%n%n", totalIncome);
    }

    public void printCinemaPlaces() {
        System.out.println();
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int j = 1; j <= seatsInRowCount; j++)
            System.out.print(j + " ");
        System.out.println();

        for(int i = 0; i < rowsCount; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < seatsInRowCount; j++)
                System.out.print(cinemaPlaces[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public void initializeCinemaPlaces() {
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < seatsInRowCount; j++) {
                cinemaPlaces[i][j] = 'S';
            }
        }
    }

    public void buyTicket(Scanner sc) throws Exception {
        /*if (!(rowNumber >= 1 && rowNumber <= rowsCount)
            || !(seatNumber >= 1 && seatNumber <= seatsInRowCount)) {
            throw new Exception("Exception in buyTicket (CinemaRoom class) method: "
                + "The row number (seat number) is invalid value");
        }*/

        int rowNumber;
        int seatNumber;
        boolean seatCoordinatesAreInvalid;
        boolean seatPlaceIsNotAvailable;
        do {
            System.out.println();
            System.out.println("Enter a row number:");
            rowNumber = sc.nextInt();
            System.out.println("Enter a seat number in that row:");
            seatNumber = sc.nextInt();

            seatCoordinatesAreInvalid = !(rowNumber >= 1 && rowNumber <= rowsCount)
                    || !(seatNumber >= 1 && seatNumber <= seatsInRowCount);

            if (seatCoordinatesAreInvalid) {
                System.out.println("\r\nWrong input!");
                seatPlaceIsNotAvailable = false;
            } else {
                seatPlaceIsNotAvailable = cinemaPlaces[rowNumber - 1][seatNumber - 1] == 'B';
                if (seatPlaceIsNotAvailable) {
                    System.out.println("\r\nThat ticket has already been purchased!");
                }
            }
        } while (seatCoordinatesAreInvalid || seatPlaceIsNotAvailable);

        int ticketPrice = getTicketPriceBySeat(rowNumber);
        System.out.println("Ticket price: $" + ticketPrice);
        System.out.println();

        cinemaPlaces[rowNumber - 1][seatNumber - 1] = 'B';
    }

    public int getTicketPriceBySeat(int rowNumber) {
        if (rowNumber <= rowsCount / 2 || rowsCount * seatsInRowCount <= CinemaRoom.largeHallBorder) {
            return CinemaRoom.generalSeatPrice;
        }
        return CinemaRoom.backHalfSeatPrice;
    }

    public int[] calculatePurchasedTicketsNumberAndCurrentIncome() {
        final int[] array = new int[2];
        int purchasedTicketsNumber = 0;
        int currentIncome = 0;

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < seatsInRowCount; j++) {
                if (cinemaPlaces[i][j] == 'B') {
                    purchasedTicketsNumber++;
                    currentIncome += getTicketPriceBySeat(i + 1);
                }
            }
        }
        array[0] = purchasedTicketsNumber;
        array[1] = currentIncome;

        return array;
    }

    public int calculateTotalIncome() {
        if (rowsCount * seatsInRowCount <= CinemaRoom.largeHallBorder) {
            return rowsCount * seatsInRowCount * CinemaRoom.generalSeatPrice;
        }
        return ((rowsCount / 2) * CinemaRoom.generalSeatPrice +
                (rowsCount - rowsCount / 2) * CinemaRoom.backHalfSeatPrice) * seatsInRowCount;
    }



    static final int largeHallBorder = 60;
    static final int generalSeatPrice = 10;
    static final int backHalfSeatPrice = 8;

    private final int rowsCount;
    private final int seatsInRowCount;
    private final char[][] cinemaPlaces;
}