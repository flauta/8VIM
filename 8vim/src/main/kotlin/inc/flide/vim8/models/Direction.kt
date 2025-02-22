package inc.flide.vim8.models

import kotlin.math.abs

enum class Direction {
    RIGHT, TOP, LEFT, BOTTOM;

    companion object {
        @JvmStatic
        fun baseQuadrant(continuousQuadrantValue: Int): Direction {
            val result = abs(continuousQuadrantValue % NUMBER_OF_SECTORS)
            return values()[result]
        }
    }
}

fun Direction.toFingerPosition(): FingerPosition {
    return when (this) {
        Direction.RIGHT -> {
            FingerPosition.RIGHT
        }

        Direction.TOP -> {
            FingerPosition.TOP
        }

        Direction.LEFT -> {
            FingerPosition.LEFT
        }

        else -> {
            FingerPosition.BOTTOM
        }
    }
}

fun Direction.opposite(): Direction {
    return when (this) {
        Direction.RIGHT -> {
            Direction.LEFT
        }

        Direction.TOP -> {
            Direction.BOTTOM
        }

        Direction.LEFT -> {
            Direction.RIGHT
        }

        else -> {
            Direction.TOP
        }
    }
}
