package com.example.helloworld;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class RatInMaze {
	private final Set<Point> visited;
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

	RatInMaze(int[][] m, int n) {
		size = n;
		matrix = m;
		visited = new HashSet<Point>();
		path = new ArrayList<int[]>();
		hasReachedDestination = false;
	}

	private boolean isSafe(int r, int c) {
		if (r < 0 || r > size - 1 || c < 0 || c > size - 1 || matrix[r][c] == 0)
			return false;
		return true;
	}

	public List<int[]> pathExists() {
		pathExists(0, 0);
		return path;
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

	private boolean isNotVisited(int r, int c) {
		return !visited.contains(new Point(r, c));
	}

	private void pathExists(int r, int c) {
		visited.add(new Point(r, c));
		path.add(makeArray(r, c));

		if (checkIfReached(r, c))
			return;

		for (int[] direction : directions) {
			int newR = r + direction[ROW];
			int newC = c + direction[COLUMN];

			if (isSafe(newR, newC) && isNotVisited(newR, newC))
				pathExists(newR, newC);
			if (hasReachedDestination)
				return;
		}
		path.remove(path.size() - 1);
	}


	public int shortestPath() {

		class QueueNode {
			private Point point;
			private int distance;

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

		Queue<QueueNode> queue = new LinkedList<QueueNode>();
		queue.add(new QueueNode(new Point(0, 0), 0));

		while (!queue.isEmpty()) {
			QueueNode node = queue.peek();
			queue.remove();
			visited.add(node.getPoint());
			if (checkIfReached(node.getPoint()))
				return node.getDistance();

			for (int[] direction : directions) {
				int newR = node.getPoint().x + direction[ROW];
				int newC = node.getPoint().y + direction[COLUMN];
				if (isSafe(newR, newC) && isNotVisited(newR, newC)) {
					QueueNode reachableNode = new QueueNode(new Point(newR, newC), node.getDistance() + 1);
					queue.add(reachableNode);
				}

			}
		}
		return -1;
	}
}
