/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


/**
 * @author iaw21752927
 *
 */
public class ITVManagerImpl extends ITVManager {

	/**
	 * @param itvFile
	 * @throws Exception
	 */
	public ITVManagerImpl(String itvFile) throws Exception {
		super(itvFile);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.fourthassignmenttopics.Manager#getNext()
	 */
	@Override
	public ITV getNext() throws Exception {
		//LocalTime, LocalDate, LocalDateTime
		LocalDateTime now = LocalDateTime.now();
		List<ITV> itvsSortedByDate = sort(new ITVDateComparator());
		for (ITV itv : itvsSortedByDate) {
			if (now.isBefore(itv.getFecha())) {
				return itv;
			}
		}
		return null;
	}

	@Override
	public List<ITV> sort(Comparator<ITV> comparator) throws Exception {
		List<ITV> itvsSorted = new ArrayList<>(itvs);
		Collections.sort(itvsSorted, comparator);
		return itvsSorted;
	}

	@Override
	public List<ITV> from(String where) throws Exception {
		List <ITV> itvsInPlace = new ArrayList<ITV>();
		List<ITV> itvsSortedByPlace = sort(new ITVPlaceComparator());
		for (ITV itv : itvsSortedByPlace) {
			if (itv.getLugar().contentEquals(where)) {
				itvsInPlace.add(itv);
			}
		}
		return itvsInPlace;
	}

	@Override
	public List<ITV> from(LocalDateTime ini, LocalDateTime fin) throws Exception {
		List <ITV> itvsInRange = new ArrayList<ITV>();
		List<ITV> itvsSortedByDate = sort(new ITVDateComparator());
		for (ITV itv : itvsSortedByDate) {
			if (itv.getFecha().isAfter(ini) && itv.getFecha().isBefore(fin)) {
				itvsInRange.add(itv);
			}
		}
		return itvsInRange;
	}
	
}
