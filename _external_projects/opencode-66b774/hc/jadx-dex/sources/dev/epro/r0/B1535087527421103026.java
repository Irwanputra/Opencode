package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B1535087527421103026 {
    public long a;
    public final android.util.SparseLongArray b = new android.util.SparseLongArray();
    public final android.util.SparseBooleanArray c = new android.util.SparseBooleanArray();
    public final java.util.ArrayList d = new java.util.ArrayList();
    public final dev.epro.r0.A18377563779865231301 e = new dev.epro.r0.A18377563779865231301((java.lang.Object) null);
    public int f = -1;
    public int g = -1;
    public boolean h;
    public boolean i;
    public dev.epro.r0.L2216691091636065972 j;

    public final void a(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        android.util.SparseLongArray sparseLongArray = this.b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.a;
                this.a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    public final void b(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f && source == this.g) {
            return;
        }
        this.f = toolType;
        this.g = source;
        this.c.clear();
        this.b.clear();
    }

    public final dev.epro.r0.V10300877997588547986 c(android.view.MotionEvent motionEvent, dev.epro.r0.S7974369370986781936 s7974369370986781936) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        android.util.SparseBooleanArray sparseBooleanArray = this.c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.b.clear();
            sparseBooleanArray.clear();
            this.h = false;
            this.i = false;
            this.j = null;
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        java.util.ArrayList arrayList = this.d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = android.os.Build.VERSION.SDK_INT >= 34 && (dev.epro.r0.I9104972935492198939.c(motionEvent) == 3 || dev.epro.r0.I9104972935492198939.c(motionEvent) == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.h = true;
            }
        }
        if (android.os.Build.VERSION.SDK_INT < 34 || !(dev.epro.r0.I9104972935492198939.c(motionEvent) == 3 || dev.epro.r0.I9104972935492198939.c(motionEvent) == 5)) {
            this.i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (i < pointerCount) {
                arrayList.add(d(s7974369370986781936, motionEvent, null, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i++;
            }
        } else {
            if (dev.epro.r0.I9104972935492198939.c(motionEvent) == 5 && motionEvent.getPointerCount() == 1) {
                if (motionEvent.getActionMasked() == 1) {
                    this.h = false;
                    this.i = false;
                    this.j = null;
                }
                e(motionEvent);
                return null;
            }
            this.i = true;
            if (motionEvent.getActionMasked() == 0) {
                this.j = new dev.epro.r0.L2216691091636065972((((long) java.lang.Float.floatToRawIntBits(dev.epro.r0.I9104972935492198939.z(motionEvent))) << 32) | (((long) java.lang.Float.floatToRawIntBits(dev.epro.r0.I9104972935492198939.a(motionEvent))) & 4294967295L));
            } else if (motionEvent.getActionMasked() == 5 && dev.epro.r0.I9104972935492198939.c(motionEvent) == 5 && motionEvent.getPointerCount() == 2) {
                this.j = new dev.epro.r0.L2216691091636065972((((long) java.lang.Float.floatToRawIntBits((dev.epro.r0.I9104972935492198939.C(motionEvent) + dev.epro.r0.I9104972935492198939.z(motionEvent)) / 2.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits((dev.epro.r0.I9104972935492198939.u(motionEvent) + dev.epro.r0.I9104972935492198939.a(motionEvent)) / 2.0f)) & 4294967295L));
            }
            arrayList.add(d(s7974369370986781936, motionEvent, this.j, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.h = false;
            this.i = false;
            this.j = null;
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new dev.epro.r0.V10300877997588547986(arrayList, motionEvent, (byte) 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0182 A[EDGE_INSN: B:84:0x0182->B:62:0x0182 BREAK  A[LOOP:0: B:43:0x00ea->B:61:0x0179], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.R9761660112265475292 d(dev.epro.r0.S7974369370986781936 r43, android.view.MotionEvent r44, dev.epro.r0.L2216691091636065972 r45, int r46, boolean r47) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B1535087527421103026.d(dev.epro.r0.S7974369370986781936, android.view.MotionEvent, dev.epro.r0.L2216691091636065972, int, boolean):dev.epro.r0.R9761660112265475292");
    }

    public final void e(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        android.util.SparseBooleanArray sparseBooleanArray = this.c;
        android.util.SparseLongArray sparseLongArray = this.b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == iKeyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
