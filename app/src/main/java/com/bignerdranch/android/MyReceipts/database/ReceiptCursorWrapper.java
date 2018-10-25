package com.bignerdranch.android.MyReceipts.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.bignerdranch.android.MyReceipts.Receipt;

import java.util.Date;
import java.util.UUID;

public class ReceiptCursorWrapper extends CursorWrapper {

    public ReceiptCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Receipt getReceipt() {

        String uuidString = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.UUID));
        String title = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.TITLE));
        long date = getLong(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.DATE));
        String description = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.DESCRIPTION));
        String shop = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.SHOP));
        double latitude = getLong(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.LATITUDE));
        double longitude = getLong(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.LONGITUDE));
        String locationSet = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.LOCATIONSET));

        Receipt receipt = new Receipt(UUID.fromString(uuidString));
        receipt.setTitle(title);
        receipt.setDate(new Date(date));
        receipt.setDescription(description);
        receipt.setShopName(shop);
        receipt.setLatitude(latitude);
        receipt.setLongitude(longitude);
        receipt.setHasSetLocation(locationSet);

        return receipt;
    }
}

