.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->えがぐせほち()V

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぺぁあねじ:Landroidx/appcompat/app/ActionBar;

    if-eqz v0, :cond_13

    .line 2
    invoke-virtual {v0}, Landroidx/appcompat/app/ActionBar;->びぐびあび()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_13

    const/4 v0, 0x1

    goto :goto_14

    :cond_13
    const/4 v0, 0x0

    :goto_14
    return v0
.end method

.method public くし〴〺ぅ()Landroid/graphics/drawable/Drawable;
    .registers 6

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ながふずは()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [I

    .line 2
    sget v3, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->homeAsUpIndicator:I

    const/4 v4, 0x0

    aput v3, v2, v4

    invoke-static {v0, v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぉざぅち〻(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    move-result-object v0

    invoke-virtual {v0, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 3
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v1
.end method

.method public げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;I)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->えがぐせほち()V

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぺぁあねじ:Landroidx/appcompat/app/ActionBar;

    if-eqz v0, :cond_f

    .line 2
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ActionBar;->おぐぴう〸ず(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, p2}, Landroidx/appcompat/app/ActionBar;->へぬ〴づぞ(I)V

    :cond_f
    return-void
.end method

.method public づざかべべ()Landroid/content/Context;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ながふずは()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public びぐびあび(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->えがぐせほち()V

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ぺぁあねじ:Landroidx/appcompat/app/ActionBar;

    if-eqz v0, :cond_c

    .line 2
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/ActionBar;->へぬ〴づぞ(I)V

    :cond_c
    return-void
.end method
