package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q17593287602150918564 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final L3121857888946036087 j;
    public boolean k;

    public Q17593287602150918564(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? U10174709222559481877.h : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        L3121857888946036087 l3121857888946036087 = new L3121857888946036087(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = l3121857888946036087;
        arrayList.add(l3121857888946036087);
    }

    public static void a(Q17593287602150918564 q17593287602150918564, List list, H10765568533039107979 h10765568533039107979, H10765568533039107979 h107655685330391079792, float f, int i) {
        int i2;
        if ((i & 2) != 0) {
            int i3 = A5540824790408504619.a;
        }
        H10765568533039107979 h107655685330391079793 = (i & 32) != 0 ? null : h107655685330391079792;
        float f2 = (i & 128) != 0 ? 0.0f : f;
        if ((i & 256) != 0) {
            int i4 = A5540824790408504619.a;
        }
        if ((i & 512) != 0) {
            int i5 = A5540824790408504619.a;
            i2 = 0;
        } else {
            i2 = 2;
        }
        int i6 = i2;
        float f3 = (i & 1024) != 0 ? 4.0f : 1.0f;
        if (q17593287602150918564.k) {
            P753981624812481271.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((L3121857888946036087) q17593287602150918564.i.get(r0.size() - 1)).j.add(new B17541588548501223042("", list, 0, h10765568533039107979, 1.0f, h107655685330391079793, 1.0f, f2, 0, i6, f3, 0.0f, 1.0f, 0.0f));
    }

    public final Z7022156542152740569 b() {
        if (this.k) {
            P753981624812481271.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                L3121857888946036087 l3121857888946036087 = this.j;
                Z7022156542152740569 z7022156542152740569 = new Z7022156542152740569(this.a, this.b, this.c, this.d, this.e, new A9257386642212911937(l3121857888946036087.a, l3121857888946036087.b, l3121857888946036087.c, l3121857888946036087.d, l3121857888946036087.e, l3121857888946036087.f, l3121857888946036087.g, l3121857888946036087.h, l3121857888946036087.i, l3121857888946036087.j), this.f, this.g, this.h);
                this.k = true;
                return z7022156542152740569;
            }
            if (this.k) {
                P753981624812481271.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            L3121857888946036087 l31218578889460360872 = (L3121857888946036087) arrayList.remove(arrayList.size() - 1);
            ((L3121857888946036087) arrayList.get(arrayList.size() - 1)).j.add(new A9257386642212911937(l31218578889460360872.a, l31218578889460360872.b, l31218578889460360872.c, l31218578889460360872.d, l31218578889460360872.e, l31218578889460360872.f, l31218578889460360872.g, l31218578889460360872.h, l31218578889460360872.i, l31218578889460360872.j));
        }
    }
}
