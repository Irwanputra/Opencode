package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P6024466796603310388 extends Y14161449526678499798 implements Parcelable, P8304175601464238421, T14677607990713025508 {
    public static final Parcelable.Creator<P6024466796603310388> CREATOR = new A16739659649845694970((byte) 13);
    public K8032392256333695657 b;

    public P6024466796603310388(int i) {
        M4722199849958580248 h = D459204867321966484.h();
        K8032392256333695657 k8032392256333695657 = new K8032392256333695657(h.g(), i);
        if (!(h instanceof J15946920862211647593)) {
            k8032392256333695657.b = new K8032392256333695657(1L, i);
        }
        this.b = k8032392256333695657;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final T9533098554585011700 a() {
        return this.b;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final T9533098554585011700 b(T9533098554585011700 t9533098554585011700, T9533098554585011700 t95330985545850117002, T9533098554585011700 t95330985545850117003) {
        if (((K8032392256333695657) t95330985545850117002).c == ((K8032392256333695657) t95330985545850117003).c) {
            return t95330985545850117002;
        }
        return null;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final void c(T9533098554585011700 t9533098554585011700) {
        this.b = (K8032392256333695657) t9533098554585011700;
    }

    @Override // dev.epro.r0.T14677607990713025508
    public final L9201360080215238538 d() {
        return B14824868959299866349.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((K8032392256333695657) D459204867321966484.s(this.b, this)).c;
    }

    public final void h(int i) {
        M4722199849958580248 h;
        K8032392256333695657 k8032392256333695657 = (K8032392256333695657) D459204867321966484.f(this.b);
        if (k8032392256333695657.c != i) {
            K8032392256333695657 k80323922563336956572 = this.b;
            synchronized (D459204867321966484.c) {
                h = D459204867321966484.h();
                ((K8032392256333695657) D459204867321966484.n(k80323922563336956572, this, h, k8032392256333695657)).c = i;
            }
            D459204867321966484.l(h, this);
        }
    }

    public final String toString() {
        return E12098517352909843120.l("MutableIntState(value=", ((K8032392256333695657) D459204867321966484.f(this.b)).c, hashCode(), ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
