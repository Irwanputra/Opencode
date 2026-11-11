package p034.p086.p091.p093;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1651 {

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1652 extends AbstractC1651 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public double[] f7724;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public double f7725;

        public C1652(double d, double[] dArr) {
            this.f7725 = d;
            this.f7724 = dArr;
        }

        @Override // p034.p086.p091.p093.AbstractC1651
        /* renamed from: 〺つふすそ */
        public double mo3592(double d, int i) {
            return this.f7724[i];
        }

        @Override // p034.p086.p091.p093.AbstractC1651
        /* renamed from: ぁごぐすすぃ */
        public double[] mo3593() {
            return new double[]{this.f7725};
        }

        @Override // p034.p086.p091.p093.AbstractC1651
        /* renamed from: くし〴〺ぅ */
        public void mo3594(double d, double[] dArr) {
            double[] dArr2 = this.f7724;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // p034.p086.p091.p093.AbstractC1651
        /* renamed from: づざかべべ */
        public double mo3595(double d, int i) {
            return 0.0d;
        }

        @Override // p034.p086.p091.p093.AbstractC1651
        /* renamed from: なぎぱいぢぎ */
        public void mo3596(double d, double[] dArr) {
            for (int i = 0; i < this.f7724.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // p034.p086.p091.p093.AbstractC1651
        /* renamed from: びぐびあび */
        public void mo3597(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f7724;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static AbstractC1651 m3591(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        return i != 0 ? i != 2 ? new C1660(dArr, dArr2) : new C1652(dArr[0], dArr2[0]) : new C1658(dArr, dArr2);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public abstract double mo3592(double d, int i);

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public abstract double[] mo3593();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public abstract void mo3594(double d, double[] dArr);

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public abstract double mo3595(double d, int i);

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public abstract void mo3596(double d, double[] dArr);

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public abstract void mo3597(double d, float[] fArr);
}
