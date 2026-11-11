.class public Landroidx/appcompat/widget/FitWindowsLinearLayout;
.super Landroid/widget/LinearLayout;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぉざぅち〻/ざとぅぼこ〺;


# instance fields
.field public 〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ざとぅぼこ〺$げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public fitSystemWindows(Landroid/graphics/Rect;)Z
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/FitWindowsLinearLayout;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ざとぅぼこ〺$げつ〴ぬぐ;

    if-eqz v0, :cond_f

    check-cast v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/へぬ〴づぞ;

    .line 1
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/へぬ〴づぞ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->くぎぶ〼のそ(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;Landroid/graphics/Rect;)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 2
    :cond_f
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->fitSystemWindows(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public setOnFitSystemWindowsListener(Lづざかべべ/〺つふすそ/ぉざぅち〻/ざとぅぼこ〺$げつ〴ぬぐ;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/FitWindowsLinearLayout;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/ざとぅぼこ〺$げつ〴ぬぐ;

    return-void
.end method
