package com.kodilla.kolkoikrzyzyk;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

@ExtendWith(MockitoExtension.class)
class KolkoIKrzyzykTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void init() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("This is the end of tests.");
    }

    @BeforeEach
    public void beforeEach() {
        testCounter++;
        System.out.println("Executing test number " + testCounter);
    }

    @Test
    void testIsWinnerRow1X() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "X";
        board[0][1] = "X";
        board[0][2] = "X";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerRow2X() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[1][0] = "X";
        board[1][1] = "X";
        board[1][2] = "X";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerRow3X() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[2][0] = "X";
        board[2][1] = "X";
        board[2][2] = "X";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerColumn1X() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "X";
        board[1][0] = "X";
        board[2][0] = "X";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerColumn2X() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][1] = "X";
        board[1][1] = "X";
        board[2][1] = "X";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerColumn3X() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][2] = "X";
        board[1][2] = "X";
        board[2][2] = "X";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerSlant1X() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "X";
        board[1][1] = "X";
        board[2][2] = "X";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerSlant2X() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][2] = "X";
        board[1][1] = "X";
        board[2][0] = "X";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerRow1O() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "O";
        board[0][1] = "O";
        board[0][2] = "O";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerRow2O() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[1][0] = "O";
        board[1][1] = "O";
        board[1][2] = "O";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerRow3O() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[2][0] = "O";
        board[2][1] = "O";
        board[2][2] = "O";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerColumn1O() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "O";
        board[1][0] = "O";
        board[2][0] = "O";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerColumn2O() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][1] = "O";
        board[1][1] = "O";
        board[2][1] = "O";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerColumn3O() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][2] = "O";
        board[1][2] = "O";
        board[2][2] = "O";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerSlant1O() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "O";
        board[1][1] = "O";
        board[2][2] = "O";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsWinnerSlant2O() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][2] = "O";
        board[1][1] = "O";
        board[2][0] = "O";
        Result result = new Result();
        //When
        boolean isWinner = result.isWinner(board);
        //Then
        assertTrue(isWinner);
    }

    @Test
    void testIsDrawTrue() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "X";
        board[0][1] = "O";
        board[0][2] = "X";
        board[1][0] = "X";
        board[1][1] = "X";
        board[1][2] = "O";
        board[2][0] = "O";
        board[2][1] = "X";
        board[2][2] = "O";
        Result result = new Result();
        //When
        boolean isDraw = result.isDraw(board);
        //Then
        assertTrue(isDraw);
    }

    @Test
    void testIsDrawFalse11() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = " ";
        board[0][1] = "O";
        board[0][2] = "X";
        board[1][0] = "X";
        board[1][1] = "X";
        board[1][2] = "O";
        board[2][0] = "O";
        board[2][1] = "X";
        board[2][2] = "O";
        Result result = new Result();
        //When
        boolean isDraw = result.isDraw(board);
        //Then
        assertFalse(isDraw);
    }

    @Test
    void testIsDrawFalse12() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "X";
        board[0][1] = " ";
        board[0][2] = "X";
        board[1][0] = "X";
        board[1][1] = "X";
        board[1][2] = "O";
        board[2][0] = "O";
        board[2][1] = "X";
        board[2][2] = "O";
        Result result = new Result();
        //When
        boolean isDraw = result.isDraw(board);
        //Then
        assertFalse(isDraw);
    }

    @Test
    void testIsDrawFalse13() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "X";
        board[0][1] = "O";
        board[0][2] = " ";
        board[1][0] = "X";
        board[1][1] = "X";
        board[1][2] = "O";
        board[2][0] = "O";
        board[2][1] = "X";
        board[2][2] = "O";
        Result result = new Result();
        //When
        boolean isDraw = result.isDraw(board);
        //Then
        assertFalse(isDraw);
    }

    @Test
    void testIsDrawFalse21() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "X";
        board[0][1] = "O";
        board[0][2] = "X";
        board[1][0] = " ";
        board[1][1] = "X";
        board[1][2] = "O";
        board[2][0] = "O";
        board[2][1] = "X";
        board[2][2] = "O";
        Result result = new Result();
        //When
        boolean isDraw = result.isDraw(board);
        //Then
        assertFalse(isDraw);
    }

    @Test
    void testIsDrawFalse22() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "X";
        board[0][1] = "O";
        board[0][2] = "X";
        board[1][0] = "X";
        board[1][1] = " ";
        board[1][2] = "O";
        board[2][0] = "O";
        board[2][1] = "X";
        board[2][2] = "O";
        Result result = new Result();
        //When
        boolean isDraw = result.isDraw(board);
        //Then
        assertFalse(isDraw);
    }

    @Test
    void testIsDrawFalse23() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "X";
        board[0][1] = "O";
        board[0][2] = "X";
        board[1][0] = "X";
        board[1][1] = "X";
        board[1][2] = " ";
        board[2][0] = "O";
        board[2][1] = "X";
        board[2][2] = "O";
        Result result = new Result();
        //When
        boolean isDraw = result.isDraw(board);
        //Then
        assertFalse(isDraw);
    }

    @Test
    void testIsDrawFalse31() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "X";
        board[0][1] = "O";
        board[0][2] = "X";
        board[1][0] = "X";
        board[1][1] = "X";
        board[1][2] = "O";
        board[2][0] = " ";
        board[2][1] = "X";
        board[2][2] = "O";
        Result result = new Result();
        //When
        boolean isDraw = result.isDraw(board);
        //Then
        assertFalse(isDraw);
    }

    @Test
    void testIsDrawFalse32() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "X";
        board[0][1] = "O";
        board[0][2] = "X";
        board[1][0] = "X";
        board[1][1] = "X";
        board[1][2] = "O";
        board[2][0] = "O";
        board[2][1] = " ";
        board[2][2] = "O";
        Result result = new Result();
        //When
        boolean isDraw = result.isDraw(board);
        //Then
        assertFalse(isDraw);
    }

    @Test
    void testIsDrawFalse33() {
        //Given
        EmptyBoard emptyBoard = new EmptyBoard();
        String[][] board = emptyBoard.getEmptyBoard();
        board[0][0] = "X";
        board[0][1] = "O";
        board[0][2] = "X";
        board[1][0] = "X";
        board[1][1] = "X";
        board[1][2] = "O";
        board[2][0] = "O";
        board[2][1] = "X";
        board[2][2] = " ";
        Result result = new Result();
        //When
        boolean isDraw = result.isDraw(board);
        //Then
        assertFalse(isDraw);
    }

//    @Test
//    void testNoSuchFieldException() {
//        //Given
//        EmptyBoard emptyBoard = new EmptyBoard();
//        String[][] board = emptyBoard.getEmptyBoard();
//        PlayersMoves playersMoves = new PlayersMoves();
//        board[4][4] = "X";
//        //When & Then
//        assertThrows(NoSuchFieldException.class, () -> playersMoves.getPlayerMove(board, "X"));
//    }

}
