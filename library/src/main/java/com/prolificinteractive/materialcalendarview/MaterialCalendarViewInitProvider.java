package com.prolificinteractive.materialcalendarview;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.jakewharton.threetenabp.AndroidThreeTen;

/**
 * With this in place, we don't have to have the user install 310Abp by himself.
 */
public final class MaterialCalendarViewInitProvider extends ContentProvider {

  private static final String MCV_AUTHORITY =
      "com.prolificinteractive.materialcalendarview.materialcalendarviewinitprovider";

  public MaterialCalendarViewInitProvider() { }

  @Override public boolean onCreate() {
    // The interesting piece here.
    AndroidThreeTen.init(getContext());
    return true;
  }

  @Override public void attachInfo(final Context context, final ProviderInfo providerInfo) {
    if (providerInfo == null) {
      throw new NullPointerException("MaterialCalendarViewInitProvider ProviderInfo cannot be null.");
    }
    // So if the authorities equal the library internal ones, the developer forgot to set his applicationId
    if (MCV_AUTHORITY.equals(providerInfo.authority)) {
      throw new IllegalStateException(
          "Incorrect provider authority in manifest. Most likely due to a "
              + "missing applicationId variable in application\'s build.gradle.");
    }
    super.attachInfo(context, providerInfo);
  }

   @Override public Cursor query(
       final Uri uri,
       final String[] projection,
       final String selection,
       final String[] selectionArgs,
       final String sortOrder) {
    return null;
  }

   @Override public String getType( final Uri uri) {
    return null;
  }

   @Override public Uri insert(
       final Uri uri,
       final ContentValues values) {
    return null;
  }

  @Override public int delete(
       final Uri uri,
       final String selection,
       final String[] selectionArgs) {
    return 0;
  }

  @Override public int update(
       final Uri uri,
       final ContentValues values,
       final String selection,
       final String[] selectionArgs) {
    return 0;
  }
}
