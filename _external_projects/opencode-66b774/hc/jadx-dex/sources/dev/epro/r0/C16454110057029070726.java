package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C16454110057029070726 implements dev.epro.r0.Y3341182438442346389 {
    public final dev.epro.r0.E890218321994133736 a;
    public final dev.epro.r0.R1604357493379982192 b;
    public final dev.epro.r0.N11883436969612056524 c;

    public C16454110057029070726(dev.epro.r0.R1604357493379982192 r1604357493379982192, dev.epro.r0.N11883436969612056524 n11883436969612056524, dev.epro.r0.E890218321994133736 e890218321994133736) {
        this.b = r1604357493379982192;
        n11883436969612056524.getClass();
        this.c = n11883436969612056524;
        this.a = e890218321994133736;
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        dev.epro.r0.W3646014350333091735.k(this.b, obj, obj2);
    }

    public final void b(java.lang.Object obj) {
        this.b.getClass();
        dev.epro.r0.C10101319439186475078 c10101319439186475078 = ((dev.epro.r0.Z14368087615735085238) obj).unknownFields;
        if (c10101319439186475078.e) {
            c10101319439186475078.e = false;
        }
        this.c.getClass();
        dev.epro.r0.L11610354117192841236.y(obj);
        throw null;
    }

    public final boolean c(java.lang.Object obj) {
        this.c.getClass();
        dev.epro.r0.L11610354117192841236.y(obj);
        throw null;
    }

    public final java.lang.Object d() {
        dev.epro.r0.Z14368087615735085238 z14368087615735085238 = this.a;
        return z14368087615735085238 instanceof dev.epro.r0.Z14368087615735085238 ? z14368087615735085238.r() : z14368087615735085238.d().c();
    }

    public final boolean e(dev.epro.r0.Z14368087615735085238 z14368087615735085238, dev.epro.r0.Z14368087615735085238 z143680876157350852382) {
        this.b.getClass();
        return z14368087615735085238.unknownFields.equals(z143680876157350852382.unknownFields);
    }

    public final int f(dev.epro.r0.Z14368087615735085238 z14368087615735085238) {
        this.b.getClass();
        return z14368087615735085238.unknownFields.hashCode();
    }

    public final void g(java.lang.Object obj, dev.epro.r0.E17564419012940707302 e17564419012940707302, dev.epro.r0.R4931231174251890987 r4931231174251890987) {
        this.b.getClass();
        dev.epro.r0.R1604357493379982192.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new java.lang.ClassCastException();
    }

    public final void h(java.lang.Object obj, dev.epro.r0.H12843822278061842084 h12843822278061842084) {
        this.c.getClass();
        dev.epro.r0.L11610354117192841236.y(obj);
        throw null;
    }

    public final int i(dev.epro.r0.Z14368087615735085238 z14368087615735085238) {
        this.b.getClass();
        dev.epro.r0.C10101319439186475078 c10101319439186475078 = z14368087615735085238.unknownFields;
        int i = c10101319439186475078.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < c10101319439186475078.a; i2++) {
            int i3 = c10101319439186475078.b[i2] >>> 3;
            iA += dev.epro.r0.A5011514514014580540.a(3, (dev.epro.r0.N17666688112968464504) c10101319439186475078.c[i2]) + dev.epro.r0.A5011514514014580540.f(i3) + dev.epro.r0.A5011514514014580540.e(2) + (dev.epro.r0.A5011514514014580540.e(1) * 2);
        }
        c10101319439186475078.d = iA;
        return iA;
    }

    public final void j(java.lang.Object obj, byte[] bArr, int i, int i2, dev.epro.r0.D15735805680132151670 d15735805680132151670) {
        dev.epro.r0.Z14368087615735085238 z14368087615735085238 = (dev.epro.r0.Z14368087615735085238) obj;
        if (z14368087615735085238.unknownFields == dev.epro.r0.C10101319439186475078.f) {
            z14368087615735085238.unknownFields = dev.epro.r0.C10101319439186475078.c();
        }
        throw dev.epro.r0.G6547577305291411977.m(obj);
    }
}
