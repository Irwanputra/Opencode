.class public final Lぺぁあねじ/くし〴〺ぅ$げつ〴ぬぐ;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lぺぁあねじ/くし〴〺ぅ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 2

    const-string v0, "Okio Watchdog"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 4

    :catch_0
    :goto_0
    :try_start_0
    const-class v0, Lぺぁあねじ/くし〴〺ぅ;

    monitor-enter v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_3} :catch_0

    :try_start_3
    invoke-static {}, Lぺぁあねじ/くし〴〺ぅ;->〳ぜぞぜべっ()Lぺぁあねじ/くし〴〺ぅ;

    move-result-object v1

    if-nez v1, :cond_b

    monitor-exit v0

    goto :goto_0

    :cond_b
    sget-object v2, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/くし〴〺ぅ;

    if-ne v1, v2, :cond_14

    const/4 v1, 0x0

    sput-object v1, Lぺぁあねじ/くし〴〺ぅ;->いいにぽつ:Lぺぁあねじ/くし〴〺ぅ;

    monitor-exit v0

    return-void

    :cond_14
    monitor-exit v0
    :try_end_15
    .catchall {:try_start_3 .. :try_end_15} :catchall_19

    :try_start_15
    invoke-virtual {v1}, Lぺぁあねじ/くし〴〺ぅ;->のぷのちつ()V
    :try_end_18
    .catch Ljava/lang/InterruptedException; {:try_start_15 .. :try_end_18} :catch_0

    goto :goto_0

    :catchall_19
    move-exception v1

    :try_start_1a
    monitor-exit v0
    :try_end_1b
    .catchall {:try_start_1a .. :try_end_1b} :catchall_19

    :try_start_1b
    goto :goto_1d
    :try_end_1c
    .catch Ljava/lang/InterruptedException; {:try_start_1b .. :try_end_1c} :catch_0

    :goto_1c
    throw v1

    :goto_1d
    goto :goto_1c
.end method
