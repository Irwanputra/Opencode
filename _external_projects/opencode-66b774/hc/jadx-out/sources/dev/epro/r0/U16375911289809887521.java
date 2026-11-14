package dev.epro.r0;

import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U16375911289809887521 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ JSONObject c;

    static {
        izmyclvb.qgayjvbiagej2(1553);
    }

    private native void ndyzgiocbxys(Map map, JSONObject jSONObject, byte b);

    @Override // dev.epro.r0.B13729205492206812220
    public final native Object invoke();

    public /* synthetic */ U16375911289809887521(Map map, JSONObject jSONObject, byte b) {
        this.a = b;
        this.b = map;
        this.c = jSONObject;
        ndyzgiocbxys(map, jSONObject, b);
    }
}
