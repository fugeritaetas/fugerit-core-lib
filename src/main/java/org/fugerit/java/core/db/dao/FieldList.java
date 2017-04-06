package org.fugerit.java.core.db.dao;

import java.util.Vector;

import org.fugerit.java.core.db.helpers.DAOID;

/*
 *
 * @author Matteo a.k.a. Fugerit (d@fugerit.org)
 *
 */
public class FieldList {
	 
	private FieldFactory fieldFactory;
	
    private Vector list;
    
    public Field getField(int index) {
        return (Field)this.list.get(index);
    }
    
    public int size() {
        return this.list.size();
    }
    
    public void addField(Field f) {
        this.list.add(f);
    }
    

    public FieldList( FieldFactory fieldFactory ) {
        super();
        this.list = new Vector();
        this.fieldFactory = fieldFactory;
    }
    

    public FieldList(FieldFactory fieldFactory, Field f) {
        this( fieldFactory );
        this.addField(f);
    }

	public void addField(DAOID value) {
		this.addField( value.longValue() );
	}

	public Field newField(int value, int type) {
		return fieldFactory.newField(value, type);
	}

	public void addField(int value) {
		this.addField( fieldFactory.newField(value) );
	}

	public void addField(long value, int type) {
		this.addField( fieldFactory.newField(value, type) );
	}

	public void addField(long value) {
		this.addField( fieldFactory.newField(value) );
	}

	public void addField(Object value, int type) {
		this.addField( fieldFactory.newField(value, type) );
	}

	public void addField(Object value) {
		this.addField( fieldFactory.newField(value) );
	}

	public void addField(String value, int type) {
		this.addField( fieldFactory.newField(value, type) );
	}

	public void addField(String value) {
		this.addField( fieldFactory.newField(value) );
	}

	public void addNullField(int type) {
		this.addField( fieldFactory.nullField(type) );
	}    

}
