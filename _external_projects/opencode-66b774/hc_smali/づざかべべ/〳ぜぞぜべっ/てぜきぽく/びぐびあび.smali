.class public Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/びぐびあび;
.super Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u3066\u305c\u304d\u307d\u304f/\u304f\u3057\u3034\u303a\u3045<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final くし〴〺ぅ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .registers 2

    invoke-direct {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;-><init>(I)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/びぐびあび;->くし〴〺ぅ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Ljava/lang/Object;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/びぐびあび;->くし〴〺ぅ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-super {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->〺つふすそ(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_9
    move-exception p1

    monitor-exit v0
    :try_end_b
    .catchall {:try_start_3 .. :try_end_b} :catchall_9

    throw p1
.end method

.method public げつ〴ぬぐ()Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/びぐびあび;->くし〴〺ぅ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-super {p0}, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/くし〴〺ぅ;->げつ〴ぬぐ()Ljava/lang/Object;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_9
    move-exception v1

    monitor-exit v0
    :try_end_b
    .catchall {:try_start_3 .. :try_end_b} :catchall_9

    throw v1
.end method
