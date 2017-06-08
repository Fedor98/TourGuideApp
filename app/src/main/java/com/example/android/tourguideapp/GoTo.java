/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguideapp;

/**
 * {@link GoTo} represents an attraction, event, public place or restaurant the tourist should go to.
 * It contains resource IDs for the respective name, details about it, audio file, and
 * optional image file for that word.
 */
public class GoTo {

    /** String resource ID for the name  */
    private int mNameId;

    /** String resource ID for the details */
    private int mDetailsId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new GoTo object.
     *
     * @param nameId is the string resource ID for the name of the attraction, event, restaurant or
     *              public place listed
     * @param detailsId is the string resource Id for details about this attraction, event,
     *                  restaurant or public place
     */
    public GoTo(int nameId, int detailsId) {
        mNameId = nameId;
        mDetailsId = detailsId;
    }

    /**
     * Create a new GoTo object.
     *
     * @param nameId is the string resource ID for the name of the attraction, event, restaurant or
     *              public place listed
     * @param detailsId is the string resource Id for details about this attraction, event,
     *                  restaurant or public place
     * @param imageResourceId is the drawable resource ID for the image associated with this
     *                        attraction, event, restaurant or public place
     */
    public GoTo(int nameId, int detailsId, int imageResourceId) {
        mNameId = nameId;
        mDetailsId = detailsId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the name of the item.
     */
    public int getNameId() {
        return mNameId;
    }

    /**
     * Get the string resource ID for details of the item.
     */
    public int getDetailsId() {
        return mDetailsId;
    }

    /**
     * Return the image resource ID of the item.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this item.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}