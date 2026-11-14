package dev.epro.r0;

import android.content.Context;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class T3983923074066333145 implements AutoCloseable {
    public static final Z11244019023321623390 L;
    public volatile boolean A;
    public volatile boolean B;
    public final ExecutorService C;
    public final Set D;
    public final J16075655124062498270 E;
    public final O12494175665883759871 F;
    public final CountDownLatch G;
    public final W18100275725746685176 H;
    public final B18437066071346442440 I;
    public final O1495669038463313080 J;
    public final E13395689114940028192 K;
    public final Context a;
    public final int b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final S8568872423891207546 j;
    public final String k;
    public final boolean l;
    public final String m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f505o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final M13389864142310742121 u;
    public final V5962473127612511307 v;
    public volatile int w;
    public volatile int x;
    public volatile int y;
    public ServerSocket z;

    static {
        int iTctrxldksqns;
        izmyclvb.qgayjvbiagej2(668);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iTctrxldksqns = tctrxldksqns(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iTctrxldksqns != 0) {
                switch (iTctrxldksqns) {
                    case 1:
                        L = (Z11244019023321623390) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v47, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v50, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v53, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v56, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v72, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v75, types: [boolean, int] */
    public /* synthetic */ T3983923074066333145(Context context, int i, String str, int i2, String str2, int i3, String str3, boolean z, boolean z2, S8568872423891207546 s8568872423891207546, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, String str7, boolean z7, boolean z8, boolean z9, boolean z10, M13389864142310742121 m13389864142310742121, V5962473127612511307 v5962473127612511307, int i4, int i5, int i6, boolean z11, boolean z12, int i7, O18369580107802500074 o18369580107802500074) {
        Object[] objArrEurdaonrjxdr = eurdaonrjxdr(context, i, str, i2, str2, i3, str3, z, z2, s8568872423891207546, str4, z3, str5, str6, z4, z5, z6, str7, z7, z8, z9, z10, m13389864142310742121, v5962473127612511307, i4, i5, i6, z11, z12, i7, o18369580107802500074);
        this((Context) objArrEurdaonrjxdr[0], ((Integer) objArrEurdaonrjxdr[1]).intValue(), (String) objArrEurdaonrjxdr[2], ((Integer) objArrEurdaonrjxdr[3]).intValue(), (String) objArrEurdaonrjxdr[4], ((Integer) objArrEurdaonrjxdr[5]).intValue(), (String) objArrEurdaonrjxdr[6], ((Integer) objArrEurdaonrjxdr[7]).intValue(), ((Integer) objArrEurdaonrjxdr[8]).intValue(), (S8568872423891207546) objArrEurdaonrjxdr[9], (String) objArrEurdaonrjxdr[10], ((Integer) objArrEurdaonrjxdr[11]).intValue(), (String) objArrEurdaonrjxdr[12], (String) objArrEurdaonrjxdr[13], ((Integer) objArrEurdaonrjxdr[14]).intValue(), ((Integer) objArrEurdaonrjxdr[15]).intValue(), ((Integer) objArrEurdaonrjxdr[16]).intValue(), (String) objArrEurdaonrjxdr[17], ((Integer) objArrEurdaonrjxdr[18]).intValue(), ((Integer) objArrEurdaonrjxdr[19]).intValue(), ((Integer) objArrEurdaonrjxdr[20]).intValue(), ((Integer) objArrEurdaonrjxdr[21]).intValue(), (M13389864142310742121) objArrEurdaonrjxdr[22], (V5962473127612511307) objArrEurdaonrjxdr[23], ((Integer) objArrEurdaonrjxdr[24]).intValue(), ((Integer) objArrEurdaonrjxdr[25]).intValue(), ((Integer) objArrEurdaonrjxdr[26]).intValue(), ((Integer) objArrEurdaonrjxdr[27]).intValue(), ((Integer) objArrEurdaonrjxdr[28]).intValue());
        ignsaxtvkvte();
    }

    public static native boolean c();

    public static native void e(T3983923074066333145 t3983923074066333145, int i, Object[] objArr, C13199856549537327585 c13199856549537327585, H13181800873099545702 h13181800873099545702, int i2);

    private static native Object[] eurdaonrjxdr(Context context, int i, String str, int i2, String str2, int i3, String str3, boolean z, boolean z2, S8568872423891207546 s8568872423891207546, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, String str7, boolean z7, boolean z8, boolean z9, boolean z10, M13389864142310742121 m13389864142310742121, V5962473127612511307 v5962473127612511307, int i4, int i5, int i6, boolean z11, boolean z12, int i7, O18369580107802500074 o18369580107802500074);

    private native void ignsaxtvkvte();

    private native void janfnggmpvcv(Context context, int i, String str, int i2, String str2, int i3, String str3, boolean z, boolean z2, S8568872423891207546 s8568872423891207546, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, String str7, boolean z7, boolean z8, boolean z9, boolean z10, M13389864142310742121 m13389864142310742121, V5962473127612511307 v5962473127612511307, int i4, int i5, int i6, boolean z11, boolean z12);

    private static native int tctrxldksqns(Object[] objArr);

    public final native boolean b();

    @Override // java.lang.AutoCloseable
    public final native void close();

    public final native void d(int i, Object[] objArr, Throwable th, C13199856549537327585 c13199856549537327585, H13181800873099545702 h13181800873099545702);

    public final native void g(Socket socket, InputStream inputStream, OutputStream outputStream, F7649235187575106900 f7649235187575106900, M10731551595724736505 m10731551595724736505, S5810547728831671333 s5810547728831671333, int i, I12007476123594936550 i12007476123594936550, I12007476123594936550 i120074761235949365502, H3568921424210614207 h3568921424210614207);

    public final native void h();

    public final native void j();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(1419);
        }

        public static native boolean a(String str);

        public static native String b(Z11244019023321623390 z11244019023321623390, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, int i2);

        public static native String c(String str);

        public static native String d(String str, AtomicInteger atomicInteger);

        private native void fwthnbaterkr();

        private native void yoctqjybohwf(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            yoctqjybohwf(o18369580107802500074);
        }

        private Z11244019023321623390() {
            fwthnbaterkr();
        }
    }

    public T3983923074066333145(Context context, int i, String str, int i2, String str2, int i3, String str3, boolean z, boolean z2, S8568872423891207546 s8568872423891207546, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, String str7, boolean z7, boolean z8, boolean z9, boolean z10, M13389864142310742121 m13389864142310742121, V5962473127612511307 v5962473127612511307, int i4, int i5, int i6, boolean z11, boolean z12) {
        context.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        str7.getClass();
        m13389864142310742121.getClass();
        janfnggmpvcv(context, i, str, i2, str2, i3, str3, z, z2, s8568872423891207546, str4, z3, str5, str6, z4, z5, z6, str7, z7, z8, z9, z10, m13389864142310742121, v5962473127612511307, i4, i5, i6, z11, z12);
    }
}
