/**      
 * QucikKV
 * Copyright (c) 2014-2015 Sumi Makito
 * Licensed under GNU GPL v3 License.
 * @author sumimakito<sumimakito@hotmail.com>
 * @version 0.7
 */ 

package sumimakito.android.quickkv.database;

public abstract class ADatabase
{
	public abstract void put(Object k, Object v);
	
	public abstract Object get(Object k);
	
	public abstract void remove(Object k);
}
