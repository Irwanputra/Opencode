package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y8977694405572177188 implements F4096073349764486348 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ Y8977694405572177188(P8646985343900033725 p8646985343900033725, C10288805116980491173 c10288805116980491173, int i, int i2, F4096073349764486348 f4096073349764486348, R14253319523827250490 r14253319523827250490, I8721020176854850835 i8721020176854850835) {
        this.d = p8646985343900033725;
        this.e = c10288805116980491173;
        this.b = i;
        this.c = i2;
        this.f = f4096073349764486348;
        this.g = r14253319523827250490;
        this.h = i8721020176854850835;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        int size;
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        int i = 0;
        switch (b) {
            case 0:
                P8646985343900033725 p8646985343900033725 = (P8646985343900033725) obj6;
                C10288805116980491173 c10288805116980491173 = (C10288805116980491173) obj5;
                F4096073349764486348 f4096073349764486348 = (F4096073349764486348) obj4;
                R14253319523827250490 r14253319523827250490 = (R14253319523827250490) obj3;
                I8721020176854850835 i8721020176854850835 = (I8721020176854850835) obj2;
                V16530418555304444393 v16530418555304444393 = (V16530418555304444393) obj;
                p8646985343900033725.getClass();
                if (p8646985343900033725 instanceof Collection) {
                    size = ((Collection) p8646985343900033725).size();
                } else {
                    Iterator it = p8646985343900033725.iterator();
                    while (((M18282718993909554674) it).c) {
                        ((B16024634506412482045) it).next();
                        i++;
                        if (i < 0) {
                            K5751602218013079365.e0();
                            throw null;
                        }
                    }
                    size = i;
                }
                v16530418555304444393.k.b(size, new L13421819325995458414(null, V16530418555304444393.l, C9244826096114317613.e, new T15443218846549482730(674613074, true, new P11333444632510140647(p8646985343900033725, c10288805116980491173, this.b, this.c, f4096073349764486348, r14253319523827250490, i8721020176854850835))));
                return o9245300239821758723;
            default:
                Z17471428274427141949 z17471428274427141949 = (Z17471428274427141949) obj6;
                Z17471428274427141949 z174714282744271419492 = (Z17471428274427141949) obj5;
                I5164649337253478959 i5164649337253478959 = (I5164649337253478959) obj4;
                Integer num = (Integer) obj3;
                Integer num2 = (Integer) obj2;
                Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj;
                int i2 = this.c;
                if (z17471428274427141949 != null && z174714282744271419492 != null) {
                    num.getClass();
                    int iIntValue = num.intValue();
                    num2.getClass();
                    int iIntValue2 = num2.intValue();
                    int iG0 = i5164649337253478959.g0(C16471169571614918912.b) + i5164649337253478959.g0(iIntValue == iIntValue2 ? F9678537450618663970.c : F9678537450618663970.d);
                    int iX = (i5164649337253478959.X(F9678537450618663970.e) + z174714282744271419492.b) - iIntValue;
                    int i3 = z17471428274427141949.a;
                    int i4 = this.b;
                    int i5 = (i2 - iIntValue2) - iG0;
                    Y2066038017114788875.j(y2066038017114788875, z17471428274427141949, (i4 - i3) / 2, i5);
                    Y2066038017114788875.j(y2066038017114788875, z174714282744271419492, (i4 - z174714282744271419492.a) / 2, i5 - iX);
                } else if (z17471428274427141949 != null) {
                    float f = F9678537450618663970.a;
                    Y2066038017114788875.j(y2066038017114788875, z17471428274427141949, 0, (i2 - z17471428274427141949.b) / 2);
                } else if (z174714282744271419492 != null) {
                    float f2 = F9678537450618663970.a;
                    Y2066038017114788875.j(y2066038017114788875, z174714282744271419492, 0, (i2 - z174714282744271419492.b) / 2);
                }
                return o9245300239821758723;
        }
    }

    public /* synthetic */ Y8977694405572177188(Z17471428274427141949 z17471428274427141949, Z17471428274427141949 z174714282744271419492, I5164649337253478959 i5164649337253478959, int i, int i2, Integer num, Integer num2) {
        this.d = z17471428274427141949;
        this.e = z174714282744271419492;
        this.f = i5164649337253478959;
        this.b = i;
        this.c = i2;
        this.g = num;
        this.h = num2;
    }
}
