/*
 * Copyright (C) 2013 Maciej Górski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.mg6.android.maps.extensions;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public class AnimationSettings {

	private long duration = 500L;

	private Interpolator interpolator = new DecelerateInterpolator();

	public AnimationSettings duration(long duration) {
		this.duration = duration;
		return this;
	}

	public long getDuration() {
		return duration;
	}

	public Interpolator getInterpolator() {
		return interpolator;
	}

	public AnimationSettings interpolator(Interpolator interpolator) {
		this.interpolator = interpolator;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof AnimationSettings)) {
			return false;
		}
		AnimationSettings other = (AnimationSettings) o;
		if (duration != other.duration) {
			return false;
		}
		return interpolator.equals(other.interpolator);
	}

	@Override
	public int hashCode() {
		// TODO: implement, low priority
		return super.hashCode();
	}
}
