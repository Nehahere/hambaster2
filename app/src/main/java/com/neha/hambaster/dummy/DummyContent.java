package com.neha.hambaster.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add some sample items.
        addItem(new DummyItem("1.", "   google", "https://www.google.co.in/"));
        addItem(new DummyItem("2.", "   shareshelves", "http://www.shareshelves.in/"));
        addItem(new DummyItem("3.", "   Videos", "https://www.youtube.com/watch?v=jNoLvbD-O6E&list=PLKuAAJP3yQ19hJ5"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String itemname;
        public final String url;

        public DummyItem(String id, String itemname, String url) {
            this.id = id;
            this.itemname = itemname;
            this.url = url;
        }

        @Override
        public String toString() {
            return itemname;
        }
    }

}