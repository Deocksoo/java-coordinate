package coordinate.view;

import coordinate.domain.AttributeType;
import coordinate.domain.Figure;

public class OutputView {
    public static void printErrorMsg(Exception e) {
        System.out.println(e.getMessage());
    }

    public static void printAttributeOf(Figure figure) {
        System.out.println(AttributeType.getPrintMessage(figure.getNumOfPoints()) + figure.calculateAttribute());
    }
}
