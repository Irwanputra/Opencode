package dev.epro.r0;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D417720124633959953 implements P7456194097047421796 {
    public final String a;
    public final S16571168858015125610 b;
    public final List c;
    public final List d;
    public final U14340554418656580554 e;
    public final R8540738700654750557 f;
    public final N18010182420439191546 g;
    public final CharSequence h;
    public final M3219114150495442389 i;
    public I1632105416032993715 j;
    public final boolean k;
    public final int l;
    public final int m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x07f2  */
    /* JADX WARN: Type inference failed for: r0v0, types: [dev.epro.r0.D417720124633959953, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D417720124633959953(java.lang.String r41, dev.epro.r0.S16571168858015125610 r42, java.util.List r43, java.util.List r44, dev.epro.r0.U14340554418656580554 r45, dev.epro.r0.R8540738700654750557 r46, boolean r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D417720124633959953.<init>(java.lang.String, dev.epro.r0.S16571168858015125610, java.util.List, java.util.List, dev.epro.r0.U14340554418656580554, dev.epro.r0.R8540738700654750557, boolean):void");
    }

    @Override // dev.epro.r0.P7456194097047421796
    public final float a() {
        M3219114150495442389 m3219114150495442389 = this.i;
        float f = m3219114150495442389.e;
        TextPaint textPaint = m3219114150495442389.b;
        if (!Float.isNaN(f)) {
            return m3219114150495442389.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = m3219114150495442389.a;
        lineInstance.setText(new R13385188873504756834(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, C775827382551829194.i);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new P8646985343900033725(i, next, 1));
            } else {
                P8646985343900033725 p8646985343900033725 = (P8646985343900033725) priorityQueue.peek();
                if (p8646985343900033725 != null && p8646985343900033725.b - p8646985343900033725.a < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new P8646985343900033725(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                Z3383101362411723454.u();
                return 0.0f;
            }
            P8646985343900033725 p86469853439000337252 = (P8646985343900033725) it.next();
            desiredWidth = Layout.getDesiredWidth(m3219114150495442389.b(), p86469853439000337252.a, p86469853439000337252.b, textPaint);
            while (it.hasNext()) {
                P8646985343900033725 p86469853439000337253 = (P8646985343900033725) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(m3219114150495442389.b(), p86469853439000337253.a, p86469853439000337253.b, textPaint));
            }
        }
        m3219114150495442389.e = desiredWidth;
        return desiredWidth;
    }

    @Override // dev.epro.r0.P7456194097047421796
    public final boolean b() {
        I1632105416032993715 i1632105416032993715 = this.j;
        if (i1632105416032993715 != null ? i1632105416032993715.s() : false) {
            return true;
        }
        if (!this.k && S10823041268949770285.K(this.b)) {
            H12843822278061842084 h12843822278061842084 = S12684936702426107147.a;
            H12843822278061842084 h128438222780618420842 = S12684936702426107147.a;
            L13148442655056575112 l13148442655056575112B = (L13148442655056575112) h128438222780618420842.b;
            if (l13148442655056575112B == null) {
                if (D3638978315442423989.d()) {
                    l13148442655056575112B = h128438222780618420842.B();
                    h128438222780618420842.b = l13148442655056575112B;
                } else {
                    l13148442655056575112B = S10823041268949770285.c;
                }
            }
            if (((Boolean) l13148442655056575112B.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.P7456194097047421796
    public final float c() {
        return this.i.c();
    }
}
