.class public Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$〺つふすそ;
.super Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;
.source ""

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public づざかべべ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$〺つふすそ;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;Landroid/content/Context;Landroid/view/ActionProvider;)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;Landroid/content/Context;Landroid/view/ActionProvider;)V

    return-void
.end method


# virtual methods
.method public onActionProviderVisibilityChanged(Z)V
    .registers 3

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$〺つふすそ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$〺つふすそ;

    if-eqz p1, :cond_10

    check-cast p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ$げつ〴ぬぐ;

    .line 1
    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->へぬ〴づぞ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->〳ぜぞぜべっ:Z

    invoke-virtual {p1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぉざぅち〻(Z)V

    :cond_10
    return-void
.end method

.method public 〳ぜぞぜべっ(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$〺つふすそ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$〺つふすそ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ$〺つふすそ;

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ActionProvider;

    invoke-virtual {p1, p0}, Landroid/view/ActionProvider;->setVisibilityListener(Landroid/view/ActionProvider$VisibilityListener;)V

    return-void
.end method

.method public 〺つふすそ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->isVisible()Z

    move-result v0

    return v0
.end method

.method public ぁごぐすすぃ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->overridesItemVisibility()Z

    move-result v0

    return v0
.end method

.method public びぐびあび(Landroid/view/MenuItem;)Landroid/view/View;
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/view/ActionProvider;

    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
