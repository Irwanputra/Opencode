.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/づざかべべ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/づざかべべ;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/くし〴〺ぅ;I)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/づざかべべ;

    invoke-direct {v0, p1, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/づざかべべ;-><init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/くし〴〺ぅ;I)V

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/づざかべべ;

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/のぷのちつ/づざかべべ;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method
