package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L4480019317650718358 extends Y7729682184936279366 {
    public final /* synthetic */ WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L4480019317650718358(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.d = workDatabase_Impl;
    }

    @Override // dev.epro.r0.Y7729682184936279366
    public final void a(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        P13747563277035175218.f(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        P13747563277035175218.f(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        P13747563277035175218.f(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        P13747563277035175218.f(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        P13747563277035175218.f(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        P13747563277035175218.f(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        P13747563277035175218.f(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        P13747563277035175218.f(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        P13747563277035175218.f(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        P13747563277035175218.f(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        P13747563277035175218.f(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        P13747563277035175218.f(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        P13747563277035175218.f(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        P13747563277035175218.f(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        P13747563277035175218.f(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // dev.epro.r0.Y7729682184936279366
    public final void b(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        P13747563277035175218.f(sQLiteConnection, "DROP TABLE IF EXISTS `Dependency`");
        P13747563277035175218.f(sQLiteConnection, "DROP TABLE IF EXISTS `WorkSpec`");
        P13747563277035175218.f(sQLiteConnection, "DROP TABLE IF EXISTS `WorkTag`");
        P13747563277035175218.f(sQLiteConnection, "DROP TABLE IF EXISTS `SystemIdInfo`");
        P13747563277035175218.f(sQLiteConnection, "DROP TABLE IF EXISTS `WorkName`");
        P13747563277035175218.f(sQLiteConnection, "DROP TABLE IF EXISTS `WorkProgress`");
        P13747563277035175218.f(sQLiteConnection, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // dev.epro.r0.Y7729682184936279366
    public final void c(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
    }

    @Override // dev.epro.r0.Y7729682184936279366
    public final void d(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        P13747563277035175218.f(sQLiteConnection, "PRAGMA foreign_keys = ON");
        this.d.n(sQLiteConnection);
    }

    @Override // dev.epro.r0.Y7729682184936279366
    public final void e(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
    }

    @Override // dev.epro.r0.Y7729682184936279366
    public final void f(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        M9216324016624295870.x(sQLiteConnection);
    }

    @Override // dev.epro.r0.Y7729682184936279366
    public final X7831914847311259349 g(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new Y523155941519587740("work_spec_id", 1, "TEXT", null, 1, true));
        linkedHashMap.put("prerequisite_id", new Y523155941519587740("prerequisite_id", 2, "TEXT", null, 1, true));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new S1864542817940015314("WorkSpec", K5751602218013079365.U("work_spec_id"), "CASCADE", K5751602218013079365.U("id"), "CASCADE"));
        linkedHashSet.add(new S1864542817940015314("WorkSpec", K5751602218013079365.U("prerequisite_id"), "CASCADE", K5751602218013079365.U("id"), "CASCADE"));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new H10969385056623275121("index_Dependency_work_spec_id", false, K5751602218013079365.U("work_spec_id"), K5751602218013079365.U("ASC")));
        linkedHashSet2.add(new H10969385056623275121("index_Dependency_prerequisite_id", false, K5751602218013079365.U("prerequisite_id"), K5751602218013079365.U("ASC")));
        W12092042239787071323 w12092042239787071323 = new W12092042239787071323("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        W12092042239787071323 w12092042239787071323G = W7808703833045379622.G(sQLiteConnection, "Dependency");
        if (!w12092042239787071323.equals(w12092042239787071323G)) {
            return new X7831914847311259349(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + w12092042239787071323 + "\n Found:\n" + w12092042239787071323G);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new Y523155941519587740("id", 1, "TEXT", null, 1, true));
        linkedHashMap2.put("state", new Y523155941519587740("state", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("worker_class_name", new Y523155941519587740("worker_class_name", 0, "TEXT", null, 1, true));
        linkedHashMap2.put("input_merger_class_name", new Y523155941519587740("input_merger_class_name", 0, "TEXT", null, 1, true));
        linkedHashMap2.put("input", new Y523155941519587740("input", 0, "BLOB", null, 1, true));
        linkedHashMap2.put("output", new Y523155941519587740("output", 0, "BLOB", null, 1, true));
        linkedHashMap2.put("initial_delay", new Y523155941519587740("initial_delay", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("interval_duration", new Y523155941519587740("interval_duration", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("flex_duration", new Y523155941519587740("flex_duration", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("run_attempt_count", new Y523155941519587740("run_attempt_count", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("backoff_policy", new Y523155941519587740("backoff_policy", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("backoff_delay_duration", new Y523155941519587740("backoff_delay_duration", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("last_enqueue_time", new Y523155941519587740("last_enqueue_time", 0, "INTEGER", "-1", 1, true));
        linkedHashMap2.put("minimum_retention_duration", new Y523155941519587740("minimum_retention_duration", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("schedule_requested_at", new Y523155941519587740("schedule_requested_at", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("run_in_foreground", new Y523155941519587740("run_in_foreground", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("out_of_quota_policy", new Y523155941519587740("out_of_quota_policy", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("period_count", new Y523155941519587740("period_count", 0, "INTEGER", "0", 1, true));
        linkedHashMap2.put("generation", new Y523155941519587740("generation", 0, "INTEGER", "0", 1, true));
        linkedHashMap2.put("next_schedule_time_override", new Y523155941519587740("next_schedule_time_override", 0, "INTEGER", "9223372036854775807", 1, true));
        linkedHashMap2.put("next_schedule_time_override_generation", new Y523155941519587740("next_schedule_time_override_generation", 0, "INTEGER", "0", 1, true));
        linkedHashMap2.put("stop_reason", new Y523155941519587740("stop_reason", 0, "INTEGER", "-256", 1, true));
        linkedHashMap2.put("trace_tag", new Y523155941519587740("trace_tag", 0, "TEXT", null, 1, false));
        linkedHashMap2.put("backoff_on_system_interruptions", new Y523155941519587740("backoff_on_system_interruptions", 0, "INTEGER", null, 1, false));
        linkedHashMap2.put("required_network_type", new Y523155941519587740("required_network_type", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("required_network_request", new Y523155941519587740("required_network_request", 0, "BLOB", "x''", 1, true));
        linkedHashMap2.put("requires_charging", new Y523155941519587740("requires_charging", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("requires_device_idle", new Y523155941519587740("requires_device_idle", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("requires_battery_not_low", new Y523155941519587740("requires_battery_not_low", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("requires_storage_not_low", new Y523155941519587740("requires_storage_not_low", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("trigger_content_update_delay", new Y523155941519587740("trigger_content_update_delay", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("trigger_max_content_delay", new Y523155941519587740("trigger_max_content_delay", 0, "INTEGER", null, 1, true));
        linkedHashMap2.put("content_uri_triggers", new Y523155941519587740("content_uri_triggers", 0, "BLOB", null, 1, true));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new H10969385056623275121("index_WorkSpec_schedule_requested_at", false, K5751602218013079365.U("schedule_requested_at"), K5751602218013079365.U("ASC")));
        linkedHashSet4.add(new H10969385056623275121("index_WorkSpec_last_enqueue_time", false, K5751602218013079365.U("last_enqueue_time"), K5751602218013079365.U("ASC")));
        W12092042239787071323 w120920422397870713232 = new W12092042239787071323("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        W12092042239787071323 w12092042239787071323G2 = W7808703833045379622.G(sQLiteConnection, "WorkSpec");
        if (!w120920422397870713232.equals(w12092042239787071323G2)) {
            return new X7831914847311259349(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + w120920422397870713232 + "\n Found:\n" + w12092042239787071323G2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new Y523155941519587740("tag", 1, "TEXT", null, 1, true));
        linkedHashMap3.put("work_spec_id", new Y523155941519587740("work_spec_id", 2, "TEXT", null, 1, true));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new S1864542817940015314("WorkSpec", K5751602218013079365.U("work_spec_id"), "CASCADE", K5751602218013079365.U("id"), "CASCADE"));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new H10969385056623275121("index_WorkTag_work_spec_id", false, K5751602218013079365.U("work_spec_id"), K5751602218013079365.U("ASC")));
        W12092042239787071323 w120920422397870713233 = new W12092042239787071323("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        W12092042239787071323 w12092042239787071323G3 = W7808703833045379622.G(sQLiteConnection, "WorkTag");
        if (!w120920422397870713233.equals(w12092042239787071323G3)) {
            return new X7831914847311259349(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + w120920422397870713233 + "\n Found:\n" + w12092042239787071323G3);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new Y523155941519587740("work_spec_id", 1, "TEXT", null, 1, true));
        linkedHashMap4.put("generation", new Y523155941519587740("generation", 2, "INTEGER", "0", 1, true));
        linkedHashMap4.put("system_id", new Y523155941519587740("system_id", 0, "INTEGER", null, 1, true));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new S1864542817940015314("WorkSpec", K5751602218013079365.U("work_spec_id"), "CASCADE", K5751602218013079365.U("id"), "CASCADE"));
        W12092042239787071323 w120920422397870713234 = new W12092042239787071323("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        W12092042239787071323 w12092042239787071323G4 = W7808703833045379622.G(sQLiteConnection, "SystemIdInfo");
        if (!w120920422397870713234.equals(w12092042239787071323G4)) {
            return new X7831914847311259349(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + w120920422397870713234 + "\n Found:\n" + w12092042239787071323G4);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new Y523155941519587740("name", 1, "TEXT", null, 1, true));
        linkedHashMap5.put("work_spec_id", new Y523155941519587740("work_spec_id", 2, "TEXT", null, 1, true));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new S1864542817940015314("WorkSpec", K5751602218013079365.U("work_spec_id"), "CASCADE", K5751602218013079365.U("id"), "CASCADE"));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new H10969385056623275121("index_WorkName_work_spec_id", false, K5751602218013079365.U("work_spec_id"), K5751602218013079365.U("ASC")));
        W12092042239787071323 w120920422397870713235 = new W12092042239787071323("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        W12092042239787071323 w12092042239787071323G5 = W7808703833045379622.G(sQLiteConnection, "WorkName");
        if (!w120920422397870713235.equals(w12092042239787071323G5)) {
            return new X7831914847311259349(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + w120920422397870713235 + "\n Found:\n" + w12092042239787071323G5);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new Y523155941519587740("work_spec_id", 1, "TEXT", null, 1, true));
        linkedHashMap6.put("progress", new Y523155941519587740("progress", 0, "BLOB", null, 1, true));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new S1864542817940015314("WorkSpec", K5751602218013079365.U("work_spec_id"), "CASCADE", K5751602218013079365.U("id"), "CASCADE"));
        W12092042239787071323 w120920422397870713236 = new W12092042239787071323("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        W12092042239787071323 w12092042239787071323G6 = W7808703833045379622.G(sQLiteConnection, "WorkProgress");
        if (!w120920422397870713236.equals(w12092042239787071323G6)) {
            return new X7831914847311259349(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + w120920422397870713236 + "\n Found:\n" + w12092042239787071323G6);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new Y523155941519587740("key", 1, "TEXT", null, 1, true));
        linkedHashMap7.put("long_value", new Y523155941519587740("long_value", 0, "INTEGER", null, 1, false));
        W12092042239787071323 w120920422397870713237 = new W12092042239787071323("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        W12092042239787071323 w12092042239787071323G7 = W7808703833045379622.G(sQLiteConnection, "Preference");
        if (w120920422397870713237.equals(w12092042239787071323G7)) {
            return new X7831914847311259349(true, (String) null);
        }
        return new X7831914847311259349(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + w120920422397870713237 + "\n Found:\n" + w12092042239787071323G7);
    }
}
