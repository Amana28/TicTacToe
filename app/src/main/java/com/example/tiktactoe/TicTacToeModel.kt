package com.example.tiktactoe

import java.util.EmptyStackException

object TicTacToeModel {
    public val EMPTY: Short = 0
    public val CIRCLE: Short = 1
    public val CROSS: Short = 2

    private val model = arrayOf(
        shortArrayOf(EMPTY, EMPTY, EMPTY),
        shortArrayOf(EMPTY, EMPTY, EMPTY),
        shortArrayOf(EMPTY, EMPTY, EMPTY))

    var nextPlayer = CIRCLE

    fun getFieldContent(x: Int, y: Int) = model[x][y]

    fun setFieldContent(x: Int, y: Int, content: Short) {
        model[x][y] = content
    }

    fun changeNextPlayer() {
        nextPlayer = if (nextPlayer == CIRCLE) CROSS else CIRCLE
    }

    fun resetModel() {
        for (i in 0..2) {
            for (j in 0..2) {
                model[i][j] = EMPTY
            }
        }
        nextPlayer = CIRCLE
    }

    fun whoIsWinner() : Short {

//        00 01 02
//        10 11 12
//        20 21 22

        // Check Horizontal Lines

        if (((TicTacToeModel.getFieldContent(0, 0) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(0, 1) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(0, 2) == TicTacToeModel.CIRCLE)) ||
            ((TicTacToeModel.getFieldContent(1, 0) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(1, 1) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(1, 2) == TicTacToeModel.CIRCLE)) ||
            ((TicTacToeModel.getFieldContent(2, 0) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(2, 1) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(2, 2) == TicTacToeModel.CIRCLE))) {

            return CIRCLE
        }

        if (((TicTacToeModel.getFieldContent(0, 0) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(0, 1) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(0, 2) == TicTacToeModel.CROSS)) ||
            ((TicTacToeModel.getFieldContent(1, 0) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(1, 1) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(1, 2) == TicTacToeModel.CROSS)) ||
            ((TicTacToeModel.getFieldContent(2, 0) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(2, 1) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(2, 2) == TicTacToeModel.CROSS))) {

            return CROSS
        }

        // Check Vertical Lines

        if (((TicTacToeModel.getFieldContent(0, 0) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(1, 0) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(2, 0) == TicTacToeModel.CIRCLE)) ||
            ((TicTacToeModel.getFieldContent(0, 1) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(1, 1) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(2, 1) == TicTacToeModel.CIRCLE)) ||
            ((TicTacToeModel.getFieldContent(0, 2) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(1, 2) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(2, 2) == TicTacToeModel.CIRCLE))) {

            return CIRCLE
        }

        if (((TicTacToeModel.getFieldContent(0, 0) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(1, 0) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(2, 0) == TicTacToeModel.CROSS)) ||
            ((TicTacToeModel.getFieldContent(0, 1) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(1, 1) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(2, 1) == TicTacToeModel.CROSS)) ||
            ((TicTacToeModel.getFieldContent(0, 2) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(1, 2) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(2, 2) == TicTacToeModel.CROSS))) {

            return CROSS
        }

        // Check Diagonal Lines
        if (((TicTacToeModel.getFieldContent(0, 0) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(1, 1) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(2, 2) == TicTacToeModel.CIRCLE)) ||
            ((TicTacToeModel.getFieldContent(0, 2) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(1, 1) == TicTacToeModel.CIRCLE) &&
                    (TicTacToeModel.getFieldContent(2, 0) == TicTacToeModel.CIRCLE))) {

            return CIRCLE
        }

        if (((TicTacToeModel.getFieldContent(0, 0) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(1, 1) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(2, 2) == TicTacToeModel.CROSS)) ||
            ((TicTacToeModel.getFieldContent(0, 2) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(1, 1) == TicTacToeModel.CROSS) &&
                    (TicTacToeModel.getFieldContent(2, 0) == TicTacToeModel.CROSS))) {

            return CIRCLE
        }





        return EMPTY

    }

}