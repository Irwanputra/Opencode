.class public abstract Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$〺つふすそ;,
        Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$〺つふすそ;

.field public げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$〺つふすそ;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$〺つふすそ;

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    :cond_b
    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$〺つふすそ;

    return-void
.end method

.method public 〺つふすそ()Z
    .registers 2

    const/4 v0, 0x1

    return v0
.end method

.method public ぁごぐすすぃ()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public abstract くし〴〺ぅ()Landroid/view/View;
.end method

.method public げつ〴ぬぐ()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public づざかべべ()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public なぎぱいぢぎ(Landroid/view/SubMenu;)V
    .registers 2

    return-void
.end method

.method public びぐびあび(Landroid/view/MenuItem;)Landroid/view/View;
    .registers 2

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;->くし〴〺ぅ()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public ぺぁあねじ(Z)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$げつ〴ぬぐ;

    if-eqz v0, :cond_1a

    check-cast v0, Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz p1, :cond_12

    .line 1
    iget-object p1, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;

    if-eqz p1, :cond_1a

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {p1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)Z

    goto :goto_1a

    .line 2
    :cond_12
    iget-object p1, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/〺つふすそ;->びぐびあび:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz p1, :cond_1a

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->くし〴〺ぅ(Z)V

    :cond_1a
    :goto_1a
    return-void
.end method
