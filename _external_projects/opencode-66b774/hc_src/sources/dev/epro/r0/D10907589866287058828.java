package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D10907589866287058828 extends Y14161449526678499798 implements Parcelable, H1324395956925527186, T14677607990713025508 {
    public static final Parcelable.Creator<D10907589866287058828> CREATOR = new A16739659649845694970((byte) 14);
    public Z11696825118607042091 b;

    public D10907589866287058828(long j) {
        M4722199849958580248 h = D459204867321966484.h();
        Z11696825118607042091 z11696825118607042091 = new Z11696825118607042091(h.g(), j);
        if (!(h instanceof J15946920862211647593)) {
            z11696825118607042091.b = new Z11696825118607042091(1L, j);
        }
        this.b = z11696825118607042091;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final T9533098554585011700 a() {
        return this.b;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final T9533098554585011700 b(T9533098554585011700 t9533098554585011700, T9533098554585011700 t95330985545850117002, T9533098554585011700 t95330985545850117003) {
        if (((Z11696825118607042091) t95330985545850117002).c == ((Z11696825118607042091) t95330985545850117003).c) {
            return t95330985545850117002;
        }
        return null;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final void c(T9533098554585011700 t9533098554585011700) {
        this.b = (Z11696825118607042091) t9533098554585011700;
    }

    @Override // dev.epro.r0.T14677607990713025508
    public final L9201360080215238538 d() {
        return B14824868959299866349.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return ((Z11696825118607042091) D459204867321966484.s(this.b, this)).c;
    }

    public final void h(long j) {
        M4722199849958580248 h;
        Z11696825118607042091 z11696825118607042091 = (Z11696825118607042091) D459204867321966484.f(this.b);
        if (z11696825118607042091.c != j) {
            Z11696825118607042091 z116968251186070420912 = this.b;
            synchronized (D459204867321966484.c) {
                h = D459204867321966484.h();
                ((Z11696825118607042091) D459204867321966484.n(z116968251186070420912, this, h, z11696825118607042091)).c = j;
            }
            D459204867321966484.l(h, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((Z11696825118607042091) D459204867321966484.f(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(g());
    }
}
