.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public げつ〴ぬぐ:Ljava/util/logging/Logger;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object p1

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    return-void
.end method


# virtual methods
.method public final 〺つふすそ(ILjava/lang/String;Ljava/lang/Throwable;)V
    .registers 6

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    const/16 v1, 0x14

    if-gt p1, v1, :cond_9

    .line 1
    sget-object p1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    goto :goto_12

    :cond_9
    const/16 v1, 0x32

    if-gt p1, v1, :cond_10

    sget-object p1, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    goto :goto_12

    :cond_10
    sget-object p1, Ljava/util/logging/Level;->FINEST:Ljava/util/logging/Level;

    .line 2
    :goto_12
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final げつ〴ぬぐ(ILjava/lang/String;)V
    .registers 5

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    const/16 v1, 0x14

    if-gt p1, v1, :cond_9

    .line 1
    sget-object p1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    goto :goto_12

    :cond_9
    const/16 v1, 0x32

    if-gt p1, v1, :cond_10

    sget-object p1, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    goto :goto_12

    :cond_10
    sget-object p1, Ljava/util/logging/Level;->FINEST:Ljava/util/logging/Level;

    .line 2
    :goto_12
    invoke-virtual {v0, p1, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    return-void
.end method
