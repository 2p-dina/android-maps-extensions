package pl.mg6.android.maps.extensions.impl;

import pl.mg6.android.maps.extensions.GroundOverlay;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

class DelegatingGroundOverlay implements GroundOverlay {

	private com.google.android.gms.maps.model.GroundOverlay real;
	private DelegatingGoogleMap map;

	private Object data;

	DelegatingGroundOverlay(com.google.android.gms.maps.model.GroundOverlay real, DelegatingGoogleMap map) {
		this.real = real;
		this.map = map;
	}

	@Override
	public float getBearing() {
		return real.getBearing();
	}

	@Override
	public LatLngBounds getBounds() {
		return real.getBounds();
	}

	@Override
	public Object getData() {
		return data;
	}

	@Override
	public float getHeight() {
		return real.getHeight();
	}

	@Deprecated
	@Override
	public String getId() {
		return real.getId();
	}

	@Override
	public LatLng getPosition() {
		return real.getPosition();
	}

	@Override
	public float getTransparency() {
		return real.getTransparency();
	}

	@Override
	public float getWidth() {
		return real.getWidth();
	}

	@Override
	public float getZIndex() {
		return real.getZIndex();
	}

	@Override
	public boolean isVisible() {
		return real.isVisible();
	}

	@Override
	public void remove() {
		real.remove();
		map.remove(real);
	}

	@Override
	public void setBearing(float bearing) {
		real.setBearing(bearing);
	}

	@Override
	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public void setDimensions(float width, float height) {
		real.setDimensions(width, height);
	}

	@Override
	public void setDimensions(float width) {
		real.setDimensions(width);
	}

	@Override
	public void setPosition(LatLng position) {
		real.setPosition(position);
	}

	@Override
	public void setPositionFromBounds(LatLngBounds bounds) {
		real.setPositionFromBounds(bounds);
	}

	@Override
	public void setTransparency(float transparency) {
		real.setTransparency(transparency);
	}

	@Override
	public void setVisible(boolean visible) {
		real.setVisible(visible);
	}

	@Override
	public void setZIndex(float zIndex) {
		real.setZIndex(zIndex);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof DelegatingGroundOverlay)) {
			return false;
		}
		DelegatingGroundOverlay other = (DelegatingGroundOverlay) o;
		return real.equals(other.real);
	}

	@Override
	public int hashCode() {
		return real.hashCode();
	}

	@Override
	public String toString() {
		return real.toString();
	}
}
