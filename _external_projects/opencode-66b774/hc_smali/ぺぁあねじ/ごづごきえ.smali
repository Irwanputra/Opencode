.class public final Lぺぁあねじ/ごづごきえ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static 〺つふすそ:J

.field public static げつ〴ぬぐ:Lぺぁあねじ/は〲ぱなで;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 〺つふすそ()Lぺぁあねじ/は〲ぱなで;
    .registers 6

    const-class v0, Lぺぁあねじ/ごづごきえ;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ:Lぺぁあねじ/は〲ぱなで;

    if-eqz v1, :cond_17

    iget-object v2, v1, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    sput-object v2, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ:Lぺぁあねじ/は〲ぱなで;

    const/4 v2, 0x0

    iput-object v2, v1, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    sget-wide v2, Lぺぁあねじ/ごづごきえ;->〺つふすそ:J

    const-wide/16 v4, 0x2000

    sub-long/2addr v2, v4

    sput-wide v2, Lぺぁあねじ/ごづごきえ;->〺つふすそ:J

    monitor-exit v0

    return-object v1

    :cond_17
    monitor-exit v0
    :try_end_18
    .catchall {:try_start_3 .. :try_end_18} :catchall_1e

    new-instance v0, Lぺぁあねじ/は〲ぱなで;

    invoke-direct {v0}, Lぺぁあねじ/は〲ぱなで;-><init>()V

    return-object v0

    :catchall_1e
    move-exception v1

    :try_start_1f
    monitor-exit v0
    :try_end_20
    .catchall {:try_start_1f .. :try_end_20} :catchall_1e

    throw v1
.end method

.method public static げつ〴ぬぐ(Lぺぁあねじ/は〲ぱなで;)V
    .registers 7

    iget-object v0, p0, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    if-nez v0, :cond_30

    iget-object v0, p0, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    if-nez v0, :cond_30

    iget-boolean v0, p0, Lぺぁあねじ/は〲ぱなで;->びぐびあび:Z

    if-eqz v0, :cond_d

    return-void

    :cond_d
    const-class v0, Lぺぁあねじ/ごづごきえ;

    monitor-enter v0

    :try_start_10
    sget-wide v1, Lぺぁあねじ/ごづごきえ;->〺つふすそ:J

    const-wide/16 v3, 0x2000

    add-long/2addr v1, v3

    const-wide/32 v3, 0x10000

    cmp-long v5, v1, v3

    if-lez v5, :cond_1e

    monitor-exit v0

    return-void

    :cond_1e
    sput-wide v1, Lぺぁあねじ/ごづごきえ;->〺つふすそ:J

    sget-object v1, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ:Lぺぁあねじ/は〲ぱなで;

    iput-object v1, p0, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    const/4 v1, 0x0

    iput v1, p0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iput v1, p0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sput-object p0, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ:Lぺぁあねじ/は〲ぱなで;

    monitor-exit v0

    return-void

    :catchall_2d
    move-exception p0

    monitor-exit v0
    :try_end_2f
    .catchall {:try_start_10 .. :try_end_2f} :catchall_2d

    throw p0

    :cond_30
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method
