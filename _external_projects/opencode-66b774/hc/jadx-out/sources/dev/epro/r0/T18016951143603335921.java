package dev.epro.r0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.RoundedCorner;
import java.security.KeyPairGenerator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import net.zetetic.database.CursorWindow;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T18016951143603335921 {
    public static final Y4261039727803185691 A;
    public static final Y4261039727803185691 B;
    public static final Y4261039727803185691 C;
    public static final float D;
    public static final float E;
    public static final float F;
    public static final V10933700885381486763 G;
    public static final float H;
    public static final D4961612090878789022 I;
    public static final Y4261039727803185691 J;
    public static final Y4261039727803185691 K;
    public static final Y4261039727803185691 L;
    public static final Y4261039727803185691 M;
    public static final Z14997871575210439922 N;
    public static boolean O = true;
    public static Z7022156542152740569 P;
    public static Z7022156542152740569 Q;
    public static Z7022156542152740569 R;
    public static Z7022156542152740569 S;
    public static final T15443218846549482730 a;
    public static final T15504973625601650233 b;
    public static final Y4261039727803185691 c;
    public static final Y4261039727803185691 d;
    public static final float e;
    public static final Y4261039727803185691 f;
    public static final V10933700885381486763 g;
    public static final float h;
    public static final Y4261039727803185691 i;
    public static final Y4261039727803185691 j;
    public static final Y4261039727803185691 k;
    public static final Y4261039727803185691 l;
    public static final float m;
    public static final D4961612090878789022 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Y4261039727803185691 f501o;
    public static final float p;
    public static final Y4261039727803185691 q;
    public static final float r;
    public static final float s;
    public static final Y4261039727803185691 t;
    public static final Y4261039727803185691 u;
    public static final V10933700885381486763 v;
    public static final float w;
    public static final float x;
    public static final Y4261039727803185691 y;
    public static final float z;

    public static float[] A(float[] fArr, int i2) {
        if (i2 < 0) {
            K2042933864045806308.h();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dev.epro.r0.F2238012860950049442 B(dev.epro.r0.W15170032298606046665 r29, float r30) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T18016951143603335921.B(dev.epro.r0.W15170032298606046665, float):dev.epro.r0.F2238012860950049442");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.D488698419923809398[] C(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T18016951143603335921.C(java.lang.String):dev.epro.r0.D488698419923809398[]");
    }

    public static final native I1722681268793429505 D(I1722681268793429505 i1722681268793429505, boolean z2, B13729205492206812220 b13729205492206812220);

    public static ColorStateList G(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListR;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListR = B5998207562248239613.r(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListR;
    }

    public static final Z7022156542152740569 H() {
        Z7022156542152740569 z7022156542152740569 = P;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(11.0f, 15.0f);
        v14323974914327418545.g(2.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.g(-2.0f);
        v14323974914327418545.s(-2.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(11.0f, 7.0f);
        v14323974914327418545.g(2.0f);
        v14323974914327418545.s(6.0f);
        v14323974914327418545.g(-2.0f);
        v14323974914327418545.h(11.0f, 7.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(11.99f, 2.0f);
        v14323974914327418545.d(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        v14323974914327418545.o(4.47f, 10.0f, 9.99f, 10.0f);
        v14323974914327418545.d(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        v14323974914327418545.n(17.52f, 2.0f, 11.99f, 2.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(12.0f, 20.0f);
        v14323974914327418545.e(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        v14323974914327418545.o(3.58f, -8.0f, 8.0f, -8.0f);
        v14323974914327418545.o(8.0f, 3.58f, 8.0f, 8.0f);
        v14323974914327418545.o(-3.58f, 8.0f, -8.0f, 8.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        P = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static G5920303990939058292 I(B14351301772695273662 b14351301772695273662) {
        X627358512999327803 x627358512999327803 = new X627358512999327803();
        x627358512999327803.c = new W8823188230031025271();
        G5920303990939058292 g5920303990939058292 = new G5920303990939058292(x627358512999327803);
        x627358512999327803.b = g5920303990939058292;
        x627358512999327803.a = b14351301772695273662.getClass();
        try {
            Object objA = b14351301772695273662.a(x627358512999327803);
            if (objA == null) {
                return g5920303990939058292;
            }
            x627358512999327803.a = objA;
            return g5920303990939058292;
        } catch (Exception e2) {
            g5920303990939058292.b.h(e2);
            return g5920303990939058292;
        }
    }

    public static final Z7022156542152740569 J() {
        Z7022156542152740569 z7022156542152740569 = Q;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(11.0f, 7.0f);
        v14323974914327418545.g(2.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.g(-2.0f);
        v14323974914327418545.c();
        G11450220448113054352.u(v14323974914327418545, 11.0f, 11.0f, 2.0f, 6.0f);
        v14323974914327418545.g(-2.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(12.0f, 2.0f);
        v14323974914327418545.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        v14323974914327418545.o(4.48f, 10.0f, 10.0f, 10.0f);
        v14323974914327418545.o(10.0f, -4.48f, 10.0f, -10.0f);
        v14323974914327418545.n(17.52f, 2.0f, 12.0f, 2.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(12.0f, 20.0f);
        v14323974914327418545.e(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        v14323974914327418545.o(3.59f, -8.0f, 8.0f, -8.0f);
        v14323974914327418545.o(8.0f, 3.59f, 8.0f, 8.0f);
        v14323974914327418545.o(-3.59f, 8.0f, -8.0f, 8.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        Q = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final Z7022156542152740569 K() {
        Z7022156542152740569 z7022156542152740569 = R;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("AutoMirrored.Outlined.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new K11581048818582425500(8.59f, 16.59f));
        arrayList.add(new N18337357316239809325(13.17f, 12.0f));
        arrayList.add(new N18337357316239809325(8.59f, 7.41f));
        arrayList.add(new N18337357316239809325(10.0f, 6.0f));
        arrayList.add(new T8070361472955532362(6.0f, 6.0f));
        arrayList.add(new T8070361472955532362(-6.0f, 6.0f));
        arrayList.add(new T8070361472955532362(-1.41f, -1.41f));
        arrayList.add(G18244342923164738699.c);
        Q17593287602150918564.a(q17593287602150918564, arrayList, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        R = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final Z7022156542152740569 L() {
        Z7022156542152740569 z7022156542152740569 = S;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Link", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(17.0f, 7.0f);
        v14323974914327418545.g(-4.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.g(4.0f);
        v14323974914327418545.e(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        v14323974914327418545.o(-1.35f, 3.0f, -3.0f, 3.0f);
        v14323974914327418545.g(-4.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.g(4.0f);
        v14323974914327418545.e(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        v14323974914327418545.o(-2.24f, -5.0f, -5.0f, -5.0f);
        G11450220448113054352.w(v14323974914327418545, 11.0f, 15.0f, 7.0f, 15.0f);
        v14323974914327418545.e(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        v14323974914327418545.o(1.35f, -3.0f, 3.0f, -3.0f);
        v14323974914327418545.g(4.0f);
        v14323974914327418545.h(11.0f, 7.0f);
        v14323974914327418545.h(7.0f, 7.0f);
        v14323974914327418545.e(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        v14323974914327418545.o(2.24f, 5.0f, 5.0f, 5.0f);
        v14323974914327418545.g(4.0f);
        v14323974914327418545.s(-2.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(8.0f, 11.0f);
        v14323974914327418545.g(8.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.h(8.0f, 13.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        S = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static Intent M(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strO = O(context, componentName);
        if (strO == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strO);
        return O(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static Intent N(R13227154569034155950 r13227154569034155950) {
        Intent parentActivityIntent = r13227154569034155950.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strO = O(r13227154569034155950, r13227154569034155950.getComponentName());
            if (strO == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(r13227154569034155950, strO);
            try {
                return O(r13227154569034155950, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String O(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final int P(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                S10973172697741180971.j("Step is zero.");
                return 0;
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    public static Y11834541914804214684 Q(Display display, int i2) {
        RoundedCorner roundedCorner;
        int i3;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i2)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i3 = 1;
            if (position != 1) {
                i3 = 2;
                if (position != 2) {
                    i3 = 3;
                    if (position != 3) {
                        S10973172697741180971.j(G6547577305291411977.n(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        return new Y11834541914804214684(i3, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static final void R(G8001132634698687269 g8001132634698687269, Throwable th) {
        Throwable runtimeException;
        Iterator it = L13362730531574763589.a.iterator();
        while (it.hasNext()) {
            try {
                ((G15142808377942141248) it.next()).handleException(g8001132634698687269, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    O8620973563946607355.m(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            O8620973563946607355.m(th, new I14268150715103701672(g8001132634698687269));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final native boolean S(String str);

    public static final native boolean T(String str);

    public static final native F4096073349764486348 W(Context context, W5797197595347441198 w5797197595347441198, N1174624271152536908 n1174624271152536908, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839);

    public static final native F4096073349764486348 X(B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static int Y(double d2) {
        if (Double.isNaN(d2)) {
            S10973172697741180971.j("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int Z(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        S10973172697741180971.j("Cannot round NaN value.");
        return 0;
    }

    public static final void a(W3656598099029166611 w3656598099029166611, I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348, G15527156457921655762 g15527156457921655762, F4096073349764486348 f40960733497644863482, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(511725103);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(w3656598099029166611) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.f(i1722681268793429505) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(f4096073349764486348) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.f(g15527156457921655762) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m3727281027331139839.h(f40960733497644863482) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 131072 : 65536;
        }
        if (m3727281027331139839.R(i3 & 1, (74899 & i3) != 74898)) {
            Object objM = m3727281027331139839.M();
            if (objM == O9023047933786425027.a) {
                objM = J6249063375258466235.k;
                m3727281027331139839.k0(objM);
            }
            c(w3656598099029166611, i1722681268793429505, f4096073349764486348, g15527156457921655762, f40960733497644863482, (F4096073349764486348) objM, t15443218846549482730, m3727281027331139839, 196608 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016));
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new M11684960389562544645(w3656598099029166611, i1722681268793429505, f4096073349764486348, g15527156457921655762, f40960733497644863482, t15443218846549482730, i2);
        }
    }

    public static long a0(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        S10973172697741180971.j("Cannot round NaN value.");
        return 0L;
    }

    public static final void b(Object obj, I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348, G15527156457921655762 g15527156457921655762, String str, F4096073349764486348 f40960733497644863482, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2, int i3) {
        int i4;
        I1722681268793429505 i17226812687934295052;
        G15527156457921655762 g155271564579216557622;
        F4096073349764486348 f40960733497644863483;
        m3727281027331139839.b0(1501828832);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? m3727281027331139839.f(obj) : m3727281027331139839.h(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= m3727281027331139839.f(i1722681268793429505) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= m3727281027331139839.h(f4096073349764486348) ? 256 : 128;
        }
        int i6 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            i6 |= m3727281027331139839.f(str) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        int i7 = i6 | 196608;
        if ((1572864 & i2) == 0) {
            i7 |= m3727281027331139839.h(t15443218846549482730) ? 1048576 : 524288;
        }
        if (m3727281027331139839.R(i7 & 1, (599187 & i7) != 599186)) {
            if (i5 != 0) {
                i1722681268793429505 = V10993962107938880611.a;
            }
            L739450498903353996 l739450498903353996 = T13350664027331345869.b;
            Object objM = m3727281027331139839.M();
            if (objM == O9023047933786425027.a) {
                objM = J6249063375258466235.j;
                m3727281027331139839.k0(objM);
            }
            F4096073349764486348 f40960733497644863484 = (F4096073349764486348) objM;
            W3656598099029166611 w3656598099029166611M = V933048422416352811.M(obj, str, m3727281027331139839, (i7 & 14) | ((i7 >> 9) & 112), 0);
            int i8 = i7 & 8176;
            int i9 = i7 >> 3;
            I1722681268793429505 i17226812687934295053 = i1722681268793429505;
            a(w3656598099029166611M, i17226812687934295053, f4096073349764486348, l739450498903353996, f40960733497644863484, t15443218846549482730, m3727281027331139839, i8 | (57344 & i9) | (i9 & 458752));
            i17226812687934295052 = i17226812687934295053;
            g155271564579216557622 = l739450498903353996;
            f40960733497644863483 = f40960733497644863484;
        } else {
            m3727281027331139839.U();
            i17226812687934295052 = i1722681268793429505;
            g155271564579216557622 = g15527156457921655762;
            f40960733497644863483 = f40960733497644863482;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new M6239439583175380381(obj, i17226812687934295052, f4096073349764486348, g155271564579216557622, str, f40960733497644863483, t15443218846549482730, i2, i3);
        }
    }

    public static final P14536951722050632485 b0(Z5580852631924387145 z5580852631924387145, J2232875916072654838 j2232875916072654838) {
        return new P14536951722050632485(z5580852631924387145, j2232875916072654838, 0.0f, q(3));
    }

    public static final void c(W3656598099029166611 w3656598099029166611, I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348, G15527156457921655762 g15527156457921655762, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        F4096073349764486348 f40960733497644863484;
        M3727281027331139839 m37272810273311398392;
        V697849047308847220 v697849047308847220;
        O11687042873311337343 o11687042873311337343;
        Object obj;
        A4559761392562572984 a4559761392562572984;
        O11687042873311337343 o116870428733113373432;
        O7205211285568135375 o7205211285568135375;
        R5670552972627103399 r5670552972627103399;
        R5670552972627103399 r56705529726271033992;
        O11687042873311337343 o11687042873311337343L;
        M3727281027331139839 m37272810273311398393;
        boolean z2;
        int i3;
        int i4;
        m3727281027331139839.b0(1935038908);
        int i5 = (i2 & 6) == 0 ? (m3727281027331139839.f(w3656598099029166611) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= m3727281027331139839.f(i1722681268793429505) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= m3727281027331139839.h(f4096073349764486348) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= m3727281027331139839.f(g15527156457921655762) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= m3727281027331139839.h(f40960733497644863482) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= m3727281027331139839.h(f40960733497644863483) ? 131072 : 65536;
        }
        T15443218846549482730 t154432188465494827302 = t15443218846549482730;
        if ((1572864 & i2) == 0) {
            i5 |= m3727281027331139839.h(t154432188465494827302) ? 1048576 : 524288;
        }
        if (m3727281027331139839.R(i5 & 1, (599187 & i5) != 599186)) {
            int i6 = i5 & 14;
            boolean z3 = i6 == 4;
            Object objM = m3727281027331139839.M();
            E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
            if (z3 || objM == e17149812035295265804) {
                objM = new O7205211285568135375(w3656598099029166611, g15527156457921655762);
                m3727281027331139839.k0(objM);
            }
            O7205211285568135375 o72052112855681353752 = (O7205211285568135375) objM;
            boolean z4 = i6 == 4;
            Object objM2 = m3727281027331139839.M();
            Object obj2 = objM2;
            if (z4 || objM2 == e17149812035295265804) {
                Object[] objArr = {w3656598099029166611.a.g()};
                R5670552972627103399 r56705529726271033993 = new R5670552972627103399();
                r56705529726271033993.addAll(O5378677881740157249.U0(objArr));
                m3727281027331139839.k0(r56705529726271033993);
                obj2 = r56705529726271033993;
            }
            R5670552972627103399 r56705529726271033994 = (R5670552972627103399) obj2;
            V697849047308847220 v6978490473088472202 = w3656598099029166611.e;
            V697849047308847220 v6978490473088472203 = w3656598099029166611.d;
            int i7 = i5;
            L6855102173777462404 l6855102173777462404 = w3656598099029166611.a;
            boolean zF = m3727281027331139839.f(v6978490473088472202.getValue()) | (i6 == 4);
            Object objM3 = m3727281027331139839.M();
            if (zF || objM3 == e17149812035295265804) {
                long[] jArr = X4026756943680612204.a;
                objM3 = new A4559761392562572984();
                m3727281027331139839.k0(objM3);
            }
            A4559761392562572984 a45597613925625729842 = (A4559761392562572984) objM3;
            if (!r56705529726271033994.contains(l6855102173777462404.g())) {
                r56705529726271033994.clear();
                r56705529726271033994.add(l6855102173777462404.g());
            }
            if (S10823041268949770285.t(l6855102173777462404.g(), v6978490473088472203.getValue()) && v6978490473088472202.getValue() == null) {
                if (r56705529726271033994.size() != 1 || !S10823041268949770285.t(r56705529726271033994.get(0), l6855102173777462404.g())) {
                    r56705529726271033994.clear();
                    r56705529726271033994.add(l6855102173777462404.g());
                }
                if (a45597613925625729842.e != 1 || a45597613925625729842.c(l6855102173777462404.g())) {
                    a45597613925625729842.a();
                }
                o72052112855681353752.b = g15527156457921655762;
            }
            Object value = v6978490473088472202.getValue();
            if (value == null || value.equals(l6855102173777462404.g())) {
                v697849047308847220 = v6978490473088472203;
            } else {
                ListIterator listIterator = r56705529726271033994.listIterator();
                int i8 = 0;
                while (true) {
                    E12552353581788229419 e12552353581788229419 = (E12552353581788229419) listIterator;
                    if (!e12552353581788229419.hasNext()) {
                        v697849047308847220 = v6978490473088472203;
                        i4 = -1;
                        break;
                    }
                    v697849047308847220 = v6978490473088472203;
                    if (S10823041268949770285.t(f40960733497644863482.invoke(e12552353581788229419.next()), f40960733497644863482.invoke(value))) {
                        i4 = i8;
                        break;
                    } else {
                        i8++;
                        v6978490473088472203 = v697849047308847220;
                    }
                }
                if (i4 == -1) {
                    r56705529726271033994.add(value);
                } else if (!S10823041268949770285.t(r56705529726271033994.get(i4), value)) {
                    r56705529726271033994.set(i4, value);
                }
            }
            if (!S10823041268949770285.t(l6855102173777462404.g(), v697849047308847220.getValue())) {
                ListIterator listIterator2 = r56705529726271033994.listIterator();
                int i9 = 0;
                while (true) {
                    E12552353581788229419 e125523535817882294192 = (E12552353581788229419) listIterator2;
                    if (!e125523535817882294192.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (S10823041268949770285.t(f40960733497644863482.invoke(e125523535817882294192.next()), f40960733497644863482.invoke(v697849047308847220.getValue()))) {
                            i3 = i9;
                            break;
                        }
                        i9++;
                    }
                }
                if (i3 == -1) {
                    r56705529726271033994.add(v697849047308847220.getValue());
                } else if (!S10823041268949770285.t(r56705529726271033994.get(i3), v697849047308847220.getValue()) || i3 != r56705529726271033994.size() - 1) {
                    S10823041268949770285.t(v697849047308847220.getValue(), r56705529726271033994.get(i3));
                    r56705529726271033994.remove(i3);
                    r56705529726271033994.add(v697849047308847220.getValue());
                }
            }
            Object value2 = v6978490473088472202.getValue();
            boolean zF2 = m3727281027331139839.f(value2);
            Object objM4 = m3727281027331139839.M();
            if (zF2 || objM4 == e17149812035295265804) {
                objM4 = value2 != null ? new W15390420638325660489(o72052112855681353752, v697849047308847220.getValue(), value2) : null;
                m3727281027331139839.k0(objM4);
            }
            W15390420638325660489 w15390420638325660489 = (W15390420638325660489) objM4;
            boolean zF3 = m3727281027331139839.f(w15390420638325660489) | ((i7 & 458752) == 131072);
            Object objM5 = m3727281027331139839.M();
            if (!zF3 && objM5 != e17149812035295265804) {
                obj = objM5;
                o11687042873311337343 = null;
            } else if (w15390420638325660489 != null && f40960733497644863483.invoke(w15390420638325660489) != null) {
                Z3383101362411723454.s();
                return;
            } else {
                o11687042873311337343 = null;
                m3727281027331139839.k0(null);
                obj = null;
            }
            if (obj != null) {
                Z3383101362411723454.s();
                return;
            }
            if (a45597613925625729842.b(v697849047308847220.getValue()) && a45597613925625729842.b(l6855102173777462404.g()) && (value2 == null || a45597613925625729842.b(value2))) {
                m3727281027331139839.a0(-297322234);
                m3727281027331139839.q(false);
                a4559761392562572984 = a45597613925625729842;
                o116870428733113373432 = o11687042873311337343;
                o7205211285568135375 = o72052112855681353752;
                r5670552972627103399 = r56705529726271033994;
                f40960733497644863484 = f4096073349764486348;
            } else {
                m3727281027331139839.a0(-302069574);
                a45597613925625729842.a();
                int size = r56705529726271033994.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = size;
                    Object obj3 = r56705529726271033994.get(i10);
                    A4559761392562572984 a45597613925625729843 = a45597613925625729842;
                    a45597613925625729843.n(obj3, S10823041268949770285.T(427839334, new Q3264573919445247267(obj3, w3656598099029166611, w15390420638325660489, f4096073349764486348, o72052112855681353752, r56705529726271033994, t154432188465494827302), m3727281027331139839));
                    i10++;
                    r56705529726271033994 = r56705529726271033994;
                    a45597613925625729842 = a45597613925625729843;
                    size = i11;
                    o11687042873311337343 = o11687042873311337343;
                    t154432188465494827302 = t15443218846549482730;
                }
                a4559761392562572984 = a45597613925625729842;
                o116870428733113373432 = o11687042873311337343;
                o7205211285568135375 = o72052112855681353752;
                r5670552972627103399 = r56705529726271033994;
                f40960733497644863484 = f4096073349764486348;
                m3727281027331139839.q(false);
            }
            boolean zF4 = m3727281027331139839.f(w3656598099029166611.f()) | m3727281027331139839.f(o7205211285568135375) | m3727281027331139839.f(v6978490473088472202.getValue());
            Object objM6 = m3727281027331139839.M();
            if (zF4 || objM6 == e17149812035295265804) {
                objM6 = (P14536951722050632485) f40960733497644863484.invoke(o7205211285568135375);
                m3727281027331139839.k0(objM6);
            }
            P14536951722050632485 p14536951722050632485 = (P14536951722050632485) objM6;
            W3656598099029166611 w36565980990291666112 = o7205211285568135375.a;
            boolean zF5 = m3727281027331139839.f(o7205211285568135375);
            Object objM7 = m3727281027331139839.M();
            if (zF5 || objM7 == e17149812035295265804) {
                objM7 = V4416135141588678913.t(Boolean.FALSE);
                m3727281027331139839.k0(objM7);
            }
            W1972671267364756056 w1972671267364756056 = (W1972671267364756056) objM7;
            W1972671267364756056 w1972671267364756056V = V4416135141588678913.v(p14536951722050632485.d, m3727281027331139839);
            if (S10823041268949770285.t(w36565980990291666112.a.g(), w36565980990291666112.d.getValue())) {
                w1972671267364756056.setValue(Boolean.FALSE);
            } else if (w1972671267364756056V.getValue() != null) {
                w1972671267364756056.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) w1972671267364756056.getValue()).booleanValue();
            I1722681268793429505 i1722681268793429505Q = V10993962107938880611.a;
            if (zBooleanValue) {
                m3727281027331139839.a0(1353077497);
                r56705529726271033992 = r5670552972627103399;
                M3727281027331139839 m37272810273311398394 = m3727281027331139839;
                o11687042873311337343L = V933048422416352811.l(o7205211285568135375.a, D15913187640519482289.f199o, null, m37272810273311398394, 0, 2);
                boolean zF6 = m37272810273311398394.f(o11687042873311337343L);
                Object objM8 = m37272810273311398394.M();
                if (zF6 || objM8 == e17149812035295265804) {
                    O5713505082642007229 o5713505082642007229 = (O5713505082642007229) w1972671267364756056V.getValue();
                    if (o5713505082642007229 == null || o5713505082642007229.a) {
                        i1722681268793429505Q = R7033599853981556291.q(i1722681268793429505Q);
                    }
                    I1722681268793429505 i17226812687934295052 = i1722681268793429505Q;
                    m37272810273311398394.k0(i17226812687934295052);
                    objM8 = i17226812687934295052;
                }
                i1722681268793429505Q = (I1722681268793429505) objM8;
                m37272810273311398394.q(false);
                m37272810273311398393 = m37272810273311398394;
            } else {
                M3727281027331139839 m37272810273311398395 = m3727281027331139839;
                r56705529726271033992 = r5670552972627103399;
                m37272810273311398395.a0(1353343539);
                m37272810273311398395.q(false);
                o11687042873311337343L = o116870428733113373432;
                m37272810273311398393 = m37272810273311398395;
            }
            I1722681268793429505 i1722681268793429505Q0 = i1722681268793429505.Q0(i1722681268793429505Q.Q0(new B11321578473434509236(o11687042873311337343L, w1972671267364756056V, o7205211285568135375)));
            Object objM9 = m37272810273311398393.M();
            if (objM9 == e17149812035295265804) {
                objM9 = new D2464995779987079409(o7205211285568135375);
                m37272810273311398393.k0(objM9);
            }
            D2464995779987079409 d2464995779987079409 = (D2464995779987079409) objM9;
            int iHashCode = Long.hashCode(m37272810273311398393.T);
            P3648740535677465818 p3648740535677465818L = m37272810273311398393.l();
            I1722681268793429505 i1722681268793429505N = V12319504402545346730.N(m37272810273311398393, i1722681268793429505Q0);
            X4572652335386916693.Po.getClass();
            m37272810273311398393.d0();
            if (m37272810273311398393.S) {
                m37272810273311398393.k(H11725168162114556860.S);
            } else {
                m37272810273311398393.n0();
            }
            W7808703833045379622.J(P2382941533350862833.i, m37272810273311398393, d2464995779987079409);
            W7808703833045379622.J(P2382941533350862833.h, m37272810273311398393, p3648740535677465818L);
            W7808703833045379622.z(m37272810273311398393, Integer.valueOf(iHashCode));
            W7808703833045379622.H(m37272810273311398393);
            W7808703833045379622.J(P2382941533350862833.g, m37272810273311398393, i1722681268793429505N);
            m37272810273311398393.a0(758586195);
            int size2 = r56705529726271033992.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Object obj4 = r56705529726271033992.get(i12);
                m37272810273311398393.Y(1420119555, f40960733497644863482.invoke(obj4));
                L12639328004344855510 l12639328004344855510 = (L12639328004344855510) a4559761392562572984.g(obj4);
                if (l12639328004344855510 == null) {
                    m37272810273311398393.a0(1074069702);
                    z2 = false;
                } else {
                    z2 = false;
                    m37272810273311398393.a0(1420120731);
                    l12639328004344855510.invoke(m37272810273311398393, 0);
                }
                m37272810273311398393.q(z2);
                m37272810273311398393.q(z2);
            }
            m37272810273311398393.q(false);
            m37272810273311398393.q(true);
            m37272810273311398392 = m37272810273311398393;
        } else {
            f40960733497644863484 = f4096073349764486348;
            M3727281027331139839 m37272810273311398396 = m3727281027331139839;
            m37272810273311398396.U();
            m37272810273311398392 = m37272810273311398396;
        }
        V4878375136513573151 v4878375136513573151T = m37272810273311398392.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new V1790540245585534785(w3656598099029166611, i1722681268793429505, f40960733497644863484, g15527156457921655762, f40960733497644863482, f40960733497644863483, t15443218846549482730, i2);
        }
    }

    public static final void d(I1722681268793429505 i1722681268793429505, B13906740428466697912 b13906740428466697912, A6527624962738679687 a6527624962738679687, O15869581661108952313 o15869581661108952313, int i2, int i3, J12078565427869724451 j12078565427869724451, M3727281027331139839 m3727281027331139839, int i4, int i5) {
        int i6;
        I1722681268793429505 i17226812687934295052;
        A6527624962738679687 a65276249627386796872;
        O15869581661108952313 o158695816611089523132;
        int i7;
        int i8;
        m3727281027331139839.b0(-1303174015);
        int i9 = i5 & 1;
        if (i9 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i10 = i5 & 4;
        if (i10 != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= m3727281027331139839.f(a6527624962738679687) ? 256 : 128;
        }
        int i11 = i5 & 8;
        if (i11 != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i6 |= m3727281027331139839.f(o15869581661108952313) ? 2048 : 1024;
        }
        int i12 = i6 | 221184;
        if (m3727281027331139839.R(i12 & 1, (599187 & i12) != 599186)) {
            if (i9 != 0) {
                i1722681268793429505 = V10993962107938880611.a;
            }
            I1722681268793429505 i17226812687934295053 = i1722681268793429505;
            if (i10 != 0) {
                a6527624962738679687 = V1475975160983963926.c;
            }
            A6527624962738679687 a65276249627386796873 = a6527624962738679687;
            if (i11 != 0) {
                o15869581661108952313 = T13350664027331345869.k;
            }
            O15869581661108952313 o158695816611089523133 = o15869581661108952313;
            e(i17226812687934295053, b13906740428466697912, a65276249627386796873, o158695816611089523133, T13350664027331345869.x, j12078565427869724451, m3727281027331139839, (i12 & 14) | 1572912 | (i12 & 896) | (i12 & 7168) | 12804096);
            i7 = Integer.MAX_VALUE;
            i8 = Integer.MAX_VALUE;
            i17226812687934295052 = i17226812687934295053;
            o158695816611089523132 = o158695816611089523133;
            a65276249627386796872 = a65276249627386796873;
        } else {
            m3727281027331139839.U();
            i17226812687934295052 = i1722681268793429505;
            a65276249627386796872 = a6527624962738679687;
            o158695816611089523132 = o15869581661108952313;
            i7 = i2;
            i8 = i3;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new B13933422937627685314(i17226812687934295052, b13906740428466697912, a65276249627386796872, o158695816611089523132, i7, i8, j12078565427869724451, i4, i5);
        }
    }

    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r7v25 */
    public static final void e(I1722681268793429505 i1722681268793429505, B13906740428466697912 b13906740428466697912, A6527624962738679687 a6527624962738679687, O15869581661108952313 o15869581661108952313, T13350664027331345869 t13350664027331345869, J12078565427869724451 j12078565427869724451, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        Object obj;
        ?? r7;
        Object obj2;
        m3727281027331139839.b0(-1956591841);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.f(b13906740428466697912) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.f(a6527624962738679687) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.f(o15869581661108952313) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m3727281027331139839.d(Integer.MAX_VALUE) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= m3727281027331139839.d(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            obj = t13350664027331345869;
            i3 |= m3727281027331139839.f(obj) ? 1048576 : 524288;
        } else {
            obj = t13350664027331345869;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= m3727281027331139839.h(j12078565427869724451) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (m3727281027331139839.R(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 & 3670016;
            boolean z2 = i5 == 1048576;
            Object objM = m3727281027331139839.M();
            Object obj3 = O9023047933786425027.a;
            if (z2 || objM == obj3) {
                obj.getClass();
                objM = new R16085073546103879032();
                m3727281027331139839.k0(objM);
            }
            R16085073546103879032 r16085073546103879032 = (R16085073546103879032) objM;
            int i6 = i4 >> 3;
            boolean zF = ((((57344 & i6) ^ 24576) > 16384 && m3727281027331139839.d(Integer.MAX_VALUE)) || (i6 & 24576) == 16384) | ((((i6 & 14) ^ 6) > 4 && m3727281027331139839.f(b13906740428466697912)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && m3727281027331139839.f(a6527624962738679687)) || (i6 & 48) == 32) | ((((i6 & 896) ^ 384) > 256 && m3727281027331139839.f(o15869581661108952313)) || (i6 & 384) == 256) | ((((i6 & 7168) ^ 3072) > 2048 && m3727281027331139839.d(Integer.MAX_VALUE)) || (i6 & 3072) == 2048) | m3727281027331139839.f(r16085073546103879032);
            Object objM2 = m3727281027331139839.M();
            if (zF || objM2 == obj3) {
                Object u14510755524476563575 = new U14510755524476563575(b13906740428466697912, a6527624962738679687, b13906740428466697912.a(), new J12579087053762208099(o15869581661108952313), a6527624962738679687.a(), r16085073546103879032);
                m3727281027331139839.k0(u14510755524476563575);
                objM2 = u14510755524476563575;
            }
            U14510755524476563575 u145107555244765635752 = (U14510755524476563575) objM2;
            boolean z3 = (i5 == 1048576) | ((i4 & 29360128) == 8388608) | ((i4 & 458752) == 131072);
            Object objM3 = m3727281027331139839.M();
            if (z3 || objM3 == obj3) {
                ArrayList arrayList = new ArrayList();
                r7 = 1;
                arrayList.add(new T15443218846549482730(-1192950673, true, new I6343259500368743429(j12078565427869724451)));
                t13350664027331345869.getClass();
                m3727281027331139839.k0(arrayList);
                obj2 = arrayList;
            } else {
                r7 = 1;
                obj2 = objM3;
            }
            T15443218846549482730 t15443218846549482730 = new T15443218846549482730(1271844412, r7, new Q5257107720850990263((List) obj2, r7));
            boolean zF2 = m3727281027331139839.f(u145107555244765635752);
            Object objM4 = m3727281027331139839.M();
            if (zF2 || objM4 == obj3) {
                objM4 = new R2492025055202319332(u145107555244765635752);
                m3727281027331139839.k0(objM4);
            }
            A10838822263452390785 a10838822263452390785 = (A10838822263452390785) objM4;
            int iHashCode = Long.hashCode(m3727281027331139839.T);
            P3648740535677465818 p3648740535677465818L = m3727281027331139839.l();
            I1722681268793429505 i1722681268793429505N = V12319504402545346730.N(m3727281027331139839, i1722681268793429505);
            X4572652335386916693.Po.getClass();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            W7808703833045379622.J(P2382941533350862833.i, m3727281027331139839, a10838822263452390785);
            W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
            W7808703833045379622.J(P2382941533350862833.j, m3727281027331139839, Integer.valueOf(iHashCode));
            W7808703833045379622.H(m3727281027331139839);
            W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
            G11450220448113054352.m(0, t15443218846549482730, m3727281027331139839, true);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new M11252898851175153091(i1722681268793429505, b13906740428466697912, a6527624962738679687, o15869581661108952313, t13350664027331345869, j12078565427869724451, i2, (byte) 2);
        }
    }

    public static final void f(A7033694156606186337 a7033694156606186337, G15527156457921655762 g15527156457921655762, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? m3727281027331139839.f(a7033694156606186337) : m3727281027331139839.h(a7033694156606186337) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.f(g15527156457921655762) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 256 : 128;
        }
        boolean z2 = true;
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !m3727281027331139839.f(a7033694156606186337))) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objM = m3727281027331139839.M();
            if (z4 || objM == O9023047933786425027.a) {
                objM = new I7933223284394816614(g15527156457921655762, a7033694156606186337);
                m3727281027331139839.k0(objM);
            }
            W10645948712581465792.a((I7933223284394816614) objM, null, new R6081921892807856809(false, Y17711880887972520074.a, false, 0), t15443218846549482730, m3727281027331139839, ((i3 << 3) & 7168) | 384, 2);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new N18429394832860979851(a7033694156606186337, g15527156457921655762, t15443218846549482730, i2, (byte) 1);
        }
    }

    public static final native void g(float f2, boolean z2, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void h(String str, String str2, boolean z2, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void i(Set set, List list, F4096073349764486348 f4096073349764486348, float f2, boolean z2, B13729205492206812220 b13729205492206812220, Integer num, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void j(Q3156151770218362234 q3156151770218362234, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final dev.epro.r0.A7033694156606186337 r19, final boolean r20, final dev.epro.r0.O16392062884302746898 r21, final boolean r22, long r23, final float r25, final dev.epro.r0.I1722681268793429505 r26, dev.epro.r0.M3727281027331139839 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T18016951143603335921.k(dev.epro.r0.A7033694156606186337, boolean, dev.epro.r0.O16392062884302746898, boolean, long, float, dev.epro.r0.I1722681268793429505, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final void l(int i2, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505, boolean z2) {
        int i3;
        m3727281027331139839.b0(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (m3727281027331139839.h(b13729205492206812220) ? 32 : 16) | (m3727281027331139839.g(z2) ? 256 : 128);
        if (m3727281027331139839.R(i4 & 1, (i4 & 147) != 146)) {
            P14992748401341948828 p14992748401341948828 = S11671697357523908420.a;
            M17147082063200071302.c(m3727281027331139839, V12319504402545346730.w(V16747615581620678882.l(i1722681268793429505, 25.0f, 25.0f), new H12233338319919107374(b13729205492206812220, z2, (byte) 0)));
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new K16152036124330436916(i1722681268793429505, b13729205492206812220, z2, i2);
        }
    }

    public static final native void m(int i2, int i3, boolean z2, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i4);

    public static final native void n(K1152907396623558498 k1152907396623558498, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, F4096073349764486348 f40960733497644863485, F4096073349764486348 f40960733497644863486, L12639328004344855510 l12639328004344855510, F4096073349764486348 f40960733497644863487, F4096073349764486348 f40960733497644863488, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void o(J8992107831457905250 j8992107831457905250, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void p(K1152907396623558498 k1152907396623558498, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static O5713505082642007229 q(int i2) {
        return new O5713505082642007229((i2 & 1) != 0, N6628307372799615376.j);
    }

    public static final native void r(A12041196496600152831 a12041196496600152831, boolean z2, H10681976249452161517 h10681976249452161517, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void s(String str, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void t(String str, boolean z2, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void u(int i2, String str, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i3, int i4);

    public static final void y(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    G6547577305291411977.z(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    O8620973563946607355.m(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    K2042933864045806308.h();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z2 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        executorService.shutdownNow();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final native KeyPairGenerator z(B13442171441690898973 b13442171441690898973, byte[] bArr);

    public G5604827203694114189 E(R4225980552687347745 r4225980552687347745) {
        G5604827203694114189 g5604827203694114189;
        G5604827203694114189 g56048272036941141892 = G5604827203694114189.d;
        synchronized (r4225980552687347745) {
            try {
                g5604827203694114189 = r4225980552687347745.b;
                if (g5604827203694114189 != g56048272036941141892) {
                    r4225980552687347745.b = g56048272036941141892;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g5604827203694114189;
    }

    public R14797178970429462271 F(R4225980552687347745 r4225980552687347745) {
        R14797178970429462271 r14797178970429462271;
        R14797178970429462271 r147971789704294622712 = R14797178970429462271.c;
        synchronized (r4225980552687347745) {
            try {
                r14797178970429462271 = r4225980552687347745.c;
                if (r14797178970429462271 != r147971789704294622712) {
                    r4225980552687347745.c = r147971789704294622712;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r14797178970429462271;
    }

    public void U(R14797178970429462271 r14797178970429462271, R14797178970429462271 r147971789704294622712) {
        r14797178970429462271.b = r147971789704294622712;
    }

    public void V(R14797178970429462271 r14797178970429462271, Thread thread) {
        r14797178970429462271.a = thread;
    }

    public boolean v(R4225980552687347745 r4225980552687347745, G5604827203694114189 g5604827203694114189, G5604827203694114189 g56048272036941141892) {
        synchronized (r4225980552687347745) {
            try {
                if (r4225980552687347745.b != g5604827203694114189) {
                    return false;
                }
                r4225980552687347745.b = g56048272036941141892;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean w(R4225980552687347745 r4225980552687347745, Object obj, Object obj2) {
        synchronized (r4225980552687347745) {
            try {
                if (r4225980552687347745.a != obj) {
                    return false;
                }
                r4225980552687347745.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean x(R4225980552687347745 r4225980552687347745, R14797178970429462271 r14797178970429462271, R14797178970429462271 r147971789704294622712) {
        synchronized (r4225980552687347745) {
            try {
                if (r4225980552687347745.c != r14797178970429462271) {
                    return false;
                }
                r4225980552687347745.c = r147971789704294622712;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static {
        izmyclvb.qgayjvbiagej2(526);
        a = new T15443218846549482730(127448943, false, new G15535714851655169452((byte) 0));
        b = new T15504973625601650233((byte) 14);
        Y4261039727803185691 y4261039727803185691 = Y4261039727803185691.g;
        c = y4261039727803185691;
        d = Y4261039727803185691.q;
        e = 56.0f;
        f = y4261039727803185691;
        g = V10933700885381486763.g;
        h = 360.0f;
        Y4261039727803185691 y42610397278031856912 = Y4261039727803185691.i;
        i = y42610397278031856912;
        j = y42610397278031856912;
        k = Y4261039727803185691.v;
        Y4261039727803185691 y42610397278031856913 = Y4261039727803185691.u;
        l = y42610397278031856913;
        m = 256.0f;
        n = D4961612090878789022.a;
        f501o = Y4261039727803185691.e;
        p = 8.0f;
        q = Y4261039727803185691.m;
        r = 48.0f;
        s = 2.0f;
        Y4261039727803185691 y42610397278031856914 = Y4261039727803185691.h;
        t = y42610397278031856914;
        u = Y4261039727803185691.t;
        V10933700885381486763 v10933700885381486763 = V10933700885381486763.j;
        v = v10933700885381486763;
        w = 38.0f;
        x = 216.0f;
        y = Y4261039727803185691.k;
        z = 1.0f;
        A = Y4261039727803185691.x;
        B = Y4261039727803185691.j;
        C = y42610397278031856912;
        D = 80.0f;
        E = 52.0f;
        F = 80.0f;
        G = v10933700885381486763;
        H = 96.0f;
        I = D4961612090878789022.d;
        J = Y4261039727803185691.n;
        K = Y4261039727803185691.f;
        L = y42610397278031856913;
        M = y42610397278031856914;
        N = new Z14997871575210439922((byte) 13);
    }
}
