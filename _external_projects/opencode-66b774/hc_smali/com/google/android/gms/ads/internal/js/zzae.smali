.class public final Lcom/google/android/gms/ads/internal/js/zzae;
.super Lcom/google/android/gms/internal/zzall;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzall<",
        "Lcom/google/android/gms/ads/internal/js/zzc;",
        ">;"
    }
.end annotation


# instance fields
.field public 〺つふすそ:Lcom/google/android/gms/internal/zzaiq;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzaiq<",
            "Lcom/google/android/gms/ads/internal/js/zzc;",
            ">;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:Z

.field public final げつ〴ぬぐ:Ljava/lang/Object;

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzaiq;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaiq<",
            "Lcom/google/android/gms/ads/internal/js/zzc;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzall;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/js/zzae;->げつ〴ぬぐ:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/js/zzae;->〺つふすそ:Lcom/google/android/gms/internal/zzaiq;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/js/zzae;->くし〴〺ぅ:Z

    iput p1, p0, Lcom/google/android/gms/ads/internal/js/zzae;->びぐびあび:I

    return-void
.end method


# virtual methods
.method public final zzlp()Lcom/google/android/gms/ads/internal/js/zzaa;
    .registers 5

    new-instance v0, Lcom/google/android/gms/ads/internal/js/zzaa;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/internal/js/zzaa;-><init>(Lcom/google/android/gms/ads/internal/js/zzae;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/js/zzae;->げつ〴ぬぐ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_8
    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/びぐびあび;

    invoke-direct {v2, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/びぐびあび;-><init>(Lcom/google/android/gms/ads/internal/js/zzaa;)V

    new-instance v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/づざかべべ;

    invoke-direct {v3, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/づざかべべ;-><init>(Lcom/google/android/gms/ads/internal/js/zzaa;)V

    invoke-virtual {p0, v2, v3}, Lcom/google/android/gms/internal/zzall;->zza(Lcom/google/android/gms/internal/zzalk;Lcom/google/android/gms/internal/zzali;)V

    iget v2, p0, Lcom/google/android/gms/ads/internal/js/zzae;->びぐびあび:I

    const/4 v3, 0x1

    if-ltz v2, :cond_1c

    const/4 v2, 0x1

    goto :goto_1d

    :cond_1c
    const/4 v2, 0x0

    :goto_1d
    invoke-static {v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->づざかべべ(Z)V

    iget v2, p0, Lcom/google/android/gms/ads/internal/js/zzae;->びぐびあび:I

    add-int/2addr v2, v3

    iput v2, p0, Lcom/google/android/gms/ads/internal/js/zzae;->びぐびあび:I

    monitor-exit v1

    return-object v0

    :catchall_27
    move-exception v0

    monitor-exit v1
    :try_end_29
    .catchall {:try_start_8 .. :try_end_29} :catchall_27

    throw v0
.end method

.method public final zzlr()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/js/zzae;->げつ〴ぬぐ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget v1, p0, Lcom/google/android/gms/ads/internal/js/zzae;->びぐびあび:I

    const/4 v2, 0x1

    if-ltz v1, :cond_a

    const/4 v1, 0x1

    goto :goto_b

    :cond_a
    const/4 v1, 0x0

    :goto_b
    invoke-static {v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->づざかべべ(Z)V

    const-string v1, "Releasing root reference. JS Engine will be destroyed once other references are released."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    iput-boolean v2, p0, Lcom/google/android/gms/ads/internal/js/zzae;->くし〴〺ぅ:Z

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/js/zzae;->〺つふすそ()V

    monitor-exit v0

    return-void

    :catchall_1a
    move-exception v1

    monitor-exit v0
    :try_end_1c
    .catchall {:try_start_3 .. :try_end_1c} :catchall_1a

    throw v1
.end method

.method public final 〺つふすそ()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/js/zzae;->げつ〴ぬぐ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget v1, p0, Lcom/google/android/gms/ads/internal/js/zzae;->びぐびあび:I

    if-ltz v1, :cond_9

    const/4 v1, 0x1

    goto :goto_a

    :cond_9
    const/4 v1, 0x0

    :goto_a
    invoke-static {v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->づざかべべ(Z)V

    iget-boolean v1, p0, Lcom/google/android/gms/ads/internal/js/zzae;->くし〴〺ぅ:Z

    if-eqz v1, :cond_28

    iget v1, p0, Lcom/google/android/gms/ads/internal/js/zzae;->びぐびあび:I

    if-nez v1, :cond_28

    const-string v1, "No reference is left (including root). Cleaning up engine."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/なぎぱいぢぎ;

    invoke-direct {v1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/なぎぱいぢぎ;-><init>(Lcom/google/android/gms/ads/internal/js/zzae;)V

    new-instance v2, Lcom/google/android/gms/internal/zzalj;

    invoke-direct {v2}, Lcom/google/android/gms/internal/zzalj;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/zzall;->zza(Lcom/google/android/gms/internal/zzalk;Lcom/google/android/gms/internal/zzali;)V

    goto :goto_2d

    :cond_28
    const-string v1, "There are still references to the engine. Not destroying."

    invoke-static {v1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    :goto_2d
    monitor-exit v0

    return-void

    :catchall_2f
    move-exception v1

    monitor-exit v0
    :try_end_31
    .catchall {:try_start_3 .. :try_end_31} :catchall_2f

    throw v1
.end method

.method public final げつ〴ぬぐ()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/js/zzae;->げつ〴ぬぐ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget v1, p0, Lcom/google/android/gms/ads/internal/js/zzae;->びぐびあび:I

    const/4 v2, 0x1

    if-lez v1, :cond_a

    const/4 v1, 0x1

    goto :goto_b

    :cond_a
    const/4 v1, 0x0

    :goto_b
    invoke-static {v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->づざかべべ(Z)V

    const-string v1, "Releasing 1 reference for JS Engine"

    invoke-static {v1}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    iget v1, p0, Lcom/google/android/gms/ads/internal/js/zzae;->びぐびあび:I

    sub-int/2addr v1, v2

    iput v1, p0, Lcom/google/android/gms/ads/internal/js/zzae;->びぐびあび:I

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/js/zzae;->〺つふすそ()V

    monitor-exit v0

    return-void

    :catchall_1d
    move-exception v1

    monitor-exit v0
    :try_end_1f
    .catchall {:try_start_3 .. :try_end_1f} :catchall_1d

    throw v1
.end method
