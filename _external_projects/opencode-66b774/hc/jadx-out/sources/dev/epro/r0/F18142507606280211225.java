package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F18142507606280211225 {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ F9886074403848142923 d;

    public F18142507606280211225(F9886074403848142923 f9886074403848142923) {
        this.d = f9886074403848142923;
    }

    public final void a(float f, float f2) {
        F9886074403848142923 f9886074403848142923 = this.d;
        V697849047308847220 v697849047308847220 = f9886074403848142923.c;
        O15319392248629494012 o15319392248629494012 = f9886074403848142923.f;
        float fG = o15319392248629494012.g();
        o15319392248629494012.h(f);
        f9886074403848142923.g.h(f2);
        if (Float.isNaN(fG)) {
            return;
        }
        boolean z = f >= fG;
        if (o15319392248629494012.g() == f9886074403848142923.d().c(v697849047308847220.getValue())) {
            Object objB = f9886074403848142923.d().b(o15319392248629494012.g() + (z ? 1.0f : -1.0f), z);
            if (objB == null) {
                objB = v697849047308847220.getValue();
            }
            if (z) {
                this.a = v697849047308847220.getValue();
                this.b = objB;
            } else {
                this.a = objB;
                this.b = v697849047308847220.getValue();
            }
        } else {
            Object objB2 = f9886074403848142923.d().b(o15319392248629494012.g(), false);
            if (objB2 == null) {
                objB2 = v697849047308847220.getValue();
            }
            Object objB3 = f9886074403848142923.d().b(o15319392248629494012.g(), true);
            if (objB3 == null) {
                objB3 = v697849047308847220.getValue();
            }
            this.a = objB2;
            this.b = objB3;
        }
        V4351601219763732262 v4351601219763732262D = f9886074403848142923.d();
        Object obj = this.a;
        obj.getClass();
        float fC = v4351601219763732262D.c(obj);
        V4351601219763732262 v4351601219763732262D2 = f9886074403848142923.d();
        Object obj2 = this.b;
        obj2.getClass();
        this.c = Math.abs(fC - v4351601219763732262D2.c(obj2));
        if (Math.abs(o15319392248629494012.g() - f9886074403848142923.d().c(v697849047308847220.getValue())) >= this.c / 2.0f) {
            Object value = z ? this.b : this.a;
            if (value == null) {
                value = v697849047308847220.getValue();
            }
            if (((Boolean) f9886074403848142923.b.invoke(value)).booleanValue()) {
                v697849047308847220.setValue(value);
            }
        }
    }
}
