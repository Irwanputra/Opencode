package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X18230120339549492884 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    public /* synthetic */ X18230120339549492884(long j, byte b) {
        this.a = b;
        this.b = j;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) throws Exception {
        H7219028874700587498 h7219028874700587498;
        Object c10696704014433963524;
        SQLiteStatement sQLiteStatement;
        int i;
        int i2;
        Integer numValueOf;
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        long j = this.b;
        switch (b) {
            case 0:
                W15170032298606046665 w15170032298606046665 = (W15170032298606046665) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (w15170032298606046665.a.e() >> 32)) / 2.0f;
                return w15170032298606046665.a(new H9530584680358255093(fIntBitsToFloat, (Object) T18016951143603335921.B(w15170032298606046665, fIntBitsToFloat), (Object) new R3103059035698929241(j, 5), (byte) 0));
            case 1:
                S11814953350912860079 s11814953350912860079 = (S11814953350912860079) obj;
                F4096073349764486348 f4096073349764486348 = s11814953350912860079.b;
                if (f4096073349764486348 != null && (h7219028874700587498 = s11814953350912860079.a) != null) {
                    try {
                        c10696704014433963524 = f4096073349764486348.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        c10696704014433963524 = new C10696704014433963524(th);
                    }
                    h7219028874700587498.resumeWith(c10696704014433963524);
                    break;
                }
                return o9245300239821758723;
            case 2:
                ((S2460821117650695638) obj).a(S11671697357523908420.a, new F15754937071781394584(V8323072410254082725.a, this.b, F13667294285619437008.b, true));
                return o9245300239821758723;
            case 3:
                L17598299826319227431 l17598299826319227431 = (L17598299826319227431) obj;
                float fMin = Math.min(l17598299826319227431.K(4.0f), Float.intBitsToFloat((int) (l17598299826319227431.e() & 4294967295L)));
                float fK = l17598299826319227431.K(6.0f);
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (l17598299826319227431.e() & 4294967295L)) - fMin) / 2.0f;
                if (fIntBitsToFloat2 <= fK) {
                    fK = fIntBitsToFloat2;
                }
                if (l17598299826319227431.getLayoutDirection() == F10342546226345611902.b) {
                    long jM0 = l17598299826319227431.m0();
                    Q7316561721656982910 q7316561721656982910R = l17598299826319227431.R();
                    long jF = q7316561721656982910R.F();
                    q7316561721656982910R.A().l();
                    try {
                        ((H12843822278061842084) q7316561721656982910R.b).H(-1.0f, 1.0f, jM0);
                        E12775674050813925581.v(l17598299826319227431, j, fMin, fK);
                    } finally {
                        L11610354117192841236.w(q7316561721656982910R, jF);
                    }
                } else {
                    E12775674050813925581.v(l17598299826319227431, j, fMin, fK);
                }
                return o9245300239821758723;
            default:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    sQLiteStatementPrepare.bindLong(1, j);
                    int iK = Y2666402291564931474.k(sQLiteStatementPrepare, "id");
                    int iK2 = Y2666402291564931474.k(sQLiteStatementPrepare, "state");
                    int iK3 = Y2666402291564931474.k(sQLiteStatementPrepare, "worker_class_name");
                    int iK4 = Y2666402291564931474.k(sQLiteStatementPrepare, "input_merger_class_name");
                    int iK5 = Y2666402291564931474.k(sQLiteStatementPrepare, "input");
                    int iK6 = Y2666402291564931474.k(sQLiteStatementPrepare, "output");
                    int iK7 = Y2666402291564931474.k(sQLiteStatementPrepare, "initial_delay");
                    int iK8 = Y2666402291564931474.k(sQLiteStatementPrepare, "interval_duration");
                    int iK9 = Y2666402291564931474.k(sQLiteStatementPrepare, "flex_duration");
                    int iK10 = Y2666402291564931474.k(sQLiteStatementPrepare, "run_attempt_count");
                    int iK11 = Y2666402291564931474.k(sQLiteStatementPrepare, "backoff_policy");
                    int iK12 = Y2666402291564931474.k(sQLiteStatementPrepare, "backoff_delay_duration");
                    int iK13 = Y2666402291564931474.k(sQLiteStatementPrepare, "last_enqueue_time");
                    int iK14 = Y2666402291564931474.k(sQLiteStatementPrepare, "minimum_retention_duration");
                    int iK15 = Y2666402291564931474.k(sQLiteStatementPrepare, "schedule_requested_at");
                    int iK16 = Y2666402291564931474.k(sQLiteStatementPrepare, "run_in_foreground");
                    int iK17 = Y2666402291564931474.k(sQLiteStatementPrepare, "out_of_quota_policy");
                    int iK18 = Y2666402291564931474.k(sQLiteStatementPrepare, "period_count");
                    int iK19 = Y2666402291564931474.k(sQLiteStatementPrepare, "generation");
                    int iK20 = Y2666402291564931474.k(sQLiteStatementPrepare, "next_schedule_time_override");
                    int iK21 = Y2666402291564931474.k(sQLiteStatementPrepare, "next_schedule_time_override_generation");
                    int iK22 = Y2666402291564931474.k(sQLiteStatementPrepare, "stop_reason");
                    int iK23 = Y2666402291564931474.k(sQLiteStatementPrepare, "trace_tag");
                    int iK24 = Y2666402291564931474.k(sQLiteStatementPrepare, "backoff_on_system_interruptions");
                    int iK25 = Y2666402291564931474.k(sQLiteStatementPrepare, "required_network_type");
                    int iK26 = Y2666402291564931474.k(sQLiteStatementPrepare, "required_network_request");
                    int iK27 = Y2666402291564931474.k(sQLiteStatementPrepare, "requires_charging");
                    int iK28 = Y2666402291564931474.k(sQLiteStatementPrepare, "requires_device_idle");
                    int iK29 = Y2666402291564931474.k(sQLiteStatementPrepare, "requires_battery_not_low");
                    int iK30 = Y2666402291564931474.k(sQLiteStatementPrepare, "requires_storage_not_low");
                    int iK31 = Y2666402291564931474.k(sQLiteStatementPrepare, "trigger_content_update_delay");
                    int iK32 = Y2666402291564931474.k(sQLiteStatementPrepare, "trigger_max_content_delay");
                    int iK33 = Y2666402291564931474.k(sQLiteStatementPrepare, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.getText(iK);
                        int i3 = iK;
                        ArrayList arrayList2 = arrayList;
                        Y8203071358079267502 y8203071358079267502D = W7808703833045379622.D((int) sQLiteStatementPrepare.getLong(iK2));
                        String text2 = sQLiteStatementPrepare.getText(iK3);
                        String text3 = sQLiteStatementPrepare.getText(iK4);
                        byte[] blob = sQLiteStatementPrepare.getBlob(iK5);
                        Z4023314114778119473 z4023314114778119473 = Z4023314114778119473.b;
                        Z4023314114778119473 z4023314114778119473B = Z860808776098365610.B(blob);
                        Z4023314114778119473 z4023314114778119473B2 = Z860808776098365610.B(sQLiteStatementPrepare.getBlob(iK6));
                        long j2 = sQLiteStatementPrepare.getLong(iK7);
                        long j3 = sQLiteStatementPrepare.getLong(iK8);
                        long j4 = sQLiteStatementPrepare.getLong(iK9);
                        int i4 = (int) sQLiteStatementPrepare.getLong(iK10);
                        Y6144095862626460568 y6144095862626460568A = W7808703833045379622.A((int) sQLiteStatementPrepare.getLong(iK11));
                        long j5 = sQLiteStatementPrepare.getLong(iK12);
                        long j6 = sQLiteStatementPrepare.getLong(iK13);
                        long j7 = sQLiteStatementPrepare.getLong(iK14);
                        int i5 = iK15;
                        long j8 = sQLiteStatementPrepare.getLong(i5);
                        int i6 = iK2;
                        int i7 = iK16;
                        int i8 = iK3;
                        boolean z = ((int) sQLiteStatementPrepare.getLong(i7)) != 0;
                        int i9 = iK17;
                        W17497847401432715949 w17497847401432715949C = W7808703833045379622.C((int) sQLiteStatementPrepare.getLong(i9));
                        int i10 = iK18;
                        int i11 = (int) sQLiteStatementPrepare.getLong(i10);
                        int i12 = iK19;
                        int i13 = (int) sQLiteStatementPrepare.getLong(i12);
                        int i14 = iK20;
                        long j9 = sQLiteStatementPrepare.getLong(i14);
                        int i15 = iK14;
                        int i16 = iK21;
                        int i17 = (int) sQLiteStatementPrepare.getLong(i16);
                        int i18 = iK22;
                        int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                        int i20 = iK23;
                        String text4 = sQLiteStatementPrepare.isNull(i20) ? null : sQLiteStatementPrepare.getText(i20);
                        int i21 = iK24;
                        if (sQLiteStatementPrepare.isNull(i21)) {
                            i = i17;
                            i2 = i18;
                            numValueOf = null;
                        } else {
                            i = i17;
                            i2 = i18;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i21));
                        }
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i22 = iK25;
                        Boolean bool = boolValueOf;
                        M12733718480826052124 m12733718480826052124B = W7808703833045379622.B((int) sQLiteStatementPrepare.getLong(i22));
                        int i23 = iK26;
                        N13222963410360886453 n13222963410360886453M = W7808703833045379622.M(sQLiteStatementPrepare.getBlob(i23));
                        iK25 = i22;
                        iK26 = i23;
                        int i24 = iK27;
                        boolean z2 = ((int) sQLiteStatementPrepare.getLong(i24)) != 0;
                        iK27 = i24;
                        int i25 = iK28;
                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(i25)) != 0;
                        int i26 = iK29;
                        boolean z4 = ((int) sQLiteStatementPrepare.getLong(i26)) != 0;
                        iK29 = i26;
                        int i27 = iK30;
                        int i28 = iK31;
                        int i29 = iK32;
                        int i30 = iK33;
                        iK33 = i30;
                        sQLiteStatement = sQLiteStatementPrepare;
                        try {
                            arrayList2.add(new L16425900549479658727(text, y8203071358079267502D, text2, text3, z4023314114778119473B, z4023314114778119473B2, j2, j3, j4, new K13184022901285147448(n13222963410360886453M, m12733718480826052124B, z2, z3, z4, ((int) sQLiteStatementPrepare.getLong(i27)) != 0, sQLiteStatementPrepare.getLong(i28), sQLiteStatementPrepare.getLong(i29), W7808703833045379622.m(sQLiteStatementPrepare.getBlob(i30))), i4, y6144095862626460568A, j5, j6, j7, j8, z, w17497847401432715949C, i11, i13, j9, i, i19, text4, bool));
                            iK2 = i6;
                            iK15 = i5;
                            iK22 = i2;
                            iK24 = i21;
                            iK30 = i27;
                            iK32 = i29;
                            iK14 = i15;
                            iK20 = i14;
                            iK21 = i16;
                            iK23 = i20;
                            arrayList = arrayList2;
                            iK28 = i25;
                            iK3 = i8;
                            iK16 = i7;
                            iK17 = i9;
                            iK18 = i10;
                            sQLiteStatementPrepare = sQLiteStatement;
                            iK19 = i12;
                            iK31 = i28;
                            iK = i3;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteStatement.close();
                            throw th;
                        }
                        break;
                    }
                    SQLiteStatement sQLiteStatement2 = sQLiteStatementPrepare;
                    ArrayList arrayList3 = arrayList;
                    sQLiteStatement2.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteStatement = sQLiteStatementPrepare;
                }
                break;
        }
    }
}
