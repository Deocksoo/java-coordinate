package coordinate;

import coordinate.domain.*;
import coordinate.ui.CartesianPlane;
import coordinate.view.InputView;
import coordinate.view.OutputView;

import java.util.List;

public class CoordinateCalculator {
    public static void main(String[] args) {
        CalculableFigure figure = getFigure();

        CartesianPlane plane = new CartesianPlane();
        plane.drawPoints(figure);
        OutputView.printGraph(plane);

        OutputView.printAreaOf(figure);
    }

    private static CalculableFigure getFigure() {
        try {
            return FigureFactory.getFigureOf(getPoints());
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMsg(e);
            return getFigure();
        }
    }

    private static Points getPoints() {
        String rawInput = InputView.inputPoints();
        return Points.of(rawInput);
    }
}
