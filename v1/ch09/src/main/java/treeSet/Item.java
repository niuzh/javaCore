package treeSet;

import java.util.*;

/**
 * An item with a description and a part number.
 */
public class Item implements Comparable<Item> {
	private String description;
	private int partNumber;

	/**
	 * Constructs an item.
	 * 
	 * @param aDescription
	 *            the item's description
	 * @param aPartNumber
	 *            the item's part number
	 */
	public Item(String aDescription, int aPartNumber) {
		description = aDescription;
		setPartNumber(aPartNumber);
	}

	/**
	 * Gets the description of this item.
	 * 
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	public String toString() {
		return "[description=" + description + ", partNumber=" + getPartNumber() + "]";
	}

	public boolean equals(Object otherObject) {
		if (this == otherObject)
			return true;
		if (otherObject == null)
			return false;
		if (getClass() != otherObject.getClass())
			return false;
		Item other = (Item) otherObject;
		return Objects.equals(description, other.description) && getPartNumber() == other.getPartNumber();
	}

	public int hashCode() {
		return Objects.hash(description, getPartNumber());
	}

	public int compareTo(Item other) {
		int diff = Integer.compare(getPartNumber(), other.getPartNumber());
		return diff != 0 ? diff : description.compareTo(other.description);
	}

	public int getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}
}
