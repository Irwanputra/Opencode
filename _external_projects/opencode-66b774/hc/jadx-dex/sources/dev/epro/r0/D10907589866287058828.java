package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D10907589866287058828 extends dev.epro.r0.Y14161449526678499798 implements android.os.Parcelable, dev.epro.r0.H1324395956925527186, dev.epro.r0.T14677607990713025508 {
    public static final android.os.Parcelable.Creator<dev.epro.r0.D10907589866287058828> CREATOR = new dev.epro.r0.A16739659649845694970((byte) 14);
    public dev.epro.r0.Z11696825118607042091 b;

    public D10907589866287058828(long j) {
        dev.epro.r0.M4722199849958580248 m4722199849958580248H = dev.epro.r0.D459204867321966484.h();
        dev.epro.r0.Z11696825118607042091 z11696825118607042091 = new dev.epro.r0.Z11696825118607042091(m4722199849958580248H.g(), j);
        if (!(m4722199849958580248H instanceof dev.epro.r0.J15946920862211647593)) {
            ((dev.epro.r0.T9533098554585011700) z11696825118607042091).b = new dev.epro.r0.Z11696825118607042091(1L, j);
        }
        this.b = z11696825118607042091;
    }

    public final dev.epro.r0.T9533098554585011700 a() {
        return this.b;
    }

    public final dev.epro.r0.T9533098554585011700 b(dev.epro.r0.T9533098554585011700 t9533098554585011700, dev.epro.r0.T9533098554585011700 t95330985545850117002, dev.epro.r0.T9533098554585011700 t95330985545850117003) {
        if (((dev.epro.r0.Z11696825118607042091) t95330985545850117002).c == ((dev.epro.r0.Z11696825118607042091) t95330985545850117003).c) {
            return t95330985545850117002;
        }
        return null;
    }

    public final void c(dev.epro.r0.T9533098554585011700 t9533098554585011700) {
        this.b = (dev.epro.r0.Z11696825118607042091) t9533098554585011700;
    }

    public final dev.epro.r0.L9201360080215238538 d() {
        return dev.epro.r0.B14824868959299866349.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return dev.epro.r0.D459204867321966484.s(this.b, this).c;
    }

    public final void h(long j) {
        dev.epro.r0.M4722199849958580248 m4722199849958580248H;
        dev.epro.r0.Z11696825118607042091 z11696825118607042091F = dev.epro.r0.D459204867321966484.f(this.b);
        if (z11696825118607042091F.c != j) {
            dev.epro.r0.Z11696825118607042091 z11696825118607042091 = this.b;
            synchronized (dev.epro.r0.D459204867321966484.c) {
                m4722199849958580248H = dev.epro.r0.D459204867321966484.h();
                dev.epro.r0.D459204867321966484.n(z11696825118607042091, this, m4722199849958580248H, z11696825118607042091F).c = j;
            }
            dev.epro.r0.D459204867321966484.l(m4722199849958580248H, this);
        }
    }

    public final java.lang.String toString() {
        return "MutableLongState(value=" + dev.epro.r0.D459204867321966484.f(this.b).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(g());
    }
}
