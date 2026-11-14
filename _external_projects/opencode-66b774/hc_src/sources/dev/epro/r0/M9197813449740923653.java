package dev.epro.r0;

import android.R;
import android.graphics.Region;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class M9197813449740923653 implements I6255327262428024138, F8386944463392899325, B15682441012508903446, X6460762560403092052, E17928301615710791514, T3455454122937680569, SupportSQLiteQuery, N9606265891541456973, R5827688671290015495 {
    public final /* synthetic */ byte a;
    public Object b;

    public M9197813449740923653(long[] jArr) {
        Q5456326841214199073 q5456326841214199073;
        this.a = (byte) 10;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            q5456326841214199073 = new Q5456326841214199073(copyOf.length);
            int i = q5456326841214199073.b;
            if (i < 0) {
                W4415201450379021245.a("");
                throw null;
            }
            if (copyOf.length != 0) {
                q5456326841214199073.b(copyOf.length + i);
                long[] jArr2 = q5456326841214199073.a;
                int i2 = q5456326841214199073.b;
                if (i != i2) {
                    O5378677881740157249.q0(jArr2, jArr2, copyOf.length + i, i, i2);
                }
                O5378677881740157249.q0(copyOf, jArr2, i, 0, copyOf.length);
                q5456326841214199073.b += copyOf.length;
            }
        } else {
            q5456326841214199073 = new Q5456326841214199073();
        }
        this.b = q5456326841214199073;
    }

    public static void l(String str) {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            int countTokens = stringTokenizer.countTokens();
            int[] iArr = new int[countTokens];
            for (int i = 0; i < countTokens; i++) {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(G6547577305291411977.s("Unable to parse HTTP flags version string: `", str, "`"), e);
        }
    }

    public static M9197813449740923653 m(X2572926153895124306 x2572926153895124306, String str, boolean z) {
        U1748733558996603759.b("Cronet ResolvedFlags#resolve");
        try {
            l(str);
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : Collections.unmodifiableMap(x2572926153895124306.e).entrySet()) {
                try {
                    Iterator it = ((M732917612736502422) entry.getValue()).e.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        if (z) {
                            throw null;
                        }
                        throw null;
                    }
                } catch (RuntimeException e) {
                    throw new IllegalArgumentException("Unable to resolve HTTP flag `" + ((String) entry.getKey()) + "`", e);
                }
            }
            M9197813449740923653 m9197813449740923653 = new M9197813449740923653((Object) hashMap, (byte) 1);
            Trace.endSection();
            return m9197813449740923653;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // dev.epro.r0.B15682441012508903446
    public H3726261569308128079 a() {
        P11191550465322624469 b;
        IOException iOException = null;
        while (!((T15985366153370019177) this.b).k.q) {
            try {
                b = ((T15985366153370019177) this.b).b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    O8620973563946607355.m(iOException, e);
                }
                if (e instanceof A9104873785792518488) {
                    throw iOException;
                }
                if (!((T15985366153370019177) this.b).a(null)) {
                    throw iOException;
                }
            }
            if (!b.e()) {
                J14476340649358081657 g = b.g();
                if (g.b == null && g.c == null) {
                    g = b.c();
                }
                P11191550465322624469 p11191550465322624469 = g.b;
                Throwable th = g.c;
                if (th != null) {
                    throw th;
                }
                if (p11191550465322624469 != null) {
                    ((T15985366153370019177) this.b).p.addFirst(p11191550465322624469);
                }
            }
            return b.d();
        }
        Q11088980322693754445.h("Canceled");
        return null;
    }

    @Override // dev.epro.r0.I6255327262428024138
    public Object b(G6332201275426833390 g6332201275426833390) {
        return ((V10450421848591554621) this.b).invoke(g6332201275426833390);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        N282309437460792485 n282309437460792485 = (N282309437460792485) this.b;
        int length = n282309437460792485.d.length;
        for (int i = 1; i < length; i++) {
            int i2 = n282309437460792485.d[i];
            if (i2 == 1) {
                supportSQLiteProgram.bindLong(i, n282309437460792485.e[i]);
            } else if (i2 == 2) {
                supportSQLiteProgram.bindDouble(i, n282309437460792485.f[i]);
            } else if (i2 == 3) {
                String str = n282309437460792485.g[i];
                str.getClass();
                supportSQLiteProgram.bindString(i, str);
            } else if (i2 == 4) {
                byte[] bArr = n282309437460792485.h[i];
                bArr.getClass();
                supportSQLiteProgram.bindBlob(i, bArr);
            } else if (i2 == 5) {
                supportSQLiteProgram.bindNull(i);
            }
        }
    }

    @Override // dev.epro.r0.B15682441012508903446
    public T15985366153370019177 c() {
        return (T15985366153370019177) this.b;
    }

    @Override // dev.epro.r0.E17928301615710791514
    public Iterator d(M9197813449740923653 m9197813449740923653, CharSequence charSequence) {
        return new M10231208252481466989(this, m9197813449740923653, charSequence);
    }

    public FileChannel e() {
        switch (this.a) {
            case 26:
                return new FileInputStream((File) this.b).getChannel();
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.b;
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                S10973172697741180971.j("Not a file: ".concat(String.valueOf(parcelFileDescriptor)));
                return null;
        }
    }

    public void f() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // dev.epro.r0.X6460762560403092052
    public long g(float f) {
        return ((long) (Math.exp(((J12368838350359828847) this.b).b(f) / (K2580088116821959803.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // dev.epro.r0.R5827688671290015495
    public K6937929821947263863 get(int i) {
        switch (this.a) {
            case 28:
                return ((G5006821039521287911[]) this.b)[i];
            default:
                return (G5006821039521287911) this.b;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        return ((N282309437460792485) this.b).b;
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float h() {
        return 0.0f;
    }

    @Override // dev.epro.r0.T3455454122937680569
    public boolean hasConnectionPool() {
        return true;
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float i(float f, float f2) {
        double b = ((J12368838350359828847) this.b).b(f2);
        double d = K2580088116821959803.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * b) * r8.a * r8.b))) + f;
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float j(float f, long j) {
        long j2 = j / 1000000;
        F15722843472204369899 a = ((J12368838350359828847) this.b).a(f);
        long j3 = a.c;
        return (((Math.signum(a.a) * L7481895516004165363.a(j3 > 0 ? j2 / j3 : 1.0f).b) * a.b) / j3) * 1000.0f;
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float k(float f, float f2, long j) {
        long j2 = j / 1000000;
        F15722843472204369899 a = ((J12368838350359828847) this.b).a(f2);
        long j3 = a.c;
        return (Math.signum(a.a) * a.b * L7481895516004165363.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    public Object n(E5386183571211952538 e5386183571211952538, B13729205492206812220 b13729205492206812220) {
        H684658346589034901 h684658346589034901;
        N13814068345032586384 n13814068345032586384;
        int i;
        if (((L6855102173777462404) this.b) == null) {
            L4738636499147270068.b("Called runAndWatch on a manager that has been disposed of");
        }
        L6855102173777462404 l6855102173777462404 = (L6855102173777462404) this.b;
        if ((l6855102173777462404 instanceof H684658346589034901) && (n13814068345032586384 = (h684658346589034901 = (H684658346589034901) l6855102173777462404).f) != null && !n13814068345032586384.equals(e5386183571211952538)) {
            N12138132444961730128 n12138132444961730128 = new N12138132444961730128();
            N13814068345032586384 n138140683450325863842 = h684658346589034901.f;
            if (n138140683450325863842 == null) {
                L4738636499147270068.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            E13273723708836014930 e13273723708836014930 = h684658346589034901.d;
            ArrayList arrayList = n12138132444961730128.c;
            if (e13273723708836014930 == null) {
                Object obj = h684658346589034901.b;
                obj.getClass();
                arrayList.add(new E2417936544745582743(obj, n138140683450325863842));
            } else {
                Object[] objArr = e13273723708836014930.b;
                long[] jArr = e13273723708836014930.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new E2417936544745582743(objArr[(i2 << 3) + i5], n138140683450325863842));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            n12138132444961730128.d();
            h684658346589034901.e();
            this.b = n12138132444961730128;
        }
        L6855102173777462404 l68551021737774624042 = (L6855102173777462404) this.b;
        l68551021737774624042.getClass();
        M4722199849958580248 u = D459204867321966484.h().u(l68551021737774624042.k(e5386183571211952538));
        l68551021737774624042.c(e5386183571211952538);
        try {
            M4722199849958580248 j2 = u.j();
            try {
                Object invoke = b13729205492206812220.invoke();
                u.c();
                l68551021737774624042.d();
                return invoke;
            } finally {
                M4722199849958580248.q(j2);
            }
        } catch (Throwable th) {
            u.c();
            throw th;
        }
    }

    public void o(I11366018238968599357 i11366018238968599357) {
        ((Region) this.b).set(i11366018238968599357.a, i11366018238968599357.b, i11366018238968599357.c, i11366018238968599357.d);
    }

    @Override // dev.epro.r0.T3455454122937680569
    public SQLiteConnection open(String str) {
        str.getClass();
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = (SupportSQLiteOpenHelper) this.b;
        String databaseName = supportSQLiteOpenHelper.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(SQLiteDatabaseConfiguration.MEMORY_DB_PATH)) {
                S10973172697741180971.i(G6547577305291411977.s("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !M8927913404651150384.v0(databaseName, '/', databaseName).equals(M8927913404651150384.v0(str, '/', str))) {
            S10973172697741180971.i(E12098517352909843120.m("This driver is configured to open a database named '", supportSQLiteOpenHelper.getDatabaseName(), "' but '", str, "' was requested."));
            return null;
        }
        return new K9419718790619213063(supportSQLiteOpenHelper.getWritableDatabase());
    }

    public void p() {
        View view;
        View view2 = (View) this.b;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new W13948953340889349604(view, (byte) 26));
    }

    public void q(String str) {
        str.getClass();
        M9197813449740923653[] m9197813449740923653Arr = X9639330962857972635.b;
        int length = m9197813449740923653Arr.length;
        int i = 0;
        while (i < length) {
            M9197813449740923653 m9197813449740923653 = m9197813449740923653Arr[i];
            i++;
            ((ThreadLocal) m9197813449740923653.b).set(str);
        }
    }

    @Override // dev.epro.r0.N9606265891541456973
    public Object v(A7868207189447841291 a7868207189447841291, Float f, Float f2, F4096073349764486348 f4096073349764486348, E14296708806979853694 e14296708806979853694) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object m = U1554499319261669842.m(a7868207189447841291, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, B5998207562248239613.a(0.0f, floatValue2, 28), (M15459437176959963354) this.b, f4096073349764486348, e14296708806979853694);
        return m == Z3437138737604933638.a ? m : (U17540031421654684319) m;
    }

    public /* synthetic */ M9197813449740923653(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public M9197813449740923653(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.b = new Region();
                break;
            case 22:
                this.b = new ThreadLocal();
                break;
            default:
                this.b = new LinkedHashSet();
                break;
        }
    }

    public M9197813449740923653(R8540738700654750557 r8540738700654750557) {
        this.a = (byte) 13;
        float f = O13877966917012660236.a;
        J12368838350359828847 j12368838350359828847 = new J12368838350359828847();
        j12368838350359828847.a = f;
        float c = r8540738700654750557.c();
        float f2 = K2580088116821959803.a;
        j12368838350359828847.b = c * 386.0878f * 160.0f * 0.84f;
        this.b = j12368838350359828847;
    }

    public M9197813449740923653(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        this.a = (byte) 16;
        supportSQLiteOpenHelper.getClass();
        this.b = supportSQLiteOpenHelper;
    }

    public M9197813449740923653(View view) {
        this.a = (byte) 12;
        if (Build.VERSION.SDK_INT >= 30) {
            E15736452233676601638 e15736452233676601638 = new E15736452233676601638(view, (byte) 11);
            e15736452233676601638.c = view;
            this.b = e15736452233676601638;
            return;
        }
        this.b = new M9197813449740923653((Object) view, (byte) 11);
    }

    public /* synthetic */ M9197813449740923653(byte b, boolean z) {
        this.a = b;
    }

    public M9197813449740923653(L5350362960623133222 l5350362960623133222) {
        this.a = (byte) 20;
        this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), l5350362960623133222);
    }

    public M9197813449740923653(float f, float f2, Z13251062865217617579 z13251062865217617579) {
        this.a = (byte) 28;
        int b = z13251062865217617579.b();
        G5006821039521287911[] g5006821039521287911Arr = new G5006821039521287911[b];
        for (int i = 0; i < b; i++) {
            g5006821039521287911Arr[i] = new G5006821039521287911(f, f2, z13251062865217617579.a(i));
        }
        this.b = g5006821039521287911Arr;
    }

    public M9197813449740923653(float f, float f2) {
        this.a = (byte) 29;
        this.b = new G5006821039521287911(f, f2);
    }

    public M9197813449740923653(SideSheetBehavior sideSheetBehavior) {
        this.a = (byte) 8;
        this.b = sideSheetBehavior;
        new W13948953340889349604(this, (byte) 25);
    }
}
