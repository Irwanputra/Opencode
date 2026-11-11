.class public Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->びぐびあび(L〳ぜぞぜべっ/なぶひせが;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:L〳ぜぞぜべっ/なぶひせが;

.field public final synthetic くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;L〳ぜぞぜべっ/なぶひせが;)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$〺つふすそ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    iput-object p2, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$〺つふすそ;->〺つふすそ:L〳ぜぞぜべっ/なぶひせが;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$〺つふすそ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->でどあくず:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/づざかべべ;

    if-eqz v0, :cond_d

    .line 2
    iget-object v1, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$〺つふすそ;->〺つふすそ:L〳ぜぞぜべっ/なぶひせが;

    check-cast v0, Lteam/dev/epro/apkcustom/activities/SSHGenerator$げつ〴ぬぐ;

    invoke-virtual {v0, v1}, Lteam/dev/epro/apkcustom/activities/SSHGenerator$げつ〴ぬぐ;->げつ〴ぬぐ(L〳ぜぞぜべっ/なぶひせが;)V

    :cond_d
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび$〺つふすそ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    invoke-virtual {v0}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ぁごぐすすぃ()V

    return-void
.end method
