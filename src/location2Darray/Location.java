package location2Darray;

import java.util.Arrays;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public static Location locateLargest(double[][] array) {
        Location location = new Location();
        location.maxValue = Arrays.stream(array).flatMapToDouble(Arrays::stream).max().getAsDouble();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == location.maxValue) {
                    location.row = i;
                    location.column = j;
                    break;
                }
            }
        }
        return location;
    }

    @Override
    public String toString() {
        return "Location{" +
                "row=" + row +
                ", column=" + column +
                ", maxValue=" + maxValue +
                '}';
    }
}
