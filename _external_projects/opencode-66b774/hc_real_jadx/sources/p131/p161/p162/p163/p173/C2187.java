package p131.p161.p162.p163.p173;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;
import p131.p161.p162.p163.p173.C2170;
import p131.p161.p162.p163.p192.C2349;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉひのべい.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2187 extends C2170.AbstractC2175 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ List f9152;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ Matrix f9153;

    public C2187(C2170 c2170, List list, Matrix matrix) {
        this.f9152 = list;
        this.f9153 = matrix;
    }

    @Override // p131.p161.p162.p163.p173.C2170.AbstractC2175
    /* renamed from: げつ〴ぬぐ */
    public void mo4280(Matrix matrix, C2349 c2349, int i, Canvas canvas) {
        Iterator it = this.f9152.iterator();
        while (it.hasNext()) {
            ((C2170.AbstractC2175) it.next()).mo4280(this.f9153, c2349, i, canvas);
        }
    }
}
