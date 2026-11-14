package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G2105242400535572210 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile E8321115364184429049 b = new E8321115364184429049(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c(115, new C13297556694972957023(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c(130, new C13297556694972957023(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c(150, new C13297556694972957023(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c(180, new C13297556694972957023(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c(200, new C13297556694972957023(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.b(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        N17315172036749737048.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static V15138624659649446319 a(float f) {
        float fB;
        V15138624659649446319 c13297556694972957023;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        E8321115364184429049 e8321115364184429049 = b;
        int i = (int) (f * 100.0f);
        e8321115364184429049.getClass();
        V15138624659649446319 v15138624659649446319 = (V15138624659649446319) V1475975160983963926.p(e8321115364184429049, i);
        if (v15138624659649446319 != null) {
            return v15138624659649446319;
        }
        E8321115364184429049 e83211153641844290492 = b;
        if (e83211153641844290492.a) {
            V1475975160983963926.v(e83211153641844290492);
        }
        int iO = I3887072968740112330.o(e83211153641844290492.d, i, e83211153641844290492.b);
        if (iO >= 0) {
            return (V15138624659649446319) b.e(iO);
        }
        int i2 = -(iO + 1);
        int i3 = i2 - 1;
        if (i2 >= b.d()) {
            C13297556694972957023 c132975566949729570232 = new C13297556694972957023(new float[]{1.0f}, new float[]{f});
            b(f, c132975566949729570232);
            return c132975566949729570232;
        }
        if (i3 < 0) {
            c13297556694972957023 = new C13297556694972957023(fArr, fArr);
            fB = 1.0f;
        } else {
            fB = b.b(i3) / 100.0f;
            c13297556694972957023 = (V15138624659649446319) b.e(i3);
        }
        float fB2 = b.b(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fB == fB2 ? 0.0f : (f - fB) / (fB2 - fB))) * 1.0f) + 0.0f;
        V15138624659649446319 v151386246596494463192 = (V15138624659649446319) b.e(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fB3 = c13297556694972957023.b(f2);
            fArr2[i4] = ((v151386246596494463192.b(f2) - fB3) * fMax) + fB3;
        }
        C13297556694972957023 c132975566949729570233 = new C13297556694972957023(fArr, fArr2);
        b(f, c132975566949729570233);
        return c132975566949729570233;
    }

    public static void b(float f, C13297556694972957023 c13297556694972957023) {
        synchronized (c) {
            E8321115364184429049 e8321115364184429049Clone = b.clone();
            e8321115364184429049Clone.c((int) (f * 100.0f), c13297556694972957023);
            b = e8321115364184429049Clone;
        }
    }
}
