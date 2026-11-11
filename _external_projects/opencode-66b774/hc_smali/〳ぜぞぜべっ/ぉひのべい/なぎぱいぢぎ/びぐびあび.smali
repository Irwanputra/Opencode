.class public final L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/びぐびあび;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final げつ〴ぬぐ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "L\u3033\u305c\u305e\u305c\u3079\u3063/\u3058\u305c\u3053\u307b\u3071;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/びぐびあび;->げつ〴ぬぐ:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public declared-synchronized げつ〴ぬぐ(L〳ぜぞぜべっ/じぜこほぱ;)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, L〳ぜぞぜべっ/ぉひのべい/なぎぱいぢぎ/びぐびあび;->げつ〴ぬぐ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_1 .. :try_end_6} :catchall_8

    monitor-exit p0

    return-void

    :catchall_8
    move-exception p1

    monitor-exit p0

    throw p1
.end method
