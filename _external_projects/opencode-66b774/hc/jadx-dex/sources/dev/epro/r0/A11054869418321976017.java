package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class A11054869418321976017 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ byte a;

    public /* synthetic */ A11054869418321976017(byte b) {
        this.a = b;
    }

    private final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        int i;
        int i2;
        java.lang.Integer numValueOf;
        androidx.sqlite.SQLiteConnection sQLiteConnection = (androidx.sqlite.SQLiteConnection) obj;
        sQLiteConnection.getClass();
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        try {
            int iK = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "id");
            int iK2 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "state");
            int iK3 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "worker_class_name");
            int iK4 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "input_merger_class_name");
            int iK5 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "input");
            int iK6 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "output");
            int iK7 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "initial_delay");
            int iK8 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "interval_duration");
            int iK9 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "flex_duration");
            int iK10 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "run_attempt_count");
            int iK11 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "backoff_policy");
            int iK12 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "backoff_delay_duration");
            int iK13 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "last_enqueue_time");
            int iK14 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "minimum_retention_duration");
            int iK15 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "schedule_requested_at");
            int iK16 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "run_in_foreground");
            int iK17 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "out_of_quota_policy");
            int iK18 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "period_count");
            int iK19 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "generation");
            int iK20 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "next_schedule_time_override");
            int iK21 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int iK22 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "stop_reason");
            int iK23 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "trace_tag");
            int iK24 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int iK25 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "required_network_type");
            int iK26 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "required_network_request");
            int iK27 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "requires_charging");
            int iK28 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "requires_device_idle");
            int iK29 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "requires_battery_not_low");
            int iK30 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "requires_storage_not_low");
            int iK31 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "trigger_content_update_delay");
            int iK32 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "trigger_max_content_delay");
            int iK33 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "content_uri_triggers");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.getText(iK);
                int i3 = iK14;
                java.util.ArrayList arrayList2 = arrayList;
                dev.epro.r0.Y8203071358079267502 y8203071358079267502D = dev.epro.r0.W7808703833045379622.D((int) sQLiteStatementPrepare.getLong(iK2));
                java.lang.String text2 = sQLiteStatementPrepare.getText(iK3);
                java.lang.String text3 = sQLiteStatementPrepare.getText(iK4);
                byte[] blob = sQLiteStatementPrepare.getBlob(iK5);
                dev.epro.r0.Z4023314114778119473 z4023314114778119473 = dev.epro.r0.Z4023314114778119473.b;
                dev.epro.r0.Z4023314114778119473 z4023314114778119473B = dev.epro.r0.Z860808776098365610.B(blob);
                dev.epro.r0.Z4023314114778119473 z4023314114778119473B2 = dev.epro.r0.Z860808776098365610.B(sQLiteStatementPrepare.getBlob(iK6));
                long j = sQLiteStatementPrepare.getLong(iK7);
                long j2 = sQLiteStatementPrepare.getLong(iK8);
                long j3 = sQLiteStatementPrepare.getLong(iK9);
                int i4 = (int) sQLiteStatementPrepare.getLong(iK10);
                int i5 = iK2;
                int i6 = iK3;
                dev.epro.r0.Y6144095862626460568 y6144095862626460568A = dev.epro.r0.W7808703833045379622.A((int) sQLiteStatementPrepare.getLong(iK11));
                long j4 = sQLiteStatementPrepare.getLong(iK12);
                long j5 = sQLiteStatementPrepare.getLong(iK13);
                long j6 = sQLiteStatementPrepare.getLong(i3);
                int i7 = iK15;
                long j7 = sQLiteStatementPrepare.getLong(i7);
                int i8 = iK;
                int i9 = iK16;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i9)) != 0;
                int i10 = iK17;
                int i11 = iK4;
                dev.epro.r0.W17497847401432715949 w17497847401432715949C = dev.epro.r0.W7808703833045379622.C((int) sQLiteStatementPrepare.getLong(i10));
                int i12 = iK18;
                int i13 = iK5;
                int i14 = (int) sQLiteStatementPrepare.getLong(i12);
                int i15 = iK19;
                int i16 = (int) sQLiteStatementPrepare.getLong(i15);
                int i17 = iK20;
                long j8 = sQLiteStatementPrepare.getLong(i17);
                int i18 = iK21;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                int i20 = iK22;
                int i21 = (int) sQLiteStatementPrepare.getLong(i20);
                int i22 = iK23;
                java.lang.Boolean boolValueOf = null;
                java.lang.String text4 = sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22);
                int i23 = iK24;
                if (sQLiteStatementPrepare.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    numValueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i23));
                }
                if (numValueOf != null) {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i24 = iK25;
                java.lang.Boolean bool = boolValueOf;
                dev.epro.r0.M12733718480826052124 m12733718480826052124B = dev.epro.r0.W7808703833045379622.B((int) sQLiteStatementPrepare.getLong(i24));
                int i25 = iK26;
                dev.epro.r0.N13222963410360886453 n13222963410360886453M = dev.epro.r0.W7808703833045379622.M(sQLiteStatementPrepare.getBlob(i25));
                iK25 = i24;
                iK26 = i25;
                int i26 = iK27;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i26)) != 0;
                iK27 = i26;
                int i27 = iK28;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i27)) != 0;
                int i28 = iK29;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i28)) != 0;
                iK29 = i28;
                int i29 = iK30;
                int i30 = iK31;
                int i31 = iK32;
                int i32 = iK33;
                iK33 = i32;
                arrayList2.add(new dev.epro.r0.L16425900549479658727(text, y8203071358079267502D, text2, text3, z4023314114778119473B, z4023314114778119473B2, j, j2, j3, new dev.epro.r0.K13184022901285147448(n13222963410360886453M, m12733718480826052124B, z2, z3, z4, ((int) sQLiteStatementPrepare.getLong(i29)) != 0, sQLiteStatementPrepare.getLong(i30), sQLiteStatementPrepare.getLong(i31), dev.epro.r0.W7808703833045379622.m(sQLiteStatementPrepare.getBlob(i32))), i4, y6144095862626460568A, j4, j5, j6, j7, z, w17497847401432715949C, i14, i16, j8, i, i21, text4, bool));
                iK30 = i29;
                iK4 = i11;
                iK17 = i10;
                iK19 = i15;
                iK22 = i2;
                iK24 = i23;
                iK31 = i30;
                iK32 = i31;
                iK2 = i5;
                iK14 = i3;
                iK3 = i6;
                arrayList = arrayList2;
                iK = i8;
                iK15 = i7;
                iK16 = i9;
                iK20 = i17;
                iK21 = i18;
                iK23 = i22;
                iK28 = i27;
                iK5 = i13;
                iK18 = i12;
            }
            java.util.ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    private final java.lang.Object d(java.lang.Object obj) throws java.lang.Exception {
        int i;
        java.lang.Integer numValueOf;
        androidx.sqlite.SQLiteConnection sQLiteConnection = (androidx.sqlite.SQLiteConnection) obj;
        sQLiteConnection.getClass();
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            sQLiteStatementPrepare.bindLong(1, 200L);
            int iK = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "id");
            int iK2 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "state");
            int iK3 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "worker_class_name");
            int iK4 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "input_merger_class_name");
            int iK5 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "input");
            int iK6 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "output");
            int iK7 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "initial_delay");
            int iK8 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "interval_duration");
            int iK9 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "flex_duration");
            int iK10 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "run_attempt_count");
            int iK11 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "backoff_policy");
            int iK12 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "backoff_delay_duration");
            int iK13 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "last_enqueue_time");
            int iK14 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "minimum_retention_duration");
            int iK15 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "schedule_requested_at");
            int iK16 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "run_in_foreground");
            int iK17 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "out_of_quota_policy");
            int iK18 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "period_count");
            int iK19 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "generation");
            int iK20 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "next_schedule_time_override");
            int iK21 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int iK22 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "stop_reason");
            int iK23 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "trace_tag");
            int iK24 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int iK25 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "required_network_type");
            int iK26 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "required_network_request");
            int iK27 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "requires_charging");
            int iK28 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "requires_device_idle");
            int iK29 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "requires_battery_not_low");
            int iK30 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "requires_storage_not_low");
            int iK31 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "trigger_content_update_delay");
            int iK32 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "trigger_max_content_delay");
            int iK33 = dev.epro.r0.Y2666402291564931474.k(sQLiteStatementPrepare, "content_uri_triggers");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.getText(iK);
                int i2 = iK13;
                int i3 = iK14;
                dev.epro.r0.Y8203071358079267502 y8203071358079267502D = dev.epro.r0.W7808703833045379622.D((int) sQLiteStatementPrepare.getLong(iK2));
                java.lang.String text2 = sQLiteStatementPrepare.getText(iK3);
                java.lang.String text3 = sQLiteStatementPrepare.getText(iK4);
                byte[] blob = sQLiteStatementPrepare.getBlob(iK5);
                dev.epro.r0.Z4023314114778119473 z4023314114778119473 = dev.epro.r0.Z4023314114778119473.b;
                dev.epro.r0.Z4023314114778119473 z4023314114778119473B = dev.epro.r0.Z860808776098365610.B(blob);
                dev.epro.r0.Z4023314114778119473 z4023314114778119473B2 = dev.epro.r0.Z860808776098365610.B(sQLiteStatementPrepare.getBlob(iK6));
                long j = sQLiteStatementPrepare.getLong(iK7);
                long j2 = sQLiteStatementPrepare.getLong(iK8);
                long j3 = sQLiteStatementPrepare.getLong(iK9);
                int i4 = (int) sQLiteStatementPrepare.getLong(iK10);
                int i5 = iK;
                int i6 = iK2;
                dev.epro.r0.Y6144095862626460568 y6144095862626460568A = dev.epro.r0.W7808703833045379622.A((int) sQLiteStatementPrepare.getLong(iK11));
                long j4 = sQLiteStatementPrepare.getLong(iK12);
                long j5 = sQLiteStatementPrepare.getLong(i2);
                long j6 = sQLiteStatementPrepare.getLong(i3);
                int i7 = iK15;
                long j7 = sQLiteStatementPrepare.getLong(i7);
                iK15 = i7;
                int i8 = iK16;
                int i9 = iK3;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i8)) != 0;
                int i10 = iK17;
                int i11 = iK4;
                dev.epro.r0.W17497847401432715949 w17497847401432715949C = dev.epro.r0.W7808703833045379622.C((int) sQLiteStatementPrepare.getLong(i10));
                int i12 = iK18;
                int i13 = (int) sQLiteStatementPrepare.getLong(i12);
                int i14 = iK19;
                int i15 = (int) sQLiteStatementPrepare.getLong(i14);
                int i16 = iK20;
                long j8 = sQLiteStatementPrepare.getLong(i16);
                int i17 = iK21;
                int i18 = (int) sQLiteStatementPrepare.getLong(i17);
                iK21 = i17;
                int i19 = iK22;
                int i20 = (int) sQLiteStatementPrepare.getLong(i19);
                int i21 = iK23;
                java.lang.Boolean boolValueOf = null;
                java.lang.String text4 = sQLiteStatementPrepare.isNull(i21) ? null : sQLiteStatementPrepare.getText(i21);
                int i22 = iK24;
                if (sQLiteStatementPrepare.isNull(i22)) {
                    i = i21;
                    iK22 = i19;
                    numValueOf = null;
                } else {
                    i = i21;
                    iK22 = i19;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i22));
                }
                if (numValueOf != null) {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf.intValue() != 0);
                }
                java.lang.Boolean bool = boolValueOf;
                int i23 = iK25;
                dev.epro.r0.M12733718480826052124 m12733718480826052124B = dev.epro.r0.W7808703833045379622.B((int) sQLiteStatementPrepare.getLong(i23));
                int i24 = iK26;
                dev.epro.r0.N13222963410360886453 n13222963410360886453M = dev.epro.r0.W7808703833045379622.M(sQLiteStatementPrepare.getBlob(i24));
                int i25 = iK27;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i25)) != 0;
                int i26 = iK28;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i26)) != 0;
                int i27 = iK29;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i27)) != 0;
                iK29 = i27;
                int i28 = iK30;
                int i29 = iK31;
                int i30 = iK32;
                iK31 = i29;
                int i31 = iK33;
                arrayList.add(new dev.epro.r0.L16425900549479658727(text, y8203071358079267502D, text2, text3, z4023314114778119473B, z4023314114778119473B2, j, j2, j3, new dev.epro.r0.K13184022901285147448(n13222963410360886453M, m12733718480826052124B, z2, z3, z4, ((int) sQLiteStatementPrepare.getLong(i28)) != 0, sQLiteStatementPrepare.getLong(i29), sQLiteStatementPrepare.getLong(i30), dev.epro.r0.W7808703833045379622.m(sQLiteStatementPrepare.getBlob(i31))), i4, y6144095862626460568A, j4, j5, j6, j7, z, w17497847401432715949C, i13, i15, j8, i18, i20, text4, bool));
                iK28 = i26;
                iK4 = i11;
                iK17 = i10;
                iK18 = i12;
                iK19 = i14;
                iK20 = i16;
                iK23 = i;
                iK24 = i22;
                iK25 = i23;
                iK26 = i24;
                iK27 = i25;
                iK33 = i31;
                iK32 = i30;
                iK30 = i28;
                iK = i5;
                iK3 = i9;
                iK13 = i2;
                iK14 = i3;
                iK2 = i6;
                iK16 = i8;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r87) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A11054869418321976017.invoke(java.lang.Object):java.lang.Object");
    }
}
