package dev.epro.r0;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J15465836106018140777 extends F3160751278268780235 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ ViewGroup d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J15465836106018140777(ViewGroup viewGroup, byte b) {
        super(1);
        this.c = b;
        this.d = viewGroup;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final N3121440022506799205 f(N3121440022506799205 n3121440022506799205, List list) {
        byte b = this.c;
        ViewGroup viewGroup = this.d;
        switch (b) {
            case 0:
                return ((E3889562084885881810) viewGroup).k(n3121440022506799205);
            default:
                D16659454241982226004 d16659454241982226004 = (D16659454241982226004) viewGroup;
                if (d16659454241982226004.m) {
                    return n3121440022506799205;
                }
                View childAt = d16659454241982226004.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, d16659454241982226004.getWidth() - childAt.getRight());
                int max4 = Math.max(0, d16659454241982226004.getHeight() - childAt.getBottom());
                return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? n3121440022506799205 : n3121440022506799205.a.r(max, max2, max3, max4);
        }
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final V10300877997588547986 g(Q12598757537405990809 q12598757537405990809, V10300877997588547986 v10300877997588547986) {
        byte b = this.c;
        ViewGroup viewGroup = this.d;
        switch (b) {
            case 0:
                I16141028645763443416 i16141028645763443416 = (I16141028645763443416) ((E3889562084885881810) viewGroup).z.F.d;
                if (!i16141028645763443416.c0.n) {
                    return v10300877997588547986;
                }
                long O = V1475975160983963926.O(i16141028645763443416.O(0L));
                int i = (int) (O >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (O & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long N = V12319504402545346730.z(i16141028645763443416).N();
                int i3 = (int) (N >> 32);
                int i4 = (int) (N & 4294967295L);
                long j = i16141028645763443416.c;
                long O2 = V1475975160983963926.O(i16141028645763443416.O((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i5 = i3 - ((int) (O2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (O2 & 4294967295L));
                int i7 = i6 >= 0 ? i6 : 0;
                return (i == 0 && i2 == 0 && i5 == 0 && i7 == 0) ? v10300877997588547986 : new V10300877997588547986(N5230833122018532994.j((Z1975157152518754667) v10300877997588547986.b, i, i2, i5, i7), N5230833122018532994.j((Z1975157152518754667) v10300877997588547986.c, i, i2, i5, i7), (byte) 29);
            default:
                D16659454241982226004 d16659454241982226004 = (D16659454241982226004) viewGroup;
                if (d16659454241982226004.m) {
                    return v10300877997588547986;
                }
                View childAt = d16659454241982226004.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, d16659454241982226004.getWidth() - childAt.getRight());
                int max4 = Math.max(0, d16659454241982226004.getHeight() - childAt.getBottom());
                if (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) {
                    return v10300877997588547986;
                }
                Z1975157152518754667 b2 = Z1975157152518754667.b(max, max2, max3, max4);
                int i8 = b2.a;
                Z1975157152518754667 z1975157152518754667 = (Z1975157152518754667) v10300877997588547986.b;
                int i9 = b2.b;
                int i10 = b2.c;
                int i11 = b2.d;
                return new V10300877997588547986(N3121440022506799205.a(z1975157152518754667, i8, i9, i10, i11), N3121440022506799205.a((Z1975157152518754667) v10300877997588547986.c, i8, i9, i10, i11), (byte) 29);
        }
    }
}
