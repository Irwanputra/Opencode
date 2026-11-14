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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class M9197813449740923653 implements I6255327262428024138, F8386944463392899325, B15682441012508903446, X6460762560403092052, E17928301615710791514, T3455454122937680569, SupportSQLiteQuery, N9606265891541456973, R5827688671290015495 {
    public final /* synthetic */ byte a;
    public Object b;

    public M9197813449740923653(long[] jArr) {
        Q5456326841214199073 q5456326841214199073;
        this.a = (byte) 10;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            q5456326841214199073 = new Q5456326841214199073(jArrCopyOf.length);
            int i = q5456326841214199073.b;
            if (i < 0) {
                W4415201450379021245.a("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                q5456326841214199073.b(jArrCopyOf.length + i);
                long[] jArr2 = q5456326841214199073.a;
                int i2 = q5456326841214199073.b;
                if (i != i2) {
                    O5378677881740157249.q0(jArr2, jArr2, jArrCopyOf.length + i, i, i2);
                }
                O5378677881740157249.q0(jArrCopyOf, jArr2, i, 0, jArrCopyOf.length);
                q5456326841214199073.b += jArrCopyOf.length;
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
            int iCountTokens = stringTokenizer.countTokens();
            int[] iArr = new int[iCountTokens];
            for (int i = 0; i < iCountTokens; i++) {
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
            HashMap map = new HashMap();
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
            M9197813449740923653 m9197813449740923653 = new M9197813449740923653((Object) map, (byte) 1);
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
    public H3726261569308128079 a() throws Throwable {
        P11191550465322624469 p11191550465322624469B;
        IOException iOException = null;
        while (!((T15985366153370019177) this.b).k.q) {
            try {
                p11191550465322624469B = ((T15985366153370019177) this.b).b();
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
            if (!p11191550465322624469B.e()) {
                J14476340649358081657 j14476340649358081657G = p11191550465322624469B.g();
                if (j14476340649358081657G.b == null && j14476340649358081657G.c == null) {
                    j14476340649358081657G = p11191550465322624469B.c();
                }
                P11191550465322624469 p11191550465322624469 = j14476340649358081657G.b;
                Throwable th = j14476340649358081657G.c;
                if (th != null) {
                    throw th;
                }
                if (p11191550465322624469 != null) {
                    ((T15985366153370019177) this.b).p.addFirst(p11191550465322624469);
                }
            }
            return p11191550465322624469B.d();
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

    public FileChannel e() throws IOException {
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
        return ((long) (Math.exp(((J12368838350359828847) this.b).b(f) / (((double) K2580088116821959803.a) - 1.0d)) * 1000.0d)) * 1000000;
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
        J12368838350359828847 j12368838350359828847 = (J12368838350359828847) this.b;
        double dB = j12368838350359828847.b(f2);
        double d = K2580088116821959803.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (j12368838350359828847.a * j12368838350359828847.b))))) + f;
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float j(float f, long j) {
        long j2 = j / 1000000;
        F15722843472204369899 f15722843472204369899A = ((J12368838350359828847) this.b).a(f);
        long j3 = f15722843472204369899A.c;
        return (((Math.signum(f15722843472204369899A.a) * L7481895516004165363.a(j3 > 0 ? j2 / j3 : 1.0f).b) * f15722843472204369899A.b) / j3) * 1000.0f;
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float k(float f, float f2, long j) {
        long j2 = j / 1000000;
        F15722843472204369899 f15722843472204369899A = ((J12368838350359828847) this.b).a(f2);
        long j3 = f15722843472204369899A.c;
        return (Math.signum(f15722843472204369899A.a) * f15722843472204369899A.b * L7481895516004165363.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(dev.epro.r0.E5386183571211952538 r21, dev.epro.r0.B13729205492206812220 r22) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M9197813449740923653.n(dev.epro.r0.E5386183571211952538, dev.epro.r0.B13729205492206812220):java.lang.Object");
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
        View viewFindViewById;
        View view = (View) this.b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new W13948953340889349604(viewFindViewById, (byte) 26));
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
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objM = U1554499319261669842.m(a7868207189447841291, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, B5998207562248239613.a(0.0f, fFloatValue2, 28), (M15459437176959963354) this.b, f4096073349764486348, e14296708806979853694);
        return objM == Z3437138737604933638.a ? objM : (U17540031421654684319) objM;
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
        float fC = r8540738700654750557.c();
        float f2 = K2580088116821959803.a;
        j12368838350359828847.b = fC * 386.0878f * 160.0f * 0.84f;
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
        int iB = z13251062865217617579.b();
        G5006821039521287911[] g5006821039521287911Arr = new G5006821039521287911[iB];
        for (int i = 0; i < iB; i++) {
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
