package com.example.helloworld;
import static java.lang.System.out;

import java.util.List;

class HelloWorld {
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 1, 1, 1, 0, 0},
				{0, 0, 0, 0, 1, 0},
				{0, 0, 1, 0, 1, 0},
				{0, 1, 0, 1, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{0, 0, 1, 1, 1, 1}
		};
		RatInMaze matrixSolver = new RatInMaze(matrix);
		/*for (int[] cell : matrixSolver.pathExists()) {
			System.out.println(cell[matrixSolver.ROW] + "," + cell[matrixSolver.COLUMN]);
		}*/

		System.out.println(matrixSolver.shortestPath());
	}

	public static void testNotNull(List<Integer> list) {
		if (list == null)
			new TestNullable().foo(list);
	}

	public boolean isGreater(int n1, int n2) {
		return n1 > n2;
	}

}
