/*
 * Copyright (C) 2018 Kaloyan Raev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.storj.libstorj;

/**
 * Callback interface for receiving the response of the
 * <code>getBucketId()</code> method.
 * 
 * @see Storj#getBucketId(String, GetBucketIdCallback)
 */
public interface GetBucketIdCallback {

    /**
     * Called if the bucket id was retrieved successfully.
     * 
     * @param bucketId
     *            a bucket id
     */
    void onBucketIdReceived(String bucketId);

    /**
     * Called if getting the bucket id finished with error.
     * 
     * @param message
     *            the error message
     */
    void onError(String message);

}