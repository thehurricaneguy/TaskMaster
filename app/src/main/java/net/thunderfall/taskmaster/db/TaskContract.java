package net.thunderfall.taskmaster.db;

import android.provider.BaseColumns;
/**
 * Created by abhiram on 28/10/16.
 */

public class TaskContract {
    public static final String DB_NAME = "net.thunderfall.taskmaster.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";
        public static final String COL_TASK_TITLE = "title";
    }
}
