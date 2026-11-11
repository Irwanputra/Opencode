.class public Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;
.super Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public ぁごぐすすぃ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

.field public なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;

.field public びぐびあび:Landroid/content/Context;

.field public ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;Z)V
    .registers 5

    invoke-direct {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;-><init>()V

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->びぐびあび:Landroid/content/Context;

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    iput-object p3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;

    new-instance p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    .line 1
    iput p2, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->てぜきぽく:I

    .line 2
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 3
    iput-object p0, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->づざかべべ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 2

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->ぺぁあねじ()V

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 1
    iget-object p1, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/げつ〴ぬぐ;->づざかべべ:Landroidx/appcompat/widget/ActionMenuPresenter;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionMenuPresenter;->ぇぬぎばつ()Z

    :cond_c
    return-void
.end method

.method public ぁごぐすすぃ()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public いいにぽつ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    .line 1
    iget-boolean v0, v0, Landroidx/appcompat/widget/ActionBarContextView;->は〲ぱなで:Z

    return v0
.end method

.method public ぇぬぎばつ(Z)V
    .registers 3

    .line 1
    iput-boolean p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;->くし〴〺ぅ:Z

    .line 2
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method

.method public おぐぴう〸ず(Ljava/lang/CharSequence;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public くし〴〺ぅ()V
    .registers 3

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->〳ぜぞぜべっ:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->〳ぜぞぜべっ:Z

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-interface {v0, p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;)V

    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/MenuItem;)Z
    .registers 3

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-interface {p1, p0, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public づざかべべ()Landroid/view/Menu;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    return-object v0
.end method

.method public てぜきぽく(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->びぐびあび:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public なぎぱいぢぎ()Landroid/view/MenuInflater;
    .registers 3

    new-instance v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public のぷのちつ(Ljava/lang/CharSequence;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public びぐびあび()Landroid/view/View;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->ぁごぐすすぃ:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    return-object v0
.end method

.method public へぬ〴づぞ(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->びぐびあび:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ぺぁあねじ()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0, p0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/げつ〴ぬぐ;Landroid/view/Menu;)Z

    return-void
.end method

.method public ぺふねづ〺(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->づざかべべ:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    if-eqz p1, :cond_d

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/びぐびあび;->ぁごぐすすぃ:Ljava/lang/ref/WeakReference;

    return-void
.end method
