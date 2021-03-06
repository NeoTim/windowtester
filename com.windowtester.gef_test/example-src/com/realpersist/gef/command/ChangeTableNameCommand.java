/*
 * Created on Jul 18, 2004
 */
package com.realpersist.gef.command;

import org.eclipse.gef.commands.Command;

import com.realpersist.gef.model.Table;

/**
 * Command to change the name field
 * 
 * @author Phil Zoio
 */
public class ChangeTableNameCommand extends Command
{

	private Table table;
	private String name, oldName;

	/**
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute()
	{
		table.modifyName(name);
	}

	/**
	 * @return whether we can apply changes
	 */
	public boolean canExecute()
	{
		if (name != null)
		{
			return true;
		}
		else
		{
			name = oldName;
			return false;
		}
	}

	/**
	 * Sets the new Column name
	 * 
	 * @param string
	 *            the new name
	 */
	public void setName(String string)
	{
		this.name = string;
	}

	/**
	 * Sets the old Column name
	 * 
	 * @param string
	 *            the old name
	 */
	public void setOldName(String string)
	{
		oldName = string;
	}

	/**
	 * @param table
	 *            The table to set.
	 */
	public void setTable(Table table)
	{
		this.table = table;
	}

	/**
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo()
	{
		table.modifyName(oldName);
	}

}