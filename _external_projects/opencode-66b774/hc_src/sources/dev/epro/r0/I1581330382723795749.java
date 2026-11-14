package dev.epro.r0;

import android.text.Layout;
import java.security.GeneralSecurityException;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I1581330382723795749 implements P7456194097047421796, K7493131619793429513 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    public I1581330382723795749(M11181104712105445833 m11181104712105445833, R8540738700654750557 r8540738700654750557, U14340554418656580554 u14340554418656580554, S16571168858015125610 s16571168858015125610, List list, boolean z) {
        int i;
        String str;
        int i2;
        List list2;
        M11181104712105445833 m111811047121054458332 = m11181104712105445833;
        S16571168858015125610 s165711688580151256102 = s16571168858015125610;
        this.a = m111811047121054458332;
        this.b = list;
        final byte b = 0;
        B13729205492206812220 b13729205492206812220 = new B13729205492206812220(this) { // from class: dev.epro.r0.V13851498593592307034
            public final /* synthetic */ I1581330382723795749 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b2 = b;
                U18170924438753170978 u18170924438753170978 = null;
                int i3 = 1;
                I1581330382723795749 i1581330382723795749 = this.b;
                switch (b2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) i1581330382723795749.e;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float a = ((U18170924438753170978) r0).a.a();
                            int size = arrayList.size() - 1;
                            boolean z2 = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList.get(i3);
                                    float a2 = ((U18170924438753170978) obj).a.a();
                                    r0 = z2;
                                    if (Float.compare(a, a2) < 0) {
                                        r0 = obj;
                                        a = a2;
                                    }
                                    if (i3 != size) {
                                        i3++;
                                        z2 = r0;
                                    }
                                }
                            }
                            u18170924438753170978 = r0;
                        }
                        U18170924438753170978 u181709244387531709782 = u18170924438753170978;
                        return Float.valueOf(u181709244387531709782 != null ? u181709244387531709782.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) i1581330382723795749.e;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float c = ((U18170924438753170978) r02).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            boolean z3 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i3);
                                    float c2 = ((U18170924438753170978) obj2).a.i.c();
                                    r02 = z3;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i3 != size2) {
                                        i3++;
                                        z3 = r02;
                                    }
                                }
                            }
                            u18170924438753170978 = r02;
                        }
                        U18170924438753170978 u181709244387531709783 = u18170924438753170978;
                        return Float.valueOf(u181709244387531709783 != null ? u181709244387531709783.a.i.c() : 0.0f);
                }
            }
        };
        G14718160286012243331 g14718160286012243331 = G14718160286012243331.c;
        this.c = M9216324016624295870.L(g14718160286012243331, b13729205492206812220);
        final byte b2 = 1;
        this.d = M9216324016624295870.L(g14718160286012243331, new B13729205492206812220(this) { // from class: dev.epro.r0.V13851498593592307034
            public final /* synthetic */ I1581330382723795749 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b22 = b2;
                U18170924438753170978 u18170924438753170978 = null;
                int i3 = 1;
                I1581330382723795749 i1581330382723795749 = this.b;
                switch (b22) {
                    case 0:
                        ArrayList arrayList = (ArrayList) i1581330382723795749.e;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float a = ((U18170924438753170978) r0).a.a();
                            int size = arrayList.size() - 1;
                            boolean z2 = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList.get(i3);
                                    float a2 = ((U18170924438753170978) obj).a.a();
                                    r0 = z2;
                                    if (Float.compare(a, a2) < 0) {
                                        r0 = obj;
                                        a = a2;
                                    }
                                    if (i3 != size) {
                                        i3++;
                                        z2 = r0;
                                    }
                                }
                            }
                            u18170924438753170978 = r0;
                        }
                        U18170924438753170978 u181709244387531709782 = u18170924438753170978;
                        return Float.valueOf(u181709244387531709782 != null ? u181709244387531709782.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) i1581330382723795749.e;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float c = ((U18170924438753170978) r02).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            boolean z3 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i3);
                                    float c2 = ((U18170924438753170978) obj2).a.i.c();
                                    r02 = z3;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i3 != size2) {
                                        i3++;
                                        z3 = r02;
                                    }
                                }
                            }
                            u18170924438753170978 = r02;
                        }
                        U18170924438753170978 u181709244387531709783 = u18170924438753170978;
                        return Float.valueOf(u181709244387531709783 != null ? u181709244387531709783.a.i.c() : 0.0f);
                }
            }
        });
        G9912494130141020078 g9912494130141020078 = s165711688580151256102.b;
        M11181104712105445833 m111811047121054458333 = Z15472362586437216226.a;
        ArrayList arrayList = m111811047121054458332.d;
        String str2 = m111811047121054458332.b;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        List W0 = arrayList != null ? R9411874267597469228.W0(arrayList, new J10770752472956524045((byte) 7)) : o2161699089510411363;
        ArrayList arrayList2 = new ArrayList();
        N11678082982039175888 n11678082982039175888 = new N11678082982039175888();
        int size = W0.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            F14378331124810887321 f14378331124810887321 = (F14378331124810887321) W0.get(i3);
            F14378331124810887321 a = F14378331124810887321.a(f14378331124810887321, g9912494130141020078.a((G9912494130141020078) f14378331124810887321.a), b, b, 14);
            Object obj = a.a;
            int i5 = a.c;
            int i6 = a.b;
            while (i4 < i6 && !n11678082982039175888.isEmpty()) {
                F14378331124810887321 f143783311248108873212 = (F14378331124810887321) n11678082982039175888.last();
                List list3 = W0;
                int i7 = f143783311248108873212.c;
                O2161699089510411363 o21616990895104113632 = o2161699089510411363;
                Object obj2 = f143783311248108873212.a;
                if (i6 < i7) {
                    arrayList2.add(new F14378331124810887321(i4, i6, obj2));
                    i4 = i6;
                    W0 = list3;
                    o2161699089510411363 = o21616990895104113632;
                } else {
                    int i8 = size;
                    arrayList2.add(new F14378331124810887321(i4, i7, obj2));
                    i4 = f143783311248108873212.c;
                    while (!n11678082982039175888.isEmpty() && i4 == ((F14378331124810887321) n11678082982039175888.last()).c) {
                        n11678082982039175888.removeLast();
                    }
                    W0 = list3;
                    o2161699089510411363 = o21616990895104113632;
                    size = i8;
                }
            }
            List list4 = W0;
            O2161699089510411363 o21616990895104113633 = o2161699089510411363;
            int i9 = size;
            if (i4 < i6) {
                arrayList2.add(new F14378331124810887321(i4, i6, g9912494130141020078));
                i4 = i6;
            }
            F14378331124810887321 f143783311248108873213 = (F14378331124810887321) n11678082982039175888.l();
            if (f143783311248108873213 != null) {
                int i10 = f143783311248108873213.c;
                Object obj3 = f143783311248108873213.a;
                int i11 = f143783311248108873213.b;
                if (i11 == i6 && i10 == i5) {
                    n11678082982039175888.removeLast();
                    n11678082982039175888.addLast(new F14378331124810887321(i6, i5, ((G9912494130141020078) obj3).a((G9912494130141020078) obj)));
                } else if (i11 == i10) {
                    arrayList2.add(new F14378331124810887321(i11, i10, obj3));
                    n11678082982039175888.removeLast();
                    n11678082982039175888.addLast(new F14378331124810887321(i6, i5, obj));
                } else {
                    if (i10 < i5) {
                        K2042933864045806308.h();
                        throw null;
                    }
                    n11678082982039175888.addLast(new F14378331124810887321(i6, i5, ((G9912494130141020078) obj3).a((G9912494130141020078) obj)));
                }
            } else {
                n11678082982039175888.addLast(new F14378331124810887321(i6, i5, obj));
            }
            i3++;
            W0 = list4;
            o2161699089510411363 = o21616990895104113633;
            size = i9;
            b = 0;
        }
        O2161699089510411363 o21616990895104113634 = o2161699089510411363;
        while (i4 <= str2.length() && !n11678082982039175888.isEmpty()) {
            F14378331124810887321 f143783311248108873214 = (F14378331124810887321) n11678082982039175888.last();
            Object obj4 = f143783311248108873214.a;
            int i12 = f143783311248108873214.c;
            arrayList2.add(new F14378331124810887321(i4, i12, obj4));
            while (!n11678082982039175888.isEmpty() && i12 == ((F14378331124810887321) n11678082982039175888.last()).c) {
                n11678082982039175888.removeLast();
            }
            i4 = i12;
        }
        if (i4 < str2.length()) {
            arrayList2.add(new F14378331124810887321(i4, str2.length(), g9912494130141020078));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new F14378331124810887321(0, 0, g9912494130141020078));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i13 = i;
        while (i13 < size2) {
            F14378331124810887321 f143783311248108873215 = (F14378331124810887321) arrayList2.get(i13);
            int i14 = f143783311248108873215.b;
            int i15 = f143783311248108873215.c;
            String substring = i14 != i15 ? str2.substring(i14, i15) : "";
            List a2 = Z15472362586437216226.a(m111811047121054458332, i14, i15, new M14716691558468128220((byte) 27));
            M11181104712105445833 m111811047121054458334 = new M11181104712105445833(substring, a2 == null ? o21616990895104113634 : a2);
            G9912494130141020078 g99124941301410200782 = (G9912494130141020078) f143783311248108873215.a;
            if (g99124941301410200782.b == 0) {
                str = str2;
                i2 = size2;
                g99124941301410200782 = new G9912494130141020078(g99124941301410200782.a, g9912494130141020078.b, g99124941301410200782.c, g99124941301410200782.d, g99124941301410200782.e, g99124941301410200782.f, g99124941301410200782.g, g99124941301410200782.h, g99124941301410200782.i);
            } else {
                str = str2;
                i2 = size2;
            }
            S16571168858015125610 s165711688580151256103 = new S16571168858015125610(s165711688580151256102.a, g9912494130141020078.a(g99124941301410200782));
            ?? r5 = m111811047121054458334.a;
            O2161699089510411363 o21616990895104113635 = r5 == 0 ? o21616990895104113634 : r5;
            List list5 = (List) this.b;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i16 = 0;
            while (i16 < size3) {
                F14378331124810887321 f143783311248108873216 = (F14378331124810887321) list5.get(i16);
                int i17 = f143783311248108873216.b;
                G9912494130141020078 g99124941301410200783 = g9912494130141020078;
                int i18 = f143783311248108873216.c;
                if (Z15472362586437216226.b(i14, i15, i17, i18)) {
                    if (i14 > i17 || i18 > i15) {
                        T12055643479535528558.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list5;
                    arrayList4.add(new F14378331124810887321(i17 - i14, i18 - i14, f143783311248108873216.a));
                } else {
                    list2 = list5;
                }
                i16++;
                list5 = list2;
                g9912494130141020078 = g99124941301410200783;
            }
            arrayList3.add(new U18170924438753170978(new D417720124633959953(substring, s165711688580151256103, o21616990895104113635, arrayList4, u14340554418656580554, r8540738700654750557, z), i14, i15));
            i13++;
            m111811047121054458332 = m11181104712105445833;
            s165711688580151256102 = s16571168858015125610;
            str2 = str;
            size2 = i2;
        }
        this.e = arrayList3;
    }

    public static I1581330382723795749 f(String str, N17666688112968464504 n17666688112968464504, D14731132657808549702 d14731132657808549702, D14731132657808549702 d147311326578085497022, Integer num) {
        D14731132657808549702 d147311326578085497023 = D14731132657808549702.m0;
        if (num != null && d147311326578085497022 == d147311326578085497023) {
            W4415201450379021245.c("Cannot set idRequirement for OutputPrefixType RAW");
            return null;
        }
        if (num == null && d147311326578085497022 != d147311326578085497023) {
            W4415201450379021245.c("Cannot have null idRequirement unless OutputPrefixType is RAW");
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("typeURL " + str + " contains non-ascii character at position " + i);
            }
        }
        I1581330382723795749 i1581330382723795749 = new I1581330382723795749();
        i1581330382723795749.a = str;
        i1581330382723795749.b = n17666688112968464504;
        i1581330382723795749.c = d14731132657808549702;
        i1581330382723795749.d = d147311326578085497022;
        i1581330382723795749.e = num;
        return i1581330382723795749;
    }

    @Override // dev.epro.r0.P7456194097047421796
    public float a() {
        return ((Number) ((K7493131619793429513) this.c).getValue()).floatValue();
    }

    @Override // dev.epro.r0.P7456194097047421796
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((U18170924438753170978) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.P7456194097047421796
    public float c() {
        return ((Number) ((K7493131619793429513) this.d).getValue()).floatValue();
    }

    public P8628803860726212495 d(D163165075543778664 d163165075543778664, B13729205492206812220 b13729205492206812220) {
        int i;
        int i2;
        int i3;
        A8284336046188466534 a8284336046188466534 = new A8284336046188466534();
        a8284336046188466534.a = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                d163165075543778664.b(th);
                return N5158094851646208854.c;
            }
            X13205888428499400927 x13205888428499400927 = (X13205888428499400927) this.c;
            do {
                i = x13205888428499400927.get();
                i2 = i + 1;
            } while (!x13205888428499400927.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            a8284336046188466534.a = (i2 >>> 27) & 15;
            ((U9803441765912152712) this.d).a(d163165075543778664);
            if (z) {
                try {
                    b13729205492206812220.invoke();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (((Throwable) this.b) == null) {
                                this.b = th2;
                                U9803441765912152712 u9803441765912152712 = (U9803441765912152712) this.d;
                                Object[] objArr = u9803441765912152712.a;
                                int i4 = u9803441765912152712.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((D163165075543778664) objArr[i5]).b(th2);
                                }
                                ((U9803441765912152712) this.d).d();
                                X13205888428499400927 x132058884284994009272 = (X13205888428499400927) this.c;
                                do {
                                    i3 = x132058884284994009272.get();
                                } while (!x132058884284994009272.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new V10300877997588547986(new A7716877927750495196((Object) d163165075543778664, (Object) this, (Object) a8284336046188466534, (byte) 3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi e(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r14 = r2.get(r15)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.k(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I1581330382723795749.e(int):java.text.Bidi");
    }

    public void g(F4096073349764486348 f4096073349764486348) {
        int i;
        synchronized (this.a) {
            try {
                U9803441765912152712 u9803441765912152712 = (U9803441765912152712) this.d;
                this.d = (U9803441765912152712) this.e;
                this.e = u9803441765912152712;
                X13205888428499400927 x13205888428499400927 = (X13205888428499400927) this.c;
                do {
                    i = x13205888428499400927.get();
                } while (!x13205888428499400927.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = u9803441765912152712.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    f4096073349764486348.invoke(u9803441765912152712.f(i3));
                }
                u9803441765912152712.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.K7493131619793429513
    public Object getValue() {
        J14024120050125738337 j14024120050125738337 = (J14024120050125738337) this.e;
        if (j14024120050125738337 != null) {
            return j14024120050125738337;
        }
        L3530692241870850490 l3530692241870850490 = (L3530692241870850490) ((B13729205492206812220) this.b).invoke();
        Q15796038708469204840 q15796038708469204840 = (Q15796038708469204840) ((B13729205492206812220) this.c).invoke();
        L14576235570718031614 l14576235570718031614 = (L14576235570718031614) ((B13729205492206812220) this.d).invoke();
        l3530692241870850490.getClass();
        q15796038708469204840.getClass();
        l14576235570718031614.getClass();
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770(l3530692241870850490, q15796038708469204840, l14576235570718031614);
        V6281043481934004271 v6281043481934004271 = (V6281043481934004271) this.a;
        String b = v6281043481934004271.b();
        if (b == null) {
            S10973172697741180971.j("Local and anonymous classes can not be ViewModels");
            return null;
        }
        J14024120050125738337 L = j15730374346044043770.L(v6281043481934004271, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.e = L;
        return L;
    }

    public float h(int i, boolean z) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float i(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.a;
        if (!z2) {
            return h(i, z);
        }
        int u = V933048422416352811.u(layout, i, z2);
        int lineStart = layout.getLineStart(u);
        int lineEnd = layout.getLineEnd(u);
        if (i != lineStart && i != lineEnd) {
            return h(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return h(i, z);
        }
        int j = j(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(k(j))) == -1;
        int m = m(lineEnd, lineStart);
        int k = k(j);
        int i4 = lineStart - k;
        int i5 = m - k;
        Bidi e = e(j);
        Bidi createLineBidi = e != null ? e.createLineBidi(i4, i5) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(u) : layout.getLineRight(u);
        }
        int runCount = createLineBidi.getRunCount();
        G7496843890255952685[] g7496843890255952685Arr = new G7496843890255952685[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            g7496843890255952685Arr[i6] = new G7496843890255952685(createLineBidi.getRunStart(i6) + lineStart, createLineBidi.getRunLimit(i6) + lineStart, createLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) createLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, g7496843890255952685Arr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (g7496843890255952685Arr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == g7496843890255952685Arr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(u) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(g7496843890255952685Arr[i3 - 1].a) : layout.getPrimaryHorizontal(g7496843890255952685Arr[i3 + 1].a) : layout.getLineRight(u);
        }
        int m2 = i > m ? m(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (g7496843890255952685Arr[i9].b == m2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == g7496843890255952685Arr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(u) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(g7496843890255952685Arr[i2 - 1].b) : layout.getPrimaryHorizontal(g7496843890255952685Arr[i2 + 1].b) : layout.getLineRight(u);
    }

    public int j(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        int t = K5751602218013079365.t(arrayList, Integer.valueOf(i));
        int i2 = t < 0 ? -(t + 1) : t + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int k(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.b).get(i - 1)).intValue();
    }

    public void l(String str, String str2) {
        str2.getClass();
        V14323974914327418545 v14323974914327418545 = (V14323974914327418545) this.c;
        v14323974914327418545.getClass();
        X7410747940286448830.k(str);
        X7410747940286448830.l(str2, str);
        v14323974914327418545.p(str);
        X7410747940286448830.c(v14323974914327418545, str, str2);
    }

    public int m(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.a).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((S10823041268949770285.z(charAt, 8192) < 0 || S10823041268949770285.z(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void n(String str, I11613337141824465265 i11613337141824465265) {
        str.getClass();
        if (str.length() <= 0) {
            S10973172697741180971.j("method.isEmpty() == true");
            return;
        }
        if (i11613337141824465265 == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                S10973172697741180971.i(G6547577305291411977.s("method ", str, " must have a request body."));
                return;
            }
        } else if (!M18113111391818111737.P(str)) {
            S10973172697741180971.i(G6547577305291411977.s("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = i11613337141824465265;
    }

    public void o(String str, Object obj) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        C23081225378374139 c23081225378374139 = (C23081225378374139) ((LinkedHashMap) this.c).get(str);
        if (c23081225378374139 != null) {
            ((S17255966974483065294) c23081225378374139).j(obj);
        }
        C23081225378374139 c230812253783741392 = (C23081225378374139) ((LinkedHashMap) this.d).get(str);
        if (c230812253783741392 != null) {
            ((S17255966974483065294) c230812253783741392).j(obj);
        }
    }

    public void p(String str) {
        str.getClass();
        if (Z13168519540281190457.F(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (Z13168519540281190457.F(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        Z17877815202129479382 z17877815202129479382 = new Z17877815202129479382();
        z17877815202129479382.c(null, str);
        this.a = z17877815202129479382.a();
    }

    public I1581330382723795749(byte b) {
        switch (b) {
            case 5:
                this.e = P2382941533350862833.n;
                this.b = "GET";
                this.c = new V14323974914327418545((byte) 2);
                break;
            default:
                this.a = new Object();
                this.c = new X13205888428499400927(0);
                this.d = new U9803441765912152712();
                this.e = new U9803441765912152712();
                break;
        }
    }

    public I1581330382723795749(V6281043481934004271 v6281043481934004271, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203) {
        this.a = v6281043481934004271;
        this.b = b13729205492206812220;
        this.c = b137292054922068122202;
        this.d = b137292054922068122203;
    }

    public I1581330382723795749(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new N8459270538234465343(this, (byte) 4);
    }
}
