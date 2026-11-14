package dev.epro.r0;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class A17466970639618813539 {
    public static final /* synthetic */ int a = 0;

    static {
        B14824868959299866349.o("EnqueueRunnable");
    }

    public static boolean a(B9934915652113529982 b9934915652113529982) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        UUID uuid;
        WorkDatabase workDatabase;
        HashSet hashSetA = B9934915652113529982.a(b9934915652113529982);
        W13734796219485846113 w13734796219485846113 = b9934915652113529982.a;
        List list = b9934915652113529982.b;
        String[] strArr = (String[]) hashSetA.toArray(new String[0]);
        O12545633033254628644 o12545633033254628644 = w13734796219485846113.b.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = w13734796219485846113.c;
        boolean z5 = strArr != null && strArr.length > 0;
        Y8203071358079267502 y8203071358079267502 = Y8203071358079267502.f;
        Y8203071358079267502 y82030713580792675022 = Y8203071358079267502.d;
        if (z5) {
            z2 = false;
            z3 = false;
            z = true;
            for (String str : strArr) {
                L16425900549479658727 l16425900549479658727B = workDatabase2.x().b(str);
                if (l16425900549479658727B == null) {
                    B14824868959299866349.n().getClass();
                    z4 = false;
                    break;
                }
                Y8203071358079267502 y82030713580792675023 = l16425900549479658727B.b;
                z &= y82030713580792675023 == Y8203071358079267502.c;
                if (y82030713580792675023 == y82030713580792675022) {
                    z3 = true;
                } else if (y82030713580792675023 == y8203071358079267502) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        Throwable th = null;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (!zIsEmpty && !z5) {
            workDatabase2.x().getClass();
            throw null;
        }
        Iterator it = list.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            M10089736868580320414 m10089736868580320414 = (M10089736868580320414) it.next();
            Throwable th2 = th;
            L16425900549479658727 l16425900549479658727B2 = m10089736868580320414.b;
            Iterator it2 = it;
            UUID uuid2 = m10089736868580320414.a;
            if (!z5 || z) {
                uuid = uuid2;
                l16425900549479658727B2.n = jCurrentTimeMillis;
            } else {
                if (z3) {
                    l16425900549479658727B2.b = y82030713580792675022;
                } else if (z2) {
                    l16425900549479658727B2.b = y8203071358079267502;
                } else {
                    uuid = uuid2;
                    l16425900549479658727B2.b = Y8203071358079267502.e;
                }
                uuid = uuid2;
            }
            long j = jCurrentTimeMillis;
            if (l16425900549479658727B2.b == Y8203071358079267502.a) {
                z6 = true;
            }
            R6421434650946170247 r6421434650946170247X = workDatabase2.x();
            w13734796219485846113.e.getClass();
            boolean zA = l16425900549479658727B2.e.a("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            W13734796219485846113 w137347962194858461132 = w13734796219485846113;
            boolean zA2 = l16425900549479658727B2.e.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean zA3 = l16425900549479658727B2.e.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (!zA && zA2 && zA3) {
                String str2 = l16425900549479658727B2.c;
                workDatabase = workDatabase2;
                S11323950170556863336 s11323950170556863336 = new S11323950170556863336((byte) 0);
                Z4023314114778119473 z4023314114778119473 = l16425900549479658727B2.e;
                z4023314114778119473.getClass();
                s11323950170556863336.e(z4023314114778119473.a);
                s11323950170556863336.a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str2);
                l16425900549479658727B2 = L16425900549479658727.b(l16425900549479658727B2, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", s11323950170556863336.d());
            } else {
                workDatabase = workDatabase2;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                K13184022901285147448 k13184022901285147448 = l16425900549479658727B2.j;
                String str3 = l16425900549479658727B2.c;
                if (!S10823041268949770285.t(str3, ConstraintTrackingWorker.class.getName()) && (k13184022901285147448.e || k13184022901285147448.f)) {
                    S11323950170556863336 s113239501705568633362 = new S11323950170556863336((byte) 0);
                    Z4023314114778119473 z40233141147781194732 = l16425900549479658727B2.e;
                    z40233141147781194732.getClass();
                    s113239501705568633362.e(z40233141147781194732.a);
                    s113239501705568633362.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str3);
                    l16425900549479658727B2 = L16425900549479658727.b(l16425900549479658727B2, ConstraintTrackingWorker.class.getName(), s113239501705568633362.d());
                }
            }
            r6421434650946170247X.getClass();
            G16660188620551127941.E(r6421434650946170247X.a, false, true, new Y14986451238933639207(r6421434650946170247X, l16425900549479658727B2, (byte) 21));
            if (z5) {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str4 = strArr[i];
                    String string = uuid.toString();
                    string.getClass();
                    H5725712505688761166 h5725712505688761166 = new H5725712505688761166(string, str4);
                    I16138585026445501844 i16138585026445501844S = workDatabase.s();
                    i16138585026445501844S.getClass();
                    G16660188620551127941.E(i16138585026445501844S.a, false, true, new J7403353095371830496(i16138585026445501844S, h5725712505688761166, (byte) 28));
                    i++;
                    strArr = strArr;
                }
            }
            String[] strArr2 = strArr;
            O7265960433762398955 o7265960433762398955Y = workDatabase.y();
            String string2 = uuid.toString();
            string2.getClass();
            Set set = m10089736868580320414.c;
            o7265960433762398955Y.getClass();
            Iterator it3 = set.iterator();
            while (it3.hasNext()) {
                G16660188620551127941.E(o7265960433762398955Y.a, false, true, new Y14986451238933639207(o7265960433762398955Y, new T10142381218774778524((String) it3.next(), string2), (byte) 22));
            }
            if (!zIsEmpty) {
                workDatabase.v();
                uuid.toString().getClass();
                throw th2;
            }
            th = th2;
            it = it2;
            jCurrentTimeMillis = j;
            w13734796219485846113 = w137347962194858461132;
            workDatabase2 = workDatabase;
            strArr = strArr2;
        }
        z4 = z6;
        b9934915652113529982.e = true;
        return z4;
    }
}
