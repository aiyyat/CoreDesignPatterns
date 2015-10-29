package org.technicalyorker.dp.creational.prototype.wargame;

import java.util.Arrays;

/**
 * This class tests out the object cloning. On running this one can see that the
 * Wizards all have the same soul though they are otherwise different
 * physically.
 * 
 * @author achuth
 *
 */
public class FairyWarField {
	public static void main(String[] args) {
		Battalion battalion = new Battalion();
		try {
			System.out.println(Arrays.toString(battalion.clone()));
			System.out.println(Arrays.toString(battalion.clone()));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
