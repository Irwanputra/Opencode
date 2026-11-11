.class public final L〳ぜぞぜべっ/ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final ぁごぐすすぃ:Ljava/util/concurrent/Executor;


# instance fields
.field public final 〺つふすそ:J

.field public final くし〴〺ぅ:Ljava/lang/Runnable;

.field public final げつ〴ぬぐ:I

.field public final づざかべべ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/びぐびあび;

.field public なぎぱいぢぎ:Z

.field public final びぐびあび:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3049\u3072\u306e\u3079\u3044/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 10

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const-wide/16 v3, 0x3c

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v0, 0x1

    .line 1
    sget-object v7, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->げつ〴ぬぐ:[B

    new-instance v7, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;

    const-string v9, "OkHttp ConnectionPool"

    invoke-direct {v7, v9, v0}, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;-><init>(Ljava/lang/String;Z)V

    move-object v0, v8

    .line 2
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v8, L〳ぜぞぜべっ/ぁごぐすすぃ;->ぁごぐすすぃ:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .registers 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, L〳ぜぞぜべっ/ぁごぐすすぃ$げつ〴ぬぐ;

    invoke-direct {v1, p0}, L〳ぜぞぜべっ/ぁごぐすすぃ$げつ〴ぬぐ;-><init>(L〳ぜぞぜべっ/ぁごぐすすぃ;)V

    iput-object v1, p0, L〳ぜぞぜべっ/ぁごぐすすぃ;->くし〴〺ぅ:Ljava/lang/Runnable;

    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, L〳ぜぞぜべっ/ぁごぐすすぃ;->びぐびあび:Ljava/util/Deque;

    new-instance v1, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/びぐびあび;

    invoke-direct {v1}, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/びぐびあび;-><init>()V

    iput-object v1, p0, L〳ぜぞぜべっ/ぁごぐすすぃ;->づざかべべ:L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/びぐびあび;

    const/4 v1, 0x5

    iput v1, p0, L〳ぜぞぜべっ/ぁごぐすすぃ;->げつ〴ぬぐ:I

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, L〳ぜぞぜべっ/ぁごぐすすぃ;->〺つふすそ:J

    return-void
.end method


# virtual methods
.method public final げつ〴ぬぐ(L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;J)I
    .registers 10

    iget-object v0, p1, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->へぬ〴づぞ:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_4
    :goto_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_4c

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/Reference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_19

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_19
    check-cast v3, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ$げつ〴ぬぐ;

    const-string v4, "A connection to "

    invoke-static {v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 1
    iget-object v5, p1, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:L〳ぜぞぜべっ/じぜこほぱ;

    .line 2
    iget-object v5, v5, L〳ぜぞぜべっ/じぜこほぱ;->げつ〴ぬぐ:L〳ぜぞぜべっ/げつ〴ぬぐ;

    .line 3
    iget-object v5, v5, L〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    .line 4
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " was leaked. Did you forget to close a response body?"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 5
    sget-object v5, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    .line 6
    iget-object v3, v3, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/ぁごぐすすぃ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/Object;

    invoke-virtual {v5, v4, v3}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->てぜきぽく(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 v3, 0x1

    iput-boolean v3, p1, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->ぺふねづ〺:Z

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    iget-wide v2, p0, L〳ぜぞぜべっ/ぁごぐすすぃ;->〺つふすそ:J

    sub-long/2addr p2, v2

    iput-wide p2, p1, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/くし〴〺ぅ;->おぐぴう〸ず:J

    return v1

    :cond_4c
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method
