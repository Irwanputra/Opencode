package dev.epro.r0;

import ads_mobile_sdk.c7;
import ads_mobile_sdk.lk;
import ads_mobile_sdk.lm0;
import ads_mobile_sdk.mm0;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import net.zetetic.database.R;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public abstract class U8836654130139556418 {
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;

    static {
        izmyclvb.qgayjvbiagej2(1040);
    }

    public static final native H1141651193498786435 A(String str);

    public static String B(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static int C(Parcel parcel) {
        int readInt = parcel.readInt();
        int w = w(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new M8821877208104636290("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = w + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new M8821877208104636290(sb.toString(), parcel);
    }

    public static final native Q7430090668634766253 D(Q7430090668634766253 q7430090668634766253, H1141651193498786435 h1141651193498786435);

    public static final native Q7430090668634766253 E(Q7430090668634766253 q7430090668634766253, String str, List list);

    public static void F(Parcel parcel, int i, int i2) {
        int w = w(parcel, i);
        if (w == i2) {
            return;
        }
        String hexString = Integer.toHexString(w);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(w).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(w);
        throw new M8821877208104636290(G6547577305291411977.v(sb, " (0x", hexString, ")"), parcel);
    }

    public static final native void a(int i, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, String str);

    public static Bundle b(U4857089234315512256 u4857089234315512256, F12600208943493964396 f12600208943493964396) {
        u4857089234315512256.getClass();
        Bundle bundle = (Bundle) u4857089234315512256.g.get(f12600208943493964396.getClass().getName());
        return bundle == null ? new Bundle() : bundle;
    }

    public static Bundle c(I16631908410500040363 i16631908410500040363) {
        i16631908410500040363.getClass();
        Bundle bundle = new Bundle();
        Iterator it = ((S11564727846197427291) i16631908410500040363.a.keySet()).iterator();
        while (((L622219180424329983) it).hasNext()) {
            String str = (String) ((L622219180424329983) it).a().f;
            try {
                str.getClass();
                String p = i16631908410500040363.w(str).p();
                p.getClass();
                bundle.putString(str, p);
            } catch (IllegalStateException unused) {
            }
        }
        bundle.remove("max_ad_content_rating");
        return bundle;
    }

    public static M10846389789027735899 d(P16188089657974175786 p16188089657974175786) {
        p16188089657974175786.getClass();
        T18375584833185129273 t18375584833185129273 = (T18375584833185129273) p16188089657974175786;
        int i = T9499380571457390126.b[t18375584833185129273.m.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            Z3383101362411723454.g();
            return null;
        }
        int i2 = T9499380571457390126.a[t18375584833185129273.n.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return new M10846389789027735899((byte) 18);
        }
        Z3383101362411723454.g();
        return null;
    }

    public static String e(I16631908410500040363 i16631908410500040363, E4916761685899363666 e4916761685899363666) {
        i16631908410500040363.getClass();
        if (!i16631908410500040363.a.containsKey("max_ad_content_rating")) {
            return e4916761685899363666.a.a;
        }
        String p = i16631908410500040363.w("max_ad_content_rating").p();
        p.getClass();
        return p;
    }

    public static void f(Context context, String str, c7 c7Var) {
        if (context == null || str == null) {
            return;
        }
        try {
            if (str.trim().isEmpty()) {
                return;
            }
            lk.a(context).getClass();
            mm0 mm0Var = (mm0) lk.d.get(str);
            if (mm0Var == null || !mm0Var.a()) {
                return;
            }
            lm0 lm0Var = null;
            try {
                if ("FireTVFOSDAT".equals(str)) {
                    lm0Var = new lm0(context);
                }
            } catch (Exception unused) {
                "Error creating attestation mechanism: ".concat(str);
            }
            if (lm0Var != null) {
                lm0Var.a(c7Var);
            }
        } catch (Exception unused2) {
            "Error during attestation with mechanism: ".concat(str);
        }
    }

    public static Parcelable g(Parcel parcel, int i, Parcelable.Creator creator) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + w);
        return parcelable;
    }

    public static String h(Parcel parcel, int i) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + w);
        return readString;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0 A[LOOP:2: B:26:0x007d->B:33:0x00d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9 A[EDGE_INSN: B:34:0x00d9->B:39:0x00d9 BREAK  A[LOOP:2: B:26:0x007d->B:33:0x00d0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dev.epro.r0.G14438155262350387569 i(dev.epro.r0.V5656221289452463152 r17, java.util.ArrayList r18, dev.epro.r0.F4096073349764486348 r19, dev.epro.r0.L12639328004344855510 r20, dev.epro.r0.G13792465322404021864 r21) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            dev.epro.r0.Z6884774333691094167 r4 = r0.a
            long r4 = r4.c
            dev.epro.r0.Z6884774333691094167 r6 = r0.b
            long r7 = r6.c
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L1f
            dev.epro.r0.G14438155262350387569 r1 = dev.epro.r0.S11299071591039262705.a
            dev.epro.r0.G14438155262350387569 r1 = new dev.epro.r0.G14438155262350387569
            r1.<init>()
            r1.i(r4, r0)
            return r1
        L1f:
            int r9 = r1.size()
            r10 = 0
            r11 = r10
            r12 = r11
        L26:
            r13 = -1
            if (r12 >= r9) goto L41
            java.lang.Object r14 = r1.get(r12)
            int r12 = r12 + 1
            java.lang.Object r14 = r2.invoke(r14)
            java.lang.Number r14 = (java.lang.Number) r14
            long r14 = r14.longValue()
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 != 0) goto L3e
            goto L42
        L3e:
            int r11 = r11 + 1
            goto L26
        L41:
            r11 = r13
        L42:
            int r9 = r1.size()
            r12 = r10
            r14 = r12
        L48:
            if (r14 >= r9) goto L62
            java.lang.Object r15 = r1.get(r14)
            int r14 = r14 + 1
            java.lang.Object r15 = r2.invoke(r15)
            java.lang.Number r15 = (java.lang.Number) r15
            long r15 = r15.longValue()
            int r15 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r15 != 0) goto L5f
            goto L63
        L5f:
            int r12 = r12 + 1
            goto L48
        L62:
            r12 = r13
        L63:
            if (r11 == r13) goto Lda
            if (r12 != r13) goto L69
            goto Lda
        L69:
            int r9 = java.lang.Math.min(r11, r12)
            int r13 = java.lang.Math.max(r11, r12)
            if (r11 <= r12) goto L74
            r10 = 1
        L74:
            dev.epro.r0.G14438155262350387569 r11 = dev.epro.r0.S11299071591039262705.a
            dev.epro.r0.G14438155262350387569 r11 = new dev.epro.r0.G14438155262350387569
            r11.<init>()
            if (r9 > r13) goto Ld9
        L7d:
            java.lang.Object r12 = r1.get(r9)
            java.lang.Object r14 = r2.invoke(r12)
            java.lang.Number r14 = (java.lang.Number) r14
            long r14 = r14.longValue()
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 != 0) goto La6
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            dev.epro.r0.Z6884774333691094167 r2 = r0.a
            int r2 = r2.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            java.lang.Object r0 = r3.i(r12, r1, r2, r0)
            dev.epro.r0.V5656221289452463152 r0 = (dev.epro.r0.V5656221289452463152) r0
        La3:
            r1 = r20
            goto Lc9
        La6:
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 != 0) goto Lbd
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            int r1 = r6.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            java.lang.Object r0 = r3.i(r12, r0, r1, r2)
            dev.epro.r0.V5656221289452463152 r0 = (dev.epro.r0.V5656221289452463152) r0
            goto La3
        Lbd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1 = r20
            java.lang.Object r0 = r1.invoke(r12, r0)
            dev.epro.r0.V5656221289452463152 r0 = (dev.epro.r0.V5656221289452463152) r0
        Lc9:
            if (r0 == 0) goto Lce
            r11.i(r14, r0)
        Lce:
            if (r9 == r13) goto Ld9
            int r9 = r9 + 1
            r0 = r17
            r1 = r18
            r2 = r19
            goto L7d
        Ld9:
            return r11
        Lda:
            dev.epro.r0.G14438155262350387569 r0 = dev.epro.r0.S11299071591039262705.a
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U8836654130139556418.i(dev.epro.r0.V5656221289452463152, java.util.ArrayList, dev.epro.r0.F4096073349764486348, dev.epro.r0.L12639328004344855510, dev.epro.r0.G13792465322404021864):dev.epro.r0.G14438155262350387569");
    }

    public static Object[] j(Parcel parcel, int i, Parcelable.Creator creator) {
        int w = w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + w);
        return createTypedArray;
    }

    public static void k(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new M8821877208104636290(sb.toString(), parcel);
    }

    public static final U12307647644992999381 l(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new U12307647644992999381(matcher, charSequence);
        }
        return null;
    }

    public static final I4293432593871965076 m(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            I4293432593871965076 i4293432593871965076 = tag instanceof I4293432593871965076 ? (I4293432593871965076) tag : null;
            if (i4293432593871965076 != null) {
                return i4293432593871965076;
            }
            Object g = P13747563277035175218.g(view);
            view = g instanceof View ? (View) g : null;
        }
        return null;
    }

    public static final H13046841657673666323 n(Q17957571128037780363 q17957571128037780363, int i, int i2, int i3, long j, boolean z, boolean z2) {
        V5656221289452463152 v5656221289452463152;
        if (z) {
            v5656221289452463152 = null;
        } else {
            int i4 = F12478849263529740365.c;
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            v5656221289452463152 = new V5656221289452463152(new Z6884774333691094167(P13747563277035175218.i(q17957571128037780363, i5), i5, 1L), new Z6884774333691094167(P13747563277035175218.i(q17957571128037780363, i6), i6, 1L), F12478849263529740365.h(j));
        }
        return new H13046841657673666323(z2, 1, 1, v5656221289452463152, new R3610722646682213723(1L, 1, i, i2, i3, q17957571128037780363));
    }

    public static void o(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            Q11088980322693754445.k(cause);
        }
    }

    public static boolean p() {
        if (Build.VERSION.SDK_INT >= 29) {
            return R671973020226452664.c();
        }
        try {
            Method method = b;
            if (method == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                b = method;
            }
            return ((Boolean) method.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            o(e);
            return false;
        }
    }

    public static final boolean q(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }

    public static final native Object r(L13135072960070674001 l13135072960070674001, U13355873707176977607 u13355873707176977607, L12602321637077960189 l12602321637077960189, R3485456205951944611 r3485456205951944611, Q9032248029835399181 q9032248029835399181, Q9032248029835399181 q90322480298353991812, K14749510448791472029 k14749510448791472029);

    public static final native Object s(U13355873707176977607 u13355873707176977607, L12602321637077960189 l12602321637077960189, K14749510448791472029 k14749510448791472029);

    /* JADX WARN: Multi-variable type inference failed */
    public static List t(K15438463641018513946 k15438463641018513946, int i, K15438463641018513946 k154384636410185139462, boolean z, boolean z2, boolean z3) {
        O2161699089510411363 o2161699089510411363;
        boolean z4;
        int i2;
        int i3;
        int t = k15438463641018513946.t(i);
        int i4 = i + t;
        int f = k15438463641018513946.f(k15438463641018513946.b, k15438463641018513946.q(i));
        int f2 = k15438463641018513946.f(k15438463641018513946.b, k15438463641018513946.q(i4));
        int i5 = f2 - f;
        boolean z5 = i >= 0 && (k15438463641018513946.b[(k15438463641018513946.q(i) * 5) + 1] & 201326592) != 0;
        k154384636410185139462.v(t);
        k154384636410185139462.w(i5, k154384636410185139462.t);
        if (k15438463641018513946.g < i4) {
            k15438463641018513946.A(i4);
        }
        if (k15438463641018513946.k < f2) {
            k15438463641018513946.B(f2, i4);
        }
        int[] iArr = k154384636410185139462.b;
        int i6 = k154384636410185139462.t;
        int i7 = i6 * 5;
        O5378677881740157249.m0(i7, i * 5, i4 * 5, k15438463641018513946.b, iArr);
        Object[] objArr = k154384636410185139462.c;
        int i8 = k154384636410185139462.i;
        System.arraycopy(k15438463641018513946.c, f, objArr, i8, i5);
        int i9 = k154384636410185139462.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + t;
        int f3 = i8 - k154384636410185139462.f(iArr, i6);
        int i12 = k154384636410185139462.m;
        int i13 = k154384636410185139462.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int f4 = k154384636410185139462.f(iArr, i15) + f3;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = k154384636410185139462.k;
            }
            iArr2[(i15 * 5) + 4] = K15438463641018513946.h(f4, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        k154384636410185139462.m = i14;
        int b2 = S13318420980680640021.b(k15438463641018513946.d, i, k15438463641018513946.o());
        int b3 = S13318420980680640021.b(k15438463641018513946.d, i4, k15438463641018513946.o());
        if (b2 < b3) {
            ArrayList arrayList = k15438463641018513946.d;
            ArrayList arrayList2 = new ArrayList(b3 - b2);
            for (int i17 = b2; i17 < b3; i17++) {
                M7798980774515057476 m7798980774515057476 = (M7798980774515057476) arrayList.get(i17);
                m7798980774515057476.a += i10;
                arrayList2.add(m7798980774515057476);
            }
            k154384636410185139462.d.addAll(S13318420980680640021.b(k154384636410185139462.d, k154384636410185139462.t, k154384636410185139462.o()), arrayList2);
            arrayList.subList(b2, b3).clear();
            o2161699089510411363 = arrayList2;
        } else {
            o2161699089510411363 = O2161699089510411363.a;
        }
        if (!o2161699089510411363.isEmpty()) {
            HashMap hashMap = k15438463641018513946.e;
            HashMap hashMap2 = k154384636410185139462.e;
            if (hashMap != null && hashMap2 != null) {
                int size = o2161699089510411363.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = k154384636410185139462.v;
        k154384636410185139462.P(i9);
        int F = k15438463641018513946.F(k15438463641018513946.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = F >= 0;
            if (z7) {
                k15438463641018513946.Q();
                k15438463641018513946.a(F - k15438463641018513946.t);
                k15438463641018513946.Q();
            }
            k15438463641018513946.a(i - k15438463641018513946.t);
            boolean I = k15438463641018513946.I();
            if (z7) {
                k15438463641018513946.N();
                k15438463641018513946.i();
                k15438463641018513946.N();
                k15438463641018513946.i();
            }
            z4 = I;
        } else {
            boolean J = k15438463641018513946.J(i, t);
            k15438463641018513946.K(f, i5, i - 1);
            z4 = J;
        }
        if (z4) {
            N2332913310205178802.a("Unexpectedly removed anchors");
        }
        int i20 = k154384636410185139462.f326o;
        int i21 = iArr3[i7 + 1];
        k154384636410185139462.f326o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            k154384636410185139462.t = i11;
            k154384636410185139462.i = i8 + i5;
        }
        if (z6) {
            k154384636410185139462.V(i9);
        }
        return o2161699089510411363;
    }

    public static boolean u(Parcel parcel, int i) {
        F(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int v(Parcel parcel, int i) {
        F(parcel, i, 4);
        return parcel.readInt();
    }

    public static int w(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final native Object x(Z6379685802376252086 z6379685802376252086, U13355873707176977607 u13355873707176977607, Q7430090668634766253 q7430090668634766253, G10140199705652282146 g10140199705652282146, K14749510448791472029 k14749510448791472029);

    public static final Y16367081738320461687 y(Y16367081738320461687 y16367081738320461687, Y16367081738320461687 y163670817383204616872) {
        int ordinal = y163670817383204616872.ordinal();
        Y16367081738320461687 y163670817383204616873 = Y16367081738320461687.a;
        if (ordinal != 0) {
            Y16367081738320461687 y163670817383204616874 = Y16367081738320461687.c;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return y163670817383204616874;
                }
                Z3383101362411723454.g();
                return null;
            }
            int ordinal2 = y16367081738320461687.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    return Y16367081738320461687.b;
                }
                if (ordinal2 == 2) {
                    return y163670817383204616874;
                }
                Z3383101362411723454.g();
                return null;
            }
        }
        return y163670817383204616873;
    }

    public static void z(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + w(parcel, i));
    }
}
