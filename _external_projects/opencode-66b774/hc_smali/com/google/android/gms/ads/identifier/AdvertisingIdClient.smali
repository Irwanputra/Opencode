.class public Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;,
        Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:J

.field public 〺つふすそ:Lcom/google/android/gms/internal/zzfo;

.field public ぁごぐすすぃ:Z

.field public くし〴〺ぅ:Z

.field public げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/なぎぱいぢぎ;

.field public づざかべべ:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$げつ〴ぬぐ;

.field public final なぎぱいぢぎ:Landroid/content/Context;

.field public びぐびあび:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 8

    const-wide/16 v2, 0x7530

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;-><init>(Landroid/content/Context;JZZ)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;JZZ)V
    .registers 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->びぐびあび:Ljava/lang/Object;

    if-eqz p1, :cond_20

    if-eqz p4, :cond_16

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p4

    if-nez p4, :cond_15

    goto :goto_16

    :cond_15
    move-object p1, p4

    :cond_16
    :goto_16
    iput-object p1, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->なぎぱいぢぎ:Landroid/content/Context;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->くし〴〺ぅ:Z

    iput-wide p2, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->〳ぜぞぜべっ:J

    iput-boolean p5, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->ぁごぐすすぃ:Z

    return-void

    .line 1
    :cond_20
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null reference"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    .registers 14

    new-instance v0, Lcom/google/android/gms/ads/identifier/zzb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/identifier/zzb;-><init>(Landroid/content/Context;)V

    const-string v1, "gads:ad_id_app_context:enabled"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/identifier/zzb;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    const-string v3, "gads:ad_id_app_context:ping_ratio"

    const/4 v4, 0x0

    .line 1
    :try_start_f
    iget-object v5, v0, Lcom/google/android/gms/ads/identifier/zzb;->げつ〴ぬぐ:Landroid/content/SharedPreferences;

    if-nez v5, :cond_14

    goto :goto_1a

    :cond_14
    invoke-interface {v5, v3, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v3
    :try_end_18
    .catchall {:try_start_f .. :try_end_18} :catchall_1a

    move v11, v3

    goto :goto_1b

    :catchall_1a
    :goto_1a
    const/4 v11, 0x0

    :goto_1b
    const-string v3, "gads:ad_id_use_shared_preference:experiment_id"

    const-string v4, ""

    .line 2
    :try_start_1f
    iget-object v5, v0, Lcom/google/android/gms/ads/identifier/zzb;->げつ〴ぬぐ:Landroid/content/SharedPreferences;

    if-nez v5, :cond_24

    goto :goto_2a

    :cond_24
    invoke-interface {v5, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_28
    .catchall {:try_start_1f .. :try_end_28} :catchall_2a

    move-object v12, v3

    goto :goto_2b

    :catchall_2a
    :goto_2a
    move-object v12, v4

    :goto_2b
    const-string v3, "gads:ad_id_use_persistent_service:enabled"

    .line 3
    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/ads/identifier/zzb;->getBoolean(Ljava/lang/String;Z)Z

    move-result v8

    new-instance v0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    const-wide/16 v5, -0x1

    move-object v3, v0

    move-object v4, p0

    move v7, v1

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;-><init>(Landroid/content/Context;JZZ)V

    :try_start_3b
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->げつ〴ぬぐ(Z)V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getInfo()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object p0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    sub-long v7, v5, v3

    const/4 v10, 0x0

    move-object v3, v0

    move-object v4, p0

    move v5, v1

    move v6, v11

    move-object v9, v12

    invoke-virtual/range {v3 .. v10}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->〺つふすそ(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;ZFJLjava/lang/String;Ljava/lang/Throwable;)Z
    :try_end_55
    .catchall {:try_start_3b .. :try_end_55} :catchall_59

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->finish()V

    return-object p0

    :catchall_59
    move-exception p0

    const/4 v4, 0x0

    const-wide/16 v7, -0x1

    move-object v3, v0

    move v5, v1

    move v6, v11

    move-object v9, v12

    move-object v10, p0

    :try_start_62
    invoke-virtual/range {v3 .. v10}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->〺つふすそ(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;ZFJLjava/lang/String;Ljava/lang/Throwable;)Z

    throw p0
    :try_end_66
    .catchall {:try_start_62 .. :try_end_66} :catchall_66

    :catchall_66
    move-exception p0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->finish()V

    throw p0
.end method

.method public static getIsAdIdFakeForDebugLogging(Landroid/content/Context;)Z
    .registers 10

    new-instance v0, Lcom/google/android/gms/ads/identifier/zzb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/identifier/zzb;-><init>(Landroid/content/Context;)V

    const-string v1, "gads:ad_id_app_context:enabled"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/identifier/zzb;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    const-string v1, "com.google.android.gms.ads.identifier.service.PERSISTENT_START"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/identifier/zzb;->getBoolean(Ljava/lang/String;Z)Z

    move-result v8

    new-instance v0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    const-wide/16 v5, -0x1

    move-object v3, v0

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;-><init>(Landroid/content/Context;JZZ)V

    :try_start_1b
    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->げつ〴ぬぐ(Z)V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getIsAdIdFakeForDebugLogging()Z

    move-result p0
    :try_end_22
    .catchall {:try_start_1b .. :try_end_22} :catchall_26

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->finish()V

    return p0

    :catchall_26
    move-exception p0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->finish()V

    throw p0
.end method

.method public static setShouldSkipGmsCoreVersionCheck(Z)V
    .registers 1

    return-void
.end method

.method public static びぐびあび(Landroid/content/Context;Z)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/なぎぱいぢぎ;
    .registers 6

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.android.vending"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_a
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_a} :catch_59

    .line 1
    sget-object v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;

    .line 2
    invoke-virtual {v0, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;->げつ〴ぬぐ(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_1e

    const/4 v1, 0x2

    if-ne v0, v1, :cond_16

    goto :goto_1e

    :cond_16
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Google Play services not available"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1e
    :goto_1e
    if-eqz p1, :cond_23

    const-string p1, "com.google.android.gms.ads.identifier.service.PERSISTENT_START"

    goto :goto_25

    :cond_23
    const-string p1, "com.google.android.gms.ads.identifier.service.START"

    :goto_25
    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/なぎぱいぢぎ;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/なぎぱいぢぎ;-><init>()V

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p1, "com.google.android.gms"

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    :try_start_34
    invoke-static {}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/びぐびあび/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/びぐびあび/げつ〴ぬぐ;

    move-result-object p1

    const/4 v2, 0x1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    invoke-virtual {p1, p0, v1, v0, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/びぐびあび/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p0
    :try_end_47
    .catchall {:try_start_34 .. :try_end_47} :catchall_52

    if-eqz p0, :cond_4a

    return-object v0

    .line 4
    :cond_4a
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Connection failure"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_52
    move-exception p0

    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_59
    new-instance p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/げつ〴ぬぐ;

    const/16 p1, 0x9

    invoke-direct {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/げつ〴ぬぐ;-><init>(I)V

    throw p0
.end method


# virtual methods
.method public finalize()V
    .registers 1

    invoke-virtual {p0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->finish()V

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public finish()V
    .registers 3

    const-string v0, "Calling this from your main thread can lead to deadlock"

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->えみにぃほす(Ljava/lang/String;)V

    monitor-enter p0

    :try_start_6
    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->なぎぱいぢぎ:Landroid/content/Context;

    if-eqz v0, :cond_27

    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/なぎぱいぢぎ;
    :try_end_c
    .catchall {:try_start_6 .. :try_end_c} :catchall_29

    if-nez v0, :cond_f

    goto :goto_27

    :cond_f
    :try_start_f
    iget-boolean v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->くし〴〺ぅ:Z

    if-eqz v0, :cond_1d

    invoke-static {}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/びぐびあび/げつ〴ぬぐ;->〺つふすそ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/びぐびあび/げつ〴ぬぐ;

    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->なぎぱいぢぎ:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/なぎぱいぢぎ;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1d
    .catchall {:try_start_f .. :try_end_1d} :catchall_1d

    :catchall_1d
    :cond_1d
    const/4 v0, 0x0

    :try_start_1e
    iput-boolean v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->くし〴〺ぅ:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->〺つふすそ:Lcom/google/android/gms/internal/zzfo;

    iput-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/なぎぱいぢぎ;

    monitor-exit p0

    return-void

    :cond_27
    :goto_27
    monitor-exit p0

    return-void

    :catchall_29
    move-exception v0

    monitor-exit p0
    :try_end_2b
    .catchall {:try_start_1e .. :try_end_2b} :catchall_29

    throw v0
.end method

.method public getInfo()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    .registers 5

    const-string v0, "Calling this from your main thread can lead to deadlock"

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->えみにぃほす(Ljava/lang/String;)V

    monitor-enter p0

    :try_start_6
    iget-boolean v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->くし〴〺ぅ:Z

    if-nez v0, :cond_3b

    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->びぐびあび:Ljava/lang/Object;

    monitor-enter v0
    :try_end_d
    .catchall {:try_start_6 .. :try_end_d} :catchall_64

    :try_start_d
    iget-object v1, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->づざかべべ:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$げつ〴ぬぐ;

    if-eqz v1, :cond_30

    iget-boolean v1, v1, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$げつ〴ぬぐ;->づざかべべ:Z

    if-eqz v1, :cond_30

    monitor-exit v0
    :try_end_16
    .catchall {:try_start_d .. :try_end_16} :catchall_38

    const/4 v0, 0x0

    :try_start_17
    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->げつ〴ぬぐ(Z)V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_1a} :catch_27
    .catchall {:try_start_17 .. :try_end_1a} :catchall_64

    :try_start_1a
    iget-boolean v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->くし〴〺ぅ:Z

    if-eqz v0, :cond_1f

    goto :goto_3b

    :cond_1f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "AdvertisingIdClient cannot reconnect."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_27
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    const-string v2, "AdvertisingIdClient cannot reconnect."

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_30
    .catchall {:try_start_1a .. :try_end_30} :catchall_64

    :cond_30
    :try_start_30
    new-instance v1, Ljava/io/IOException;

    const-string v2, "AdvertisingIdClient is not connected."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_38
    move-exception v1

    monitor-exit v0
    :try_end_3a
    .catchall {:try_start_30 .. :try_end_3a} :catchall_38

    :try_start_3a
    throw v1

    :cond_3b
    :goto_3b
    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/なぎぱいぢぎ;

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くし〴〺ぅ(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->〺つふすそ:Lcom/google/android/gms/internal/zzfo;

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くし〴〺ぅ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_45
    .catchall {:try_start_3a .. :try_end_45} :catchall_64

    :try_start_45
    new-instance v0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    iget-object v1, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->〺つふすそ:Lcom/google/android/gms/internal/zzfo;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzfo;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->〺つふすそ:Lcom/google/android/gms/internal/zzfo;

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/zzfo;->zzb(Z)Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;-><init>(Ljava/lang/String;Z)V
    :try_end_57
    .catch Landroid/os/RemoteException; {:try_start_45 .. :try_end_57} :catch_5c
    .catchall {:try_start_45 .. :try_end_57} :catchall_64

    :try_start_57
    monitor-exit p0
    :try_end_58
    .catchall {:try_start_57 .. :try_end_58} :catchall_64

    invoke-virtual {p0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->くし〴〺ぅ()V

    return-object v0

    :catch_5c
    :try_start_5c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Remote exception"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_64
    move-exception v0

    monitor-exit p0
    :try_end_66
    .catchall {:try_start_5c .. :try_end_66} :catchall_64

    throw v0
.end method

.method public getIsAdIdFakeForDebugLogging()Z
    .registers 4

    const-string v0, "Calling this from your main thread can lead to deadlock"

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->えみにぃほす(Ljava/lang/String;)V

    monitor-enter p0

    :try_start_6
    iget-boolean v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->くし〴〺ぅ:Z

    if-nez v0, :cond_3b

    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->びぐびあび:Ljava/lang/Object;

    monitor-enter v0
    :try_end_d
    .catchall {:try_start_6 .. :try_end_d} :catchall_58

    :try_start_d
    iget-object v1, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->づざかべべ:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$げつ〴ぬぐ;

    if-eqz v1, :cond_30

    iget-boolean v1, v1, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$げつ〴ぬぐ;->づざかべべ:Z

    if-eqz v1, :cond_30

    monitor-exit v0
    :try_end_16
    .catchall {:try_start_d .. :try_end_16} :catchall_38

    const/4 v0, 0x0

    :try_start_17
    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->げつ〴ぬぐ(Z)V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_1a} :catch_27
    .catchall {:try_start_17 .. :try_end_1a} :catchall_58

    :try_start_1a
    iget-boolean v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->くし〴〺ぅ:Z

    if-eqz v0, :cond_1f

    goto :goto_3b

    :cond_1f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "AdvertisingIdClient cannot reconnect."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_27
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    const-string v2, "AdvertisingIdClient cannot reconnect."

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_30
    .catchall {:try_start_1a .. :try_end_30} :catchall_58

    :cond_30
    :try_start_30
    new-instance v1, Ljava/io/IOException;

    const-string v2, "AdvertisingIdClient is not connected."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_38
    move-exception v1

    monitor-exit v0
    :try_end_3a
    .catchall {:try_start_30 .. :try_end_3a} :catchall_38

    :try_start_3a
    throw v1

    :cond_3b
    :goto_3b
    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/なぎぱいぢぎ;

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くし〴〺ぅ(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->〺つふすそ:Lcom/google/android/gms/internal/zzfo;

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くし〴〺ぅ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_45
    .catchall {:try_start_3a .. :try_end_45} :catchall_58

    :try_start_45
    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->〺つふすそ:Lcom/google/android/gms/internal/zzfo;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzfo;->zzbp()Z

    move-result v0
    :try_end_4b
    .catch Landroid/os/RemoteException; {:try_start_45 .. :try_end_4b} :catch_50
    .catchall {:try_start_45 .. :try_end_4b} :catchall_58

    :try_start_4b
    monitor-exit p0
    :try_end_4c
    .catchall {:try_start_4b .. :try_end_4c} :catchall_58

    invoke-virtual {p0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->くし〴〺ぅ()V

    return v0

    :catch_50
    :try_start_50
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Remote exception"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_58
    move-exception v0

    monitor-exit p0
    :try_end_5a
    .catchall {:try_start_50 .. :try_end_5a} :catchall_58

    throw v0
.end method

.method public start()V
    .registers 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->げつ〴ぬぐ(Z)V

    return-void
.end method

.method public final 〺つふすそ(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;ZFJLjava/lang/String;Ljava/lang/Throwable;)Z
    .registers 12

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    float-to-double v2, p3

    cmpl-double p3, v0, v2

    if-lez p3, :cond_b

    const/4 p1, 0x0

    return p1

    :cond_b
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    const-string v0, "1"

    const-string v1, "0"

    if-eqz p2, :cond_18

    move-object p2, v0

    goto :goto_19

    :cond_18
    move-object p2, v1

    :goto_19
    const-string v2, "app_context"

    invoke-virtual {p3, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_2d

    invoke-virtual {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result p2

    if-eqz p2, :cond_27

    goto :goto_28

    :cond_27
    move-object v0, v1

    :goto_28
    const-string p2, "limit_ad_tracking"

    invoke-virtual {p3, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2d
    if-eqz p1, :cond_46

    invoke-virtual {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_46

    invoke-virtual {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "ad_id_size"

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_46
    if-eqz p7, :cond_55

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "error"

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_55
    if-eqz p6, :cond_62

    invoke-virtual {p6}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_62

    const-string p1, "experiment_id"

    invoke-virtual {p3, p1, p6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_62
    const-string p1, "tag"

    const-string p2, "AdvertisingIdClient"

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4, p5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    const-string p2, "time_spent"

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/くし〴〺ぅ/げつ〴ぬぐ;

    invoke-direct {p1, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/くし〴〺ぅ/げつ〴ぬぐ;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    const/4 p1, 0x1

    return p1
.end method

.method public final くし〴〺ぅ()V
    .registers 7

    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->びぐびあび:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->づざかべべ:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$げつ〴ぬぐ;

    if-eqz v1, :cond_11

    iget-object v1, v1, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$げつ〴ぬぐ;->びぐびあび:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_24

    :try_start_c
    iget-object v1, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->づざかべべ:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$げつ〴ぬぐ;

    invoke-virtual {v1}, Ljava/lang/Thread;->join()V
    :try_end_11
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_11} :catch_11
    .catchall {:try_start_c .. :try_end_11} :catchall_24

    :catch_11
    :cond_11
    :try_start_11
    iget-wide v1, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->〳ぜぞぜべっ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_22

    new-instance v1, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$げつ〴ぬぐ;

    iget-wide v2, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->〳ぜぞぜべっ:J

    invoke-direct {v1, p0, v2, v3}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$げつ〴ぬぐ;-><init>(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;J)V

    iput-object v1, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->づざかべべ:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$げつ〴ぬぐ;

    :cond_22
    monitor-exit v0

    return-void

    :catchall_24
    move-exception v1

    monitor-exit v0
    :try_end_26
    .catchall {:try_start_11 .. :try_end_26} :catchall_24

    throw v1
.end method

.method public final げつ〴ぬぐ(Z)V
    .registers 4

    const-string v0, "Calling this from your main thread can lead to deadlock"

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->えみにぃほす(Ljava/lang/String;)V

    monitor-enter p0

    :try_start_6
    iget-boolean v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->くし〴〺ぅ:Z

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->finish()V

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->なぎぱいぢぎ:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->ぁごぐすすぃ:Z

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->びぐびあび(Landroid/content/Context;Z)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/なぎぱいぢぎ;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/なぎぱいぢぎ;
    :try_end_17
    .catchall {:try_start_6 .. :try_end_17} :catchall_3c

    .line 1
    :try_start_17
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/なぎぱいぢぎ;->げつ〴ぬぐ(Ljava/util/concurrent/TimeUnit;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzfp;->zzc(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzfo;

    move-result-object v0
    :try_end_21
    .catch Ljava/lang/InterruptedException; {:try_start_17 .. :try_end_21} :catch_34
    .catchall {:try_start_17 .. :try_end_21} :catchall_2d

    .line 2
    :try_start_21
    iput-object v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->〺つふすそ:Lcom/google/android/gms/internal/zzfo;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->くし〴〺ぅ:Z

    if-eqz p1, :cond_2b

    invoke-virtual {p0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->くし〴〺ぅ()V

    :cond_2b
    monitor-exit p0

    return-void

    :catchall_2d
    move-exception p1

    .line 3
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_34
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Interrupted exception"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_3c
    move-exception p1

    .line 4
    monitor-exit p0
    :try_end_3e
    .catchall {:try_start_21 .. :try_end_3e} :catchall_3c

    throw p1
.end method
