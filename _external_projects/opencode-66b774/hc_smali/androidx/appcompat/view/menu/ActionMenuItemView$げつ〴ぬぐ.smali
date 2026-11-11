.class public Landroidx/appcompat/view/menu/ActionMenuItemView$げつ〴ぬぐ;
.super Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/view/menu/ActionMenuItemView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final synthetic ぺふねづ〺:Landroidx/appcompat/view/menu/ActionMenuItemView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$げつ〴ぬぐ;->ぺふねづ〺:Landroidx/appcompat/view/menu/ActionMenuItemView;

    invoke-direct {p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぇぬぎばつ;
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$げつ〴ぬぐ;->ぺふねづ〺:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->ぺふねづ〺:Landroidx/appcompat/view/menu/ActionMenuItemView$〺つふすそ;

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    check-cast v0, Landroidx/appcompat/widget/ActionMenuPresenter$〺つふすそ;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuPresenter$〺つふすそ;->げつ〴ぬぐ:Landroidx/appcompat/widget/ActionMenuPresenter;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuPresenter;->ぶでにく〼〳:Landroidx/appcompat/widget/ActionMenuPresenter$げつ〴ぬぐ;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/てぜきぽく;->げつ〴ぬぐ()Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺふねづ〺;

    move-result-object v1

    :cond_13
    return-object v1
.end method

.method public くし〴〺ぅ()Z
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$げつ〴ぬぐ;->ぺふねづ〺:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v1, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->ぺぁあねじ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$〺つふすそ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1c

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->なぎぱいぢぎ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    invoke-interface {v1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ$〺つふすそ;->げつ〴ぬぐ(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;)Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView$げつ〴ぬぐ;->〺つふすそ()Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぇぬぎばつ;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-interface {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぇぬぎばつ;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_1c

    const/4 v2, 0x1

    :cond_1c
    return v2
.end method
