// Copyright (c) 2013 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package org.cef;

import java.awt.Cursor;

/**
 * Delegate interface implemented by the client owner.
 */

public interface CefClientDelegate {
  /**
	 * Handle address changes.
	 * @param client The client generating the event.
	 * @param url The new address.
	 */
  public void onAddressChange(CefClient client, String url);

  /**
	 * Handle title changes.
	 * @param client The client generating the event.
	 * @param title The new title.
	 */
  public void onTitleChange(CefClient client, String title);

  /**
	 * Handle cursor changes.
	 * @param client The client generating the event.
	 * @param cursor The new cursor.
	 */
	public void onCursorChange(CefClient client,
                             Cursor cursor);
}
