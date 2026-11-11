.class public final Lcom/google/android/gms/internal/zzany;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzt;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
        "Lcom/google/android/gms/internal/zzanh;",
        ">;"
    }
.end annotation


# instance fields
.field private synthetic zzdmx:Lcom/google/android/gms/internal/zzanx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzanx;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzany;->zzdmx:Lcom/google/android/gms/internal/zzanx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .registers 4

    if-eqz p2, :cond_38

    const-string p1, "height"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_38

    :try_start_10
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget-object p2, p0, Lcom/google/android/gms/internal/zzany;->zzdmx:Lcom/google/android/gms/internal/zzanx;

    invoke-static {p2}, Lcom/google/android/gms/internal/zzanx;->zza(Lcom/google/android/gms/internal/zzanx;)Ljava/lang/Object;

    move-result-object p2

    monitor-enter p2
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_1b} :catch_32

    :try_start_1b
    iget-object v0, p0, Lcom/google/android/gms/internal/zzany;->zzdmx:Lcom/google/android/gms/internal/zzanx;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzanx;->zzb(Lcom/google/android/gms/internal/zzanx;)I

    move-result v0

    if-eq v0, p1, :cond_2d

    iget-object v0, p0, Lcom/google/android/gms/internal/zzany;->zzdmx:Lcom/google/android/gms/internal/zzanx;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzanx;->zza(Lcom/google/android/gms/internal/zzanx;I)I

    iget-object p1, p0, Lcom/google/android/gms/internal/zzany;->zzdmx:Lcom/google/android/gms/internal/zzanx;

    invoke-virtual {p1}, Landroid/webkit/WebView;->requestLayout()V

    :cond_2d
    monitor-exit p2

    return-void

    :catchall_2f
    move-exception p1

    monitor-exit p2
    :try_end_31
    .catchall {:try_start_1b .. :try_end_31} :catchall_2f

    :try_start_31
    throw p1
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_31 .. :try_end_32} :catch_32

    :catch_32
    move-exception p1

    const-string p2, "Exception occurred while getting webview content height"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_38
    return-void
.end method
