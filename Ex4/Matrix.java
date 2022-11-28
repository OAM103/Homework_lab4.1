package com.metanit.Ex4;

import java.util.concurrent.ThreadLocalRandom;

public class Matrix {

    private int rows;
    private int columns;
    private int[][] matrix;

    public Matrix(int rows, int columns){
        if(rows <= 0 || columns <= 0){
            throw new NullPointerException();
        }
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }


    public void Print(int[][] matrix){
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] getMatrix(int rows, int columns){
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                matrix[i][j] = ThreadLocalRandom.current().nextInt(-10,10);
            }
        }
        Print(matrix);
        return matrix;
    }

    public void Sum(int[][] matrix1, int[][] matrix2, int rows, int columns){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] += matrix1[i][j];
            }

        }
        Print(matrix2);
    }

    public void Num_mat(int[][] matrix1, int rows, int columns, int num){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = matrix1[i][j]*num;
            }

        }
        Print(matrix);
    }



}

