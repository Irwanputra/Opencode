package dev.epro.r0;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class X18230120339549492884 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    public /* synthetic */ X18230120339549492884(long j, byte b) {
        this.a = b;
        this.b = j;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        H7219028874700587498 h7219028874700587498;
        Object c10696704014433963524;
        SQLiteStatement sQLiteStatement;
        int i;
        int i2;
        Integer valueOf;
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        long j = this.b;
        switch (b) {
            case 0:
                W15170032298606046665 w15170032298606046665 = (W15170032298606046665) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (w15170032298606046665.a.e() >> 32)) / 2.0f;
                return w15170032298606046665.a(new H9530584680358255093(intBitsToFloat, (Object) T18016951143603335921.B(w15170032298606046665, intBitsToFloat), (Object) new R3103059035698929241(j, 5), (byte) 0));
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
                }
                return o9245300239821758723;
            case 2:
                ((S2460821117650695638) obj).a(S11671697357523908420.a, new F15754937071781394584(V8323072410254082725.a, this.b, F13667294285619437008.b, true));
                return o9245300239821758723;
            case 3:
                L17598299826319227431 l17598299826319227431 = (L17598299826319227431) obj;
                float min = Math.min(l17598299826319227431.K(4.0f), Float.intBitsToFloat((int) (l17598299826319227431.e() & 4294967295L)));
                float K = l17598299826319227431.K(6.0f);
                float intBitsToFloat2 = (Float.intBitsToFloat((int) (l17598299826319227431.e() & 4294967295L)) - min) / 2.0f;
                if (intBitsToFloat2 <= K) {
                    K = intBitsToFloat2;
                }
                if (l17598299826319227431.getLayoutDirection() == F10342546226345611902.b) {
                    long m0 = l17598299826319227431.m0();
                    Q7316561721656982910 R = l17598299826319227431.R();
                    long F = R.F();
                    R.A().l();
                    try {
                        ((H12843822278061842084) R.b).H(-1.0f, 1.0f, m0);
                        E12775674050813925581.v(l17598299826319227431, j, min, K);
                    } finally {
                        L11610354117192841236.w(R, F);
                    }
                } else {
                    E12775674050813925581.v(l17598299826319227431, j, min, K);
                }
                return o9245300239821758723;
            default:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement prepare = sQLiteConnection.prepare("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    prepare.bindLong(1, j);
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
                        int i3 = k;
                        ArrayList arrayList2 = arrayList;
                        Y8203071358079267502 D = W7808703833045379622.D((int) prepare.getLong(k2));
                        String text2 = prepare.getText(k3);
                        String text3 = prepare.getText(k4);
                        byte[] blob = prepare.getBlob(k5);
                        Z4023314114778119473 z4023314114778119473 = Z4023314114778119473.b;
                        Z4023314114778119473 B = Z860808776098365610.B(blob);
                        Z4023314114778119473 B2 = Z860808776098365610.B(prepare.getBlob(k6));
                        long j2 = prepare.getLong(k7);
                        long j3 = prepare.getLong(k8);
                        long j4 = prepare.getLong(k9);
                        int i4 = (int) prepare.getLong(k10);
                        Y6144095862626460568 A = W7808703833045379622.A((int) prepare.getLong(k11));
                        long j5 = prepare.getLong(k12);
                        long j6 = prepare.getLong(k13);
                        long j7 = prepare.getLong(k14);
                        int i5 = k15;
                        long j8 = prepare.getLong(i5);
                        int i6 = k2;
                        int i7 = k16;
                        int i8 = k3;
                        boolean z = ((int) prepare.getLong(i7)) != 0;
                        int i9 = k17;
                        W17497847401432715949 C = W7808703833045379622.C((int) prepare.getLong(i9));
                        int i10 = k18;
                        int i11 = (int) prepare.getLong(i10);
                        int i12 = k19;
                        int i13 = (int) prepare.getLong(i12);
                        int i14 = k20;
                        long j9 = prepare.getLong(i14);
                        int i15 = k14;
                        int i16 = k21;
                        int i17 = (int) prepare.getLong(i16);
                        int i18 = k22;
                        int i19 = (int) prepare.getLong(i18);
                        int i20 = k23;
                        Boolean bool = null;
                        String text4 = prepare.isNull(i20) ? null : prepare.getText(i20);
                        int i21 = k24;
                        if (prepare.isNull(i21)) {
                            i = i17;
                            i2 = i18;
                            valueOf = null;
                        } else {
                            i = i17;
                            i2 = i18;
                            valueOf = Integer.valueOf((int) prepare.getLong(i21));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        int i22 = k25;
                        Boolean bool2 = bool;
                        M12733718480826052124 B3 = W7808703833045379622.B((int) prepare.getLong(i22));
                        int i23 = k26;
                        N13222963410360886453 M = W7808703833045379622.M(prepare.getBlob(i23));
                        k25 = i22;
                        k26 = i23;
                        int i24 = k27;
                        boolean z2 = ((int) prepare.getLong(i24)) != 0;
                        k27 = i24;
                        int i25 = k28;
                        boolean z3 = ((int) prepare.getLong(i25)) != 0;
                        int i26 = k29;
                        boolean z4 = ((int) prepare.getLong(i26)) != 0;
                        k29 = i26;
                        int i27 = k30;
                        int i28 = k31;
                        int i29 = k32;
                        int i30 = k33;
                        k33 = i30;
                        sQLiteStatement = prepare;
                        try {
                            arrayList2.add(new L16425900549479658727(text, D, text2, text3, B, B2, j2, j3, j4, new K13184022901285147448(M, B3, z2, z3, z4, ((int) prepare.getLong(i27)) != 0, prepare.getLong(i28), prepare.getLong(i29), W7808703833045379622.m(prepare.getBlob(i30))), i4, A, j5, j6, j7, j8, z, C, i11, i13, j9, i, i19, text4, bool2));
                            k2 = i6;
                            k15 = i5;
                            k22 = i2;
                            k24 = i21;
                            k30 = i27;
                            k32 = i29;
                            k14 = i15;
                            k20 = i14;
                            k21 = i16;
                            k23 = i20;
                            arrayList = arrayList2;
                            k28 = i25;
                            k3 = i8;
                            k16 = i7;
                            k17 = i9;
                            k18 = i10;
                            prepare = sQLiteStatement;
                            k19 = i12;
                            k31 = i28;
                            k = i3;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteStatement.close();
                            throw th;
                        }
                    }
                    SQLiteStatement sQLiteStatement2 = prepare;
                    ArrayList arrayList3 = arrayList;
                    sQLiteStatement2.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteStatement = prepare;
                }
        }
    }
}
