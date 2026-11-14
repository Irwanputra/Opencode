package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V697849047308847220 extends Y14161449526678499798 implements Parcelable, T14677607990713025508 {
    public static final Parcelable.Creator<V697849047308847220> CREATOR = new P18169153813687183597(0);
    public final L9201360080215238538 b;
    public L13621891909849861861 c;

    public V697849047308847220(Object obj, L9201360080215238538 l9201360080215238538) {
        this.b = l9201360080215238538;
        M4722199849958580248 h = D459204867321966484.h();
        L13621891909849861861 l13621891909849861861 = new L13621891909849861861(h.g(), obj);
        if (!(h instanceof J15946920862211647593)) {
            l13621891909849861861.b = new L13621891909849861861(1L, obj);
        }
        this.c = l13621891909849861861;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final T9533098554585011700 a() {
        return this.c;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final T9533098554585011700 b(T9533098554585011700 t9533098554585011700, T9533098554585011700 t95330985545850117002, T9533098554585011700 t95330985545850117003) {
        if (this.b.a(((L13621891909849861861) t95330985545850117002).c, ((L13621891909849861861) t95330985545850117003).c)) {
            return t95330985545850117002;
        }
        return null;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final void c(T9533098554585011700 t9533098554585011700) {
        this.c = (L13621891909849861861) t9533098554585011700;
    }

    @Override // dev.epro.r0.T14677607990713025508
    public final L9201360080215238538 d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // dev.epro.r0.L13148442655056575112
    public final Object getValue() {
        return ((L13621891909849861861) D459204867321966484.s(this.c, this)).c;
    }

    @Override // dev.epro.r0.W1972671267364756056
    public final void setValue(Object obj) {
        M4722199849958580248 h;
        L13621891909849861861 l13621891909849861861 = (L13621891909849861861) D459204867321966484.f(this.c);
        if (this.b.a(l13621891909849861861.c, obj)) {
            return;
        }
        L13621891909849861861 l136218919098498618612 = this.c;
        synchronized (D459204867321966484.c) {
            h = D459204867321966484.h();
            ((L13621891909849861861) D459204867321966484.n(l136218919098498618612, this, h, l13621891909849861861)).c = obj;
        }
        D459204867321966484.l(h, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((L13621891909849861861) D459204867321966484.f(this.c)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        B14824868959299866349 b14824868959299866349 = B14824868959299866349.k;
        L9201360080215238538 l9201360080215238538 = this.b;
        if (l9201360080215238538.equals(b14824868959299866349)) {
            i2 = 0;
        } else if (l9201360080215238538.equals(B14824868959299866349.s)) {
            i2 = 1;
        } else {
            if (!l9201360080215238538.equals(B14824868959299866349.m)) {
                S10973172697741180971.m("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
