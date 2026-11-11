.class public final Lcom/google/android/gms/internal/zzaeu;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzcwm:Lcom/google/android/gms/internal/zzaes;

.field private synthetic zzcwn:Lcom/google/android/gms/internal/zzakv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzakv;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaeu;->zzcwm:Lcom/google/android/gms/internal/zzaes;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaeu;->zzcwn:Lcom/google/android/gms/internal/zzakv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzcwn:Lcom/google/android/gms/internal/zzakv;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaeu;->zzcwm:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzaes;->zzp(Ljava/util/Map;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzcwm:Lcom/google/android/gms/internal/zzaes;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/zzaes;->zzcwh:Z

    if-eqz v1, :cond_2b

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaes;->zza(Lcom/google/android/gms/internal/zzaes;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_18
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_18} :catch_35
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_18} :catch_33
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_18} :catch_31

    :try_start_18
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaeu;->zzcwm:Lcom/google/android/gms/internal/zzaes;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzaes;->zzb(Lcom/google/android/gms/internal/zzaes;)Lcom/google/android/gms/internal/zzfjw;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/internal/zzfjw;->zzpnw:Ljava/lang/Integer;

    monitor-exit v0

    goto :goto_2b

    :catchall_28
    move-exception v1

    monitor-exit v0
    :try_end_2a
    .catchall {:try_start_18 .. :try_end_2a} :catchall_28

    :try_start_2a
    throw v1

    :cond_2b
    :goto_2b
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu;->zzcwm:Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaes;->send()V
    :try_end_30
    .catch Ljava/lang/InterruptedException; {:try_start_2a .. :try_end_30} :catch_35
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2a .. :try_end_30} :catch_33
    .catch Lorg/json/JSONException; {:try_start_2a .. :try_end_30} :catch_31

    return-void

    :catch_31
    move-exception v0

    goto :goto_36

    :catch_33
    move-exception v0

    goto :goto_36

    :catch_35
    move-exception v0

    :goto_36
    const-string v1, "Failed to get SafeBrowsing metadata"

    sget-object v2, Lcom/google/android/gms/internal/zznh;->zzbqb:Lcom/google/android/gms/internal/zzmx;

    invoke-static {}, Lcom/google/android/gms/internal/zzkb;->zzif()Lcom/google/android/gms/internal/zznf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zznf;->zzd(Lcom/google/android/gms/internal/zzmx;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4d

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzakb;->zza(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4d
    return-void
.end method
