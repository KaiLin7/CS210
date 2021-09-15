package tables;

import java.util.Iterator;
import java.util.List;

/**
 * Implements a hash-based table
 * using an array data structure.
 */
public class HashArrayTable extends Table {
	/*
	 * TODO: For Module 1, implement the stubs.
	 *
	 * Until then, this class is unused.
	 */

	/**
	 * Creates a table and initializes
	 * the data structure.
	 *
	 * @param tableName the table name
	 * @param columnNames the column names
	 * @param columnTypes the column types
	 * @param primaryIndex the primary index
	 */
	public HashArrayTable(String tableName, List<String> columnNames, List<String> columnTypes, Integer primaryIndex) {
	//initialize all the schema properties
		//example setTableName(tableName);
		
		//initialize the fields, or call clear 
	}

	@Override
	public void clear() {
		//initialize the array as necessary
		//initialize companion variable as necessary

	}

	@Override
	public boolean put(List<Object> row) {
		//implement put
		//if necessary,rehash
		return false;
	}
	
	//helper methods
	//hash function
	//collision resolution technique
	//computing prime numbers
	
	@Override
	public boolean remove(Object key) {
		//implement remove
		return false;
	}

	@Override
	public List<Object> get(Object key) {
		//implement get
		return null;
	}

	//implement helper method when rehashing
	
	@Override
	public int size() {
		//return size companion variable
		return 0;
	}

	@Override
	public int capacity() {
		//return the length of the array
		return 0;
	}

	@Override
	public Iterator<List<Object>> iterator() {
		//implement the iterator
		return null;
	}
}
