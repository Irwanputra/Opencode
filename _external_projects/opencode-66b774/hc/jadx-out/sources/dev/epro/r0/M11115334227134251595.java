package dev.epro.r0;

import java.nio.ByteBuffer;
import o.bwmna.gdrqkg.izmyclvb;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class M11115334227134251595 implements B17882008330949896466, R5909351061398077004, B14351301772695273662 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    static {
        izmyclvb.dpqpjfpoanwt1(1289);
    }

    public /* synthetic */ M11115334227134251595(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // dev.epro.r0.B14351301772695273662
    public Object a(X627358512999327803 x627358512999327803) {
        G8001132634698687269 g8001132634698687269 = (G8001132634698687269) this.b;
        L856869997670741194 l856869997670741194 = (L856869997670741194) this.c;
        L12639328004344855510 l12639328004344855510 = (L12639328004344855510) this.d;
        W13948953340889349604 w13948953340889349604 = new W13948953340889349604((Q15035754882231748864) g8001132634698687269.get(P2382941533350862833.p), (byte) 18);
        W8823188230031025271 w8823188230031025271 = x627358512999327803.c;
        if (w8823188230031025271 != null) {
            w8823188230031025271.a(w13948953340889349604, A3452148295251753522.a);
        }
        return R7033599853981556291.E(O8620973563946607355.a(g8001132634698687269), null, l856869997670741194, new C288342651169725874((Object) l12639328004344855510, (Object) x627358512999327803, (R4833348786910499294) null, (byte) 13), 1);
    }

    public native void b(String str, byte[] bArr);

    @Override // dev.epro.r0.R5909351061398077004
    /* JADX INFO: renamed from: run */
    public void mo18run() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        R9704326227384281667 r9704326227384281667 = (R9704326227384281667) this.b;
        switch (b) {
            case 2:
                r9704326227384281667.a.onRedirectReceived(r9704326227384281667.d, (N12175049621887677679) obj2, (String) obj);
                break;
            default:
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) obj2;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                Z11821137052809198413 z11821137052809198413 = r9704326227384281667.d;
                if (z11821137052809198413.f.compareAndSet(5, 4)) {
                    r9704326227384281667.a.onReadCompleted(z11821137052809198413, urlResponseInfo, byteBuffer);
                }
                break;
        }
    }

    @Override // dev.epro.r0.B17882008330949896466
    public Object run() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        R6413645163672196790 r6413645163672196790 = (R6413645163672196790) this.b;
        android.net.http.UrlResponseInfo urlResponseInfo = (android.net.http.UrlResponseInfo) obj2;
        switch (b) {
            case 0:
                V14822036933104273045 v14822036933104273045B = V14822036933104273045.b(urlResponseInfo);
                r6413645163672196790.a.onReadCompleted(r6413645163672196790.b, v14822036933104273045B, (ByteBuffer) obj);
                break;
            default:
                V14822036933104273045 v14822036933104273045B2 = V14822036933104273045.b(urlResponseInfo);
                r6413645163672196790.a.onRedirectReceived(r6413645163672196790.b, v14822036933104273045B2, (String) obj);
                break;
        }
        return null;
    }
}
