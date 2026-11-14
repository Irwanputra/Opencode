package dev.epro.r0;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:118:0x03cd, code lost:
    
        if ((r7.b.c & 1095216660480L) != 0) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x009d, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x086b A[LOOP:6: B:296:0x0869->B:297:0x086b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ae  */
    /* JADX WARN: Type inference failed for: r0v0, types: [dev.epro.r0.D417720124633959953, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D417720124633959953(java.lang.String r41, dev.epro.r0.S16571168858015125610 r42, java.util.List r43, java.util.List r44, dev.epro.r0.U14340554418656580554 r45, dev.epro.r0.R8540738700654750557 r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 2243
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
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                Z3383101362411723454.u();
                return 0.0f;
            }
            P8646985343900033725 p86469853439000337252 = (P8646985343900033725) it.next();
            f2 = Layout.getDesiredWidth(m3219114150495442389.b(), p86469853439000337252.a, p86469853439000337252.b, textPaint);
            while (it.hasNext()) {
                P8646985343900033725 p86469853439000337253 = (P8646985343900033725) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(m3219114150495442389.b(), p86469853439000337253.a, p86469853439000337253.b, textPaint));
            }
        }
        m3219114150495442389.e = f2;
        return f2;
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
            L13148442655056575112 l13148442655056575112 = (L13148442655056575112) h128438222780618420842.b;
            if (l13148442655056575112 == null) {
                if (D3638978315442423989.d()) {
                    l13148442655056575112 = h128438222780618420842.B();
                    h128438222780618420842.b = l13148442655056575112;
                } else {
                    l13148442655056575112 = S10823041268949770285.c;
                }
            }
            if (((Boolean) l13148442655056575112.getValue()).booleanValue()) {
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
