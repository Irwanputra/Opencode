package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U10812473741286294883 {
    public final H468557734500664188 a;
    public final H7219028874700587498 b;

    public U10812473741286294883(H468557734500664188 h468557734500664188, H7219028874700587498 h7219028874700587498) {
        this.a = h468557734500664188;
        this.b = h7219028874700587498;
    }

    public final String toString() {
        H7219028874700587498 h7219028874700587498 = this.b;
        String str = ((N14854071629268978730) h7219028874700587498.e.get(N14854071629268978730.b)) != null ? "Room Invalidation Tracker Refresh" : null;
        int iHashCode = hashCode();
        M9216324016624295870.q(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "Request@" + string + (str != null ? G6547577305291411977.s("[", str, "](") : "(") + "currentBounds()=" + this.a.invoke() + ", continuation=" + h7219028874700587498 + ")";
    }
}
