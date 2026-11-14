package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E9997701474979625536 extends android.text.SpannableStringBuilder {
    public final java.lang.Class a;
    public final java.util.ArrayList b;

    public E9997701474979625536(java.lang.Class cls, java.lang.CharSequence charSequence) {
        super(charSequence);
        this.b = new java.util.ArrayList();
        dev.epro.r0.K5751602218013079365.x("watcherClass cannot be null", cls);
        this.a = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((dev.epro.r0.A1443918367825261584) arrayList.get(i)).b.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((dev.epro.r0.A1443918367825261584) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final dev.epro.r0.A1443918367825261584 c(java.lang.Object obj) {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            dev.epro.r0.A1443918367825261584 a1443918367825261584 = (dev.epro.r0.A1443918367825261584) arrayList.get(i);
            if (a1443918367825261584.a == obj) {
                return a1443918367825261584;
            }
            i++;
        }
    }

    public final boolean d(java.lang.Object obj) {
        if (obj != null) {
            return this.a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((dev.epro.r0.A1443918367825261584) arrayList.get(i)).b.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(java.lang.Object obj) {
        dev.epro.r0.A1443918367825261584 a1443918367825261584C;
        if (d(obj) && (a1443918367825261584C = c(obj)) != null) {
            obj = a1443918367825261584C;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(java.lang.Object obj) {
        dev.epro.r0.A1443918367825261584 a1443918367825261584C;
        if (d(obj) && (a1443918367825261584C = c(obj)) != null) {
            obj = a1443918367825261584C;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(java.lang.Object obj) {
        dev.epro.r0.A1443918367825261584 a1443918367825261584C;
        if (d(obj) && (a1443918367825261584C = c(obj)) != null) {
            obj = a1443918367825261584C;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final java.lang.Object[] getSpans(int i, int i2, java.lang.Class cls) {
        if (this.a != cls) {
            return super.getSpans(i, i2, cls);
        }
        dev.epro.r0.A1443918367825261584[] a1443918367825261584Arr = (dev.epro.r0.A1443918367825261584[]) super.getSpans(i, i2, dev.epro.r0.A1443918367825261584.class);
        java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, a1443918367825261584Arr.length);
        for (int i3 = 0; i3 < a1443918367825261584Arr.length; i3++) {
            objArr[i3] = a1443918367825261584Arr[i3].a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable insert(int i, java.lang.CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, java.lang.Class cls) {
        if (cls == null || this.a == cls) {
            cls = dev.epro.r0.A1443918367825261584.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(java.lang.Object obj) {
        dev.epro.r0.A1443918367825261584 a1443918367825261584C;
        if (d(obj)) {
            a1443918367825261584C = c(obj);
            if (a1443918367825261584C != null) {
                obj = a1443918367825261584C;
            }
        } else {
            a1443918367825261584C = null;
        }
        super.removeSpan(obj);
        if (a1443918367825261584C != null) {
            this.b.remove(a1443918367825261584C);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int i, int i2, java.lang.CharSequence charSequence) {
        a();
        super.replace(i, i2, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(java.lang.Object obj, int i, int i2, int i3) {
        if (d(obj)) {
            dev.epro.r0.A1443918367825261584 a1443918367825261584 = new dev.epro.r0.A1443918367825261584(obj);
            this.b.add(a1443918367825261584);
            obj = a1443918367825261584;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return new dev.epro.r0.E9997701474979625536(this.a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder insert(int i, java.lang.CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.Editable insert(int i, java.lang.CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder insert(int i, java.lang.CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final java.lang.Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.Editable append(java.lang.CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable replace(int i, int i2, java.lang.CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable replace(int i, int i2, java.lang.CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, java.lang.Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int i, int i2, java.lang.CharSequence charSequence, int i3, int i4) {
        a();
        super.replace(i, i2, charSequence, i3, i4);
        e();
        return this;
    }

    public E9997701474979625536(java.lang.Class cls, dev.epro.r0.E9997701474979625536 e9997701474979625536, int i, int i2) {
        super(e9997701474979625536, i, i2);
        this.b = new java.util.ArrayList();
        dev.epro.r0.K5751602218013079365.x("watcherClass cannot be null", cls);
        this.a = cls;
    }
}
