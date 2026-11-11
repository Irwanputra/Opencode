.class public Lcom/google/android/gms/internal/zzaos;
.super Lcom/google/android/gms/internal/zzani;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation

.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzanh;Z)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzani;-><init>(Lcom/google/android/gms/internal/zzanh;Z)V

    return-void
.end method


# virtual methods
.method public final zza(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;)Landroid/webkit/WebResourceResponse;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/webkit/WebResourceResponse;"
        }
    .end annotation

    const-string v0, "UTF-8"

    instance-of v1, p1, Lcom/google/android/gms/internal/zzanh;

    const/4 v2, 0x0

    if-nez v1, :cond_d

    const-string p1, "Tried to intercept request from a WebView that wasn\'t an AdWebView."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-object v2

    :cond_d
    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/internal/zzanh;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzani;->zzaoq:Lcom/google/android/gms/internal/zzafb;

    if-eqz v3, :cond_18

    const/4 v4, 0x1

    invoke-interface {v3, p2, p3, v4}, Lcom/google/android/gms/internal/zzafb;->zza(Ljava/lang/String;Ljava/util/Map;I)V

    :cond_18
    new-instance p3, Ljava/io/File;

    invoke-direct {p3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p3

    const-string v3, "mraid.js"

    invoke-virtual {v3, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_2e

    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/zzani;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_2e
    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->zzsz()Lcom/google/android/gms/internal/zzani;

    move-result-object p1

    if-eqz p1, :cond_3b

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->zzsz()Lcom/google/android/gms/internal/zzani;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzani;->zzmv()V

    :cond_3b
    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->zzsx()Lcom/google/android/gms/internal/zzapa;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzapa;->zzuh()Z

    move-result p1

    if-eqz p1, :cond_52

    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbjk:Lcom/google/android/gms/internal/zzmx;

    :goto_47
    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_5e

    :cond_52
    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->zztc()Z

    move-result p1

    if-eqz p1, :cond_5b

    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbjj:Lcom/google/android/gms/internal/zzmx;

    goto :goto_47

    :cond_5b
    sget-object p1, Lcom/google/android/gms/internal/zznh;->zzbji:Lcom/google/android/gms/internal/zzmx;

    goto :goto_47

    :goto_5e
    :try_start_5e
    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzanh;->zzsk()Lcom/google/android/gms/internal/zzakd;

    move-result-object p3

    iget-object p3, p3, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v3, "User-Agent"

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    move-result-object v4

    invoke-virtual {v4, p2, p3}, Lcom/google/android/gms/internal/zzahn;->zzp(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, v3, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p3, "Cache-Control"

    const-string v3, "max-stale=3600"

    invoke-virtual {v1, p3, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Lcom/google/android/gms/internal/zzaiv;

    invoke-direct {p3, p2}, Lcom/google/android/gms/internal/zzaiv;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/zzaiv;->zzb(Ljava/lang/String;Ljava/util/Map;)Lcom/google/android/gms/internal/zzakv;

    move-result-object p1

    const-wide/16 p2, 0x3c

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, p2, p3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_97

    return-object v2

    :cond_97
    new-instance p2, Landroid/webkit/WebResourceResponse;

    const-string p3, "application/javascript"

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p2, p3, v0, v1}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_a7
    .catch Ljava/io/IOException; {:try_start_5e .. :try_end_a7} :catch_ae
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5e .. :try_end_a7} :catch_ac
    .catch Ljava/lang/InterruptedException; {:try_start_5e .. :try_end_a7} :catch_aa
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_5e .. :try_end_a7} :catch_a8

    return-object p2

    :catch_a8
    move-exception p1

    goto :goto_af

    :catch_aa
    move-exception p1

    goto :goto_af

    :catch_ac
    move-exception p1

    goto :goto_af

    :catch_ae
    move-exception p1

    :goto_af
    const-string p2, "Could not fetch MRAID JS. "

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    if-eqz p3, :cond_c4

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_c9

    :cond_c4
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_c9
    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-object v2
.end method
