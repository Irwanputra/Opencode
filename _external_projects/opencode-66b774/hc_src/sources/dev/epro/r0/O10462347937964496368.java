package dev.epro.r0;

import android.net.NetworkRequest;
import android.os.Build;
import androidx.sqlite.SQLiteStatement;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O10462347937964496368 extends S2941385686793915703 {
    public final /* synthetic */ byte W;

    public /* synthetic */ O10462347937964496368(byte b) {
        this.W = b;
    }

    @Override // dev.epro.r0.S2941385686793915703
    public final void w(SQLiteStatement sQLiteStatement, Object obj) {
        int i;
        int i2;
        int[] c1;
        boolean hasTransport;
        int[] c12;
        boolean hasCapability;
        byte[] byteArray;
        byte[] byteArray2;
        int i3 = 3;
        switch (this.W) {
            case 0:
                H5725712505688761166 h5725712505688761166 = (H5725712505688761166) obj;
                sQLiteStatement.getClass();
                h5725712505688761166.getClass();
                sQLiteStatement.bindText(1, h5725712505688761166.a);
                sQLiteStatement.bindText(2, h5725712505688761166.b);
                return;
            case 1:
                J11694349994993559002 j11694349994993559002 = (J11694349994993559002) obj;
                sQLiteStatement.getClass();
                j11694349994993559002.getClass();
                sQLiteStatement.bindText(1, j11694349994993559002.a);
                sQLiteStatement.bindLong(2, j11694349994993559002.b.longValue());
                return;
            case 2:
                Z9812534989346881836 z9812534989346881836 = (Z9812534989346881836) obj;
                sQLiteStatement.getClass();
                z9812534989346881836.getClass();
                sQLiteStatement.bindText(1, z9812534989346881836.a);
                sQLiteStatement.bindLong(2, z9812534989346881836.b);
                sQLiteStatement.bindLong(3, z9812534989346881836.c);
                return;
            case 3:
                sQLiteStatement.getClass();
                ((Z8881442951747294179) obj).getClass();
                throw null;
            case 4:
                L16425900549479658727 l16425900549479658727 = (L16425900549479658727) obj;
                sQLiteStatement.getClass();
                l16425900549479658727.getClass();
                sQLiteStatement.bindText(1, l16425900549479658727.a);
                sQLiteStatement.bindLong(2, W7808703833045379622.K(l16425900549479658727.b));
                sQLiteStatement.bindText(3, l16425900549479658727.c);
                sQLiteStatement.bindText(4, l16425900549479658727.d);
                Z4023314114778119473 z4023314114778119473 = Z4023314114778119473.b;
                sQLiteStatement.bindBlob(5, Z860808776098365610.R(l16425900549479658727.e));
                sQLiteStatement.bindBlob(6, Z860808776098365610.R(l16425900549479658727.f));
                sQLiteStatement.bindLong(7, l16425900549479658727.g);
                sQLiteStatement.bindLong(8, l16425900549479658727.h);
                sQLiteStatement.bindLong(9, l16425900549479658727.i);
                sQLiteStatement.bindLong(10, l16425900549479658727.k);
                Y6144095862626460568 y6144095862626460568 = l16425900549479658727.l;
                y6144095862626460568.getClass();
                int ordinal = y6144095862626460568.ordinal();
                if (ordinal == 0) {
                    i = 0;
                } else {
                    if (ordinal != 1) {
                        Z3383101362411723454.g();
                        return;
                    }
                    i = 1;
                }
                sQLiteStatement.bindLong(11, i);
                sQLiteStatement.bindLong(12, l16425900549479658727.m);
                sQLiteStatement.bindLong(13, l16425900549479658727.n);
                sQLiteStatement.bindLong(14, l16425900549479658727.f345o);
                sQLiteStatement.bindLong(15, l16425900549479658727.p);
                sQLiteStatement.bindLong(16, l16425900549479658727.q ? 1L : 0L);
                W17497847401432715949 w17497847401432715949 = l16425900549479658727.r;
                w17497847401432715949.getClass();
                int ordinal2 = w17497847401432715949.ordinal();
                if (ordinal2 == 0) {
                    i2 = 0;
                } else {
                    if (ordinal2 != 1) {
                        Z3383101362411723454.g();
                        return;
                    }
                    i2 = 1;
                }
                sQLiteStatement.bindLong(17, i2);
                sQLiteStatement.bindLong(18, l16425900549479658727.s);
                sQLiteStatement.bindLong(19, l16425900549479658727.t);
                sQLiteStatement.bindLong(20, l16425900549479658727.u);
                sQLiteStatement.bindLong(21, l16425900549479658727.v);
                sQLiteStatement.bindLong(22, l16425900549479658727.w);
                String str = l16425900549479658727.x;
                if (str == null) {
                    sQLiteStatement.bindNull(23);
                } else {
                    sQLiteStatement.bindText(23, str);
                }
                Boolean bool = l16425900549479658727.y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    sQLiteStatement.bindNull(24);
                } else {
                    sQLiteStatement.bindLong(24, r5.intValue());
                }
                K13184022901285147448 k13184022901285147448 = l16425900549479658727.j;
                M12733718480826052124 m12733718480826052124 = k13184022901285147448.a;
                int ordinal3 = m12733718480826052124.ordinal();
                if (ordinal3 == 0) {
                    i3 = 0;
                } else if (ordinal3 == 1) {
                    i3 = 1;
                } else if (ordinal3 == 2) {
                    i3 = 2;
                } else if (ordinal3 != 3) {
                    if (ordinal3 == 4) {
                        i3 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || m12733718480826052124 != M12733718480826052124.f) {
                            throw new IllegalArgumentException("Could not convert " + m12733718480826052124 + " to int");
                        }
                        i3 = 5;
                    }
                }
                sQLiteStatement.bindLong(25, i3);
                N13222963410360886453 n13222963410360886453 = k13184022901285147448.b;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = (NetworkRequest) n13222963410360886453.a;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                if (i4 >= 31) {
                                    c1 = networkRequest.getTransportTypes();
                                    c1.getClass();
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i5 = 0; i5 < 10; i5++) {
                                        int i6 = iArr[i5];
                                        hasTransport = networkRequest.hasTransport(i6);
                                        if (hasTransport) {
                                            arrayList.add(Integer.valueOf(i6));
                                        }
                                    }
                                    c1 = R9411874267597469228.c1(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    c12 = networkRequest.getCapabilities();
                                    c12.getClass();
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i7 = 0; i7 < 30; i7++) {
                                        int i8 = iArr2[i7];
                                        hasCapability = networkRequest.hasCapability(i8);
                                        if (hasCapability) {
                                            arrayList2.add(Integer.valueOf(i8));
                                        }
                                    }
                                    c12 = R9411874267597469228.c1(arrayList2);
                                }
                                objectOutputStream.writeInt(c1.length);
                                for (int i9 : c1) {
                                    objectOutputStream.writeInt(i9);
                                }
                                objectOutputStream.writeInt(c12.length);
                                for (int i10 : c12) {
                                    objectOutputStream.writeInt(i10);
                                }
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArray.getClass();
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
                sQLiteStatement.bindBlob(26, byteArray);
                sQLiteStatement.bindLong(27, k13184022901285147448.c ? 1L : 0L);
                sQLiteStatement.bindLong(28, k13184022901285147448.d ? 1L : 0L);
                sQLiteStatement.bindLong(29, k13184022901285147448.e ? 1L : 0L);
                sQLiteStatement.bindLong(30, k13184022901285147448.f ? 1L : 0L);
                sQLiteStatement.bindLong(31, k13184022901285147448.g);
                sQLiteStatement.bindLong(32, k13184022901285147448.h);
                Set<D12564639665095693399> set = k13184022901285147448.i;
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (D12564639665095693399 d12564639665095693399 : set) {
                                objectOutputStream2.writeUTF(d12564639665095693399.a.toString());
                                objectOutputStream2.writeBoolean(d12564639665095693399.b);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            byteArray2.getClass();
                        } finally {
                        }
                    } finally {
                    }
                }
                sQLiteStatement.bindBlob(33, byteArray2);
                return;
            default:
                T10142381218774778524 t10142381218774778524 = (T10142381218774778524) obj;
                sQLiteStatement.getClass();
                t10142381218774778524.getClass();
                sQLiteStatement.bindText(1, t10142381218774778524.a);
                sQLiteStatement.bindText(2, t10142381218774778524.b);
                return;
        }
    }

    @Override // dev.epro.r0.S2941385686793915703
    public final String z() {
        switch (this.W) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
