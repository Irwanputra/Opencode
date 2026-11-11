.class public final Lcom/google/android/gms/ads/internal/zzaw;
.super Lcom/google/android/gms/internal/zzlh;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field public static final づざかべべ:Ljava/lang/Object;

.field public static なぎぱいぢぎ:Lcom/google/android/gms/ads/internal/zzaw;


# instance fields
.field public final 〺つふすそ:Landroid/content/Context;

.field public くし〴〺ぅ:Z

.field public びぐびあび:Lcom/google/android/gms/internal/zzakd;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/zzaw;->づざかべべ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;)V
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzlh;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzaw;->〺つふすそ:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzaw;->びぐびあび:Lcom/google/android/gms/internal/zzakd;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/zzaw;->くし〴〺ぅ:Z

    return-void
.end method

.method public static zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;)Lcom/google/android/gms/ads/internal/zzaw;
    .registers 4

    sget-object v0, Lcom/google/android/gms/ads/internal/zzaw;->づざかべべ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lcom/google/android/gms/ads/internal/zzaw;->なぎぱいぢぎ:Lcom/google/android/gms/ads/internal/zzaw;

    if-nez v1, :cond_12

    new-instance v1, Lcom/google/android/gms/ads/internal/zzaw;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/zzaw;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;)V

    sput-object v1, Lcom/google/android/gms/ads/internal/zzaw;->なぎぱいぢぎ:Lcom/google/android/gms/ads/internal/zzaw;

    :cond_12
    sget-object p0, Lcom/google/android/gms/ads/internal/zzaw;->なぎぱいぢぎ:Lcom/google/android/gms/ads/internal/zzaw;

    monitor-exit v0

    return-object p0

    :catchall_16
    move-exception p0

    monitor-exit v0
    :try_end_18
    .catchall {:try_start_3 .. :try_end_18} :catchall_16

    throw p0
.end method


# virtual methods
.method public final initialize()V
    .registers 4

    sget-object v0, Lcom/google/android/gms/ads/internal/zzaw;->づざかべべ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzaw;->くし〴〺ぅ:Z

    if-eqz v1, :cond_e

    const-string v1, "Mobile ads is initialized already."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_e
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzaw;->くし〴〺ぅ:Z

    monitor-exit v0
    :try_end_12
    .catchall {:try_start_3 .. :try_end_12} :catchall_2c

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzaw;->〺つふすそ:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/zznh;->initialize(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzem()Lcom/google/android/gms/internal/zzaft;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzaw;->〺つふすそ:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzaw;->びぐびあび:Lcom/google/android/gms/internal/zzakd;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzaft;->zzc(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzen()Lcom/google/android/gms/internal/zzid;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzaw;->〺つふすそ:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzid;->initialize(Landroid/content/Context;)V

    return-void

    :catchall_2c
    move-exception v1

    :try_start_2d
    monitor-exit v0
    :try_end_2e
    .catchall {:try_start_2d .. :try_end_2e} :catchall_2c

    throw v1
.end method

.method public final setAppMuted(Z)V
    .registers 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzff()Lcom/google/android/gms/internal/zzaie;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaie;->setAppMuted(Z)V

    return-void
.end method

.method public final setAppVolume(F)V
    .registers 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzff()Lcom/google/android/gms/internal/zzaie;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaie;->setAppVolume(F)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V
    .registers 7

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzaw;->〺つふすそ:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/zznh;->initialize(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbpl:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sget-object v1, Lcom/google/android/gms/internal/zznh;->zzblc:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    or-int/2addr v0, v2

    const/4 v2, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_4a

    const/4 v0, 0x1

    invoke-static {p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Runnable;

    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/ぇぬぎばつ;

    invoke-direct {v2, p0, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/ぇぬぎばつ;-><init>(Lcom/google/android/gms/ads/internal/zzaw;Ljava/lang/Runnable;)V

    :cond_4a
    if-eqz v0, :cond_57

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzep()Lcom/google/android/gms/ads/internal/zzac;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzaw;->〺つふすそ:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzaw;->びぐびあび:Lcom/google/android/gms/internal/zzakd;

    invoke-virtual {p2, v0, v1, p1, v2}, Lcom/google/android/gms/ads/internal/zzac;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;Ljava/lang/String;Ljava/lang/Runnable;)V

    :cond_57
    return-void
.end method

.method public final zzb(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;Ljava/lang/String;)V
    .registers 4

    if-nez p1, :cond_8

    const-string p1, "Wrapped context is null. Failed to open debug menu."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->e(Ljava/lang/String;)V

    return-void

    :cond_8
    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;->ぺふねづ〺(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    if-nez p1, :cond_16

    const-string p1, "Context is null. Failed to open debug menu."

    invoke-static {p1}, Lcom/google/android/gms/internal/zzakb;->e(Ljava/lang/String;)V

    return-void

    :cond_16
    new-instance v0, Lcom/google/android/gms/internal/zzaig;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzaig;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/zzaig;->setAdUnitId(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzaw;->びぐびあび:Lcom/google/android/gms/internal/zzakd;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaig;->zzcl(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaig;->showDialog()V

    return-void
.end method

.method public final zzdn()F
    .registers 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzff()Lcom/google/android/gms/internal/zzaie;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaie;->zzdn()F

    move-result v0

    return v0
.end method

.method public final zzdo()Z
    .registers 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzff()Lcom/google/android/gms/internal/zzaie;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaie;->zzdo()Z

    move-result v0

    return v0
.end method

.method public final zzu(Ljava/lang/String;)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzaw;->〺つふすそ:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/zznh;->initialize(Landroid/content/Context;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_29

    sget-object v0, Lcom/google/android/gms/internal/zznh;->zzbpl:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzep()Lcom/google/android/gms/ads/internal/zzac;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzaw;->〺つふすそ:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzaw;->びぐびあび:Lcom/google/android/gms/internal/zzakd;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/ads/internal/zzac;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzakd;Ljava/lang/String;Ljava/lang/Runnable;)V

    :cond_29
    return-void
.end method
