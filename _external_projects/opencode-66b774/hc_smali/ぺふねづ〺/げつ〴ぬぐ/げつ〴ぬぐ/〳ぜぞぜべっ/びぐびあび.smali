.class public Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/びぐびあび;
.super Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "L\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3033\u305c\u305e\u305c\u3079\u3063/\u3065\u3056\u304b\u3079\u3079<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Landroid/content/Context;
    .registers 4

    .line 1
    iget-object v0, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_9

    check-cast v0, Landroid/content/Context;

    return-object v0

    :cond_9
    instance-of v1, v0, Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_14

    check-cast v0, Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->いいにぽつ()Landroid/content/Context;

    move-result-object v0

    return-object v0

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown host: "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/づざかべべ;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 4
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public varargs げつ〴ぬぐ(I[Ljava/lang/String;)V
    .registers 3

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Should never be requesting permissions on API < 23!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public varargs づざかべべ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II[Ljava/lang/String;)V
    .registers 7

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Should never be requesting permissions on API < 23!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public びぐびあび(Ljava/lang/String;)Z
    .registers 2

    const/4 p1, 0x0

    return p1
.end method
