package main.java.profession.level1.lesson8.core.domain;

public final class MatrixCoordinate {

    private final int row;
    private final int column;

    public MatrixCoordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

}
