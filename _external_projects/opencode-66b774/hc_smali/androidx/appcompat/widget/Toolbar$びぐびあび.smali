.class public Landroidx/appcompat/widget/Toolbar$びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/のぷのちつ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/Toolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

.field public くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

.field public final synthetic びぐびあび:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public 〳ぜぞぜべっ()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public ぁごぐすすぃ(Z)V
    .registers 6

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    if-eqz p1, :cond_28

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    const/4 v0, 0x0

    if-eqz p1, :cond_1f

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->size()I

    move-result p1

    const/4 v1, 0x0

    :goto_e
    if-ge v1, p1, :cond_1f

    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v2, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    if-ne v2, v3, :cond_1c

    const/4 v0, 0x1

    goto :goto_1f

    :cond_1c
    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_1f
    :goto_1f
    if-nez v0, :cond_28

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/Toolbar$びぐびあび;->いいにぽつ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)Z

    :cond_28
    return-void
.end method

.method public いいにぽつ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)Z
    .registers 6

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    instance-of v0, p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〺つふすそ;

    if-eqz v0, :cond_d

    check-cast p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〺つふすそ;

    invoke-interface {p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〺つふすそ;->づざかべべ()V

    :cond_d
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, p1, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, p1, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    .line 1
    iget-object v1, p1, Landroidx/appcompat/widget/Toolbar;->ぺづげぺが:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_26
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_36

    iget-object v2, p1, Landroidx/appcompat/widget/Toolbar;->ぺづげぺが:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_26

    :cond_36
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->ぺづげぺが:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 2
    iput-object v0, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->requestLayout()V

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->どぇぞほだ:Z

    iget-object p2, p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->へぬ〴づぞ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {p2, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぉざぅち〻(Z)V

    const/4 p1, 0x1

    return p1
.end method

.method public くし〴〺ぅ(Landroid/content/Context;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;)V
    .registers 4

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    if-eqz p1, :cond_b

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    if-eqz v0, :cond_b

    invoke-virtual {p1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)Z

    :cond_b
    iput-object p2, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Z)V
    .registers 3

    return-void
.end method

.method public づざかべべ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ざとぅぼこ〺;)Z
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public びぐびあび(Landroid/os/Parcelable;)V
    .registers 2

    return-void
.end method

.method public ぺぁあねじ()Landroid/os/Parcelable;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public ぺふねづ〺(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)Z
    .registers 7

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->くし〴〺ぅ()V

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {p1}, Landroid/widget/ImageButton;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    if-eq p1, v0, :cond_23

    instance-of v1, p1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1c

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1c
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, p1, Landroidx/appcompat/widget/Toolbar;->ぺぁあねじ:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_23
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->getActionView()Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    iput-object p2, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x2

    if-eq p1, v0, :cond_65

    instance-of v2, p1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_45

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_45
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->〳ぜぞぜべっ()Landroidx/appcompat/widget/Toolbar$LayoutParams;

    move-result-object p1

    const v0, 0x800003

    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    iget v3, v2, Landroidx/appcompat/widget/Toolbar;->おぐぴう〸ず:I

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v0, v3

    iput v0, p1, Landroidx/appcompat/app/ActionBar$LayoutParams;->げつ〴ぬぐ:I

    iput v1, p1, Landroidx/appcompat/widget/Toolbar$LayoutParams;->〺つふすそ:I

    iget-object v0, v2, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, p1, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_65
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    :cond_6b
    :goto_6b
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_8a

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/Toolbar$LayoutParams;

    iget v3, v3, Landroidx/appcompat/widget/Toolbar$LayoutParams;->〺つふすそ:I

    if-eq v3, v1, :cond_6b

    iget-object v3, p1, Landroidx/appcompat/widget/Toolbar;->〺つふすそ:Landroidx/appcompat/widget/ActionMenuView;

    if-eq v2, v3, :cond_6b

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    iget-object v3, p1, Landroidx/appcompat/widget/Toolbar;->ぺづげぺが:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6b

    .line 2
    :cond_8a
    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->requestLayout()V

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->どぇぞほだ:Z

    iget-object p2, p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->へぬ〴づぞ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぉざぅち〻(Z)V

    .line 4
    iget-object p2, p0, Landroidx/appcompat/widget/Toolbar$びぐびあび;->びぐびあび:Landroidx/appcompat/widget/Toolbar;

    iget-object p2, p2, Landroidx/appcompat/widget/Toolbar;->いいにぽつ:Landroid/view/View;

    instance-of v0, p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〺つふすそ;

    if-eqz v0, :cond_a5

    check-cast p2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〺つふすそ;

    invoke-interface {p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/〺つふすそ;->くし〴〺ぅ()V

    :cond_a5
    return p1
.end method
