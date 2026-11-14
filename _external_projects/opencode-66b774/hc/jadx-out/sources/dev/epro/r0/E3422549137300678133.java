package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.R;
import o.bwmna.gdrqkg.izmyclvb;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class E3422549137300678133 {
    public static M6051904797092768348 a;
    public static final float[] b;
    public static final Y4261039727803185691 c;
    public static final V10933700885381486763 d;
    public static final Y4261039727803185691 e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final F6942723054099263096 i;
    public static final P10283164515565247229 j;
    public static final P10283164515565247229 k;
    public static final P10283164515565247229 l;
    public static final Object m;
    public static final Z14997871575210439922 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Z7022156542152740569 f220o;

    public static final native void A(R6894569913291645384 r6894569913291645384, M3727281027331139839 m3727281027331139839, int i2);

    public static final void B(A13182230205880306765 a13182230205880306765, P5204863746366580363 p5204863746366580363, W5797197595347441198 w5797197595347441198, boolean z, W1972671267364756056 w1972671267364756056, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        A13182230205880306765 a131822302058803067652;
        int i3;
        m3727281027331139839.b0(-1413720282);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            a131822302058803067652 = a13182230205880306765;
            i3 = (m3727281027331139839.f(a131822302058803067652) ? 4 : 2) | i2;
        } else {
            a131822302058803067652 = a13182230205880306765;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? m3727281027331139839.f(p5204863746366580363) : m3727281027331139839.h(p5204863746366580363) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.h(w5797197595347441198) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m3727281027331139839.g(z) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= m3727281027331139839.f(w1972671267364756056) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 1048576 : 524288;
        }
        byte b3 = 0;
        if (m3727281027331139839.R(i3 & 1, (599187 & i3) != 599186)) {
            String strQ = T1335862270807194835.q(R.string.tooltip_description, m3727281027331139839);
            boolean zH = ((i3 & 112) == 32 || ((i3 & 64) != 0 && m3727281027331139839.h(p5204863746366580363))) | ((i3 & 896) == 256) | m3727281027331139839.h(w5797197595347441198) | ((458752 & i3) == 131072);
            Object objM = m3727281027331139839.M();
            if (zH || objM == O9023047933786425027.a) {
                objM = new A7716877927750495196((Object) p5204863746366580363, (Object) w5797197595347441198, w1972671267364756056, b2);
                m3727281027331139839.k0(objM);
            }
            W10645948712581465792.a(a131822302058803067652, (B13729205492206812220) objM, new R6081921892807856809(z), S10823041268949770285.T(-1287705660, new U8464449497680896203(strQ, t15443218846549482730, b3), m3727281027331139839), m3727281027331139839, (i3 & 14) | 3072, 0);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new W11516564711856301633(a13182230205880306765, p5204863746366580363, w5797197595347441198, z, w1972671267364756056, t15443218846549482730, i2);
        }
    }

    public static final native void C(String str, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void D(String str, String str2, String str3, String str4, String str5, boolean z, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void E(Z2479813363168291834 z2479813363168291834, boolean z, String str, String str2, boolean z2, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void F(List list, String str, M310145413173941529 m310145413173941529, boolean z, Set set, Integer num, boolean z2, boolean z3, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, F4096073349764486348 f40960733497644863484, B13729205492206812220 b137292054922068122204, B13729205492206812220 b137292054922068122205, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void G(M310145413173941529 m310145413173941529, boolean z, String str, LinkedHashMap linkedHashMap, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void H(String str, boolean z, String str2, String str3, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final void I(P5204863746366580363 p5204863746366580363, W1972671267364756056 w1972671267364756056, I1722681268793429505 i1722681268793429505, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(1873232064);
        byte b2 = 1;
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.g(true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? m3727281027331139839.f(p5204863746366580363) : m3727281027331139839.h(p5204863746366580363) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.f(w1972671267364756056) ? 256 : 128;
        }
        byte b3 = 0;
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m3727281027331139839.f(i1722681268793429505) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 131072 : 65536;
        }
        if (m3727281027331139839.R(i3 & 1, (74899 & i3) != 74898)) {
            Object objM = m3727281027331139839.M();
            if (objM == O9023047933786425027.a) {
                objM = Q13169198992966610970.R(m3727281027331139839);
                m3727281027331139839.k0(objM);
            }
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) objM;
            I1722681268793429505 i1722681268793429505E = B5998207562248239613.E(G16660188620551127941.C(T7055906184043387232.b(T7055906184043387232.b(i1722681268793429505, p5204863746366580363, new A2764358890551697978(p5204863746366580363, b3)), p5204863746366580363, new A2764358890551697978(p5204863746366580363, b2)).Q0(new S3426947254695259356(new C2148711509933735908(T1335862270807194835.q(R.string.tooltip_label, m3727281027331139839), (Object) w5797197595347441198, (Object) p5204863746366580363, (byte) 7))), new J7403353095371830496(w5797197595347441198, p5204863746366580363, (byte) 16)), new J3772078759892425500(p5204863746366580363, w1972671267364756056, (byte) 3));
            A10838822263452390785 a10838822263452390785C = Z6714950837425363575.c(T13350664027331345869.b, false);
            int iA = E12775674050813925581.A(m3727281027331139839);
            P3648740535677465818 p3648740535677465818L = m3727281027331139839.l();
            I1722681268793429505 i1722681268793429505N = V12319504402545346730.N(m3727281027331139839, i1722681268793429505E);
            X4572652335386916693.Po.getClass();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            W7808703833045379622.J(P2382941533350862833.i, m3727281027331139839, a10838822263452390785C);
            W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
            X4712621039624176170 x4712621039624176170 = P2382941533350862833.j;
            if (m3727281027331139839.S || !S10823041268949770285.t(m3727281027331139839.M(), Integer.valueOf(iA))) {
                L11610354117192841236.t(iA, m3727281027331139839, iA, x4712621039624176170);
            }
            W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
            G11450220448113054352.m((i3 >> 15) & 14, t15443218846549482730, m3727281027331139839, true);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new G18133890210511251283(p5204863746366580363, w1972671267364756056, i1722681268793429505, t15443218846549482730, i2);
        }
    }

    public static final native Y10647802459566096560 J(int i2, String str);

    public static final boolean K(I4622425004907418771 i4622425004907418771, int i2, A4783298371339261043 a4783298371339261043, boolean z) {
        boolean z2;
        synchronized (m) {
            try {
                int i3 = i4622425004907418771.d;
                if (i3 == i2) {
                    i4622425004907418771.c = a4783298371339261043;
                    z2 = true;
                    if (z) {
                        i4622425004907418771.e++;
                    }
                    i4622425004907418771.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final Object L(D16915945238461757356 d16915945238461757356, R14062301455140331524 r14062301455140331524) throws Throwable {
        try {
            if (d16915945238461757356.isDone()) {
                return P16078978668947144669.e(d16915945238461757356);
            }
            H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(r14062301455140331524));
            d16915945238461757356.a(new M14623918774394739022(d16915945238461757356, h7219028874700587498, (byte) 1), U16739955047530304491.a);
            h7219028874700587498.v(new J3227772737003951788(d16915945238461757356, (byte) 12));
            return h7219028874700587498.r();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                throw cause;
            }
            X11333337577019102532 x11333337577019102532 = new X11333337577019102532();
            S10823041268949770285.Y(x11333337577019102532, S10823041268949770285.class.getName());
            throw x11333337577019102532;
        }
    }

    public static void M(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                Z3383101362411723454.k(G6547577305291411977.n(i3, "at index "));
                return;
            }
        }
    }

    public static final Z13251062865217617579 N(Z13251062865217617579 z13251062865217617579) {
        Z13251062865217617579 z13251062865217617579C = z13251062865217617579.c();
        int iB = z13251062865217617579C.b();
        for (int i2 = 0; i2 < iB; i2++) {
            z13251062865217617579C.e(i2, z13251062865217617579.a(i2));
        }
        return z13251062865217617579C;
    }

    public static final native long P(long j2, TimeZone timeZone);

    public static final native long Q(long j2, TimeZone timeZone);

    public static final long R(float f2, int i2, long j2, boolean z) {
        int i3 = ((z || i2 == 2 || i2 == 4 || i2 == 5) && I16980768508151520658.e(j2)) ? I16980768508151520658.i(j2) : Integer.MAX_VALUE;
        if (I16980768508151520658.k(j2) != i3) {
            i3 = W7808703833045379622.q(T13998044911588922055.d(f2), I16980768508151520658.k(j2), i3);
        }
        return C12265524002282074474.R(0, i3, 0, I16980768508151520658.h(j2));
    }

    public static final I4622425004907418771 S(R5670552972627103399 r5670552972627103399) {
        I4622425004907418771 i4622425004907418771 = r5670552972627103399.a;
        i4622425004907418771.getClass();
        return (I4622425004907418771) D459204867321966484.s(i4622425004907418771, r5670552972627103399);
    }

    public static final int T(R5670552972627103399 r5670552972627103399) {
        I4622425004907418771 i4622425004907418771 = r5670552972627103399.a;
        i4622425004907418771.getClass();
        return ((I4622425004907418771) D459204867321966484.f(i4622425004907418771)).e;
    }

    public static final native boolean V(Z12230432157744414222 z12230432157744414222, Z12230432157744414222 z122304321577444142222);

    public static final boolean W(R5670552972627103399 r5670552972627103399, F4096073349764486348 f4096073349764486348) {
        int i2;
        A4783298371339261043 a4783298371339261043;
        Object objInvoke;
        M4722199849958580248 m4722199849958580248H;
        boolean zK;
        do {
            synchronized (m) {
                I4622425004907418771 i4622425004907418771 = r5670552972627103399.a;
                i4622425004907418771.getClass();
                I4622425004907418771 i46224250049074187712 = (I4622425004907418771) D459204867321966484.f(i4622425004907418771);
                i2 = i46224250049074187712.d;
                a4783298371339261043 = i46224250049074187712.c;
            }
            a4783298371339261043.getClass();
            J15049672055732829618 j15049672055732829618J = a4783298371339261043.j();
            objInvoke = f4096073349764486348.invoke(j15049672055732829618J);
            A4783298371339261043 a4783298371339261043C = j15049672055732829618J.c();
            if (S10823041268949770285.t(a4783298371339261043C, a4783298371339261043)) {
                break;
            }
            I4622425004907418771 i46224250049074187713 = r5670552972627103399.a;
            i46224250049074187713.getClass();
            synchronized (D459204867321966484.c) {
                m4722199849958580248H = D459204867321966484.h();
                zK = K((I4622425004907418771) D459204867321966484.w(i46224250049074187713, r5670552972627103399, m4722199849958580248H), i2, a4783298371339261043C, true);
            }
            D459204867321966484.l(m4722199849958580248H, r5670552972627103399);
        } while (!zK);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final native G13897809556106331572 X(Z12230432157744414222 z12230432157744414222);

    public static O2957401531134925886 Y(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        int i3;
        int i4;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            d0(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), G6619020464718317066.b);
        int i5 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i6 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), G6619020464718317066.c);
                        int i7 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i9 = typedArrayObtainAttributes2.getInt(i8, 0);
                        int i10 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i10, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i10);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            d0(xmlResourceParser);
                        }
                        arrayList.add(new T13158771825442419349(i7, i9, resourceId2, string7, string6, z));
                    } else {
                        d0(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new L933758655888641216((T13158771825442419349[]) arrayList.toArray(new T13158771825442419349[0]));
        }
        List listB0 = b0(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), G6619020464718317066.d);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i5);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        i4 = integer;
                        String string10 = typedArrayObtainAttributes3.getString(i2);
                        if (string8 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i6) {
                            d0(xmlResourceParser);
                        }
                        try {
                            typedArray = typedArrayObtainAttributes3;
                            i3 = i6;
                            try {
                                O5645052741531709506 o5645052741531709506 = new O5645052741531709506(string, string2, string8, listB0, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(o5645052741531709506);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = typedArrayObtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i3 = i6;
                i4 = integer;
                d0(xmlResourceParser);
                i6 = i3;
                integer = i4;
                i2 = 2;
                i5 = 0;
            }
        }
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new Z16564692815490596738(arrayList2, i11, integer2, string5);
        }
        if (string3 == null) {
            S10973172697741180971.j("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new O5645052741531709506(string, string2, string3, listB0, null, null));
        if (string4 != null) {
            arrayList2.add(new O5645052741531709506(string, string2, string4, listB0, null, null));
        }
        return new Z16564692815490596738(arrayList2, i11, integer2, string5);
    }

    public static final native void a(G17854281415623469737 g17854281415623469737, float f2, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native U1779235441444412014 a0(String str);

    public static List b0(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final void c(A13182230205880306765 a13182230205880306765, T15443218846549482730 t15443218846549482730, P5204863746366580363 p5204863746366580363, I1722681268793429505 i1722681268793429505, T15443218846549482730 t154432188465494827302, M3727281027331139839 m3727281027331139839, int i2) {
        A13182230205880306765 a131822302058803067652;
        int i3;
        W1972671267364756056 w1972671267364756056;
        boolean z;
        M3727281027331139839 m37272810273311398392 = m3727281027331139839;
        m37272810273311398392.b0(-1221877520);
        if ((i2 & 6) == 0) {
            a131822302058803067652 = a13182230205880306765;
            i3 = (m37272810273311398392.f(a131822302058803067652) ? 4 : 2) | i2;
        } else {
            a131822302058803067652 = a13182230205880306765;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m37272810273311398392.h(t15443218846549482730) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? m37272810273311398392.f(p5204863746366580363) : m37272810273311398392.h(p5204863746366580363) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m37272810273311398392.f(i1722681268793429505) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m37272810273311398392.h(null) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= m37272810273311398392.g(false) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= m37272810273311398392.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= m37272810273311398392.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= m37272810273311398392.h(t154432188465494827302) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (m37272810273311398392.R(i4 & 1, (38347923 & i4) != 38347922)) {
            Object objM = m37272810273311398392.M();
            E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
            if (objM == e17149812035295265804) {
                objM = Q13169198992966610970.R(m37272810273311398392);
                m37272810273311398392.k0(objM);
            }
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) objM;
            Object objM2 = m37272810273311398392.M();
            if (objM2 == e17149812035295265804) {
                objM2 = V4416135141588678913.t(Boolean.FALSE);
                m37272810273311398392.k0(objM2);
            }
            W1972671267364756056 w19726712673647560562 = (W1972671267364756056) objM2;
            A10838822263452390785 a10838822263452390785C = Z6714950837425363575.c(T13350664027331345869.b, false);
            int iA = E12775674050813925581.A(m37272810273311398392);
            P3648740535677465818 p3648740535677465818L = m37272810273311398392.l();
            I1722681268793429505 i1722681268793429505N = V12319504402545346730.N(m37272810273311398392, V10993962107938880611.a);
            X4572652335386916693.Po.getClass();
            m37272810273311398392.d0();
            if (m37272810273311398392.S) {
                m37272810273311398392.k(H11725168162114556860.S);
            } else {
                m37272810273311398392.n0();
            }
            W7808703833045379622.J(P2382941533350862833.i, m37272810273311398392, a10838822263452390785C);
            W7808703833045379622.J(P2382941533350862833.h, m37272810273311398392, p3648740535677465818L);
            X4712621039624176170 x4712621039624176170 = P2382941533350862833.j;
            if (m37272810273311398392.S || !S10823041268949770285.t(m37272810273311398392.M(), Integer.valueOf(iA))) {
                L11610354117192841236.t(iA, m37272810273311398392, iA, x4712621039624176170);
            }
            W7808703833045379622.J(P2382941533350862833.g, m37272810273311398392, i1722681268793429505N);
            if (p5204863746366580363.b()) {
                m37272810273311398392.a0(-1891243071);
                B(a131822302058803067652, p5204863746366580363, w5797197595347441198, false, w19726712673647560562, t15443218846549482730, m37272810273311398392, ((i4 << 15) & 3670016) | (i4 & 14) | 196608 | ((i4 >> 3) & 112) | ((i4 >> 6) & 896));
                w1972671267364756056 = w19726712673647560562;
                m37272810273311398392 = m37272810273311398392;
                z = false;
                m37272810273311398392.q(false);
            } else {
                w1972671267364756056 = w19726712673647560562;
                z = false;
                m37272810273311398392.a0(-1890863476);
                m37272810273311398392.q(false);
            }
            I(p5204863746366580363, w1972671267364756056, i1722681268793429505, t154432188465494827302, m37272810273311398392, ((i4 >> 18) & 14) | 384 | ((i4 >> 3) & 112) | ((i4 >> 12) & 7168) | (57344 & (i4 << 3)) | ((i4 >> 9) & 458752));
            m37272810273311398392.q(true);
            boolean z2 = ((i4 & 896) == 256 || ((i4 & 512) != 0 && m37272810273311398392.h(p5204863746366580363))) ? true : z;
            Object objM3 = m37272810273311398392.M();
            if (z2 || objM3 == e17149812035295265804) {
                objM3 = new A6662317080022852970(p5204863746366580363, (byte) 14);
                m37272810273311398392.k0(objM3);
            }
            Q13169198992966610970.c(p5204863746366580363, (F4096073349764486348) objM3, m37272810273311398392);
        } else {
            m37272810273311398392.U();
        }
        V4878375136513573151 v4878375136513573151T = m37272810273311398392.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new Z11010316021731160528(a13182230205880306765, t15443218846549482730, p5204863746366580363, i1722681268793429505, t154432188465494827302, i2);
        }
    }

    public static final native Set c0(String str);

    public static final native void d(V3118049853945785650 v3118049853945785650, M3727281027331139839 m3727281027331139839, int i2);

    public static void d0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final native void e(String str, W1413845473851472788 w1413845473851472788, long j2, M3727281027331139839 m3727281027331139839, int i2);

    public static final void e0(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            W4415201450379021245.a(G11450220448113054352.h(i2, i3, "index (", ") is out of bound of [0, ", ")"));
        }
    }

    public static final native void f(int i2, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, String str, boolean z);

    public static final void j(W3656598099029166611 w3656598099029166611, I1722681268793429505 i1722681268793429505, A10693687560045094360 a10693687560045094360, F4096073349764486348 f4096073349764486348, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        F4096073349764486348 f40960733497644863482;
        L6855102173777462404 l6855102173777462404 = w3656598099029166611.a;
        m3727281027331139839.b0(-1877370462);
        int i3 = (i2 & 6) == 0 ? (m3727281027331139839.f(w3656598099029166611) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.f(i1722681268793429505) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(a10693687560045094360) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= m3727281027331139839.h(t15443218846549482730) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if (m3727281027331139839.R(i4 & 1, (i4 & 9363) != 9362)) {
            Object objM = m3727281027331139839.M();
            Object obj = O9023047933786425027.a;
            if (objM == obj) {
                objM = J6249063375258466235.p;
                m3727281027331139839.k0(objM);
            }
            F4096073349764486348 f40960733497644863483 = (F4096073349764486348) objM;
            Object objM2 = m3727281027331139839.M();
            Object obj2 = objM2;
            if (objM2 == obj) {
                R5670552972627103399 r5670552972627103399 = new R5670552972627103399();
                r5670552972627103399.add(l6855102173777462404.g());
                m3727281027331139839.k0(r5670552972627103399);
                obj2 = r5670552972627103399;
            }
            R5670552972627103399 r56705529726271033992 = (R5670552972627103399) obj2;
            Object objM3 = m3727281027331139839.M();
            if (objM3 == obj) {
                long[] jArr = X4026756943680612204.a;
                objM3 = new A4559761392562572984();
                m3727281027331139839.k0(objM3);
            }
            A4559761392562572984 a4559761392562572984 = (A4559761392562572984) objM3;
            V697849047308847220 v697849047308847220 = w3656598099029166611.d;
            if (S10823041268949770285.t(l6855102173777462404.g(), v697849047308847220.getValue())) {
                m3727281027331139839.a0(321145192);
                if (r56705529726271033992.size() == 1 && S10823041268949770285.t(r56705529726271033992.get(0), v697849047308847220.getValue())) {
                    m3727281027331139839.a0(321469824);
                    m3727281027331139839.q(false);
                } else {
                    m3727281027331139839.a0(321279546);
                    boolean z = (i4 & 14) == 4;
                    Object objM4 = m3727281027331139839.M();
                    if (z || objM4 == obj) {
                        objM4 = new J3227772737003951788(w3656598099029166611, (byte) 9);
                        m3727281027331139839.k0(objM4);
                    }
                    P17571903987102865660.p0((F4096073349764486348) objM4, r56705529726271033992);
                    a4559761392562572984.a();
                    m3727281027331139839.q(false);
                }
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(321475776);
                m3727281027331139839.q(false);
            }
            if (a4559761392562572984.b(v697849047308847220.getValue())) {
                m3727281027331139839.a0(322279296);
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(321536443);
                ListIterator listIterator = r56705529726271033992.listIterator();
                int i5 = 0;
                while (true) {
                    E12552353581788229419 e12552353581788229419 = (E12552353581788229419) listIterator;
                    if (!e12552353581788229419.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (S10823041268949770285.t(f40960733497644863483.invoke(e12552353581788229419.next()), f40960733497644863483.invoke(v697849047308847220.getValue()))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    r56705529726271033992.add(v697849047308847220.getValue());
                } else {
                    r56705529726271033992.set(i5, v697849047308847220.getValue());
                }
                a4559761392562572984.a();
                int size = r56705529726271033992.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Object obj3 = r56705529726271033992.get(i6);
                    a4559761392562572984.n(obj3, S10823041268949770285.T(-934471669, new M11969686331725811805(w3656598099029166611, a10693687560045094360, obj3, t15443218846549482730), m3727281027331139839));
                }
                m3727281027331139839.q(false);
            }
            A10838822263452390785 a10838822263452390785C = Z6714950837425363575.c(T13350664027331345869.b, false);
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
            W7808703833045379622.J(P2382941533350862833.i, m3727281027331139839, a10838822263452390785C);
            W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
            W7808703833045379622.z(m3727281027331139839, Integer.valueOf(iHashCode));
            W7808703833045379622.H(m3727281027331139839);
            W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
            m3727281027331139839.a0(-1312707512);
            int size2 = r56705529726271033992.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Object obj4 = r56705529726271033992.get(i7);
                m3727281027331139839.Y(1171574969, f40960733497644863483.invoke(obj4));
                L12639328004344855510 l12639328004344855510 = (L12639328004344855510) a4559761392562572984.g(obj4);
                if (l12639328004344855510 == null) {
                    m3727281027331139839.a0(1959122128);
                } else {
                    m3727281027331139839.a0(1171576145);
                    l12639328004344855510.invoke(m3727281027331139839, 0);
                }
                m3727281027331139839.q(false);
                m3727281027331139839.q(false);
            }
            m3727281027331139839.q(false);
            m3727281027331139839.q(true);
            f40960733497644863482 = f40960733497644863483;
        } else {
            m3727281027331139839.U();
            f40960733497644863482 = f4096073349764486348;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new B4826844404414046037(w3656598099029166611, i1722681268793429505, a10693687560045094360, f40960733497644863482, t15443218846549482730, i2);
        }
    }

    public static final void k(Object obj, I1722681268793429505 i1722681268793429505, A10693687560045094360 a10693687560045094360, String str, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2, int i3) {
        int i4;
        I1722681268793429505 i17226812687934295052;
        String str2;
        m3727281027331139839.b0(-513216493);
        int i5 = i2 | (m3727281027331139839.f(obj) ? 4 : 2);
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (m3727281027331139839.f(i1722681268793429505) ? 32 : 16);
        }
        int i7 = i4 | (m3727281027331139839.h(a10693687560045094360) ? 256 : 128) | 3072;
        if (m3727281027331139839.R(i7 & 1, (i7 & 9363) != 9362)) {
            I1722681268793429505 i17226812687934295053 = i6 != 0 ? V10993962107938880611.a : i1722681268793429505;
            j(V933048422416352811.M(obj, "Crossfade", m3727281027331139839, (i7 & 14) | 48, 0), i17226812687934295053, a10693687560045094360, null, t15443218846549482730, m3727281027331139839, i7 & 58352);
            i17226812687934295052 = i17226812687934295053;
            str2 = "Crossfade";
        } else {
            m3727281027331139839.U();
            i17226812687934295052 = i1722681268793429505;
            str2 = str;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new W5376853193994691768(obj, i17226812687934295052, a10693687560045094360, str2, t15443218846549482730, i2, i3);
        }
    }

    public static final native void l(X11638668447546090163 x11638668447546090163, K2746982608131049817 k2746982608131049817, X16042184966849612101 x16042184966849612101, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void m(P18315010608309390908 p18315010608309390908, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void n(boolean z, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void o(P18315010608309390908 p18315010608309390908, C3072902849025492506 c3072902849025492506, E9947071562186447382 e9947071562186447382, boolean z, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void p(E10547862673625079010 e10547862673625079010, boolean z, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void q(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void r(X12291102796058397370 x12291102796058397370, boolean z, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void s(Z7022156542152740569 z7022156542152740569, String str, long j2, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void t(long j2, long j3, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void u(String str, long j2, M3727281027331139839 m3727281027331139839, int i2);

    public static final void v(I1722681268793429505 i1722681268793429505, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        I1722681268793429505 i17226812687934295052;
        T15443218846549482730 t154432188465494827302;
        m3727281027331139839.b0(790527681);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 32 : 16;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            Object objM = m3727281027331139839.M();
            E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
            if (objM == e17149812035295265804) {
                V697849047308847220 v697849047308847220 = new V697849047308847220(null, B14824868959299866349.k);
                m3727281027331139839.k0(v697849047308847220);
                objM = v697849047308847220;
            }
            final W1972671267364756056 w1972671267364756056 = (W1972671267364756056) objM;
            Object objM2 = m3727281027331139839.M();
            if (objM2 == e17149812035295265804) {
                final byte b3 = 12;
                objM2 = new B13729205492206812220(w1972671267364756056, b3) { // from class: dev.epro.r0.H1387862205763836338
                    public final /* synthetic */ byte a;
                    public final /* synthetic */ W1972671267364756056 b;

                    static {
                        izmyclvb.dpqpjfpoanwt1(60);
                    }

                    private native void jvxjfollcprj(W1972671267364756056 w19726712673647560562, byte b4);

                    @Override // dev.epro.r0.B13729205492206812220
                    public final native Object invoke();

                    {
                        this.a = b3;
                        this.b = w1972671267364756056;
                        jvxjfollcprj(w1972671267364756056, b3);
                    }
                };
                m3727281027331139839.k0(objM2);
            }
            B13729205492206812220 b13729205492206812220 = (B13729205492206812220) objM2;
            R6081921892807856809 r6081921892807856809 = I828473291849542367.a;
            Q3290033537611024070 q3290033537611024070H = O4077903568229246.h(O8620973563946607355.b, m3727281027331139839, 6);
            i17226812687934295052 = i1722681268793429505;
            t154432188465494827302 = t15443218846549482730;
            D1286559660607336098.b(new P11507981277033739248[]{M6666571459626975107.b.a(O8620973563946607355.Q(b13729205492206812220, m3727281027331139839, 2)), M6666571459626975107.a.a(q3290033537611024070H)}, S10823041268949770285.T(1070596993, new G989519692541748422(i17226812687934295052, w1972671267364756056, t154432188465494827302, q3290033537611024070H, b13729205492206812220), m3727281027331139839), m3727281027331139839, 56);
        } else {
            i17226812687934295052 = i1722681268793429505;
            t154432188465494827302 = t15443218846549482730;
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new S4441727196080009540(i17226812687934295052, t154432188465494827302, i2, b2);
        }
    }

    public static final void w(I1722681268793429505 i1722681268793429505, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(155925518);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 32 : 16;
        }
        byte b2 = 3;
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            boolean z = m3727281027331139839.j(M6666571459626975107.a) != null;
            boolean z2 = m3727281027331139839.j(M6666571459626975107.b) != null;
            if (z && z2) {
                m3727281027331139839.a0(-1977187922);
                A10838822263452390785 a10838822263452390785C = Z6714950837425363575.c(T13350664027331345869.b, true);
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
                W7808703833045379622.J(P2382941533350862833.i, m3727281027331139839, a10838822263452390785C);
                W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
                W7808703833045379622.J(P2382941533350862833.j, m3727281027331139839, Integer.valueOf(iHashCode));
                W7808703833045379622.H(m3727281027331139839);
                W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
                t15443218846549482730.invoke(m3727281027331139839, Integer.valueOf((i3 >> 3) & 14));
                m3727281027331139839.q(true);
                m3727281027331139839.q(false);
            } else if (z) {
                m3727281027331139839.a0(-1976997706);
                O8620973563946607355.i(i1722681268793429505, t15443218846549482730, m3727281027331139839, i3 & 126);
                m3727281027331139839.q(false);
            } else if (z2) {
                m3727281027331139839.a0(-1976846922);
                I828473291849542367.d(i1722681268793429505, t15443218846549482730, m3727281027331139839, i3 & 126);
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(-1976716505);
                v(i1722681268793429505, t15443218846549482730, m3727281027331139839, i3 & 126);
                m3727281027331139839.q(false);
            }
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new S4441727196080009540(i1722681268793429505, t15443218846549482730, i2, b2);
        }
    }

    public static final native void x(A16842337154698931828 a16842337154698931828, Y15427935686644244568 y15427935686644244568, V9622388302629328265 v9622388302629328265, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void y(R6894569913291645384 r6894569913291645384, U14925992865883685656 u14925992865883685656, String str, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void z(String str, M3727281027331139839 m3727281027331139839, int i2);

    public abstract Intent O(Context context, Object obj);

    public Z6787503239643758223 U(Context context, Object obj) {
        return null;
    }

    public abstract Object Z(Intent intent, int i2);

    static {
        izmyclvb.oeynnivvrnts0(1066);
        b = new float[91];
        c = Y4261039727803185691.u;
        d = V10933700885381486763.h;
        e = Y4261039727803185691.w;
        f = 0.38f;
        g = 6.0f;
        h = 1.0f;
        i = new F6942723054099263096((Object) new T15504973625601650233((byte) 15), (byte) 14);
        j = new P10283164515565247229(1000);
        new P10283164515565247229(1007);
        k = new P10283164515565247229(1008);
        l = new P10283164515565247229(1002);
        m = new Object();
        n = new Z14997871575210439922((byte) 22);
    }
}
