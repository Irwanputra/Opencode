package dev.epro.r0;

import o.bwmna.gdrqkg.izmyclvb;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.XMLFilterImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class M1409774708310732374 extends XMLFilterImpl {
    public final CharSequence a;
    public final Z8283220427686875771 b;
    public int c;

    static {
        izmyclvb.dpqpjfpoanwt1(1415);
    }

    public /* synthetic */ M1409774708310732374(CharSequence charSequence, ContentHandler contentHandler, Z8283220427686875771 z8283220427686875771, int i, O18369580107802500074 o18369580107802500074) {
        this(charSequence, contentHandler, (Z8283220427686875771) epqonltalloo(charSequence, contentHandler, z8283220427686875771, i, o18369580107802500074)[0]);
        xxpptqehagxe();
    }

    private static native Object[] epqonltalloo(CharSequence charSequence, ContentHandler contentHandler, Z8283220427686875771 z8283220427686875771, int i, O18369580107802500074 o18369580107802500074);

    private native void nsttkeqzccch(CharSequence charSequence, ContentHandler contentHandler, Z8283220427686875771 z8283220427686875771);

    private native void xxpptqehagxe();

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public final native void characters(char[] cArr, int i, int i2);

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public final native void endElement(String str, String str2, String str3);

    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public final native void startElement(String str, String str2, String str3, Attributes attributes);

    public M1409774708310732374(CharSequence charSequence, ContentHandler contentHandler, Z8283220427686875771 z8283220427686875771) {
        charSequence.getClass();
        contentHandler.getClass();
        nsttkeqzccch(charSequence, contentHandler, z8283220427686875771);
    }
}
