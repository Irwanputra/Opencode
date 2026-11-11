.class public Lcom/google/android/material/appbar/MaterialToolbar;
.super Landroidx/appcompat/widget/Toolbar;
.source ""


# static fields
.field public static final ておぞぞはね:I


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->Widget_MaterialComponents_Toolbar:I

    sput v0, Lcom/google/android/material/appbar/MaterialToolbar;->ておぞぞはね:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/appbar/MaterialToolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->toolbarStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/appbar/MaterialToolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    sget v0, Lcom/google/android/material/appbar/MaterialToolbar;->ておぞぞはね:I

    invoke-static {p1, p2, p3, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺でおいここ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_18

    instance-of p3, p2, Landroid/graphics/drawable/ColorDrawable;

    if-nez p3, :cond_18

    goto :goto_4e

    :cond_18
    new-instance p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-direct {p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;-><init>()V

    if-eqz p2, :cond_26

    check-cast p2, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result p2

    goto :goto_27

    :cond_26
    const/4 p2, 0x0

    :goto_27
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p3, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ごづごきえ(Landroid/content/res/ColorStateList;)V

    .line 2
    iget-object p2, p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

    invoke-direct {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;-><init>(Landroid/content/Context;)V

    iput-object v0, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

    invoke-virtual {p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ぺづげぺが()V

    .line 3
    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺふねづ〺(Landroid/view/View;)F

    move-result p1

    invoke-virtual {p3, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->は〲ぱなで(F)V

    .line 4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x10

    if-lt p1, p2, :cond_4b

    invoke-virtual {p0, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_4e

    :cond_4b
    invoke-virtual {p0, p3}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_4e
    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .registers 3

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    if-eqz v1, :cond_10

    check-cast v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-static {p0, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅばづそほせ(Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;)V

    :cond_10
    return-void
.end method

.method public setElevation(F)V
    .registers 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setElevation(F)V

    invoke-static {p0, p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->へえどぜせ(Landroid/view/View;F)V

    return-void
.end method
