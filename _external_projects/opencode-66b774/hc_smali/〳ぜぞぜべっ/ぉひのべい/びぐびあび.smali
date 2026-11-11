.class public final L〳ぜぞぜべっ/ぉひのべい/びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final synthetic 〺つふすそ:Z

.field public final synthetic げつ〴ぬぐ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .registers 3

    iput-object p1, p0, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;->げつ〴ぬぐ:Ljava/lang/String;

    iput-boolean p2, p0, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;->〺つふすそ:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .registers 4

    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iget-boolean p1, p0, L〳ぜぞぜべっ/ぉひのべい/びぐびあび;->〺つふすそ:Z

    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0
.end method
