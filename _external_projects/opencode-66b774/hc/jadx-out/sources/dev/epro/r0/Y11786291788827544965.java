package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.OverwritingInputMerger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y11786291788827544965 extends K13242289086361784648 {
    public static final Y11786291788827544965 d = new Y11786291788827544965(11, 12, 0);
    public static final Y11786291788827544965 e = new Y11786291788827544965(12, 13, 1);
    public static final Y11786291788827544965 f = new Y11786291788827544965(15, 16, 2);
    public static final Y11786291788827544965 g = new Y11786291788827544965(16, 17, 3);
    public static final Y11786291788827544965 h = new Y11786291788827544965(1, 2, 4);
    public static final Y11786291788827544965 i = new Y11786291788827544965(3, 4, 5);
    public static final Y11786291788827544965 j = new Y11786291788827544965(4, 5, 6);
    public static final Y11786291788827544965 k = new Y11786291788827544965(6, 7, 7);
    public static final Y11786291788827544965 l = new Y11786291788827544965(7, 8, 8);
    public static final Y11786291788827544965 m = new Y11786291788827544965(8, 9, 9);
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y11786291788827544965(int i2, int i3, byte b) {
        super(i2, i3);
        this.c = b;
    }

    @Override // dev.epro.r0.K13242289086361784648
    public void a(SQLiteConnection sQLiteConnection) {
        switch (this.c) {
            case 10:
                sQLiteConnection.getClass();
                P13747563277035175218.f(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                P13747563277035175218.f(sQLiteConnection, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                P13747563277035175218.f(sQLiteConnection, "DROP TABLE `WorkSpec`");
                P13747563277035175218.f(sQLiteConnection, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                P13747563277035175218.f(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                P13747563277035175218.f(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                break;
            case 11:
                sQLiteConnection.getClass();
                P13747563277035175218.f(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                P13747563277035175218.f(sQLiteConnection, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                P13747563277035175218.f(sQLiteConnection, "DROP TABLE `WorkSpec`");
                P13747563277035175218.f(sQLiteConnection, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                P13747563277035175218.f(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                P13747563277035175218.f(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                break;
            case 12:
                sQLiteConnection.getClass();
                P13747563277035175218.f(sQLiteConnection, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
                P13747563277035175218.f(sQLiteConnection, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
                break;
            case 13:
                sQLiteConnection.getClass();
                P13747563277035175218.f(sQLiteConnection, "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
                break;
            case 14:
                sQLiteConnection.getClass();
                P13747563277035175218.f(sQLiteConnection, "ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
                break;
            case 15:
                sQLiteConnection.getClass();
                P13747563277035175218.f(sQLiteConnection, "ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
                break;
            case 16:
                sQLiteConnection.getClass();
                P13747563277035175218.f(sQLiteConnection, "ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL");
                break;
            default:
                super.a(sQLiteConnection);
                break;
        }
    }

    @Override // dev.epro.r0.K13242289086361784648
    public void b(SupportSQLiteDatabase supportSQLiteDatabase) {
        switch (this.c) {
            case 0:
                supportSQLiteDatabase.getClass();
                supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                break;
            case 1:
                supportSQLiteDatabase.getClass();
                supportSQLiteDatabase.execSQL("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                supportSQLiteDatabase.execSQL("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                break;
            case 2:
                supportSQLiteDatabase.getClass();
                supportSQLiteDatabase.execSQL("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                supportSQLiteDatabase.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.execSQL("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                supportSQLiteDatabase.execSQL("DROP TABLE `SystemIdInfo`");
                supportSQLiteDatabase.execSQL("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                break;
            case 3:
                supportSQLiteDatabase.getClass();
                supportSQLiteDatabase.execSQL(G5759126466240281083.t("UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                "));
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
                supportSQLiteDatabase.execSQL("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
                supportSQLiteDatabase.execSQL("DROP TABLE `WorkSpec`");
                supportSQLiteDatabase.execSQL("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
                supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                break;
            case 4:
                supportSQLiteDatabase.getClass();
                supportSQLiteDatabase.execSQL("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                supportSQLiteDatabase.execSQL("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS alarmInfo");
                supportSQLiteDatabase.execSQL("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                break;
            case 5:
                supportSQLiteDatabase.getClass();
                supportSQLiteDatabase.execSQL("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                break;
            case 6:
                supportSQLiteDatabase.getClass();
                supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                break;
            case 7:
                supportSQLiteDatabase.getClass();
                supportSQLiteDatabase.execSQL("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                break;
            case 8:
                supportSQLiteDatabase.getClass();
                supportSQLiteDatabase.execSQL("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                break;
            case 9:
                supportSQLiteDatabase.getClass();
                supportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                break;
            default:
                super.b(supportSQLiteDatabase);
                break;
        }
    }
}
