package dev.epro.r0;

import java.util.Comparator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class M5459415309190684092 implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ M5459415309190684092(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return S10823041268949770285.z(((Q4498434392846071086) obj2).a ? 1 : 0, ((Q4498434392846071086) obj).a ? 1 : 0);
            case 1:
                return Integer.compare(((S10055171720181493248) obj).a.a, ((S10055171720181493248) obj2).a.a);
            case 2:
                return ((N6991946250244024627) obj).b.index() - ((N6991946250244024627) obj2).b.index();
            case 3:
                return ((K16124730071979655029) obj).c.index() - ((K16124730071979655029) obj2).c.index();
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 5:
                return S10823041268949770285.z(((O740537273435134204) obj).b, ((O740537273435134204) obj2).b);
            case 6:
                P8646985343900033725 p8646985343900033725 = (P8646985343900033725) obj;
                P8646985343900033725 p86469853439000337252 = (P8646985343900033725) obj2;
                return (p8646985343900033725.b - p8646985343900033725.a) - (p86469853439000337252.b - p86469853439000337252.a);
            case 7:
                H11725168162114556860 h11725168162114556860 = (H11725168162114556860) obj;
                H11725168162114556860 h117251681621145568602 = (H11725168162114556860) obj2;
                float f = h11725168162114556860.G.p.F;
                float f2 = h117251681621145568602.G.p.F;
                return f == f2 ? S10823041268949770285.z(h11725168162114556860.v(), h117251681621145568602.v()) : Float.compare(f, f2);
            case 8:
                return S10823041268949770285.z(((I6148490667470006645) obj).getIndex(), ((I6148490667470006645) obj2).getIndex());
            case 9:
                return ((Number) E4662066703278899418.b.invoke(obj, obj2)).intValue();
            default:
                return ((Double) obj).compareTo((Double) obj2);
        }
    }
}
