package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J15264501749816156841 implements N12402914283838705413 {
    public final int a;
    public final int b;
    public final J6301524036964264730 c;

    public J15264501749816156841(int i, J6301524036964264730 j6301524036964264730, int i2) {
        this(i, 0, (i2 & 4) != 0 ? W10816543021280842737.a : j6301524036964264730);
    }

    @Override // dev.epro.r0.M15459437176959963354
    public final V9266657454036696449 a(R3937090736490516115 r3937090736490516115) {
        return new Y16414919402539525744(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J15264501749816156841) {
            J15264501749816156841 j15264501749816156841 = (J15264501749816156841) obj;
            if (j15264501749816156841.a == this.a && j15264501749816156841.b == this.b && S10823041268949770285.t(j15264501749816156841.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    public J15264501749816156841(int i, int i2, J6301524036964264730 j6301524036964264730) {
        this.a = i;
        this.b = i2;
        this.c = j6301524036964264730;
    }

    @Override // dev.epro.r0.N12402914283838705413, dev.epro.r0.M15459437176959963354
    public final H3517214926285464793 a(R3937090736490516115 r3937090736490516115) {
        return new Y16414919402539525744(this.a, this.b, this.c);
    }
}
