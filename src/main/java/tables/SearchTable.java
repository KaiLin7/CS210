package tables;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Implements a search-based table
 * using a list data structure.
 */
public class SearchTable extends Table {
	private List<List<Object>> list;

	/**
	 * Creates a table and initializes
	 * the data structure.
	 *
	 * @param tableName the table name
	 * @param columnNames the column names
	 * @param columnTypes the column types
	 * @param primaryIndex the primary index
	 */
	public SearchTable(String tableName, List<String> columnNames, List<String> columnTypes, Integer primaryIndex) {
		setTableName(tableName);
		setColumnNames(columnNames);
		setColumnTypes(columnTypes);
		setPrimaryIndex(primaryIndex);

		list = new LinkedList<>();
	}

	@Override
	public void clear() {
		list.clear();
	}

	@Override
	public boolean put(List<Object> row) {
		if (row == null) throw new NullPointerException();

		Object key = row.get(primaryIndex);
		if (key == null) throw new NullPointerException();

		for (int i = 0; i < list.size(); i++) {
			List<Object> old = list.get(i);
			if (old != null && old.get(primaryIndex).equals(key)) {
				list.set(i, row);
				return true;
			}
		}
		list.add(row);
		return false;
	}

	@Override
	public boolean remove(Object key) {
		if (key == null) throw new NullPointerException();

		for (int i = 0; i < list.size(); i++) {
			List<Object> row = list.get(i);
			if (row != null && row.get(primaryIndex).equals(key)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Object> get(Object key) {
		/*
		 * TODO: For Lab 1 (optional), implement
		 * the move-to-front or transpose heuristic.
		 */

		if (key == null) throw new NullPointerException();

		for (int i = 0; i < list.size(); i++) {
			List<Object> row = list.get(i);
			if (row != null && row.get(primaryIndex).equals(key))
				return row;
		}
		return null;
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public int capacity() {
		return size();
	}

	@Override
	public Iterator<List<Object>> iterator() {
		return new Iterator<>() {
			int index = 0;

			@Override
			public boolean hasNext() {
				return index < list.size();
			}

			@Override
			public List<Object> next() {
				return list.get(index++);
			}
		};
	}
}