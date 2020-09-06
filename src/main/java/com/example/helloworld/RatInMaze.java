package com.example.helloworld;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RatInMaze {
	private final boolean[][] visited;
	private final int[][] matrix;
	private final int[][] directions = {
			{0, 1}, //right
			{1, 0}, //down
			{1, 1}, //diagonal right down
			{1, -1},  //diagonal left down
			{1, -1}, //left
			{-1, 0}, //up
			{-1, +1}, //diagonal right up
			{-1, -1}, //diagonal left up
	};
	private final int size;
	private final List<int[]> path;
	int ROW = 0;
	int COLUMN = 1;
	private boolean hasReachedDestination;

	RatInMaze(int[][] m) {
		size = m.length;
		matrix = m;
		visited = new boolean[size][size];
		path = new ArrayList<int[]>();
		hasReachedDestination = false;
	}

	public List<int[]> pathExists() {
		dfs(0, 0);
		return path;
	}

	private boolean isSafe(int r, int c) {
		if (r < 0 || r > size - 1 || c < 0 || c > size - 1 || matrix[r][c] == 0)
			return false;
		return true;
	}

	private void dfs(int r, int c) {
		visited[r][c] = true;
		path.add(makeArray(r, c));

		if (checkIfReached(r, c))
			return;

		for (int[] direction : directions) {
			int newR = r + direction[ROW];
			int newC = c + direction[COLUMN];

			if (isSafe(newR, newC) && !visited[newR][newC])
				dfs(newR, newC);
			if (hasReachedDestination)
				return;
		}
		path.remove(path.size() - 1);
	}

	private int[] makeArray(int r, int c) {
		return new int[]{r, c};
	}

	private boolean checkIfReached(int r, int c) {
		if (r == size - 1 && c == size - 1) {
			hasReachedDestination = true;
			return true;
		}
		return false;
	}

	private boolean checkIfReached(Point point) {
		return checkIfReached(point.x, point.y);
	}

	public int bfs(Queue<QueueNode> queue) {
		while (!queue.isEmpty()) {
			QueueNode node = queue.peek();
			queue.remove();

			int r = node.getPoint().x;
			int c = node.getPoint().y;
			visited[r][c] = true;
			if (checkIfReached(node.getPoint()))
				return node.getDistance();

			for (int[] direction : directions) {
				int newR = r + direction[ROW];
				int newC = c + direction[COLUMN];
				if (isSafe(newR, newC) && !visited[newR][newC]) {
					QueueNode reachableNode = new QueueNode(new Point(newR, newC), node.getDistance() + 1);
					queue.add(reachableNode);
				}
			}
		}
		return -1;
	}

	public int shortestPath() {
		//bfs
		Queue<QueueNode> queue = new LinkedList<QueueNode>();
		queue.add(new QueueNode(new Point(0, 0), 0));
		return bfs(queue);
	}

	class QueueNode {
		private final Point point;
		private final int distance;

		QueueNode(Point p, int d) {
			point = p;
			distance = d;
		}

		public Point getPoint() {
			return point;
		}

		public int getDistance() {
			return distance;
		}
	}
/*
	public static void main(String[] args){
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

		int[][] matrix = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
		};
		RatInMaze matrixSolver = new RatInMaze(matrix, matrix.length);
		/*for (int[] cell : matrixSolver.pathExists()) {
			System.out.println(cell[matrixSolver.ROW] + "," + cell[matrixSolver.COLUMN]);
		}

		System.out.println(matrixSolver.shortestPath());
	}

	*/
}
