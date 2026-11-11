.class public Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ;
.super Ljava/util/concurrent/ThreadPoolExecutor;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# direct methods
.method public constructor <init>(ILjava/util/concurrent/ThreadFactory;)V
    .registers 11

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    const-wide/16 v3, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    return-void
.end method


# virtual methods
.method public submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    check-cast p1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/〺つふすそ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/なぎぱいぢぎ;)V

    invoke-virtual {p0, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method
