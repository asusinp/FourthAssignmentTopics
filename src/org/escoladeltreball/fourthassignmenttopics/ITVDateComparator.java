/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

import java.util.Comparator;

/**
 * @author iaw21752927
 *
 */
public class ITVDateComparator implements Comparator<ITV> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(ITV itv1, ITV itv2) {
		return itv1.getFecha().compareTo(itv2.getFecha());
	}

}
