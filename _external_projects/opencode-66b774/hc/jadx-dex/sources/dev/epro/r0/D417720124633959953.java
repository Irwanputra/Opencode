package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D417720124633959953 implements dev.epro.r0.P7456194097047421796 {
    public final java.lang.String a;
    public final dev.epro.r0.S16571168858015125610 b;
    public final java.util.List c;
    public final java.util.List d;
    public final dev.epro.r0.U14340554418656580554 e;
    public final dev.epro.r0.R8540738700654750557 f;
    public final dev.epro.r0.N18010182420439191546 g;
    public final java.lang.CharSequence h;
    public final dev.epro.r0.M3219114150495442389 i;
    public dev.epro.r0.I1632105416032993715 j;
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

    public final float a() {
        dev.epro.r0.M3219114150495442389 m3219114150495442389 = this.i;
        float f = m3219114150495442389.e;
        android.text.TextPaint textPaint = m3219114150495442389.b;
        if (!java.lang.Float.isNaN(f)) {
            return m3219114150495442389.e;
        }
        java.text.BreakIterator lineInstance = java.text.BreakIterator.getLineInstance(textPaint.getTextLocale());
        java.lang.CharSequence charSequence = m3219114150495442389.a;
        lineInstance.setText((java.text.CharacterIterator) new dev.epro.r0.R13385188873504756834(charSequence, charSequence.length()));
        java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue(10, dev.epro.r0.C775827382551829194.i);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new dev.epro.r0.P8646985343900033725(i, next, 1));
            } else {
                dev.epro.r0.P8646985343900033725 p8646985343900033725 = (dev.epro.r0.P8646985343900033725) priorityQueue.peek();
                if (p8646985343900033725 != null && ((dev.epro.r0.I12982432556619280823) p8646985343900033725).b - ((dev.epro.r0.I12982432556619280823) p8646985343900033725).a < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new dev.epro.r0.P8646985343900033725(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            java.util.Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                dev.epro.r0.Z3383101362411723454.u();
                return 0.0f;
            }
            dev.epro.r0.P8646985343900033725 p86469853439000337252 = (dev.epro.r0.P8646985343900033725) it.next();
            desiredWidth = android.text.Layout.getDesiredWidth(m3219114150495442389.b(), ((dev.epro.r0.I12982432556619280823) p86469853439000337252).a, ((dev.epro.r0.I12982432556619280823) p86469853439000337252).b, textPaint);
            while (it.hasNext()) {
                dev.epro.r0.P8646985343900033725 p86469853439000337253 = (dev.epro.r0.P8646985343900033725) it.next();
                desiredWidth = java.lang.Math.max(desiredWidth, android.text.Layout.getDesiredWidth(m3219114150495442389.b(), ((dev.epro.r0.I12982432556619280823) p86469853439000337253).a, ((dev.epro.r0.I12982432556619280823) p86469853439000337253).b, textPaint));
            }
        }
        m3219114150495442389.e = desiredWidth;
        return desiredWidth;
    }

    public final boolean b() {
        dev.epro.r0.I1632105416032993715 i1632105416032993715 = this.j;
        if (i1632105416032993715 != null ? i1632105416032993715.s() : false) {
            return true;
        }
        if (!this.k && dev.epro.r0.S10823041268949770285.K(this.b)) {
            dev.epro.r0.H12843822278061842084 h12843822278061842084 = dev.epro.r0.S12684936702426107147.a;
            dev.epro.r0.H12843822278061842084 h128438222780618420842 = dev.epro.r0.S12684936702426107147.a;
            dev.epro.r0.L13148442655056575112 l13148442655056575112B = (dev.epro.r0.L13148442655056575112) h128438222780618420842.b;
            if (l13148442655056575112B == null) {
                if (dev.epro.r0.D3638978315442423989.d()) {
                    l13148442655056575112B = h128438222780618420842.B();
                    h128438222780618420842.b = l13148442655056575112B;
                } else {
                    l13148442655056575112B = dev.epro.r0.S10823041268949770285.c;
                }
            }
            if (((java.lang.Boolean) l13148442655056575112B.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final float c() {
        return this.i.c();
    }
}
