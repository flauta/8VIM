package inc.flide.vim8.utils;

import static inc.flide.vim8.models.QuadrantKt.NUMBER_OF_SECTORS;

import android.graphics.PointF;
import inc.flide.vim8.models.Direction;

public final class GeometricUtilities {
    private GeometricUtilities() {
    }

    public static double getSquaredDistanceBetweenPoints(PointF a, PointF b) {
        double distanceXSquare = Math.pow(a.x - b.x, 2);
        double distanceYSquare = Math.pow(a.y - b.y, 2);
        return Math.abs(distanceXSquare + distanceYSquare);
    }

    public static Direction getBaseQuadrant(int continuousQuadrantValue) {
        int result;
        // Calculate result with modulus operator
        result = continuousQuadrantValue % NUMBER_OF_SECTORS;
        return Direction.values()[result];
    }
}

