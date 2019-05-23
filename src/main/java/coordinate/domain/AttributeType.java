package coordinate.domain;

public enum AttributeType {
    STRAIGHT_LINE("두 점 사이의 거리는 ", 2),
    TRIANGLE("삼각형 넓이는", 3),
    RECTANGLE("사각형 넓이는", 4);

    private String attribuePrintMessage;
    private int numberOfPointInFigure;

    AttributeType(String attribuePrintMessage, int numberOfPointInFigure) {
        this.attribuePrintMessage = attribuePrintMessage;
        this.numberOfPointInFigure = numberOfPointInFigure;
    }

    public static String getPrintMessage(int numberOfPointInFigure) {
        for (AttributeType attributeType : values()) {
            if (attributeType.matchNumOfPoint(numberOfPointInFigure)) {
                return attributeType.attribuePrintMessage;
            }
        }
        throw new IllegalArgumentException("해당 AttributeType 이 존재하지 않습니다.");
    }

    private boolean matchNumOfPoint(int numberOfPointInFigure) {
        return this.numberOfPointInFigure == numberOfPointInFigure;
    }
}
