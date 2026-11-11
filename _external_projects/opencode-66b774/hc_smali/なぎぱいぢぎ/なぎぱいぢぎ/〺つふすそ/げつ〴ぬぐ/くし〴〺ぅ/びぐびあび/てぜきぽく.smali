.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzanm;


# instance fields
.field public synthetic 〺つふすそ:Ljava/lang/String;

.field public synthetic くし〴〺ぅ:Lcom/google/android/gms/internal/zzanh;

.field public synthetic げつ〴ぬぐ:Lcom/google/android/gms/internal/zzol;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzol;Ljava/lang/String;Lcom/google/android/gms/internal/zzanh;)V
    .registers 4

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzol;

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;->〺つふすそ:Ljava/lang/String;

    iput-object p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;->くし〴〺ぅ:Lcom/google/android/gms/internal/zzanh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/zzanh;Z)V
    .registers 6

    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const-string p2, "headline"

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzol;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzol;->getHeadline()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "body"

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzol;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzol;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "call_to_action"

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzol;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzol;->getCallToAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "advertiser"

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzol;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzol;->getAdvertiser()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "logo"

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzol;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzol;->zzjz()Lcom/google/android/gms/internal/zzpq;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/zzaq;->〺つふすそ(Lcom/google/android/gms/internal/zzpq;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance p2, Lorg/json/JSONArray;

    invoke-direct {p2}, Lorg/json/JSONArray;-><init>()V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzol;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzol;->getImages()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6f

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_51
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 1
    instance-of v2, v1, Landroid/os/IBinder;

    if-eqz v2, :cond_66

    check-cast v1, Landroid/os/IBinder;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzpr;->zzk(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzpq;

    move-result-object v1

    goto :goto_67

    :cond_66
    const/4 v1, 0x0

    .line 2
    :goto_67
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/zzaq;->〺つふすそ(Lcom/google/android/gms/internal/zzpq;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_51

    :cond_6f
    const-string v0, "images"

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "extras"

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzol;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzol;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;->〺つふすそ:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/zzaq;->くし〴〺ぅ(Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "assets"

    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "template_id"

    const-string v0, "1"

    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/てぜきぽく;->くし〴〺ぅ:Lcom/google/android/gms/internal/zzanh;

    const-string v0, "google.afma.nativeExpressAds.loadAssets"

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/zzanh;->zzb(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_9d
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_9d} :catch_9e

    return-void

    :catch_9e
    move-exception p1

    const-string p2, "Exception occurred when loading assets"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
