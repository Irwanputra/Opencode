package dev.epro.r0;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K15572083692188606544 {
    public K15572083692188606544 a() {
        return Y12917327898100101934.a;
    }

    public boolean b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final P16422848101170923038 k() {
        if (this instanceof P16422848101170923038) {
            return (P16422848101170923038) this;
        }
        Q11088980322693754445.m("Not a JSON Array: ", this);
        return null;
    }

    public final I16631908410500040363 l() {
        if (this instanceof I16631908410500040363) {
            return (I16631908410500040363) this;
        }
        Q11088980322693754445.m("Not a JSON Object: ", this);
        return null;
    }

    public final D16457379462628768197 m() {
        if (this instanceof D16457379462628768197) {
            return (D16457379462628768197) this;
        }
        Q11088980322693754445.m("Not a JSON Primitive: ", this);
        return null;
    }

    public long n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number o() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            Y14132333989764804283 y14132333989764804283 = new Y14132333989764804283(new R1620071977321010765(sb));
            y14132333989764804283.h = 1;
            B14764642315028140130 b14764642315028140130 = Q2123592735363394013.z;
            b14764642315028140130.getClass();
            b14764642315028140130.c(this, y14132333989764804283);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
