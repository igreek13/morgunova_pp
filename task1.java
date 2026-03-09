boolean pointInCircle(double centerX, double centerY, double radius, double pointX, double pointY) {
    double distanceSquared = Math.pow(pointX - centerX, 2) + Math.pow(pointY - centerY, 2);
    return distanceSquared <= Math.pow(radius, 2);
}

void main() {
    double centerX = 0.0;
    double centerY = 0.0;
    double radius = 5.0;
    double pointX = 3.0;
    double pointY = 4.0;

    boolean result1 = pointInCircle(centerX, centerY, radius, pointX, pointY);
    System.out.println("Точка (" + pointX + "; " + pointY + ") лежит внутри круга с центром " +
            "(" + centerX + "; " + centerY + ") и радиусом " + radius + ": " + result1);

    pointX = 6.0;
    pointY = 0.0;
    boolean result2 = pointInCircle(centerX, centerY, radius, pointX, pointY);
    System.out.println("Точка (" + pointX + "; " + pointY + ") лежит внутри круга с центром " +
            "(" + centerX + "; " + centerY + ") и радиусом " + radius + ": " + result2);
}
