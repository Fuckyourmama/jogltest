package ru.olamedia.astronomy;

/*
 *  Copyright 2011 Brad Parks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//package com.bradsbrain.simpleastronomy;

public class FullMoonChecker extends MoonChecker {

	private static final double VERY_LARGE_ANGLE = 180.10;
	private static final double VERY_LARGE_PERCENT = 99.999;

	/**
	 * A new moon would be at a very small angle
	 */
	@Override
	public boolean isCorrectAngle(double d) {
		return d > VERY_LARGE_ANGLE;
	}

	/**
	 * A new moon would be at a very small percent visible
	 */
	@Override
	public boolean isCorrectPercent(double d) {
		return d > VERY_LARGE_PERCENT;
	}

}
