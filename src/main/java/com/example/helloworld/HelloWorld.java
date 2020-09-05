package com.example.helloworld;


import java.util.List;

class HelloWorld {

	public static void main(String[] args) {
		/*int size= 3;
		int [][] matrix ={
				{1,0,0},
				{1,0,0},
				{1,1,1}
		};

		int size = 4;
		int[][] matrix = {
				{1, 0, 1, 0},
				{0, 1, 0, 1},
				{0, 0, 0, 1},
				{0, 0, 0, 1}
		};


		int size = 4;
		int[][] matrix = {
				{1, 1, 0, 0},
				{0, 0, 1, 0},
				{0, 1, 0, 0},
				{0, 0, 1, 1}
		};


		int size = 6;
		int[][] matrix = {
				{1, 1, 1, 1, 0, 0},
				{0, 0, 0, 0, 1, 0},
				{0, 0, 1, 0, 1, 0},
				{0, 1, 0, 1, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{0, 0, 1, 1, 1, 1}
		};
*/

		int[][] matrix = {
				{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
				{ 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 },
				{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }
		};


		RatInMaze matrixSolver = new RatInMaze(matrix, matrix.length);
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
