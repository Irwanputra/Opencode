package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class A11054869418321976017 implements F4096073349764486348 {
    public final /* synthetic */ byte a;

    public /* synthetic */ A11054869418321976017(byte b) {
        this.a = b;
    }

    private final Object b(Object obj) {
        int i;
        int i2;
        Integer valueOf;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        sQLiteConnection.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        try {
            int k = Y2666402291564931474.k(prepare, "id");
            int k2 = Y2666402291564931474.k(prepare, "state");
            int k3 = Y2666402291564931474.k(prepare, "worker_class_name");
            int k4 = Y2666402291564931474.k(prepare, "input_merger_class_name");
            int k5 = Y2666402291564931474.k(prepare, "input");
            int k6 = Y2666402291564931474.k(prepare, "output");
            int k7 = Y2666402291564931474.k(prepare, "initial_delay");
            int k8 = Y2666402291564931474.k(prepare, "interval_duration");
            int k9 = Y2666402291564931474.k(prepare, "flex_duration");
            int k10 = Y2666402291564931474.k(prepare, "run_attempt_count");
            int k11 = Y2666402291564931474.k(prepare, "backoff_policy");
            int k12 = Y2666402291564931474.k(prepare, "backoff_delay_duration");
            int k13 = Y2666402291564931474.k(prepare, "last_enqueue_time");
            int k14 = Y2666402291564931474.k(prepare, "minimum_retention_duration");
            int k15 = Y2666402291564931474.k(prepare, "schedule_requested_at");
            int k16 = Y2666402291564931474.k(prepare, "run_in_foreground");
            int k17 = Y2666402291564931474.k(prepare, "out_of_quota_policy");
            int k18 = Y2666402291564931474.k(prepare, "period_count");
            int k19 = Y2666402291564931474.k(prepare, "generation");
            int k20 = Y2666402291564931474.k(prepare, "next_schedule_time_override");
            int k21 = Y2666402291564931474.k(prepare, "next_schedule_time_override_generation");
            int k22 = Y2666402291564931474.k(prepare, "stop_reason");
            int k23 = Y2666402291564931474.k(prepare, "trace_tag");
            int k24 = Y2666402291564931474.k(prepare, "backoff_on_system_interruptions");
            int k25 = Y2666402291564931474.k(prepare, "required_network_type");
            int k26 = Y2666402291564931474.k(prepare, "required_network_request");
            int k27 = Y2666402291564931474.k(prepare, "requires_charging");
            int k28 = Y2666402291564931474.k(prepare, "requires_device_idle");
            int k29 = Y2666402291564931474.k(prepare, "requires_battery_not_low");
            int k30 = Y2666402291564931474.k(prepare, "requires_storage_not_low");
            int k31 = Y2666402291564931474.k(prepare, "trigger_content_update_delay");
            int k32 = Y2666402291564931474.k(prepare, "trigger_max_content_delay");
            int k33 = Y2666402291564931474.k(prepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text = prepare.getText(k);
                int i3 = k14;
                ArrayList arrayList2 = arrayList;
                Y8203071358079267502 D = W7808703833045379622.D((int) prepare.getLong(k2));
                String text2 = prepare.getText(k3);
                String text3 = prepare.getText(k4);
                byte[] blob = prepare.getBlob(k5);
                Z4023314114778119473 z4023314114778119473 = Z4023314114778119473.b;
                Z4023314114778119473 B = Z860808776098365610.B(blob);
                Z4023314114778119473 B2 = Z860808776098365610.B(prepare.getBlob(k6));
                long j = prepare.getLong(k7);
                long j2 = prepare.getLong(k8);
                long j3 = prepare.getLong(k9);
                int i4 = (int) prepare.getLong(k10);
                int i5 = k2;
                int i6 = k3;
                Y6144095862626460568 A = W7808703833045379622.A((int) prepare.getLong(k11));
                long j4 = prepare.getLong(k12);
                long j5 = prepare.getLong(k13);
                long j6 = prepare.getLong(i3);
                int i7 = k15;
                long j7 = prepare.getLong(i7);
                int i8 = k;
                int i9 = k16;
                boolean z = ((int) prepare.getLong(i9)) != 0;
                int i10 = k17;
                int i11 = k4;
                W17497847401432715949 C = W7808703833045379622.C((int) prepare.getLong(i10));
                int i12 = k18;
                int i13 = k5;
                int i14 = (int) prepare.getLong(i12);
                int i15 = k19;
                int i16 = (int) prepare.getLong(i15);
                int i17 = k20;
                long j8 = prepare.getLong(i17);
                int i18 = k21;
                int i19 = (int) prepare.getLong(i18);
                int i20 = k22;
                int i21 = (int) prepare.getLong(i20);
                int i22 = k23;
                Boolean bool = null;
                String text4 = prepare.isNull(i22) ? null : prepare.getText(i22);
                int i23 = k24;
                if (prepare.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    valueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    valueOf = Integer.valueOf((int) prepare.getLong(i23));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                int i24 = k25;
                Boolean bool2 = bool;
                M12733718480826052124 B3 = W7808703833045379622.B((int) prepare.getLong(i24));
                int i25 = k26;
                N13222963410360886453 M = W7808703833045379622.M(prepare.getBlob(i25));
                k25 = i24;
                k26 = i25;
                int i26 = k27;
                boolean z2 = ((int) prepare.getLong(i26)) != 0;
                k27 = i26;
                int i27 = k28;
                boolean z3 = ((int) prepare.getLong(i27)) != 0;
                int i28 = k29;
                boolean z4 = ((int) prepare.getLong(i28)) != 0;
                k29 = i28;
                int i29 = k30;
                int i30 = k31;
                int i31 = k32;
                int i32 = k33;
                k33 = i32;
                arrayList2.add(new L16425900549479658727(text, D, text2, text3, B, B2, j, j2, j3, new K13184022901285147448(M, B3, z2, z3, z4, ((int) prepare.getLong(i29)) != 0, prepare.getLong(i30), prepare.getLong(i31), W7808703833045379622.m(prepare.getBlob(i32))), i4, A, j4, j5, j6, j7, z, C, i14, i16, j8, i, i21, text4, bool2));
                k30 = i29;
                k4 = i11;
                k17 = i10;
                k19 = i15;
                k22 = i2;
                k24 = i23;
                k31 = i30;
                k32 = i31;
                k2 = i5;
                k14 = i3;
                k3 = i6;
                arrayList = arrayList2;
                k = i8;
                k15 = i7;
                k16 = i9;
                k20 = i17;
                k21 = i18;
                k23 = i22;
                k28 = i27;
                k5 = i13;
                k18 = i12;
            }
            ArrayList arrayList3 = arrayList;
            prepare.close();
            return arrayList3;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    private final Object d(Object obj) {
        int i;
        Integer valueOf;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
        sQLiteConnection.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            prepare.bindLong(1, 200L);
            int k = Y2666402291564931474.k(prepare, "id");
            int k2 = Y2666402291564931474.k(prepare, "state");
            int k3 = Y2666402291564931474.k(prepare, "worker_class_name");
            int k4 = Y2666402291564931474.k(prepare, "input_merger_class_name");
            int k5 = Y2666402291564931474.k(prepare, "input");
            int k6 = Y2666402291564931474.k(prepare, "output");
            int k7 = Y2666402291564931474.k(prepare, "initial_delay");
            int k8 = Y2666402291564931474.k(prepare, "interval_duration");
            int k9 = Y2666402291564931474.k(prepare, "flex_duration");
            int k10 = Y2666402291564931474.k(prepare, "run_attempt_count");
            int k11 = Y2666402291564931474.k(prepare, "backoff_policy");
            int k12 = Y2666402291564931474.k(prepare, "backoff_delay_duration");
            int k13 = Y2666402291564931474.k(prepare, "last_enqueue_time");
            int k14 = Y2666402291564931474.k(prepare, "minimum_retention_duration");
            int k15 = Y2666402291564931474.k(prepare, "schedule_requested_at");
            int k16 = Y2666402291564931474.k(prepare, "run_in_foreground");
            int k17 = Y2666402291564931474.k(prepare, "out_of_quota_policy");
            int k18 = Y2666402291564931474.k(prepare, "period_count");
            int k19 = Y2666402291564931474.k(prepare, "generation");
            int k20 = Y2666402291564931474.k(prepare, "next_schedule_time_override");
            int k21 = Y2666402291564931474.k(prepare, "next_schedule_time_override_generation");
            int k22 = Y2666402291564931474.k(prepare, "stop_reason");
            int k23 = Y2666402291564931474.k(prepare, "trace_tag");
            int k24 = Y2666402291564931474.k(prepare, "backoff_on_system_interruptions");
            int k25 = Y2666402291564931474.k(prepare, "required_network_type");
            int k26 = Y2666402291564931474.k(prepare, "required_network_request");
            int k27 = Y2666402291564931474.k(prepare, "requires_charging");
            int k28 = Y2666402291564931474.k(prepare, "requires_device_idle");
            int k29 = Y2666402291564931474.k(prepare, "requires_battery_not_low");
            int k30 = Y2666402291564931474.k(prepare, "requires_storage_not_low");
            int k31 = Y2666402291564931474.k(prepare, "trigger_content_update_delay");
            int k32 = Y2666402291564931474.k(prepare, "trigger_max_content_delay");
            int k33 = Y2666402291564931474.k(prepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text = prepare.getText(k);
                int i2 = k13;
                int i3 = k14;
                Y8203071358079267502 D = W7808703833045379622.D((int) prepare.getLong(k2));
                String text2 = prepare.getText(k3);
                String text3 = prepare.getText(k4);
                byte[] blob = prepare.getBlob(k5);
                Z4023314114778119473 z4023314114778119473 = Z4023314114778119473.b;
                Z4023314114778119473 B = Z860808776098365610.B(blob);
                Z4023314114778119473 B2 = Z860808776098365610.B(prepare.getBlob(k6));
                long j = prepare.getLong(k7);
                long j2 = prepare.getLong(k8);
                long j3 = prepare.getLong(k9);
                int i4 = (int) prepare.getLong(k10);
                int i5 = k;
                int i6 = k2;
                Y6144095862626460568 A = W7808703833045379622.A((int) prepare.getLong(k11));
                long j4 = prepare.getLong(k12);
                long j5 = prepare.getLong(i2);
                long j6 = prepare.getLong(i3);
                int i7 = k15;
                long j7 = prepare.getLong(i7);
                k15 = i7;
                int i8 = k16;
                int i9 = k3;
                boolean z = ((int) prepare.getLong(i8)) != 0;
                int i10 = k17;
                int i11 = k4;
                W17497847401432715949 C = W7808703833045379622.C((int) prepare.getLong(i10));
                int i12 = k18;
                int i13 = (int) prepare.getLong(i12);
                int i14 = k19;
                int i15 = (int) prepare.getLong(i14);
                int i16 = k20;
                long j8 = prepare.getLong(i16);
                int i17 = k21;
                int i18 = (int) prepare.getLong(i17);
                k21 = i17;
                int i19 = k22;
                int i20 = (int) prepare.getLong(i19);
                int i21 = k23;
                Boolean bool = null;
                String text4 = prepare.isNull(i21) ? null : prepare.getText(i21);
                int i22 = k24;
                if (prepare.isNull(i22)) {
                    i = i21;
                    k22 = i19;
                    valueOf = null;
                } else {
                    i = i21;
                    k22 = i19;
                    valueOf = Integer.valueOf((int) prepare.getLong(i22));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                Boolean bool2 = bool;
                int i23 = k25;
                M12733718480826052124 B3 = W7808703833045379622.B((int) prepare.getLong(i23));
                int i24 = k26;
                N13222963410360886453 M = W7808703833045379622.M(prepare.getBlob(i24));
                int i25 = k27;
                boolean z2 = ((int) prepare.getLong(i25)) != 0;
                int i26 = k28;
                boolean z3 = ((int) prepare.getLong(i26)) != 0;
                int i27 = k29;
                boolean z4 = ((int) prepare.getLong(i27)) != 0;
                k29 = i27;
                int i28 = k30;
                int i29 = k31;
                int i30 = k32;
                k31 = i29;
                int i31 = k33;
                arrayList.add(new L16425900549479658727(text, D, text2, text3, B, B2, j, j2, j3, new K13184022901285147448(M, B3, z2, z3, z4, ((int) prepare.getLong(i28)) != 0, prepare.getLong(i29), prepare.getLong(i30), W7808703833045379622.m(prepare.getBlob(i31))), i4, A, j4, j5, j6, j7, z, C, i13, i15, j8, i18, i20, text4, bool2));
                k28 = i26;
                k4 = i11;
                k17 = i10;
                k18 = i12;
                k19 = i14;
                k20 = i16;
                k23 = i;
                k24 = i22;
                k25 = i23;
                k26 = i24;
                k27 = i25;
                k33 = i31;
                k32 = i30;
                k30 = i28;
                k = i5;
                k3 = i9;
                k13 = i2;
                k14 = i3;
                k2 = i6;
                k16 = i8;
            }
            prepare.close();
            return arrayList;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        SQLiteStatement prepare;
        Integer valueOf;
        Boolean bool;
        Integer valueOf2;
        Boolean bool2;
        boolean z;
        Integer valueOf3;
        Boolean bool3;
        switch (this.a) {
            case 0:
                Q14474720477641017052 q14474720477641017052 = (Q14474720477641017052) obj;
                q14474720477641017052.getClass();
                return q14474720477641017052.getClass().getSimpleName();
            case 1:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                prepare = sQLiteConnection.prepare("DELETE FROM WorkProgress");
                try {
                    prepare.step();
                    prepare.close();
                    return O9245300239821758723.a;
                } finally {
                }
            case 2:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                prepare = sQLiteConnection2.prepare("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    prepare.bindText(1, "offline_ping_sender_work");
                    ArrayList arrayList = new ArrayList();
                    while (prepare.step()) {
                        arrayList.add(prepare.getText(0));
                    }
                    return arrayList;
                } finally {
                }
            case 3:
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                prepare = sQLiteConnection3.prepare("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    prepare.bindLong(1, 20L);
                    int k = Y2666402291564931474.k(prepare, "id");
                    int k2 = Y2666402291564931474.k(prepare, "state");
                    int k3 = Y2666402291564931474.k(prepare, "worker_class_name");
                    int k4 = Y2666402291564931474.k(prepare, "input_merger_class_name");
                    int k5 = Y2666402291564931474.k(prepare, "input");
                    int k6 = Y2666402291564931474.k(prepare, "output");
                    int k7 = Y2666402291564931474.k(prepare, "initial_delay");
                    int k8 = Y2666402291564931474.k(prepare, "interval_duration");
                    int k9 = Y2666402291564931474.k(prepare, "flex_duration");
                    int k10 = Y2666402291564931474.k(prepare, "run_attempt_count");
                    int k11 = Y2666402291564931474.k(prepare, "backoff_policy");
                    int k12 = Y2666402291564931474.k(prepare, "backoff_delay_duration");
                    int k13 = Y2666402291564931474.k(prepare, "last_enqueue_time");
                    int k14 = Y2666402291564931474.k(prepare, "minimum_retention_duration");
                    int k15 = Y2666402291564931474.k(prepare, "schedule_requested_at");
                    int k16 = Y2666402291564931474.k(prepare, "run_in_foreground");
                    int k17 = Y2666402291564931474.k(prepare, "out_of_quota_policy");
                    int k18 = Y2666402291564931474.k(prepare, "period_count");
                    int k19 = Y2666402291564931474.k(prepare, "generation");
                    int k20 = Y2666402291564931474.k(prepare, "next_schedule_time_override");
                    int k21 = Y2666402291564931474.k(prepare, "next_schedule_time_override_generation");
                    int k22 = Y2666402291564931474.k(prepare, "stop_reason");
                    int k23 = Y2666402291564931474.k(prepare, "trace_tag");
                    int k24 = Y2666402291564931474.k(prepare, "backoff_on_system_interruptions");
                    int k25 = Y2666402291564931474.k(prepare, "required_network_type");
                    int k26 = Y2666402291564931474.k(prepare, "required_network_request");
                    int k27 = Y2666402291564931474.k(prepare, "requires_charging");
                    int k28 = Y2666402291564931474.k(prepare, "requires_device_idle");
                    int k29 = Y2666402291564931474.k(prepare, "requires_battery_not_low");
                    int k30 = Y2666402291564931474.k(prepare, "requires_storage_not_low");
                    int k31 = Y2666402291564931474.k(prepare, "trigger_content_update_delay");
                    int k32 = Y2666402291564931474.k(prepare, "trigger_max_content_delay");
                    int k33 = Y2666402291564931474.k(prepare, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (prepare.step()) {
                        String text = prepare.getText(k);
                        int i = k14;
                        ArrayList arrayList3 = arrayList2;
                        Y8203071358079267502 D = W7808703833045379622.D((int) prepare.getLong(k2));
                        String text2 = prepare.getText(k3);
                        String text3 = prepare.getText(k4);
                        byte[] blob = prepare.getBlob(k5);
                        Z4023314114778119473 z4023314114778119473 = Z4023314114778119473.b;
                        Z4023314114778119473 B = Z860808776098365610.B(blob);
                        Z4023314114778119473 B2 = Z860808776098365610.B(prepare.getBlob(k6));
                        long j = prepare.getLong(k7);
                        long j2 = prepare.getLong(k8);
                        long j3 = prepare.getLong(k9);
                        int i2 = (int) prepare.getLong(k10);
                        int i3 = k5;
                        int i4 = k4;
                        Y6144095862626460568 A = W7808703833045379622.A((int) prepare.getLong(k11));
                        long j4 = prepare.getLong(k12);
                        long j5 = prepare.getLong(k13);
                        long j6 = prepare.getLong(i);
                        int i5 = k15;
                        long j7 = prepare.getLong(i5);
                        int i6 = k3;
                        int i7 = k16;
                        boolean z2 = ((int) prepare.getLong(i7)) != 0;
                        int i8 = k2;
                        int i9 = k17;
                        W17497847401432715949 C = W7808703833045379622.C((int) prepare.getLong(i9));
                        k17 = i9;
                        int i10 = k18;
                        int i11 = (int) prepare.getLong(i10);
                        k18 = i10;
                        int i12 = k19;
                        int i13 = (int) prepare.getLong(i12);
                        int i14 = k20;
                        long j8 = prepare.getLong(i14);
                        int i15 = k21;
                        int i16 = (int) prepare.getLong(i15);
                        k21 = i15;
                        int i17 = k22;
                        int i18 = (int) prepare.getLong(i17);
                        int i19 = k23;
                        String text4 = prepare.isNull(i19) ? null : prepare.getText(i19);
                        int i20 = k24;
                        if (prepare.isNull(i20)) {
                            k23 = i19;
                            k22 = i17;
                            valueOf = null;
                        } else {
                            k23 = i19;
                            k22 = i17;
                            valueOf = Integer.valueOf((int) prepare.getLong(i20));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i21 = k25;
                        M12733718480826052124 B3 = W7808703833045379622.B((int) prepare.getLong(i21));
                        int i22 = k26;
                        N13222963410360886453 M = W7808703833045379622.M(prepare.getBlob(i22));
                        int i23 = k27;
                        boolean z3 = ((int) prepare.getLong(i23)) != 0;
                        int i24 = k28;
                        boolean z4 = ((int) prepare.getLong(i24)) != 0;
                        int i25 = k29;
                        boolean z5 = ((int) prepare.getLong(i25)) != 0;
                        k29 = i25;
                        int i26 = k30;
                        int i27 = k31;
                        int i28 = k32;
                        k31 = i27;
                        int i29 = k33;
                        k33 = i29;
                        arrayList3.add(new L16425900549479658727(text, D, text2, text3, B, B2, j, j2, j3, new K13184022901285147448(M, B3, z3, z4, z5, ((int) prepare.getLong(i26)) != 0, prepare.getLong(i27), prepare.getLong(i28), W7808703833045379622.m(prepare.getBlob(i29))), i2, A, j4, j5, j6, j7, z2, C, i11, i13, j8, i16, i18, text4, bool));
                        k2 = i8;
                        k16 = i7;
                        k19 = i12;
                        k20 = i14;
                        k24 = i20;
                        k25 = i21;
                        k26 = i22;
                        k27 = i23;
                        k28 = i24;
                        k32 = i28;
                        k30 = i26;
                        k4 = i4;
                        k14 = i;
                        k3 = i6;
                        arrayList2 = arrayList3;
                        k5 = i3;
                        k15 = i5;
                    }
                    return arrayList2;
                } finally {
                }
            case 4:
                SQLiteConnection sQLiteConnection4 = (SQLiteConnection) obj;
                sQLiteConnection4.getClass();
                prepare = sQLiteConnection4.prepare("SELECT * FROM workspec WHERE state=1");
                try {
                    int k34 = Y2666402291564931474.k(prepare, "id");
                    int k35 = Y2666402291564931474.k(prepare, "state");
                    int k36 = Y2666402291564931474.k(prepare, "worker_class_name");
                    int k37 = Y2666402291564931474.k(prepare, "input_merger_class_name");
                    int k38 = Y2666402291564931474.k(prepare, "input");
                    int k39 = Y2666402291564931474.k(prepare, "output");
                    int k40 = Y2666402291564931474.k(prepare, "initial_delay");
                    int k41 = Y2666402291564931474.k(prepare, "interval_duration");
                    int k42 = Y2666402291564931474.k(prepare, "flex_duration");
                    int k43 = Y2666402291564931474.k(prepare, "run_attempt_count");
                    int k44 = Y2666402291564931474.k(prepare, "backoff_policy");
                    int k45 = Y2666402291564931474.k(prepare, "backoff_delay_duration");
                    int k46 = Y2666402291564931474.k(prepare, "last_enqueue_time");
                    int k47 = Y2666402291564931474.k(prepare, "minimum_retention_duration");
                    int k48 = Y2666402291564931474.k(prepare, "schedule_requested_at");
                    int k49 = Y2666402291564931474.k(prepare, "run_in_foreground");
                    int k50 = Y2666402291564931474.k(prepare, "out_of_quota_policy");
                    int k51 = Y2666402291564931474.k(prepare, "period_count");
                    int k52 = Y2666402291564931474.k(prepare, "generation");
                    int k53 = Y2666402291564931474.k(prepare, "next_schedule_time_override");
                    int k54 = Y2666402291564931474.k(prepare, "next_schedule_time_override_generation");
                    int k55 = Y2666402291564931474.k(prepare, "stop_reason");
                    int k56 = Y2666402291564931474.k(prepare, "trace_tag");
                    int k57 = Y2666402291564931474.k(prepare, "backoff_on_system_interruptions");
                    int k58 = Y2666402291564931474.k(prepare, "required_network_type");
                    int k59 = Y2666402291564931474.k(prepare, "required_network_request");
                    int k60 = Y2666402291564931474.k(prepare, "requires_charging");
                    int k61 = Y2666402291564931474.k(prepare, "requires_device_idle");
                    int k62 = Y2666402291564931474.k(prepare, "requires_battery_not_low");
                    int k63 = Y2666402291564931474.k(prepare, "requires_storage_not_low");
                    int k64 = Y2666402291564931474.k(prepare, "trigger_content_update_delay");
                    int k65 = Y2666402291564931474.k(prepare, "trigger_max_content_delay");
                    int k66 = Y2666402291564931474.k(prepare, "content_uri_triggers");
                    ArrayList arrayList4 = new ArrayList();
                    while (prepare.step()) {
                        String text5 = prepare.getText(k34);
                        int i30 = k47;
                        int i31 = k46;
                        Y8203071358079267502 D2 = W7808703833045379622.D((int) prepare.getLong(k35));
                        String text6 = prepare.getText(k36);
                        String text7 = prepare.getText(k37);
                        byte[] blob2 = prepare.getBlob(k38);
                        Z4023314114778119473 z40233141147781194732 = Z4023314114778119473.b;
                        Z4023314114778119473 B4 = Z860808776098365610.B(blob2);
                        Z4023314114778119473 B5 = Z860808776098365610.B(prepare.getBlob(k39));
                        long j9 = prepare.getLong(k40);
                        long j10 = prepare.getLong(k41);
                        long j11 = prepare.getLong(k42);
                        int i32 = (int) prepare.getLong(k43);
                        int i33 = k38;
                        int i34 = k37;
                        Y6144095862626460568 A2 = W7808703833045379622.A((int) prepare.getLong(k44));
                        long j12 = prepare.getLong(k45);
                        long j13 = prepare.getLong(i31);
                        long j14 = prepare.getLong(i30);
                        int i35 = k48;
                        long j15 = prepare.getLong(i35);
                        int i36 = k36;
                        int i37 = k49;
                        boolean z6 = ((int) prepare.getLong(i37)) != 0;
                        int i38 = k35;
                        int i39 = k50;
                        W17497847401432715949 C2 = W7808703833045379622.C((int) prepare.getLong(i39));
                        k50 = i39;
                        int i40 = k51;
                        int i41 = (int) prepare.getLong(i40);
                        k51 = i40;
                        int i42 = k52;
                        int i43 = (int) prepare.getLong(i42);
                        int i44 = k53;
                        long j16 = prepare.getLong(i44);
                        int i45 = k54;
                        int i46 = (int) prepare.getLong(i45);
                        k54 = i45;
                        int i47 = k55;
                        int i48 = (int) prepare.getLong(i47);
                        int i49 = k56;
                        String text8 = prepare.isNull(i49) ? null : prepare.getText(i49);
                        int i50 = k57;
                        if (prepare.isNull(i50)) {
                            k56 = i49;
                            k55 = i47;
                            valueOf2 = null;
                        } else {
                            k56 = i49;
                            k55 = i47;
                            valueOf2 = Integer.valueOf((int) prepare.getLong(i50));
                        }
                        if (valueOf2 != null) {
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        } else {
                            bool2 = null;
                        }
                        int i51 = k58;
                        M12733718480826052124 B6 = W7808703833045379622.B((int) prepare.getLong(i51));
                        int i52 = k59;
                        N13222963410360886453 M2 = W7808703833045379622.M(prepare.getBlob(i52));
                        int i53 = k60;
                        boolean z7 = ((int) prepare.getLong(i53)) != 0;
                        int i54 = k61;
                        boolean z8 = ((int) prepare.getLong(i54)) != 0;
                        int i55 = k62;
                        boolean z9 = ((int) prepare.getLong(i55)) != 0;
                        k62 = i55;
                        int i56 = k63;
                        int i57 = k64;
                        int i58 = k65;
                        k64 = i57;
                        int i59 = k66;
                        arrayList4.add(new L16425900549479658727(text5, D2, text6, text7, B4, B5, j9, j10, j11, new K13184022901285147448(M2, B6, z7, z8, z9, ((int) prepare.getLong(i56)) != 0, prepare.getLong(i57), prepare.getLong(i58), W7808703833045379622.m(prepare.getBlob(i59))), i32, A2, j12, j13, j14, j15, z6, C2, i41, i43, j16, i46, i48, text8, bool2));
                        k35 = i38;
                        k49 = i37;
                        k52 = i42;
                        k53 = i44;
                        k57 = i50;
                        k58 = i51;
                        k59 = i52;
                        k60 = i53;
                        k61 = i54;
                        k66 = i59;
                        k65 = i58;
                        k63 = i56;
                        k47 = i30;
                        k37 = i34;
                        k38 = i33;
                        k36 = i36;
                        k48 = i35;
                        k46 = i31;
                    }
                    return arrayList4;
                } finally {
                }
            case 5:
                return b(obj);
            case 6:
                SQLiteConnection sQLiteConnection5 = (SQLiteConnection) obj;
                sQLiteConnection5.getClass();
                prepare = sQLiteConnection5.prepare("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i60 = prepare.step() ? (int) prepare.getLong(0) : 0;
                    prepare.close();
                    return Integer.valueOf(i60);
                } finally {
                }
            case 7:
                SQLiteConnection sQLiteConnection6 = (SQLiteConnection) obj;
                sQLiteConnection6.getClass();
                prepare = sQLiteConnection6.prepare("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (prepare.step()) {
                        if (((int) prepare.getLong(0)) != 0) {
                            z = true;
                            prepare.close();
                            return Boolean.valueOf(z);
                        }
                    }
                    z = false;
                    prepare.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 8:
                return d(obj);
            case 9:
                SQLiteConnection sQLiteConnection7 = (SQLiteConnection) obj;
                sQLiteConnection7.getClass();
                prepare = sQLiteConnection7.prepare("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    prepare.step();
                    int o2 = E2166724654553415323.o(sQLiteConnection7);
                    prepare.close();
                    return Integer.valueOf(o2);
                } finally {
                }
            default:
                SQLiteConnection sQLiteConnection8 = (SQLiteConnection) obj;
                sQLiteConnection8.getClass();
                prepare = sQLiteConnection8.prepare("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int k67 = Y2666402291564931474.k(prepare, "id");
                    int k68 = Y2666402291564931474.k(prepare, "state");
                    int k69 = Y2666402291564931474.k(prepare, "worker_class_name");
                    int k70 = Y2666402291564931474.k(prepare, "input_merger_class_name");
                    int k71 = Y2666402291564931474.k(prepare, "input");
                    int k72 = Y2666402291564931474.k(prepare, "output");
                    int k73 = Y2666402291564931474.k(prepare, "initial_delay");
                    int k74 = Y2666402291564931474.k(prepare, "interval_duration");
                    int k75 = Y2666402291564931474.k(prepare, "flex_duration");
                    int k76 = Y2666402291564931474.k(prepare, "run_attempt_count");
                    int k77 = Y2666402291564931474.k(prepare, "backoff_policy");
                    int k78 = Y2666402291564931474.k(prepare, "backoff_delay_duration");
                    int k79 = Y2666402291564931474.k(prepare, "last_enqueue_time");
                    int k80 = Y2666402291564931474.k(prepare, "minimum_retention_duration");
                    int k81 = Y2666402291564931474.k(prepare, "schedule_requested_at");
                    int k82 = Y2666402291564931474.k(prepare, "run_in_foreground");
                    int k83 = Y2666402291564931474.k(prepare, "out_of_quota_policy");
                    int k84 = Y2666402291564931474.k(prepare, "period_count");
                    int k85 = Y2666402291564931474.k(prepare, "generation");
                    int k86 = Y2666402291564931474.k(prepare, "next_schedule_time_override");
                    int k87 = Y2666402291564931474.k(prepare, "next_schedule_time_override_generation");
                    int k88 = Y2666402291564931474.k(prepare, "stop_reason");
                    int k89 = Y2666402291564931474.k(prepare, "trace_tag");
                    int k90 = Y2666402291564931474.k(prepare, "backoff_on_system_interruptions");
                    int k91 = Y2666402291564931474.k(prepare, "required_network_type");
                    int k92 = Y2666402291564931474.k(prepare, "required_network_request");
                    int k93 = Y2666402291564931474.k(prepare, "requires_charging");
                    int k94 = Y2666402291564931474.k(prepare, "requires_device_idle");
                    int k95 = Y2666402291564931474.k(prepare, "requires_battery_not_low");
                    int k96 = Y2666402291564931474.k(prepare, "requires_storage_not_low");
                    int k97 = Y2666402291564931474.k(prepare, "trigger_content_update_delay");
                    int k98 = Y2666402291564931474.k(prepare, "trigger_max_content_delay");
                    int k99 = Y2666402291564931474.k(prepare, "content_uri_triggers");
                    ArrayList arrayList5 = new ArrayList();
                    while (prepare.step()) {
                        String text9 = prepare.getText(k67);
                        int i61 = k80;
                        int i62 = k79;
                        Y8203071358079267502 D3 = W7808703833045379622.D((int) prepare.getLong(k68));
                        String text10 = prepare.getText(k69);
                        String text11 = prepare.getText(k70);
                        byte[] blob3 = prepare.getBlob(k71);
                        Z4023314114778119473 z40233141147781194733 = Z4023314114778119473.b;
                        Z4023314114778119473 B7 = Z860808776098365610.B(blob3);
                        Z4023314114778119473 B8 = Z860808776098365610.B(prepare.getBlob(k72));
                        long j17 = prepare.getLong(k73);
                        long j18 = prepare.getLong(k74);
                        long j19 = prepare.getLong(k75);
                        int i63 = (int) prepare.getLong(k76);
                        int i64 = k71;
                        int i65 = k70;
                        Y6144095862626460568 A3 = W7808703833045379622.A((int) prepare.getLong(k77));
                        long j20 = prepare.getLong(k78);
                        long j21 = prepare.getLong(i62);
                        long j22 = prepare.getLong(i61);
                        int i66 = k81;
                        long j23 = prepare.getLong(i66);
                        int i67 = k69;
                        int i68 = k82;
                        boolean z10 = ((int) prepare.getLong(i68)) != 0;
                        int i69 = k68;
                        int i70 = k83;
                        W17497847401432715949 C3 = W7808703833045379622.C((int) prepare.getLong(i70));
                        k83 = i70;
                        int i71 = k84;
                        int i72 = (int) prepare.getLong(i71);
                        k84 = i71;
                        int i73 = k85;
                        int i74 = (int) prepare.getLong(i73);
                        int i75 = k86;
                        long j24 = prepare.getLong(i75);
                        int i76 = k87;
                        int i77 = (int) prepare.getLong(i76);
                        k87 = i76;
                        int i78 = k88;
                        int i79 = (int) prepare.getLong(i78);
                        int i80 = k89;
                        String text12 = prepare.isNull(i80) ? null : prepare.getText(i80);
                        int i81 = k90;
                        if (prepare.isNull(i81)) {
                            k89 = i80;
                            k88 = i78;
                            valueOf3 = null;
                        } else {
                            k89 = i80;
                            k88 = i78;
                            valueOf3 = Integer.valueOf((int) prepare.getLong(i81));
                        }
                        if (valueOf3 != null) {
                            bool3 = Boolean.valueOf(valueOf3.intValue() != 0);
                        } else {
                            bool3 = null;
                        }
                        int i82 = k91;
                        M12733718480826052124 B9 = W7808703833045379622.B((int) prepare.getLong(i82));
                        int i83 = k92;
                        N13222963410360886453 M3 = W7808703833045379622.M(prepare.getBlob(i83));
                        int i84 = k93;
                        boolean z11 = ((int) prepare.getLong(i84)) != 0;
                        int i85 = k94;
                        boolean z12 = ((int) prepare.getLong(i85)) != 0;
                        int i86 = k95;
                        boolean z13 = ((int) prepare.getLong(i86)) != 0;
                        k95 = i86;
                        int i87 = k96;
                        int i88 = k97;
                        int i89 = k98;
                        k97 = i88;
                        int i90 = k99;
                        arrayList5.add(new L16425900549479658727(text9, D3, text10, text11, B7, B8, j17, j18, j19, new K13184022901285147448(M3, B9, z11, z12, z13, ((int) prepare.getLong(i87)) != 0, prepare.getLong(i88), prepare.getLong(i89), W7808703833045379622.m(prepare.getBlob(i90))), i63, A3, j20, j21, j22, j23, z10, C3, i72, i74, j24, i77, i79, text12, bool3));
                        k68 = i69;
                        k82 = i68;
                        k85 = i73;
                        k86 = i75;
                        k90 = i81;
                        k91 = i82;
                        k92 = i83;
                        k93 = i84;
                        k94 = i85;
                        k99 = i90;
                        k98 = i89;
                        k96 = i87;
                        k80 = i61;
                        k70 = i65;
                        k71 = i64;
                        k69 = i67;
                        k81 = i66;
                        k79 = i62;
                    }
                    return arrayList5;
                } finally {
                }
        }
    }
}
