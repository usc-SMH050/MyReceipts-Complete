package com.bignerdranch.android.MyReceipts.database;

public class ReceiptDbSchema {
    public static final class ReceiptTable {
        public static final String NAME = "receipts";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String DESCRIPTION = "description";
            public static final String SHOP = "shop";
            public static final String LATITUDE = "latitude";
            public static final String LONGITUDE = "longitude";
            public static final String LOCATIONSET = "locationSet";
        }
    }
}
