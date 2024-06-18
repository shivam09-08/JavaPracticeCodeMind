package CollectionSortingComparatercompare;

import java.util.Comparator;

public class RollNoSorting implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.rno==o2.rno)
			return 0;
		else if(o1.rno>o2.rno)
			return 1;
		else
		return -1;
	}

}
