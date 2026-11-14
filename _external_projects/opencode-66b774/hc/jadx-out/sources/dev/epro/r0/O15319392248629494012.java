package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O15319392248629494012 extends Y14161449526678499798 implements Parcelable, L13471809889507924345, T14677607990713025508 {
    public static final Parcelable.Creator<O15319392248629494012> CREATOR = new A16739659649845694970((byte) 12);
    public A3584731475624905703 b;

    public O15319392248629494012(float f) {
        M4722199849958580248 m4722199849958580248H = D459204867321966484.h();
        A3584731475624905703 a3584731475624905703 = new A3584731475624905703(f, m4722199849958580248H.g());
        if (!(m4722199849958580248H instanceof J15946920862211647593)) {
            a3584731475624905703.b = new A3584731475624905703(f, 1L);
        }
        this.b = a3584731475624905703;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final T9533098554585011700 a() {
        return this.b;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final T9533098554585011700 b(T9533098554585011700 t9533098554585011700, T9533098554585011700 t95330985545850117002, T9533098554585011700 t95330985545850117003) {
        if (((A3584731475624905703) t95330985545850117002).c == ((A3584731475624905703) t95330985545850117003).c) {
            return t95330985545850117002;
        }
        return null;
    }

    @Override // dev.epro.r0.O13595511762861117873
    public final void c(T9533098554585011700 t9533098554585011700) {
        this.b = (A3584731475624905703) t9533098554585011700;
    }

    @Override // dev.epro.r0.T14677607990713025508
    public final L9201360080215238538 d() {
        return B14824868959299866349.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((A3584731475624905703) D459204867321966484.s(this.b, this)).c;
    }

    public final void h(float f) {
        M4722199849958580248 m4722199849958580248H;
        A3584731475624905703 a3584731475624905703 = (A3584731475624905703) D459204867321966484.f(this.b);
        if (a3584731475624905703.c == f) {
            return;
        }
        A3584731475624905703 a35847314756249057032 = this.b;
        synchronized (D459204867321966484.c) {
            m4722199849958580248H = D459204867321966484.h();
            ((A3584731475624905703) D459204867321966484.n(a35847314756249057032, this, m4722199849958580248H, a3584731475624905703)).c = f;
        }
        D459204867321966484.l(m4722199849958580248H, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((A3584731475624905703) D459204867321966484.f(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
