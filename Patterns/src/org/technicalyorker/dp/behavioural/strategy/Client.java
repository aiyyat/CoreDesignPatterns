package org.technicalyorker.dp.behavioural.strategy;

import org.technicalyorker.dp.behavioural.strategy.sort.NumberSorter;
import org.technicalyorker.dp.behavioural.strategy.sort.strategies.ForwardQuickSortStrategy;
import org.technicalyorker.dp.behavioural.strategy.sort.strategies.ReverseSelectionSortStrategy;

public class Client {
	public static void main(String[] args) {
		NumberSorter selectionSortNumberBoard = new NumberSorter(
				new ReverseSelectionSortStrategy());
		NumberSorter quickSortNumberBoard = new NumberSorter(
				new ForwardQuickSortStrategy());
		selectionSortNumberBoard.display(new int[] { 8, 2, 6, 3, 1, 7, 5, 4 });
		quickSortNumberBoard.display(new int[] { 8, 2, 6, 3, 1, 7, 5, 4 });
	}
}
