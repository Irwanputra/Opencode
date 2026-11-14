package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C16454110057029070726 implements Y3341182438442346389 {
    public final E890218321994133736 a;
    public final R1604357493379982192 b;
    public final N11883436969612056524 c;

    public C16454110057029070726(R1604357493379982192 r1604357493379982192, N11883436969612056524 n11883436969612056524, E890218321994133736 e890218321994133736) {
        this.b = r1604357493379982192;
        n11883436969612056524.getClass();
        this.c = n11883436969612056524;
        this.a = e890218321994133736;
    }

    @Override // dev.epro.r0.Y3341182438442346389
    public final void a(Object obj, Object obj2) {
        W3646014350333091735.k(this.b, obj, obj2);
    }

    @Override // dev.epro.r0.Y3341182438442346389
    public final void b(Object obj) {
        this.b.getClass();
        C10101319439186475078 c10101319439186475078 = ((Z14368087615735085238) obj).unknownFields;
        if (c10101319439186475078.e) {
            c10101319439186475078.e = false;
        }
        this.c.getClass();
        L11610354117192841236.y(obj);
        throw null;
    }

    @Override // dev.epro.r0.Y3341182438442346389
    public final boolean c(Object obj) {
        this.c.getClass();
        L11610354117192841236.y(obj);
        throw null;
    }

    @Override // dev.epro.r0.Y3341182438442346389
    public final Object d() {
        E890218321994133736 e890218321994133736 = this.a;
        return e890218321994133736 instanceof Z14368087615735085238 ? ((Z14368087615735085238) e890218321994133736).r() : e890218321994133736.d().c();
    }

    @Override // dev.epro.r0.Y3341182438442346389
    public final boolean e(Z14368087615735085238 z14368087615735085238, Z14368087615735085238 z143680876157350852382) {
        this.b.getClass();
        return z14368087615735085238.unknownFields.equals(z143680876157350852382.unknownFields);
    }

    @Override // dev.epro.r0.Y3341182438442346389
    public final int f(Z14368087615735085238 z14368087615735085238) {
        this.b.getClass();
        return z14368087615735085238.unknownFields.hashCode();
    }

    @Override // dev.epro.r0.Y3341182438442346389
    public final void g(Object obj, E17564419012940707302 e17564419012940707302, R4931231174251890987 r4931231174251890987) {
        this.b.getClass();
        R1604357493379982192.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // dev.epro.r0.Y3341182438442346389
    public final void h(Object obj, H12843822278061842084 h12843822278061842084) {
        this.c.getClass();
        L11610354117192841236.y(obj);
        throw null;
    }

    @Override // dev.epro.r0.Y3341182438442346389
    public final int i(Z14368087615735085238 z14368087615735085238) {
        this.b.getClass();
        C10101319439186475078 c10101319439186475078 = z14368087615735085238.unknownFields;
        int i = c10101319439186475078.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < c10101319439186475078.a; i3++) {
            int i4 = c10101319439186475078.b[i3] >>> 3;
            i2 += A5011514514014580540.a(3, (N17666688112968464504) c10101319439186475078.c[i3]) + A5011514514014580540.f(i4) + A5011514514014580540.e(2) + (A5011514514014580540.e(1) * 2);
        }
        c10101319439186475078.d = i2;
        return i2;
    }

    @Override // dev.epro.r0.Y3341182438442346389
    public final void j(Object obj, byte[] bArr, int i, int i2, D15735805680132151670 d15735805680132151670) {
        Z14368087615735085238 z14368087615735085238 = (Z14368087615735085238) obj;
        if (z14368087615735085238.unknownFields == C10101319439186475078.f) {
            z14368087615735085238.unknownFields = C10101319439186475078.c();
        }
        throw G6547577305291411977.m(obj);
    }
}
