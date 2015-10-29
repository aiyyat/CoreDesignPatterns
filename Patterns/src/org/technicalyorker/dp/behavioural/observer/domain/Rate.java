package org.technicalyorker.dp.behavioural.observer.domain;

import java.math.BigDecimal;

public class Rate {
	private BigDecimal ask;
	private BigDecimal bid;
	private BigDecimal mid;

	public Rate(BigDecimal ask, BigDecimal bid, BigDecimal mid) {
		super();
		this.ask = ask;
		this.bid = bid;
		this.mid = mid;
	}

	public BigDecimal getAsk() {
		return ask;
	}

	public BigDecimal getBid() {
		return bid;
	}

	public BigDecimal getMid() {
		return mid;
	}

	@Override
	public String toString() {
		return "Rate [ask=" + ask + ", bid=" + bid + ", mid=" + mid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ask == null) ? 0 : ask.hashCode());
		result = prime * result + ((bid == null) ? 0 : bid.hashCode());
		result = prime * result + ((mid == null) ? 0 : mid.hashCode());
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
		Rate other = (Rate) obj;
		if (ask == null) {
			if (other.ask != null)
				return false;
		} else if (!ask.equals(other.ask))
			return false;
		if (bid == null) {
			if (other.bid != null)
				return false;
		} else if (!bid.equals(other.bid))
			return false;
		if (mid == null) {
			if (other.mid != null)
				return false;
		} else if (!mid.equals(other.mid))
			return false;
		return true;
	}
}
