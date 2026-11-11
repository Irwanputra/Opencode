.class public final L〳ぜぞぜべっ/〻ぞまぎな〻$げつ〴ぬぐ;
.super L〳ぜぞぜべっ/ぉひのべい/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/〻ぞまぎな〻;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 2

    const/4 v0, 0x0

    :try_start_1
    throw v0
    :try_end_2
    .catchall {:try_start_1 .. :try_end_2} :catchall_2

    :catchall_2
    throw v0
.end method
