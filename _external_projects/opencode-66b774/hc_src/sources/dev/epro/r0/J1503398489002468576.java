package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J1503398489002468576 extends J13319129656433893658 {
    public final transient int f;
    public final transient int g;
    public final /* synthetic */ J13319129656433893658 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1503398489002468576(J13319129656433893658 j13319129656433893658, int i, int i2) {
        super((byte) 2);
        this.h = j13319129656433893658;
        this.f = i;
        this.g = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        P1789376955961125859.m(i, this.g);
        return this.h.get(i + this.f);
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int k() {
        return this.h.m() + this.f + this.g;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int m() {
        return this.h.m() + this.f;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final Object[] o() {
        return this.h.o();
    }

    @Override // dev.epro.r0.J13319129656433893658, java.util.List
    /* renamed from: q */
    public final J13319129656433893658 subList(int i, int i2) {
        P1789376955961125859.o(i, i2, this.g);
        int i3 = this.f;
        return this.h.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
