package p034.p035.p043.p044;

import java.util.List;

/* renamed from: づざかべべ.〳ぜぞぜべっ.なぎぱいぢぎ.〺つふすそ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1065 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final float[] f5519;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int[] f5520;

    public C1065(int i, int i2) {
        this.f5520 = new int[]{i, i2};
        this.f5519 = new float[]{0.0f, 1.0f};
    }

    public C1065(int i, int i2, int i3) {
        this.f5520 = new int[]{i, i2, i3};
        this.f5519 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C1065(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f5520 = new int[size];
        this.f5519 = new float[size];
        for (int i = 0; i < size; i++) {
            this.f5520[i] = list.get(i).intValue();
            this.f5519[i] = list2.get(i).floatValue();
        }
    }
}
