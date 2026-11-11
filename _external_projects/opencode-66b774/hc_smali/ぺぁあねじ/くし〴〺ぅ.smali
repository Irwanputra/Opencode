.class public Lぺぁあねじ/くし〴〺ぅ;
.super Lぺぁあねじ/〻ぞまぎな〻;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lぺぁあねじ/くし〴〺ぅ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final 〳ぜぞぜべっ:J

.field public static いいにぽつ:Lぺぁあねじ/くし〴〺ぅ;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public static final ぺぁあねじ:J


# instance fields
.field public ぁごぐすすぃ:J

.field public づざかべべ:Z

.field public なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lぺぁあねじ/くし〴〺ぅ;->〳ぜぞぜべっ:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lぺぁあねじ/くし〴〺ぅ;->ぺぁあねじ:J

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lぺぁあねじ/〻ぞまぎな〻;-><init>()V

    return-void
.end method

.method public static 〳ぜぞぜべっ()Lぺぁあねじ/くし〴〺ぅ;
    .registers 9
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-class v0, Lぺぁあねじ/くし〴〺ぅ;

    sget-object v1, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/くし〴〺ぅ;

    iget-object v1, v1, Lぺぁあねじ/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;

    const/4 v2, 0x0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    if-nez v1, :cond_26

    sget-wide v5, Lぺぁあねじ/くし〴〺ぅ;->〳ぜぞぜべっ:J

    invoke-virtual {v0, v5, v6}, Ljava/lang/Object;->wait(J)V

    sget-object v0, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/くし〴〺ぅ;

    iget-object v0, v0, Lぺぁあねじ/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;

    if-nez v0, :cond_25

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sub-long/2addr v0, v3

    sget-wide v3, Lぺぁあねじ/くし〴〺ぅ;->ぺぁあねじ:J

    cmp-long v5, v0, v3

    if-ltz v5, :cond_25

    sget-object v2, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/くし〴〺ぅ;

    :cond_25
    return-object v2

    .line 1
    :cond_26
    iget-wide v5, v1, Lぺぁあねじ/くし〴〺ぅ;->ぁごぐすすぃ:J

    sub-long/2addr v5, v3

    const-wide/16 v3, 0x0

    cmp-long v7, v5, v3

    if-lez v7, :cond_3c

    const-wide/32 v3, 0xf4240

    .line 2
    div-long v7, v5, v3

    mul-long v3, v3, v7

    sub-long/2addr v5, v3

    long-to-int v1, v5

    invoke-virtual {v0, v7, v8, v1}, Ljava/lang/Object;->wait(JI)V

    return-object v2

    :cond_3c
    sget-object v0, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/くし〴〺ぅ;

    iget-object v3, v1, Lぺぁあねじ/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;

    iput-object v3, v0, Lぺぁあねじ/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;

    iput-object v2, v1, Lぺぁあねじ/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;

    return-object v1
.end method


# virtual methods
.method public final いいにぽつ(Z)V
    .registers 3

    invoke-virtual {p0}, Lぺぁあねじ/くし〴〺ぅ;->ぺふねづ〺()Z

    move-result v0

    if-eqz v0, :cond_f

    if-nez p1, :cond_9

    goto :goto_f

    :cond_9
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lぺぁあねじ/くし〴〺ぅ;->てぜきぽく(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_f
    :goto_f
    return-void
.end method

.method public てぜきぽく(Ljava/io/IOException;)Ljava/io/IOException;
    .registers 4
    .param p1    # Ljava/io/IOException;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_c

    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_c
    return-object v0
.end method

.method public のぷのちつ()V
    .registers 1

    return-void
.end method

.method public final ぺぁあねじ()V
    .registers 11

    iget-boolean v0, p0, Lぺぁあねじ/くし〴〺ぅ;->づざかべべ:Z

    if-nez v0, :cond_77

    .line 1
    iget-wide v0, p0, Lぺぁあねじ/〻ぞまぎな〻;->くし〴〺ぅ:J

    .line 2
    iget-boolean v2, p0, Lぺぁあねじ/〻ぞまぎな〻;->げつ〴ぬぐ:Z

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-nez v5, :cond_11

    if-nez v2, :cond_11

    return-void

    :cond_11
    const/4 v5, 0x1

    .line 3
    iput-boolean v5, p0, Lぺぁあねじ/くし〴〺ぅ;->づざかべべ:Z

    .line 4
    const-class v5, Lぺぁあねじ/くし〴〺ぅ;

    monitor-enter v5

    :try_start_17
    sget-object v6, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/くし〴〺ぅ;

    if-nez v6, :cond_2a

    new-instance v6, Lぺぁあねじ/くし〴〺ぅ;

    invoke-direct {v6}, Lぺぁあねじ/くし〴〺ぅ;-><init>()V

    sput-object v6, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/くし〴〺ぅ;

    new-instance v6, Lぺぁあねじ/くし〴〺ぅ$げつ〴ぬぐ;

    invoke-direct {v6}, Lぺぁあねじ/くし〴〺ぅ$げつ〴ぬぐ;-><init>()V

    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    :cond_2a
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    cmp-long v8, v0, v3

    if-eqz v8, :cond_3e

    if-eqz v2, :cond_3e

    invoke-virtual {p0}, Lぺぁあねじ/〻ぞまぎな〻;->くし〴〺ぅ()J

    move-result-wide v2

    sub-long/2addr v2, v6

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    goto :goto_42

    :cond_3e
    cmp-long v8, v0, v3

    if-eqz v8, :cond_46

    :goto_42
    add-long/2addr v0, v6

    iput-wide v0, p0, Lぺぁあねじ/くし〴〺ぅ;->ぁごぐすすぃ:J

    goto :goto_4e

    :cond_46
    if-eqz v2, :cond_6e

    invoke-virtual {p0}, Lぺぁあねじ/〻ぞまぎな〻;->くし〴〺ぅ()J

    move-result-wide v0

    iput-wide v0, p0, Lぺぁあねじ/くし〴〺ぅ;->ぁごぐすすぃ:J

    .line 5
    :goto_4e
    iget-wide v0, p0, Lぺぁあねじ/くし〴〺ぅ;->ぁごぐすすぃ:J

    sub-long/2addr v0, v6

    .line 6
    sget-object v2, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/くし〴〺ぅ;

    :goto_53
    iget-object v3, v2, Lぺぁあねじ/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;

    if-eqz v3, :cond_61

    .line 7
    iget-wide v8, v3, Lぺぁあねじ/くし〴〺ぅ;->ぁごぐすすぃ:J

    sub-long/2addr v8, v6

    cmp-long v4, v0, v8

    if-gez v4, :cond_5f

    goto :goto_61

    :cond_5f
    move-object v2, v3

    goto :goto_53

    .line 8
    :cond_61
    :goto_61
    iput-object v3, p0, Lぺぁあねじ/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;

    iput-object p0, v2, Lぺぁあねじ/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;

    sget-object v0, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/くし〴〺ぅ;

    if-ne v2, v0, :cond_6c

    invoke-virtual {v5}, Ljava/lang/Object;->notify()V
    :try_end_6c
    .catchall {:try_start_17 .. :try_end_6c} :catchall_74

    :cond_6c
    monitor-exit v5

    return-void

    :cond_6e
    :try_start_6e
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_74
    .catchall {:try_start_6e .. :try_end_74} :catchall_74

    :catchall_74
    move-exception v0

    monitor-exit v5

    throw v0

    .line 9
    :cond_77
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unbalanced enter/exit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_80

    :goto_7f
    throw v0

    :goto_80
    goto :goto_7f
.end method

.method public final ぺふねづ〺()Z
    .registers 5

    iget-boolean v0, p0, Lぺぁあねじ/くし〴〺ぅ;->づざかべべ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    iput-boolean v1, p0, Lぺぁあねじ/くし〴〺ぅ;->づざかべべ:Z

    .line 1
    const-class v0, Lぺぁあねじ/くし〴〺ぅ;

    monitor-enter v0

    :try_start_b
    sget-object v2, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/くし〴〺ぅ;

    :goto_d
    if-eqz v2, :cond_1d

    iget-object v3, v2, Lぺぁあねじ/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;

    if-ne v3, p0, :cond_1b

    iget-object v3, p0, Lぺぁあねじ/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;

    iput-object v3, v2, Lぺぁあねじ/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;

    const/4 v2, 0x0

    iput-object v2, p0, Lぺぁあねじ/くし〴〺ぅ;->なぎぱいぢぎ:Lぺぁあねじ/くし〴〺ぅ;
    :try_end_1a
    .catchall {:try_start_b .. :try_end_1a} :catchall_20

    goto :goto_1e

    :cond_1b
    move-object v2, v3

    goto :goto_d

    :cond_1d
    const/4 v1, 0x1

    :goto_1e
    monitor-exit v0

    return v1

    :catchall_20
    move-exception v1

    monitor-exit v0

    goto :goto_24

    :goto_23
    throw v1

    :goto_24
    goto :goto_23
.end method
