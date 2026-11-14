package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E6859840916608331672 implements Iterator {
    public final /* synthetic */ byte a = 3;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Object d;

    public E6859840916608331672(A10473301933203002473 a10473301933203002473) {
        this.d = a10473301933203002473;
        this.c = a10473301933203002473.i();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < this.c) {
                }
                break;
            case 1:
                if (this.b < this.c) {
                }
                break;
            case 2:
                if (this.b < this.c) {
                }
                break;
            default:
                if (this.b < this.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.d;
        int i = this.c;
        switch (b) {
            case 0:
                int i2 = this.b;
                if (i2 >= i) {
                    Z3383101362411723454.u();
                    break;
                } else {
                    this.b = i2 + 1;
                    break;
                }
            case 1:
                int i3 = this.b;
                if (i3 >= i) {
                    Z3383101362411723454.u();
                    break;
                } else {
                    this.b = i3 + 1;
                    break;
                }
            case 2:
                int i4 = this.b;
                if (i4 >= i) {
                    Z3383101362411723454.u();
                    break;
                } else {
                    this.b = i4 + 1;
                    break;
                }
            default:
                int i5 = this.b;
                if (i5 >= i) {
                    Z3383101362411723454.u();
                    break;
                } else {
                    this.b = i5 + 1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public E6859840916608331672(M18082356575916498704 m18082356575916498704) {
        this.d = m18082356575916498704;
        this.c = m18082356575916498704.size();
    }

    public E6859840916608331672(D8243293650800641817 d8243293650800641817) {
        this.d = d8243293650800641817;
        this.c = d8243293650800641817.size();
    }

    public E6859840916608331672(B15200565448991586841 b15200565448991586841) {
        this.d = b15200565448991586841;
        this.c = b15200565448991586841.size();
    }
}
