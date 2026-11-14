package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B6047434429717167341 extends C12135989508407940960 {
    public final transient int f;
    public final transient int g;
    public final /* synthetic */ C12135989508407940960 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B6047434429717167341(C12135989508407940960 c12135989508407940960, int i, int i2) {
        super((byte) 0);
        this.h = c12135989508407940960;
        this.f = i;
        this.g = i2;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int b() {
        return this.h.c() + this.f + this.g;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int c() {
        return this.h.c() + this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        E2166724654553415323.d(i, this.g);
        return this.h.get(i + this.f);
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final Object[] i() {
        return this.h.i();
    }

    @Override // dev.epro.r0.C12135989508407940960, java.util.List
    /* JADX INFO: renamed from: q */
    public final C12135989508407940960 subList(int i, int i2) {
        E2166724654553415323.h(i, i2, this.g);
        int i3 = this.f;
        return this.h.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
