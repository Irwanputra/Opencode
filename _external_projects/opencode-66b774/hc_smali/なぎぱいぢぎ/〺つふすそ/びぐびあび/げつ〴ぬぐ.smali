.class public Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;
.super Ljava/lang/Exception;
.source ""


# instance fields
.field public 〺つふすそ:L〳ぜぞぜべっ/なぶひせが;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .registers 2

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(L〳ぜぞぜべっ/なぶひせが;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/なぶひせが;

    return-void
.end method
