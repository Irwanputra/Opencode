.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;
.super Landroidx/appcompat/app/ActionBar;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$びぐびあび;,
        Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$くし〴〺ぅ;,
        Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$づざかべべ;
    }
.end annotation


# instance fields
.field public final 〳ぜぞぜべっ:Landroidx/appcompat/widget/Toolbar$づざかべべ;

.field public 〺つふすそ:Z

.field public final ぁごぐすすぃ:Ljava/lang/Runnable;

.field public くし〴〺ぅ:Landroid/view/Window$Callback;

.field public げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

.field public づざかべべ:Z

.field public なぎぱいぢぎ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/appcompat/app/ActionBar$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V
    .registers 7

    invoke-direct {p0}, Landroidx/appcompat/app/ActionBar;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->なぎぱいぢぎ:Ljava/util/ArrayList;

    new-instance v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->ぁごぐすすぃ:Ljava/lang/Runnable;

    new-instance v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$〺つふすそ;

    invoke-direct {v0, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$〺つふすそ;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->〳ぜぞぜべっ:Landroidx/appcompat/widget/Toolbar$づざかべべ;

    new-instance v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    new-instance v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$づざかべべ;

    invoke-direct {v1, p0, p3}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$づざかべべ;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;Landroid/view/Window$Callback;)V

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->くし〴〺ぅ:Landroid/view/Window$Callback;

    iget-object p3, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {p3, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->setWindowCallback(Landroid/view/Window$Callback;)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Landroidx/appcompat/widget/Toolbar$づざかべべ;)V

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->ぺぁあねじ()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->ぁごぐすすぃ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public 〺つふすそ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->ぺふねづ〺()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->collapseActionView()V

    const/4 v0, 0x1

    return v0

    :cond_f
    const/4 v0, 0x0

    return v0
.end method

.method public ぁごぐすすぃ(Landroid/content/res/Configuration;)V
    .registers 2

    return-void
.end method

.method public いいにぽつ(Landroid/view/KeyEvent;)Z
    .registers 3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_c

    .line 1
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->びぐびあび()Z

    :cond_c
    return v0
.end method

.method public ぇぬぎばつ(Z)V
    .registers 2

    return-void
.end method

.method public ぉざぅち〻(Ljava/lang/CharSequence;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public おぐぴう〸ず(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->ざっざへづ(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public くし〴〺ぅ(Z)V
    .registers 5

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->づざかべべ:Z

    if-ne p1, v0, :cond_5

    return-void

    :cond_5
    iput-boolean p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->づざかべべ:Z

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_e
    if-ge v1, v0, :cond_1e

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/ActionBar$げつ〴ぬぐ;

    invoke-interface {v2, p1}, Landroidx/appcompat/app/ActionBar$げつ〴ぬぐ;->げつ〴ぬぐ(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_1e
    return-void
.end method

.method public げつ〴ぬぐ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->くし〴〺ぅ()Z

    move-result v0

    return v0
.end method

.method public final ごづごきえ()Landroid/view/Menu;
    .registers 4

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->びぐびあび:Z

    if-nez v0, :cond_16

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    new-instance v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$くし〴〺ぅ;

    invoke-direct {v1, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$くし〴〺ぅ;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;)V

    new-instance v2, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$びぐびあび;

    invoke-direct {v2, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ$びぐびあび;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;)V

    invoke-interface {v0, v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->ぁごぐすすぃ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ$げつ〴ぬぐ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$げつ〴ぬぐ;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->びぐびあび:Z

    :cond_16
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->へぬ〴づぞ()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method

.method public ざとぅぼこ〺(Ljava/lang/CharSequence;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public づざかべべ()Landroid/content/Context;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public てぜきぽく(Z)V
    .registers 2

    return-void
.end method

.method public なぎぱいぢぎ()Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->ぺぁあねじ()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->ぁごぐすすぃ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->ぺぁあねじ()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->ぁごぐすすぃ:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぅみぱぎぎ(Landroid/view/View;Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    return v0
.end method

.method public のぷのちつ(Z)V
    .registers 5

    const/4 v0, 0x4

    if-eqz p1, :cond_5

    const/4 p1, 0x4

    goto :goto_6

    :cond_5
    const/4 p1, 0x0

    .line 1
    :goto_6
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->のぷのちつ()I

    move-result v1

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    and-int/2addr p1, v0

    const/4 v0, -0x5

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    invoke-interface {v2, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->てぜきぽく(I)V

    return-void
.end method

.method public びぐびあび()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->のぷのちつ()I

    move-result v0

    return v0
.end method

.method public へぬ〴づぞ(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->ぇぬぎばつ(I)V

    return-void
.end method

.method public ぺぁあねじ(ILandroid/view/KeyEvent;)Z
    .registers 7

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->ごづごきえ()Landroid/view/Menu;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_24

    if-eqz p2, :cond_e

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    goto :goto_f

    :cond_e
    const/4 v2, -0x1

    :goto_f
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1b

    goto :goto_1c

    :cond_1b
    const/4 v3, 0x0

    :goto_1c
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_24
    return v1
.end method

.method public ぺふねづ〺()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざっざへづ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おぐぴう〸ず;->びぐびあび()Z

    move-result v0

    return v0
.end method
