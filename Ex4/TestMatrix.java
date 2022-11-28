package com.metanit.Ex4;

import java.util.Scanner;

public class TestMatrix{
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Кол-во строк: ");
        int rows = sc.nextInt();
        System.out.print("Кол-во столбцов: ");
        int columns = sc.nextInt();
        System.out.print("Число, на которое умножется первая матрица: ");
        int num = sc.nextInt();

        try{
            Matrix m1 = new Matrix(rows, columns);
            Matrix m2 = new Matrix(rows, columns);

            int[][] Mat1 = m1.getMatrix(rows,columns);
            int[][] Mat2 = m2.getMatrix(rows,columns);

            System.out.print("Сумма матриц: " + '\n');
            m1.Sum(Mat1, Mat2, rows, columns);

            System.out.print("Матрица 1, умноженная на число: " + '\n');
            m1.Num_mat(Mat1, rows, columns, num);
        }
        catch (NullPointerException e ){
            System.out.println("Неверные размеры матрицы");
        }

    }
}
