.class public final Lcom/google/android/gms/internal/zzdw;
.super Lcom/google/android/gms/internal/zzet;
.source ""


# instance fields
.field private final zzaki:Landroid/app/Activity;

.field private final zzakj:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzdm;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/zzaz;IILandroid/view/View;Landroid/app/Activity;)V
    .registers 16

    const/16 v6, 0x3e

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/zzet;-><init>(Lcom/google/android/gms/internal/zzdm;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/zzaz;II)V

    iput-object p7, p0, Lcom/google/android/gms/internal/zzdw;->zzakj:Landroid/view/View;

    iput-object p8, p0, Lcom/google/android/gms/internal/zzdw;->zzaki:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final zzay()V
    .registers 7

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdw;->zzakj:Landroid/view/View;

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzakw:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdw;->zzaki:Landroid/app/Activity;

    const/4 v5, 0x1

    aput-object v0, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    iget-object v1, p0, Lcom/google/android/gms/internal/zzet;->zzako:Lcom/google/android/gms/internal/zzaz;

    monitor-enter v1

    :try_start_1c
    iget-object v2, p0, Lcom/google/android/gms/internal/zzet;->zzako:Lcom/google/android/gms/internal/zzaz;

    aget-wide v3, v0, v4

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/internal/zzaz;->zzez:Ljava/lang/Long;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzet;->zzako:Lcom/google/android/gms/internal/zzaz;

    aget-wide v3, v0, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/zzaz;->zzfa:Ljava/lang/Long;

    monitor-exit v1

    return-void

    :catchall_32
    move-exception v0

    monitor-exit v1
    :try_end_34
    .catchall {:try_start_1c .. :try_end_34} :catchall_32

    throw v0
.end method
