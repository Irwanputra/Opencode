.class public final Lcom/google/android/gms/ads/internal/zzac;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field public 〺つふすそ:J

.field public げつ〴ぬぐ:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/ads/internal/zzac;->〺つふすそ:J

    return-void
.end method


# virtual methods
.method public final zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;Ljava/lang/String;Ljava/lang/Runnable;)V
    .registers 13

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    move-object v7, p4

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/ads/internal/zzac;->げつ〴ぬぐ(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;ZLcom/google/android/gms/internal/zzafs;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final げつ〴ぬぐ(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;ZLcom/google/android/gms/internal/zzafs;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
    .registers 15

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 2
    iget-wide v2, p0, Lcom/google/android/gms/ads/internal/zzac;->〺つふすそ:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1388

    cmp-long v4, v0, v2

    if-gez v4, :cond_1c

    const-string p1, "Not retrying to fetch app settings"

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void

    :cond_1c
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 4
    iput-wide v0, p0, Lcom/google/android/gms/ads/internal/zzac;->〺つふすそ:J

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p4, :cond_31

    :cond_2f
    :goto_2f
    const/4 v0, 0x1

    goto :goto_63

    :cond_31
    invoke-virtual {p4}, Lcom/google/android/gms/internal/zzafs;->zzou()J

    move-result-wide v2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/げつ〴ぬぐ;

    move-result-object v4

    check-cast v4, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/づざかべべ/〺つふすそ;

    .line 5
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    .line 6
    sget-object v2, Lcom/google/android/gms/internal/zznh;->zzbpn:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v6, v4, v2

    if-lez v6, :cond_59

    const/4 v2, 0x1

    goto :goto_5a

    :cond_59
    const/4 v2, 0x0

    :goto_5a
    if-nez v2, :cond_2f

    invoke-virtual {p4}, Lcom/google/android/gms/internal/zzafs;->zzov()Z

    move-result p4

    if-nez p4, :cond_63

    goto :goto_2f

    :cond_63
    :goto_63
    if-nez v0, :cond_66

    return-void

    :cond_66
    if-nez p1, :cond_6e

    const-string p1, "Context not provided to fetch application settings"

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void

    :cond_6e
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_80

    invoke-static {p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_80

    const-string p1, "App settings could not be fetched. Required parameters missing"

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    return-void

    :cond_80
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p4

    if-eqz p4, :cond_87

    goto :goto_88

    :cond_87
    move-object p4, p1

    :goto_88
    iput-object p4, p0, Lcom/google/android/gms/ads/internal/zzac;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzev()Lcom/google/android/gms/internal/zztq;

    move-result-object p4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzac;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-virtual {p4, v0, p2}, Lcom/google/android/gms/internal/zztq;->zzb(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;)Lcom/google/android/gms/internal/zztx;

    move-result-object p2

    sget-object p4, Lcom/google/android/gms/internal/zztu;->zzccb:Lcom/google/android/gms/internal/zztt;

    const-string v0, "google.afma.config.fetchAppSettings"

    invoke-virtual {p2, v0, p4, p4}, Lcom/google/android/gms/internal/zztx;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzts;Lcom/google/android/gms/internal/zztr;)Lcom/google/android/gms/internal/zztp;

    move-result-object p2

    :try_start_9c
    new-instance p4, Lorg/json/JSONObject;

    invoke-direct {p4}, Lorg/json/JSONObject;-><init>()V

    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_ad

    const-string p6, "app_id"

    invoke-virtual {p4, p6, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_b8

    :cond_ad
    invoke-static {p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p5

    if-nez p5, :cond_b8

    const-string p5, "ad_unit_id"

    invoke-virtual {p4, p5, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_b8
    :goto_b8
    const-string p5, "is_init"

    invoke-virtual {p4, p5, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string p3, "pn"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-interface {p2, p4}, Lcom/google/android/gms/internal/zztp;->zzg(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzakv;

    move-result-object p1

    new-instance p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/づざかべべ;

    invoke-direct {p2, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/づざかべべ;-><init>(Lcom/google/android/gms/ads/internal/zzac;)V

    sget-object p3, Lcom/google/android/gms/internal/zzala;->zzdff:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/zzakl;->zza(Lcom/google/android/gms/internal/zzakv;Lcom/google/android/gms/internal/zzakg;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/zzakv;

    move-result-object p2

    if-eqz p7, :cond_da

    invoke-interface {p1, p7, p3}, Lcom/google/android/gms/internal/zzakv;->zza(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_da
    const-string p1, "ConfigLoader.maybeFetchNewAppSettings"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzakj;->zza(Lcom/google/android/gms/internal/zzakv;Ljava/lang/String;)V
    :try_end_df
    .catch Ljava/lang/Exception; {:try_start_9c .. :try_end_df} :catch_e0

    return-void

    :catch_e0
    move-exception p1

    const-string p2, "Error requesting application settings"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
