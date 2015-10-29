package org.technicalyorker.dp.creational.factory;

public class Specification {
	String itemCode;
	String color;
	String flex;
	String constructionFrame;
	int lengthInMM;
	int weightIngms;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFlex() {
		return flex;
	}

	public void setFlex(String flex) {
		this.flex = flex;
	}

	public String getConstructionFrame() {
		return constructionFrame;
	}

	public void setConstructionFrame(String constructionFrame) {
		this.constructionFrame = constructionFrame;
	}

	public int getLengthInMM() {
		return lengthInMM;
	}

	public void setLengthInMM(int lengthInMM) {
		this.lengthInMM = lengthInMM;
	}

	public int getWeightIngms() {
		return weightIngms;
	}

	public void setWeightIngms(int weightIngms) {
		this.weightIngms = weightIngms;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime
				* result
				+ ((constructionFrame == null) ? 0 : constructionFrame
						.hashCode());
		result = prime * result + ((flex == null) ? 0 : flex.hashCode());
		result = prime * result
				+ ((itemCode == null) ? 0 : itemCode.hashCode());
		result = prime * result + lengthInMM;
		result = prime * result + weightIngms;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Specification other = (Specification) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (constructionFrame == null) {
			if (other.constructionFrame != null)
				return false;
		} else if (!constructionFrame.equals(other.constructionFrame))
			return false;
		if (flex == null) {
			if (other.flex != null)
				return false;
		} else if (!flex.equals(other.flex))
			return false;
		if (itemCode == null) {
			if (other.itemCode != null)
				return false;
		} else if (!itemCode.equals(other.itemCode))
			return false;
		if (lengthInMM != other.lengthInMM)
			return false;
		if (weightIngms != other.weightIngms)
			return false;
		return true;
	}

	public Specification(String itemCode, String color, String flex,
			String constructionFrame, int lengthInMM, int weightIngms) {
		super();
		this.itemCode = itemCode;
		this.color = color;
		this.flex = flex;
		this.constructionFrame = constructionFrame;
		this.lengthInMM = lengthInMM;
		this.weightIngms = weightIngms;
	}

	@Override
	public String toString() {
		return "Specification [itemCode=" + itemCode + ", color=" + color
				+ ", flex=" + flex + ", constructionFrame=" + constructionFrame
				+ ", lengthInMM=" + lengthInMM + ", weightIngms=" + weightIngms
				+ "]";
	}
}
